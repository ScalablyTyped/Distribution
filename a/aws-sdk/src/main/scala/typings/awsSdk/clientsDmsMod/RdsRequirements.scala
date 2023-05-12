package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsRequirements extends StObject {
  
  /**
    * The required deployment option for the Amazon RDS DB instance. Valid values include "MULTI_AZ" for Multi-AZ deployments and "SINGLE_AZ" for Single-AZ deployments.
    */
  var DeploymentOption: js.UndefOr[String] = js.undefined
  
  /**
    * The required target Amazon RDS engine edition.
    */
  var EngineEdition: js.UndefOr[String] = js.undefined
  
  /**
    * The required memory on the Amazon RDS DB instance.
    */
  var InstanceMemory: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
    */
  var InstanceVcpu: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
    */
  var StorageIops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The required Amazon RDS DB instance storage size.
    */
  var StorageSize: js.UndefOr[IntegerOptional] = js.undefined
}
object RdsRequirements {
  
  inline def apply(): RdsRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsRequirements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsRequirements] (val x: Self) extends AnyVal {
    
    inline def setDeploymentOption(value: String): Self = StObject.set(x, "DeploymentOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOptionUndefined: Self = StObject.set(x, "DeploymentOption", js.undefined)
    
    inline def setEngineEdition(value: String): Self = StObject.set(x, "EngineEdition", value.asInstanceOf[js.Any])
    
    inline def setEngineEditionUndefined: Self = StObject.set(x, "EngineEdition", js.undefined)
    
    inline def setInstanceMemory(value: DoubleOptional): Self = StObject.set(x, "InstanceMemory", value.asInstanceOf[js.Any])
    
    inline def setInstanceMemoryUndefined: Self = StObject.set(x, "InstanceMemory", js.undefined)
    
    inline def setInstanceVcpu(value: DoubleOptional): Self = StObject.set(x, "InstanceVcpu", value.asInstanceOf[js.Any])
    
    inline def setInstanceVcpuUndefined: Self = StObject.set(x, "InstanceVcpu", js.undefined)
    
    inline def setStorageIops(value: IntegerOptional): Self = StObject.set(x, "StorageIops", value.asInstanceOf[js.Any])
    
    inline def setStorageIopsUndefined: Self = StObject.set(x, "StorageIops", js.undefined)
    
    inline def setStorageSize(value: IntegerOptional): Self = StObject.set(x, "StorageSize", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeUndefined: Self = StObject.set(x, "StorageSize", js.undefined)
  }
}
