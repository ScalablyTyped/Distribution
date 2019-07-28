package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flow extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
    */
  var AvailabilityZone: __string
  /**
    * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var EgressIp: js.UndefOr[__string] = js.undefined
  /**
    * The entitlements in this flow.
    */
  var Entitlements: __listOfEntitlement
  /**
    * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
    */
  var FlowArn: __string
  /**
    * The name of the flow.
    */
  var Name: __string
  /**
    * The outputs in this flow.
    */
  var Outputs: __listOfOutput
  var Source: typings.awsDashSdk.clientsMediaconnectMod.Source
  /**
    * The current status of the flow.
    */
  var Status: typings.awsDashSdk.clientsMediaconnectMod.Status
}

object Flow {
  @scala.inline
  def apply(
    AvailabilityZone: __string,
    Entitlements: __listOfEntitlement,
    FlowArn: __string,
    Name: __string,
    Outputs: __listOfOutput,
    Source: Source,
    Status: Status,
    Description: __string = null,
    EgressIp: __string = null
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, Entitlements = Entitlements, FlowArn = FlowArn, Name = Name, Outputs = Outputs, Source = Source, Status = Status.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EgressIp != null) __obj.updateDynamic("EgressIp")(EgressIp)
    __obj.asInstanceOf[Flow]
  }
}

