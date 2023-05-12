package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupModifyConfig extends StObject {
  
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The Amazon EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined
  
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Unique ID of the instance group to modify.
    */
  var InstanceGroupId: XmlStringMaxLen256
  
  /**
    * Type of reconfiguration requested. Valid values are MERGE and OVERWRITE.
    */
  var ReconfigurationType: js.UndefOr[typings.awsSdk.clientsEmrMod.ReconfigurationType] = js.undefined
  
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.clientsEmrMod.ShrinkPolicy] = js.undefined
}
object InstanceGroupModifyConfig {
  
  inline def apply(InstanceGroupId: XmlStringMaxLen256): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupModifyConfig] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setEC2InstanceIdsToTerminate(value: EC2InstanceIdsToTerminateList): Self = StObject.set(x, "EC2InstanceIdsToTerminate", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceIdsToTerminateUndefined: Self = StObject.set(x, "EC2InstanceIdsToTerminate", js.undefined)
    
    inline def setEC2InstanceIdsToTerminateVarargs(value: InstanceId*): Self = StObject.set(x, "EC2InstanceIdsToTerminate", js.Array(value*))
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    inline def setReconfigurationType(value: ReconfigurationType): Self = StObject.set(x, "ReconfigurationType", value.asInstanceOf[js.Any])
    
    inline def setReconfigurationTypeUndefined: Self = StObject.set(x, "ReconfigurationType", js.undefined)
    
    inline def setShrinkPolicy(value: ShrinkPolicy): Self = StObject.set(x, "ShrinkPolicy", value.asInstanceOf[js.Any])
    
    inline def setShrinkPolicyUndefined: Self = StObject.set(x, "ShrinkPolicy", js.undefined)
  }
}
