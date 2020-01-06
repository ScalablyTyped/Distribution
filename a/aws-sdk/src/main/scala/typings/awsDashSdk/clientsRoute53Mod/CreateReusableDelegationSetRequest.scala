package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReusableDelegationSetRequest extends js.Object {
  /**
    * A unique string that identifies the request, and that allows you to retry failed CreateReusableDelegationSet requests without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateReusableDelegationSet request. CallerReference can be any unique string, for example a date/time stamp.
    */
  var CallerReference: Nonce = js.native
  /**
    * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
}

object CreateReusableDelegationSetRequest {
  @scala.inline
  def apply(CallerReference: Nonce, HostedZoneId: ResourceId = null): CreateReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetRequest]
  }
}

