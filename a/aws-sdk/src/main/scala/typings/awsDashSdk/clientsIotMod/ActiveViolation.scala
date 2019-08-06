package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveViolation extends js.Object {
  /**
    * The behavior which is being violated.
    */
  var behavior: js.UndefOr[Behavior] = js.undefined
  /**
    * The time the most recent violation occurred.
    */
  var lastViolationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The value of the metric (the measurement) which caused the most recent violation.
    */
  var lastViolationValue: js.UndefOr[MetricValue] = js.undefined
  /**
    * The security profile whose behavior is in violation.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  /**
    * The name of the thing responsible for the active violation.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  /**
    * The ID of the active violation.
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
  /**
    * The time the violation started.
    */
  var violationStartTime: js.UndefOr[Timestamp] = js.undefined
}

object ActiveViolation {
  @scala.inline
  def apply(
    behavior: Behavior = null,
    lastViolationTime: Timestamp = null,
    lastViolationValue: MetricValue = null,
    securityProfileName: SecurityProfileName = null,
    thingName: DeviceDefenderThingName = null,
    violationId: ViolationId = null,
    violationStartTime: Timestamp = null
  ): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (lastViolationTime != null) __obj.updateDynamic("lastViolationTime")(lastViolationTime)
    if (lastViolationValue != null) __obj.updateDynamic("lastViolationValue")(lastViolationValue)
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (violationId != null) __obj.updateDynamic("violationId")(violationId)
    if (violationStartTime != null) __obj.updateDynamic("violationStartTime")(violationStartTime)
    __obj.asInstanceOf[ActiveViolation]
  }
}

