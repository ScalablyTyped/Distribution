package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsEncryption extends js.Object {
  /**
    * A constant initialization vector for encryption (optional).
  When not specified the initialization vector will be periodically rotated.
    */
  var ConstantInitializationVector: js.UndefOr[__string] = js.undefined
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.EncryptionMethod] = js.undefined
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackagevodMod.SpekeKeyProvider
}

object HlsEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    ConstantInitializationVector: __string = null,
    EncryptionMethod: EncryptionMethod = null
  ): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider)
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector)
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
}

