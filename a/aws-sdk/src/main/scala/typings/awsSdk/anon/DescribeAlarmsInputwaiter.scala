package typings.awsSdk.anon

import typings.awsSdk.cloudwatchMod.ActionPrefix
import typings.awsSdk.cloudwatchMod.AlarmName
import typings.awsSdk.cloudwatchMod.AlarmNamePrefix
import typings.awsSdk.cloudwatchMod.AlarmNames
import typings.awsSdk.cloudwatchMod.AlarmTypes
import typings.awsSdk.cloudwatchMod.MaxRecords
import typings.awsSdk.cloudwatchMod.NextToken
import typings.awsSdk.cloudwatchMod.StateValue
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudwatch.DescribeAlarmsInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeAlarmsInputwaiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
    */
  var ActionPrefix: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionPrefix] = js.native
  /**
    * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names that start with this prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmNamePrefix] = js.native
  /**
    * The names of the alarms to retrieve information about.
    */
  var AlarmNames: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmNames] = js.native
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmTypes] = js.native
  /**
    * If you use this parameter and specify the name of a composite alarm, the operation returns information about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the AlarmRule field of the composite alarm that you specify in ChildrenOfAlarmName. Information about the composite alarm that you name in ChildrenOfAlarmName is not returned. If you specify ChildrenOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you will receive a validation error.  Only the Alarm Name, ARN, StateValue (OK/ALARM/INSUFFICIENT_DATA), and StateUpdatedTimestamp information are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ChildrenOfAlarmName: js.UndefOr[AlarmName] = js.native
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information about the "parent" alarms of the alarm you specify. These are the composite alarms that have AlarmRule parameters that reference the alarm named in ParentsOfAlarmName. Information about the alarm that you specify in ParentsOfAlarmName is not returned. If you specify ParentsOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you will receive a validation error.  Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ParentsOfAlarmName: js.UndefOr[AlarmName] = js.native
  /**
    * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.native
}

object DescribeAlarmsInputwaiter {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    ActionPrefix: ActionPrefix = null,
    AlarmNamePrefix: AlarmNamePrefix = null,
    AlarmNames: AlarmNames = null,
    AlarmTypes: AlarmTypes = null,
    ChildrenOfAlarmName: AlarmName = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: NextToken = null,
    ParentsOfAlarmName: AlarmName = null,
    StateValue: StateValue = null
  ): DescribeAlarmsInputwaiter = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (ActionPrefix != null) __obj.updateDynamic("ActionPrefix")(ActionPrefix.asInstanceOf[js.Any])
    if (AlarmNamePrefix != null) __obj.updateDynamic("AlarmNamePrefix")(AlarmNamePrefix.asInstanceOf[js.Any])
    if (AlarmNames != null) __obj.updateDynamic("AlarmNames")(AlarmNames.asInstanceOf[js.Any])
    if (AlarmTypes != null) __obj.updateDynamic("AlarmTypes")(AlarmTypes.asInstanceOf[js.Any])
    if (ChildrenOfAlarmName != null) __obj.updateDynamic("ChildrenOfAlarmName")(ChildrenOfAlarmName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ParentsOfAlarmName != null) __obj.updateDynamic("ParentsOfAlarmName")(ParentsOfAlarmName.asInstanceOf[js.Any])
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsInputwaiter]
  }
}

