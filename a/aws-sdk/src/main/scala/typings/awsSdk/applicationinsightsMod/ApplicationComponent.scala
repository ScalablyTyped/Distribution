package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationComponent extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentName] = js.undefined
  
  /**
    *  If logging is supported for the resource type, indicates whether the component has configured logs to be monitored. 
    */
  var ComponentRemarks: js.UndefOr[Remarks] = js.undefined
  
  /**
    *  Workloads detected in the application component. 
    */
  var DetectedWorkload: js.UndefOr[typings.awsSdk.applicationinsightsMod.DetectedWorkload] = js.undefined
  
  /**
    * Indicates whether the application component is monitored. 
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.undefined
  
  /**
    *  The operating system of the component. 
    */
  var OsType: js.UndefOr[typings.awsSdk.applicationinsightsMod.OsType] = js.undefined
  
  /**
    * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application ELB, and SQS Queue.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceType] = js.undefined
  
  /**
    * The stack tier of the application component.
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.undefined
}
object ApplicationComponent {
  
  inline def apply(): ApplicationComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponent]
  }
  
  extension [Self <: ApplicationComponent](x: Self) {
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "ComponentName", js.undefined)
    
    inline def setComponentRemarks(value: Remarks): Self = StObject.set(x, "ComponentRemarks", value.asInstanceOf[js.Any])
    
    inline def setComponentRemarksUndefined: Self = StObject.set(x, "ComponentRemarks", js.undefined)
    
    inline def setDetectedWorkload(value: DetectedWorkload): Self = StObject.set(x, "DetectedWorkload", value.asInstanceOf[js.Any])
    
    inline def setDetectedWorkloadUndefined: Self = StObject.set(x, "DetectedWorkload", js.undefined)
    
    inline def setMonitor(value: Monitor): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    inline def setOsType(value: OsType): Self = StObject.set(x, "OsType", value.asInstanceOf[js.Any])
    
    inline def setOsTypeUndefined: Self = StObject.set(x, "OsType", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
