package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerConfig extends js.Object {
  /**
    * The event type or types for which notifications are triggered.
    */
  var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined
  /**
    * The name of the notification trigger.
    */
  var triggerName: js.UndefOr[TriggerName] = js.undefined
  /**
    * The ARN of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
    */
  var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined
}

object TriggerConfig {
  @scala.inline
  def apply(
    triggerEvents: TriggerEventTypeList = null,
    triggerName: TriggerName = null,
    triggerTargetArn: TriggerTargetArn = null
  ): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    if (triggerEvents != null) __obj.updateDynamic("triggerEvents")(triggerEvents)
    if (triggerName != null) __obj.updateDynamic("triggerName")(triggerName)
    if (triggerTargetArn != null) __obj.updateDynamic("triggerTargetArn")(triggerTargetArn)
    __obj.asInstanceOf[TriggerConfig]
  }
}

