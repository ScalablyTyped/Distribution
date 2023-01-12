package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetails extends StObject {
  
  /**
    *  [Event-based policies only] The actions to be performed when the event-based policy is activated. You can specify only one action per policy.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    *  [Event-based policies only] The event that activates the event-based policy.
    */
  var EventSource: js.UndefOr[typings.awsSdk.clientsDlmMod.EventSource] = js.undefined
  
  /**
    *  [Snapshot and AMI policies only] A set of optional parameters for snapshot and AMI lifecycle policies.   If you are modifying a policy that was created or previously modified using the Amazon Data Lifecycle Manager console, then you must include this parameter and specify either the default values or the new values that you require. You can't omit this parameter or set its values to null. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsDlmMod.Parameters] = js.undefined
  
  /**
    *  [All policy types] The valid target resource types and actions a policy can manage. Specify EBS_SNAPSHOT_MANAGEMENT to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify IMAGE_MANAGEMENT to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify EVENT_BASED_POLICY  to create an event-based policy that performs specific actions when a defined event occurs in your Amazon Web Services account. The default is EBS_SNAPSHOT_MANAGEMENT.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined
  
  /**
    *  [Snapshot and AMI policies only] The location of the resources to backup. If the source resources are located in an Amazon Web Services Region, specify CLOUD. If the source resources are located on an Outpost in your account, specify OUTPOST. If you specify OUTPOST, Amazon Data Lifecycle Manager backs up all resources of the specified type with matching target tags across all of the Outposts in your account.
    */
  var ResourceLocations: js.UndefOr[ResourceLocationList] = js.undefined
  
  /**
    *  [Snapshot policies only] The target resource type for snapshot and AMI lifecycle policies. Use VOLUME to create snapshots of individual volumes or use INSTANCE to create multi-volume snapshots from the volumes for an instance.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
  
  /**
    *  [Snapshot and AMI policies only] The schedules of policy-defined actions for snapshot and AMI lifecycle policies. A policy can have up to four schedules—one mandatory schedule and up to three optional schedules.
    */
  var Schedules: js.UndefOr[ScheduleList] = js.undefined
  
  /**
    *  [Snapshot and AMI policies only] The single tag that identifies targeted resources for this policy.
    */
  var TargetTags: js.UndefOr[TargetTagList] = js.undefined
}
object PolicyDetails {
  
  inline def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setEventSource(value: EventSource): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setPolicyType(value: PolicyTypeValues): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    inline def setResourceLocations(value: ResourceLocationList): Self = StObject.set(x, "ResourceLocations", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationsUndefined: Self = StObject.set(x, "ResourceLocations", js.undefined)
    
    inline def setResourceLocationsVarargs(value: ResourceLocationValues*): Self = StObject.set(x, "ResourceLocations", js.Array(value*))
    
    inline def setResourceTypes(value: ResourceTypeValuesList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceTypeValues*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setSchedules(value: ScheduleList): Self = StObject.set(x, "Schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesUndefined: Self = StObject.set(x, "Schedules", js.undefined)
    
    inline def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "Schedules", js.Array(value*))
    
    inline def setTargetTags(value: TargetTagList): Self = StObject.set(x, "TargetTags", value.asInstanceOf[js.Any])
    
    inline def setTargetTagsUndefined: Self = StObject.set(x, "TargetTags", js.undefined)
    
    inline def setTargetTagsVarargs(value: Tag*): Self = StObject.set(x, "TargetTags", js.Array(value*))
  }
}
