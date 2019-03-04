package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Decryption Result Listener.
  *
  * This interface is used to receive the result information of a decryption operation.
  */
trait XDecryptionResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the decryption result.
    * @param securityId the security id of the encryption to be decrypted
    * @param decryptionResult the result information
    */
  def decrypted(
    securityId: scala.Double,
    decryptionResult: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  ): scala.Unit
}

object XDecryptionResultListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    decrypted: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDecryptionResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, decrypted = decrypted, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDecryptionResultListener]
  }
}

