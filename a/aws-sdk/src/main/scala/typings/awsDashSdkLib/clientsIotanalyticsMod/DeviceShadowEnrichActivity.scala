package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceShadowEnrichActivity extends js.Object {
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName
  /**
    * The name of the 'deviceShadowEnrich' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
  /**
    * The ARN of the role that allows access to the device's shadow.
    */
  var roleArn: RoleArn
  /**
    * The name of the IoT device whose shadow information is added to the message.
    */
  var thingName: AttributeName
}

object DeviceShadowEnrichActivity {
  @scala.inline
  def apply(
    attribute: AttributeName,
    name: ActivityName,
    roleArn: RoleArn,
    thingName: AttributeName,
    next: ActivityName = null
  ): DeviceShadowEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute, name = name, roleArn = roleArn, thingName = thingName)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[DeviceShadowEnrichActivity]
  }
}

