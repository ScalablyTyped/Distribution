package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLEncryption} */
trait XMLEncryption
  extends XXMLEncryption
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLEncryption {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    decrypt: js.Function2[XXMLEncryptionTemplate, XXMLSecurityContext, XXMLEncryptionTemplate],
    encrypt: js.Function2[XXMLEncryptionTemplate, XSecurityEnvironment, XXMLEncryptionTemplate],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = acquire, decrypt = decrypt, encrypt = encrypt, initialize = initialize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMLEncryption]
  }
}

