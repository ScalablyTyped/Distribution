package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyRequest extends js.Object {
  /**
    * A friendly description of the policy. Typically used to store information about the permissions defined in the policy. For example, "Grants access to production DynamoDB tables." The policy description is immutable. After a value is assigned, it cannot be changed.
    */
  var Description: js.UndefOr[policyDescriptionType] = js.undefined
  /**
    * The path for the policy. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[policyPathType] = js.undefined
  /**
    * The JSON policy document that you want to use as the content for the new policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyDocument: policyDocumentType
  /**
    * The friendly name of the policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
}

object CreatePolicyRequest {
  @scala.inline
  def apply(
    PolicyDocument: policyDocumentType,
    PolicyName: policyNameType,
    Description: policyDescriptionType = null,
    Path: policyPathType = null
  ): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument, PolicyName = PolicyName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

