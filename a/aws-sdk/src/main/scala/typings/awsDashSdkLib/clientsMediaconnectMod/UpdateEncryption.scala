package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEncryption extends js.Object {
  /**
    * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
    */
  var Algorithm: js.UndefOr[Algorithm] = js.undefined
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[KeyType] = js.undefined
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
    */
  var SecretArn: js.UndefOr[__string] = js.undefined
}

object UpdateEncryption {
  @scala.inline
  def apply(
    Algorithm: Algorithm = null,
    KeyType: KeyType = null,
    RoleArn: __string = null,
    SecretArn: __string = null
  ): UpdateEncryption = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (KeyType != null) __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn)
    __obj.asInstanceOf[UpdateEncryption]
  }
}

