package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowRequest extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
    */
  var AvailabilityZone: js.UndefOr[__string] = js.undefined
  /**
    * The entitlements that you want to grant on a flow.
    */
  var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest] = js.undefined
  /**
    * The name of the flow.
    */
  var Name: __string
  /**
    * The outputs that you want to add to this flow.
    */
  var Outputs: js.UndefOr[__listOfAddOutputRequest] = js.undefined
  var Source: SetSourceRequest
}

object CreateFlowRequest {
  @scala.inline
  def apply(
    Name: __string,
    Source: SetSourceRequest,
    AvailabilityZone: __string = null,
    Entitlements: __listOfGrantEntitlementRequest = null,
    Outputs: __listOfAddOutputRequest = null
  ): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Source = Source)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    __obj.asInstanceOf[CreateFlowRequest]
  }
}

