package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  /**
    * The SHA-1 digest of the DER encoded private key.
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  /**
    * An unencrypted PEM encoded RSA private key.
    */
  var KeyMaterial: js.UndefOr[String] = js.undefined
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
}

object KeyPair {
  @scala.inline
  def apply(KeyFingerprint: String = null, KeyMaterial: String = null, KeyName: String = null): KeyPair = {
    val __obj = js.Dynamic.literal()
    if (KeyFingerprint != null) __obj.updateDynamic("KeyFingerprint")(KeyFingerprint)
    if (KeyMaterial != null) __obj.updateDynamic("KeyMaterial")(KeyMaterial)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    __obj.asInstanceOf[KeyPair]
  }
}

