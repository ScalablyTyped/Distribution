package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmsInput extends js.Object {
  /**
    * The action name prefix.
    */
  var ActionPrefix: js.UndefOr[ActionPrefix] = js.undefined
  /**
    * The alarm name prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[AlarmNamePrefix] = js.undefined
  /**
    * The names of the alarms.
    */
  var AlarmNames: js.UndefOr[AlarmNames] = js.undefined
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The state value to be used in matching alarms.
    */
  var StateValue: js.UndefOr[StateValue] = js.undefined
}

object DescribeAlarmsInput {
  @scala.inline
  def apply(
    ActionPrefix: ActionPrefix = null,
    AlarmNamePrefix: AlarmNamePrefix = null,
    AlarmNames: AlarmNames = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: NextToken = null,
    StateValue: StateValue = null
  ): DescribeAlarmsInput = {
    val __obj = js.Dynamic.literal()
    if (ActionPrefix != null) __obj.updateDynamic("ActionPrefix")(ActionPrefix)
    if (AlarmNamePrefix != null) __obj.updateDynamic("AlarmNamePrefix")(AlarmNamePrefix)
    if (AlarmNames != null) __obj.updateDynamic("AlarmNames")(AlarmNames)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsInput]
  }
}

