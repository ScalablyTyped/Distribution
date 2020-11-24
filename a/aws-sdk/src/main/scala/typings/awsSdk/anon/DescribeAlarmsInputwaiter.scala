package typings.awsSdk.anon

import typings.awsSdk.cloudwatchMod.ActionPrefix
import typings.awsSdk.cloudwatchMod.AlarmName
import typings.awsSdk.cloudwatchMod.AlarmNamePrefix
import typings.awsSdk.cloudwatchMod.AlarmNames
import typings.awsSdk.cloudwatchMod.AlarmType
import typings.awsSdk.cloudwatchMod.AlarmTypes
import typings.awsSdk.cloudwatchMod.MaxRecords
import typings.awsSdk.cloudwatchMod.NextToken
import typings.awsSdk.cloudwatchMod.StateValue
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudwatch.DescribeAlarmsInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
    * If you use this parameter and specify the name of a composite alarm, the operation returns information about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the AlarmRule field of the composite alarm that you specify in ChildrenOfAlarmName. Information about the composite alarm that you name in ChildrenOfAlarmName is not returned. If you specify ChildrenOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you receive a validation error.  Only the Alarm Name, ARN, StateValue (OK/ALARM/INSUFFICIENT_DATA), and StateUpdatedTimestamp information are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
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
    * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information about the "parent" alarms of the alarm you specify. These are the composite alarms that have AlarmRule parameters that reference the alarm named in ParentsOfAlarmName. Information about the alarm that you specify in ParentsOfAlarmName is not returned. If you specify ParentsOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you receive a validation error.  Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ParentsOfAlarmName: js.UndefOr[AlarmName] = js.native
  
  /**
    * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.native
}
object DescribeAlarmsInputwaiter {
  
  @scala.inline
  def apply(): DescribeAlarmsInputwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsInputwaiter]
  }
  
  @scala.inline
  implicit class DescribeAlarmsInputwaiterOps[Self <: DescribeAlarmsInputwaiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    
    @scala.inline
    def setActionPrefix(value: ActionPrefix): Self = this.set("ActionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionPrefix: Self = this.set("ActionPrefix", js.undefined)
    
    @scala.inline
    def setAlarmNamePrefix(value: AlarmNamePrefix): Self = this.set("AlarmNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmNamePrefix: Self = this.set("AlarmNamePrefix", js.undefined)
    
    @scala.inline
    def setAlarmNamesVarargs(value: AlarmName*): Self = this.set("AlarmNames", js.Array(value :_*))
    
    @scala.inline
    def setAlarmNames(value: AlarmNames): Self = this.set("AlarmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmNames: Self = this.set("AlarmNames", js.undefined)
    
    @scala.inline
    def setAlarmTypesVarargs(value: AlarmType*): Self = this.set("AlarmTypes", js.Array(value :_*))
    
    @scala.inline
    def setAlarmTypes(value: AlarmTypes): Self = this.set("AlarmTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmTypes: Self = this.set("AlarmTypes", js.undefined)
    
    @scala.inline
    def setChildrenOfAlarmName(value: AlarmName): Self = this.set("ChildrenOfAlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenOfAlarmName: Self = this.set("ChildrenOfAlarmName", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setParentsOfAlarmName(value: AlarmName): Self = this.set("ParentsOfAlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentsOfAlarmName: Self = this.set("ParentsOfAlarmName", js.undefined)
    
    @scala.inline
    def setStateValue(value: StateValue): Self = this.set("StateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateValue: Self = this.set("StateValue", js.undefined)
  }
}
