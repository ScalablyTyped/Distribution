package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsInput extends js.Object {
  /**
    * The action name prefix.
    */
  var ActionPrefix: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ActionPrefix] = js.native
  /**
    * The alarm name prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmNamePrefix] = js.native
  /**
    * The names of the alarms.
    */
  var AlarmNames: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmNames] = js.native
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
  /**
    * The state value to be used in matching alarms.
    */
  var StateValue: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.StateValue] = js.native
}

object DescribeAlarmsInput {
  @scala.inline
  def apply(
    ActionPrefix: ActionPrefix = null,
    AlarmNamePrefix: AlarmNamePrefix = null,
    AlarmNames: AlarmNames = null,
    MaxRecords: Int | Double = null,
    NextToken: NextToken = null,
    StateValue: StateValue = null
  ): DescribeAlarmsInput = {
    val __obj = js.Dynamic.literal()
    if (ActionPrefix != null) __obj.updateDynamic("ActionPrefix")(ActionPrefix.asInstanceOf[js.Any])
    if (AlarmNamePrefix != null) __obj.updateDynamic("AlarmNamePrefix")(AlarmNamePrefix.asInstanceOf[js.Any])
    if (AlarmNames != null) __obj.updateDynamic("AlarmNames")(AlarmNames.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsInput]
  }
}

