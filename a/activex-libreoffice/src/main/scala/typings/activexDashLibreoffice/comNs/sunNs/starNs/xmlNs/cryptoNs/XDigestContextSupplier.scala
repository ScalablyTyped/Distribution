package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get an object to generate a digest of a specified format.
  * @since OOo 3.4
  */
trait XDigestContextSupplier extends XInterface {
  /**
    * returns an object that allows to generate the specified digest.
    * @param nDigestID the internal ID specifying the algorithm, should take value from {@link DigestID}
    * @param aParams optional parameters that could be used to initialize the digest, for example, it could contain a key and etc.
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getDigestContext(nDigestID: Double, aParams: SeqEquiv[NamedValue]): XDigestContext
}

object XDigestContextSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDigestContext: (Double, SeqEquiv[NamedValue]) => XDigestContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDigestContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDigestContextSupplier]
  }
}

