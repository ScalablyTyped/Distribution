package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairInfo extends js.Object {
  /**
    * If you used CreateKeyPair to create the key pair, this is the SHA-1 digest of the DER encoded private key. If you used ImportKeyPair to provide AWS the public key, this is the MD5 public key fingerprint as specified in section 4 of RFC4716.
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
}

object KeyPairInfo {
  @scala.inline
  def apply(KeyFingerprint: String = null, KeyName: String = null): KeyPairInfo = {
    val __obj = js.Dynamic.literal()
    if (KeyFingerprint != null) __obj.updateDynamic("KeyFingerprint")(KeyFingerprint)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    __obj.asInstanceOf[KeyPairInfo]
  }
}

