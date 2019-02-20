package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Encryption Result Listener.
  *
  * This interface is used to receive the result information of an encryption operation.
  */
trait XEncryptionResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the encryption result.
    * @param securityId the security id of the encryption
    * @param encryptionResult the result information
    */
  def encrypted(
    securityId: scala.Double,
    encryptionResult: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  ): scala.Unit
}

