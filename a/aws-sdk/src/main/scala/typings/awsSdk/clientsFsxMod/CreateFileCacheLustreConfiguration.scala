package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileCacheLustreConfiguration extends StObject {
  
  /**
    * Specifies the cache deployment type, which must be CACHE_1.
    */
  var DeploymentType: FileCacheLustreDeploymentType
  
  /**
    * The configuration for a Lustre MDT (Metadata Target) storage volume.
    */
  var MetadataConfiguration: FileCacheLustreMetadataConfiguration
  
  /**
    * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in MB/s/TiB. The only supported value is 1000.
    */
  var PerUnitStorageThroughput: typings.awsSdk.clientsFsxMod.PerUnitStorageThroughput
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object CreateFileCacheLustreConfiguration {
  
  inline def apply(
    DeploymentType: FileCacheLustreDeploymentType,
    MetadataConfiguration: FileCacheLustreMetadataConfiguration,
    PerUnitStorageThroughput: PerUnitStorageThroughput
  ): CreateFileCacheLustreConfiguration = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], MetadataConfiguration = MetadataConfiguration.asInstanceOf[js.Any], PerUnitStorageThroughput = PerUnitStorageThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileCacheLustreConfiguration]
  }
  
  extension [Self <: CreateFileCacheLustreConfiguration](x: Self) {
    
    inline def setDeploymentType(value: FileCacheLustreDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setMetadataConfiguration(value: FileCacheLustreMetadataConfiguration): Self = StObject.set(x, "MetadataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
