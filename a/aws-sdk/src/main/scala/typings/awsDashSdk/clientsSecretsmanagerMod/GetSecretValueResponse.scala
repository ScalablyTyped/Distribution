package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretValueResponse extends js.Object {
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The date and time that this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.native
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a base64-encoded string. This parameter is not used if the secret is created by the Secrets Manager console. If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the SecretString or SecretBinary fields.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a string. If you create this secret by using the Secrets Manager console then only the SecretString parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse. If you store custom information in the secret by using the CreateSecret, UpdateSecret, or PutSecretValue API operations instead of the Secrets Manager console, or by using the Other secret type in the console, then you must code your Lambda rotation function to parse and interpret those values.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.native
  /**
    * The unique identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * A list of all of the staging labels currently attached to this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}

object GetSecretValueResponse {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    CreatedDate: CreatedDateType = null,
    Name: SecretNameType = null,
    SecretBinary: SecretBinaryType = null,
    SecretString: SecretStringType = null,
    VersionId: SecretVersionIdType = null,
    VersionStages: SecretVersionStagesType = null
  ): GetSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SecretBinary != null) __obj.updateDynamic("SecretBinary")(SecretBinary.asInstanceOf[js.Any])
    if (SecretString != null) __obj.updateDynamic("SecretString")(SecretString.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    if (VersionStages != null) __obj.updateDynamic("VersionStages")(VersionStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretValueResponse]
  }
}

