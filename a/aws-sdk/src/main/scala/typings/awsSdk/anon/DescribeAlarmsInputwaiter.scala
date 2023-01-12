package typings.awsSdk.anon

import typings.awsSdk.clientsCloudwatchMod.ActionPrefix
import typings.awsSdk.clientsCloudwatchMod.AlarmName
import typings.awsSdk.clientsCloudwatchMod.AlarmNamePrefix
import typings.awsSdk.clientsCloudwatchMod.AlarmNames
import typings.awsSdk.clientsCloudwatchMod.AlarmType
import typings.awsSdk.clientsCloudwatchMod.AlarmTypes
import typings.awsSdk.clientsCloudwatchMod.MaxRecords
import typings.awsSdk.clientsCloudwatchMod.NextToken
import typings.awsSdk.clientsCloudwatchMod.StateValue
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudwatch.DescribeAlarmsInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeAlarmsInputwaiter extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Use this parameter to filter the results of the operation to only those alarms that use a certain alarm action. For example, you could specify the ARN of an SNS topic to find all alarms that send notifications to that topic.
    */
  var ActionPrefix: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ActionPrefix] = js.undefined
  
  /**
    * An alarm name prefix. If you specify this parameter, you receive information about all alarms that have names that start with this prefix. If this parameter is specified, you cannot specify AlarmNames.
    */
  var AlarmNamePrefix: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmNamePrefix] = js.undefined
  
  /**
    * The names of the alarms to retrieve information about.
    */
  var AlarmNames: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmNames] = js.undefined
  
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmTypes] = js.undefined
  
  /**
    * If you use this parameter and specify the name of a composite alarm, the operation returns information about the "children" alarms of the alarm you specify. These are the metric alarms and composite alarms referenced in the AlarmRule field of the composite alarm that you specify in ChildrenOfAlarmName. Information about the composite alarm that you name in ChildrenOfAlarmName is not returned. If you specify ChildrenOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you receive a validation error.  Only the Alarm Name, ARN, StateValue (OK/ALARM/INSUFFICIENT_DATA), and StateUpdatedTimestamp information are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ChildrenOfAlarmName: js.UndefOr[AlarmName] = js.undefined
  
  /**
    * The maximum number of alarm descriptions to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MaxRecords] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
  
  /**
    * If you use this parameter and specify the name of a metric or composite alarm, the operation returns information about the "parent" alarms of the alarm you specify. These are the composite alarms that have AlarmRule parameters that reference the alarm named in ParentsOfAlarmName. Information about the alarm that you specify in ParentsOfAlarmName is not returned. If you specify ParentsOfAlarmName, you cannot specify any other parameters in the request except for MaxRecords and NextToken. If you do so, you receive a validation error.  Only the Alarm Name and ARN are returned by this operation when you use this parameter. To get complete information about these alarms, perform another DescribeAlarms operation and specify the parent alarm names in the AlarmNames parameter. 
    */
  var ParentsOfAlarmName: js.UndefOr[AlarmName] = js.undefined
  
  /**
    * Specify this parameter to receive information only about alarms that are currently in the state that you specify.
    */
  var StateValue: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.StateValue] = js.undefined
}
object DescribeAlarmsInputwaiter {
  
  inline def apply(): DescribeAlarmsInputwaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsInputwaiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlarmsInputwaiter] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setActionPrefix(value: ActionPrefix): Self = StObject.set(x, "ActionPrefix", value.asInstanceOf[js.Any])
    
    inline def setActionPrefixUndefined: Self = StObject.set(x, "ActionPrefix", js.undefined)
    
    inline def setAlarmNamePrefix(value: AlarmNamePrefix): Self = StObject.set(x, "AlarmNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamePrefixUndefined: Self = StObject.set(x, "AlarmNamePrefix", js.undefined)
    
    inline def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamesUndefined: Self = StObject.set(x, "AlarmNames", js.undefined)
    
    inline def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value*))
    
    inline def setAlarmTypes(value: AlarmTypes): Self = StObject.set(x, "AlarmTypes", value.asInstanceOf[js.Any])
    
    inline def setAlarmTypesUndefined: Self = StObject.set(x, "AlarmTypes", js.undefined)
    
    inline def setAlarmTypesVarargs(value: AlarmType*): Self = StObject.set(x, "AlarmTypes", js.Array(value*))
    
    inline def setChildrenOfAlarmName(value: AlarmName): Self = StObject.set(x, "ChildrenOfAlarmName", value.asInstanceOf[js.Any])
    
    inline def setChildrenOfAlarmNameUndefined: Self = StObject.set(x, "ChildrenOfAlarmName", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParentsOfAlarmName(value: AlarmName): Self = StObject.set(x, "ParentsOfAlarmName", value.asInstanceOf[js.Any])
    
    inline def setParentsOfAlarmNameUndefined: Self = StObject.set(x, "ParentsOfAlarmName", js.undefined)
    
    inline def setStateValue(value: StateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
    
    inline def setStateValueUndefined: Self = StObject.set(x, "StateValue", js.undefined)
  }
}
