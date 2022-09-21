package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfig extends StObject {
  
  /**
    * Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket. The default value is 1.
    */
  var instanceCount: js.UndefOr[InstanceConfigInstanceCountInteger] = js.undefined
  
  /**
    * Configures the type resource instances to use while running an Amazon Braket hybrid job.
    */
  var instanceType: InstanceType
  
  /**
    * The size of the storage volume, in GB, that user wants to provision.
    */
  var volumeSizeInGb: InstanceConfigVolumeSizeInGbInteger
}
object InstanceConfig {
  
  inline def apply(instanceType: InstanceType, volumeSizeInGb: InstanceConfigVolumeSizeInGbInteger): InstanceConfig = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], volumeSizeInGb = volumeSizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceConfig]
  }
  
  extension [Self <: InstanceConfig](x: Self) {
    
    inline def setInstanceCount(value: InstanceConfigInstanceCountInteger): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGb(value: InstanceConfigVolumeSizeInGbInteger): Self = StObject.set(x, "volumeSizeInGb", value.asInstanceOf[js.Any])
  }
}
