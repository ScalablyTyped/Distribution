package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get an object that allows to encrypt/decrypt data using the specified algorithm.
  * @since OOo 3.4
  */
trait XCipherContextSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns an object that allows to encrypt/decrypt data.
    * @param nCipherID the internal ID specifying the algorithm, should take value from {@link CipherID}
    * @param aKey the key that should be used for the encryption
    * @param aInitializationVector the initialization vector that should be used for the encryption
    * @param bEncryption whether an encryption or decryption cipher should be created `TRUE` - Encryption `FALSE` - Decryption
    * @param aParams optional parameters that could be used to initialize the cipher,
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getCipherContext(
    nCipherID: scala.Double,
    aKey: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    aInitializationVector: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bEncryption: scala.Boolean,
    aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): XCipherContext
}

object XCipherContextSupplier {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getCipherContext: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Boolean, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => XCipherContext,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCipherContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCipherContext = js.Any.fromFunction5(getCipherContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCipherContextSupplier]
  }
}

