package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReusableDelegationSetRequest extends js.Object {
  /**
    * A unique string that identifies the request, and that allows you to retry failed CreateReusableDelegationSet requests without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateReusableDelegationSet request. CallerReference can be any unique string, for example a date/time stamp.
    */
  var CallerReference: Nonce
  /**
    * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
}

object CreateReusableDelegationSetRequest {
  @scala.inline
  def apply(CallerReference: Nonce, HostedZoneId: ResourceId = null): CreateReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    __obj.asInstanceOf[CreateReusableDelegationSetRequest]
  }
}

