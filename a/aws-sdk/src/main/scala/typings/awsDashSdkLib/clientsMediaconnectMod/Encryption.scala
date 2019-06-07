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
    * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
    */
  var ConstantInitializationVector: js.UndefOr[__string] = js.undefined
  /**
    * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var DeviceId: js.UndefOr[__string] = js.undefined
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[KeyType] = js.undefined
  /**
    * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Region: js.UndefOr[__string] = js.undefined
  /**
    * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: __string
  /**
    * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
    */
  var SecretArn: js.UndefOr[__string] = js.undefined
  /**
    * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object Encryption {
  @scala.inline
  def apply(
    Algorithm: Algorithm,
    RoleArn: __string,
    ConstantInitializationVector: __string = null,
    DeviceId: __string = null,
    KeyType: KeyType = null,
    Region: __string = null,
    ResourceId: __string = null,
    SecretArn: __string = null,
    Url: __string = null
  ): Encryption = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], RoleArn = RoleArn)
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector)
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (KeyType != null) __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Encryption]
  }
}

