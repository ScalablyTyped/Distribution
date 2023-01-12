package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledAction extends StObject {
  
  /**
    * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not trigger. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see Using Identity-Based Policies for Amazon Redshift in the Amazon Redshift Cluster Management Guide. 
    */
  var IamRole: js.UndefOr[String] = js.undefined
  
  /**
    * List of times when the scheduled action will run. 
    */
  var NextInvocations: js.UndefOr[ScheduledActionTimeList] = js.undefined
  
  /**
    * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be separated by at least one hour. Format of at expressions is "at(yyyy-mm-ddThh:mm:ss)". For example, "at(2016-03-04T17:27:00)". Format of cron expressions is "cron(Minutes Hours Day-of-month Month Day-of-week Year)". For example, "cron(0 10 ? * MON *)". For more information, see Cron Expressions in the Amazon CloudWatch Events User Guide.
    */
  var Schedule: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the scheduled action. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.undefined
  
  /**
    * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the scheduled action. For example, DISABLED. 
    */
  var State: js.UndefOr[ScheduledActionState] = js.undefined
  
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters.  "{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}". 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.undefined
}
object ScheduledAction {
  
  inline def apply(): ScheduledAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledAction] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setIamRole(value: String): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    inline def setNextInvocations(value: ScheduledActionTimeList): Self = StObject.set(x, "NextInvocations", value.asInstanceOf[js.Any])
    
    inline def setNextInvocationsUndefined: Self = StObject.set(x, "NextInvocations", js.undefined)
    
    inline def setNextInvocationsVarargs(value: js.Date*): Self = StObject.set(x, "NextInvocations", js.Array(value*))
    
    inline def setSchedule(value: String): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setScheduledActionDescription(value: String): Self = StObject.set(x, "ScheduledActionDescription", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionDescriptionUndefined: Self = StObject.set(x, "ScheduledActionDescription", js.undefined)
    
    inline def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNameUndefined: Self = StObject.set(x, "ScheduledActionName", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: ScheduledActionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTargetAction(value: ScheduledActionType): Self = StObject.set(x, "TargetAction", value.asInstanceOf[js.Any])
    
    inline def setTargetActionUndefined: Self = StObject.set(x, "TargetAction", js.undefined)
  }
}
