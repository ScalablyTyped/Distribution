package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsEncryption extends js.Object {
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.EncryptionMethod] = js.undefined
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackagevodMod.SpekeKeyProvider
}

object HlsEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider, EncryptionMethod: EncryptionMethod = null): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider)
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
}

