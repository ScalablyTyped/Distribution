package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContextKeysForCustomPolicyRequest extends js.Object {
  /**
    * A list of policies for which you want the list of context keys referenced in those policies. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyInputList: SimulationPolicyListType
}

object GetContextKeysForCustomPolicyRequest {
  @scala.inline
  def apply(PolicyInputList: SimulationPolicyListType): GetContextKeysForCustomPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInputList = PolicyInputList)
  
    __obj.asInstanceOf[GetContextKeysForCustomPolicyRequest]
  }
}

