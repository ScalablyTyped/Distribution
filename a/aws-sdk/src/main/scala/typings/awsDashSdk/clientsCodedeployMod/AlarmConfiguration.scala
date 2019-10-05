package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmConfiguration extends js.Object {
  /**
    * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
    */
  var alarms: js.UndefOr[AlarmList] = js.undefined
  /**
    * Indicates whether the alarm configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from Amazon CloudWatch. The default value is false.   true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.   false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.  
    */
  var ignorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined
}

object AlarmConfiguration {
  @scala.inline
  def apply(
    alarms: AlarmList = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePollAlarmFailure: js.UndefOr[scala.Boolean] = js.undefined
  ): AlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(ignorePollAlarmFailure)) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure)
    __obj.asInstanceOf[AlarmConfiguration]
  }
}

