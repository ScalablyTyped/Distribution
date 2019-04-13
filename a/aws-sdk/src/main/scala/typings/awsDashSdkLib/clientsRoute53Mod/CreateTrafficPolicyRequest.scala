package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficPolicyRequest extends js.Object {
  /**
    * (Optional) Any comments that you want to include about the traffic policy.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
  /**
    * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument
  /**
    * The name of the traffic policy.
    */
  var Name: TrafficPolicyName
}

object CreateTrafficPolicyRequest {
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Name: TrafficPolicyName, Comment: TrafficPolicyComment = null): CreateTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Document = Document, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[CreateTrafficPolicyRequest]
  }
}

