package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get an object to generate a digest of a specified format.
  * @since OOo 3.4
  */
trait XDigestContextSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns an object that allows to generate the specified digest.
    * @param nDigestID the internal ID specifying the algorithm, should take value from {@link DigestID}
    * @param aParams optional parameters that could be used to initialize the digest, for example, it could contain a key and etc.
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getDigestContext(
    nDigestID: scala.Double,
    aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): XDigestContext
}

object XDigestContextSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDigestContext: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XDigestContext
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDigestContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDigestContext = getDigestContext, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDigestContextSupplier]
  }
}

