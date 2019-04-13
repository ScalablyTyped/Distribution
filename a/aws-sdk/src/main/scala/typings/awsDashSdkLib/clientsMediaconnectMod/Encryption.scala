package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryption extends js.Object {
  /**
    * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
    */
  var Algorithm: awsDashSdkLib.clientsMediaconnectMod.Algorithm
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[KeyType] = js.undefined
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: __string
  /**
    * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
    */
  var SecretArn: __string
}

object Encryption {
  @scala.inline
  def apply(Algorithm: Algorithm, RoleArn: __string, SecretArn: __string, KeyType: KeyType = null): Encryption = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], RoleArn = RoleArn, SecretArn = SecretArn)
    if (KeyType != null) __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
}

