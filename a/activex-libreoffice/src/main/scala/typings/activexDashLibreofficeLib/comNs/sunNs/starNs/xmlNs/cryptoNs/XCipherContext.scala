package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to encrypt/decrypt data using the cipher context.
  *
  * The algorithm as well as encryption data are specified on object creation.
  * @see XCipherContextSupplier
  * @since OOo 3.4
  */
trait XCipherContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * encrypts/decrypts the data using the cipher.
    *
    * Please have in mind, the cipher object state might depend from the already encrypted/decrypted data ( it depends from the used algorithm ).
    *
    * Whether the object does encryption or decryption is specified by creation of the object.
    * @param aData data that should be encrypted/decrypted
    */
  def convertWithCipherContext(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): stdLib.SafeArray[scala.Double]
  /** finalizes cipher and disposes context. */
  def finalizeCipherContextAndDispose(): stdLib.SafeArray[scala.Double]
}

object XCipherContext {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    convertWithCipherContext: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => stdLib.SafeArray[scala.Double],
    finalizeCipherContextAndDispose: () => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCipherContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertWithCipherContext = js.Any.fromFunction1(convertWithCipherContext), finalizeCipherContextAndDispose = js.Any.fromFunction0(finalizeCipherContextAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCipherContext]
  }
}

