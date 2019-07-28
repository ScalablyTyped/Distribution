package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceRegistryEnrichActivity extends js.Object {
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName
  /**
    * The name of the 'deviceRegistryEnrich' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
  /**
    * The ARN of the role that allows access to the device's registry information.
    */
  var roleArn: RoleArn
  /**
    * The name of the IoT device whose registry information is added to the message.
    */
  var thingName: AttributeName
}

object DeviceRegistryEnrichActivity {
  @scala.inline
  def apply(
    attribute: AttributeName,
    name: ActivityName,
    roleArn: RoleArn,
    thingName: AttributeName,
    next: ActivityName = null
  ): DeviceRegistryEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute, name = name, roleArn = roleArn, thingName = thingName)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[DeviceRegistryEnrichActivity]
  }
}

