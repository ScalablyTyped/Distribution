package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackResourceSummary extends StObject {
  
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.undefined
  
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: js.Date
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.clientsCloudformationMod.LogicalResourceId
  
  /**
    * Contains information about the module from which the resource was created, if the resource was created from a module included in the stack template.
    */
  var ModuleInfo: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ModuleInfo] = js.undefined
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of the resource.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typings.awsSdk.clientsCloudformationMod.ResourceStatus
  
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ResourceStatusReason] = js.undefined
  
  /**
    * Type of resource. (For more information, go to Amazon Web Services Resource Types Reference in the CloudFormation User Guide.)
    */
  var ResourceType: typings.awsSdk.clientsCloudformationMod.ResourceType
}
object StackResourceSummary {
  
  inline def apply(
    LastUpdatedTimestamp: js.Date,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceSummary]
  }
  
  extension [Self <: StackResourceSummary](x: Self) {
    
    inline def setDriftInformation(value: StackResourceDriftInformationSummary): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    inline def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setModuleInfo(value: ModuleInfo): Self = StObject.set(x, "ModuleInfo", value.asInstanceOf[js.Any])
    
    inline def setModuleInfoUndefined: Self = StObject.set(x, "ModuleInfo", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusReason(value: ResourceStatusReason): Self = StObject.set(x, "ResourceStatusReason", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusReasonUndefined: Self = StObject.set(x, "ResourceStatusReason", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
