package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInformation extends js.Object {
  /**
    * The description of the event.
    */
  var EventDescription: js.UndefOr[String] = js.undefined
  /**
    * The event. The following are the error events:    iamFleetRoleInvalid - The Spot Fleet did not have the required permissions either to launch or terminate an instance.    spotFleetRequestConfigurationInvalid - The configuration is not valid. For more information, see the description of the event.    spotInstanceCountLimitExceeded - You've reached the limit on the number of Spot Instances that you can launch.   The following are the fleetRequestChange events:    active - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the target number of running Spot Instances.    cancelled - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will be deleted two days after its instances were terminated.    cancelled_running - The Spot Fleet is canceled and does not launch additional Spot Instances. Existing Spot Instances continue to run until they are interrupted or terminated.    cancelled_terminating - The Spot Fleet is canceled and its Spot Instances are terminating.    expired - The Spot Fleet request has expired. A subsequent event indicates that the instances were terminated, if the request was created with TerminateInstancesWithExpiration set.    modify_in_progress - A request to modify the Spot Fleet request was accepted and is in progress.    modify_successful - The Spot Fleet request was modified.    price_update - The price for a launch configuration was adjusted because it was too high. This change is permanent.    submitted - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the target number of Spot Instances.   The following are the instanceChange events:    launched - A request was fulfilled and a new instance was launched.    terminated - An instance was terminated by the user.   The following are the Information events:    launchSpecTemporarilyBlacklisted - The configuration is not valid and several attempts to launch instances have failed. For more information, see the description of the event.    launchSpecUnusable - The price in a launch specification is not valid because it is below the Spot price or the Spot price is above the On-Demand price.    fleetProgressHalted - The price in every launch specification is not valid. A launch specification might become valid if the Spot price changes.  
    */
  var EventSubType: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance. This information is available only for instanceChange events.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object EventInformation {
  @scala.inline
  def apply(EventDescription: String = null, EventSubType: String = null, InstanceId: String = null): EventInformation = {
    val __obj = js.Dynamic.literal()
    if (EventDescription != null) __obj.updateDynamic("EventDescription")(EventDescription)
    if (EventSubType != null) __obj.updateDynamic("EventSubType")(EventSubType)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[EventInformation]
  }
}

