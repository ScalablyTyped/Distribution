package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficPolicy extends js.Object {
  /**
    * The comment that you specify in the CreateTrafficPolicy request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
  /**
    * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy in the CreateTrafficPolicy request. For more information about the JSON format, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument
  /**
    * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
    */
  var Id: TrafficPolicyId
  /**
    * The name that you specified when you created the traffic policy.
    */
  var Name: TrafficPolicyName
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType
  /**
    * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of Version is always 1.
    */
  var Version: TrafficPolicyVersion
}

object TrafficPolicy {
  @scala.inline
  def apply(
    Document: TrafficPolicyDocument,
    Id: TrafficPolicyId,
    Name: TrafficPolicyName,
    Type: RRType,
    Version: TrafficPolicyVersion,
    Comment: TrafficPolicyComment = null
  ): TrafficPolicy = {
    val __obj = js.Dynamic.literal(Document = Document, Id = Id, Name = Name, Type = Type.asInstanceOf[js.Any], Version = Version)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[TrafficPolicy]
  }
}

