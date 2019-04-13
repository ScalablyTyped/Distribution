package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateSecretRequest extends js.Object {
  /**
    * (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.  If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request. You only need to specify your own value if you are implementing your own retry logic and want to ensure that a given secret is not created twice. We recommend that you generate a UUID-type value to ensure uniqueness within the specified secret.  Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the function's processing. This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  /**
    * (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined
  /**
    * A structure that defines the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.undefined
  /**
    * Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a hyphen followed by six characters. 
    */
  var SecretId: SecretIdType
}

object RotateSecretRequest {
  @scala.inline
  def apply(
    SecretId: SecretIdType,
    ClientRequestToken: ClientRequestTokenType = null,
    RotationLambdaARN: RotationLambdaARNType = null,
    RotationRules: RotationRulesType = null
  ): RotateSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (RotationLambdaARN != null) __obj.updateDynamic("RotationLambdaARN")(RotationLambdaARN)
    if (RotationRules != null) __obj.updateDynamic("RotationRules")(RotationRules)
    __obj.asInstanceOf[RotateSecretRequest]
  }
}

