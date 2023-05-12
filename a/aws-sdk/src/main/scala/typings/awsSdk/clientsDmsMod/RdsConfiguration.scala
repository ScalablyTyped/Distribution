package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsConfiguration extends StObject {
  
  /**
    * Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include Multi-AZ and Single-AZ deployments. Valid values include "MULTI_AZ" and "SINGLE_AZ".
    */
  var DeploymentOption: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the recommended target Amazon RDS engine edition.
    */
  var EngineEdition: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
    */
  var InstanceMemory: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Describes the recommended target Amazon RDS instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your requirements.
    */
  var InstanceVcpu: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB instance that meets your requirements.
    */
  var StorageIops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
    */
  var StorageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements. Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS SSD (also known as io1), and magnetic (also known as standard).
    */
  var StorageType: js.UndefOr[String] = js.undefined
}
object RdsConfiguration {
  
  inline def apply(): RdsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDeploymentOption(value: String): Self = StObject.set(x, "DeploymentOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOptionUndefined: Self = StObject.set(x, "DeploymentOption", js.undefined)
    
    inline def setEngineEdition(value: String): Self = StObject.set(x, "EngineEdition", value.asInstanceOf[js.Any])
    
    inline def setEngineEditionUndefined: Self = StObject.set(x, "EngineEdition", js.undefined)
    
    inline def setInstanceMemory(value: DoubleOptional): Self = StObject.set(x, "InstanceMemory", value.asInstanceOf[js.Any])
    
    inline def setInstanceMemoryUndefined: Self = StObject.set(x, "InstanceMemory", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setInstanceVcpu(value: DoubleOptional): Self = StObject.set(x, "InstanceVcpu", value.asInstanceOf[js.Any])
    
    inline def setInstanceVcpuUndefined: Self = StObject.set(x, "InstanceVcpu", js.undefined)
    
    inline def setStorageIops(value: IntegerOptional): Self = StObject.set(x, "StorageIops", value.asInstanceOf[js.Any])
    
    inline def setStorageIopsUndefined: Self = StObject.set(x, "StorageIops", js.undefined)
    
    inline def setStorageSize(value: IntegerOptional): Self = StObject.set(x, "StorageSize", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeUndefined: Self = StObject.set(x, "StorageSize", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
