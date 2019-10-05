package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserAttributesRequest extends js.Object {
  /**
    * The access token for the request to update user attributes.
    */
  var AccessToken: TokenModelType
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the UpdateUserAttributes API action, Amazon Cognito invokes the functions that are assigned to the custom message and pre mutation triggers. When Amazon Cognito invokes either of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType
}

object UpdateUserAttributesRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    UserAttributes: AttributeListType,
    ClientMetadata: ClientMetadataType = null
  ): UpdateUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, UserAttributes = UserAttributes)
    if (ClientMetadata != null) __obj.updateDynamic("ClientMetadata")(ClientMetadata)
    __obj.asInstanceOf[UpdateUserAttributesRequest]
  }
}

