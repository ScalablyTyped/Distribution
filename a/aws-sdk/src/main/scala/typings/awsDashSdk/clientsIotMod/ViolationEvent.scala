package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolationEvent extends js.Object {
  /**
    * The behavior which was violated.
    */
  var behavior: js.UndefOr[Behavior] = js.undefined
  /**
    * The value of the metric (the measurement).
    */
  var metricValue: js.UndefOr[MetricValue] = js.undefined
  /**
    * The name of the security profile whose behavior was violated.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  /**
    * The name of the thing responsible for the violation event.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  /**
    * The time the violation event occurred.
    */
  var violationEventTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of violation event.
    */
  var violationEventType: js.UndefOr[ViolationEventType] = js.undefined
  /**
    * The ID of the violation event.
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
}

object ViolationEvent {
  @scala.inline
  def apply(
    behavior: Behavior = null,
    metricValue: MetricValue = null,
    securityProfileName: SecurityProfileName = null,
    thingName: DeviceDefenderThingName = null,
    violationEventTime: Timestamp = null,
    violationEventType: ViolationEventType = null,
    violationId: ViolationId = null
  ): ViolationEvent = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (metricValue != null) __obj.updateDynamic("metricValue")(metricValue)
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (violationEventTime != null) __obj.updateDynamic("violationEventTime")(violationEventTime)
    if (violationEventType != null) __obj.updateDynamic("violationEventType")(violationEventType.asInstanceOf[js.Any])
    if (violationId != null) __obj.updateDynamic("violationId")(violationId)
    __obj.asInstanceOf[ViolationEvent]
  }
}

