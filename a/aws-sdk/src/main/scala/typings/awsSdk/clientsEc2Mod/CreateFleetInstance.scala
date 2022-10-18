package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetInstance extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var InstanceIds: js.UndefOr[InstanceIdsSet] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined
  
  /**
    * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined
  
  /**
    * The value is Windows for Windows instances. Otherwise, the value is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
}
object CreateFleetInstance {
  
  inline def apply(): CreateFleetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetInstance]
  }
  
  extension [Self <: CreateFleetInstance](x: Self) {
    
    inline def setInstanceIds(value: InstanceIdsSet): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLaunchTemplateAndOverrides(value: LaunchTemplateAndOverridesResponse): Self = StObject.set(x, "LaunchTemplateAndOverrides", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateAndOverridesUndefined: Self = StObject.set(x, "LaunchTemplateAndOverrides", js.undefined)
    
    inline def setLifecycle(value: InstanceLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
  }
}
