package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStorageRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: string
  
  /**
    * 
    EBS volume provisioned throughput information.
    
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.clientsKafkaMod.ProvisionedThroughput] = js.undefined
  
  /**
    * 
    Controls storage mode for supported storage tiers.
    
    */
  var StorageMode: js.UndefOr[typings.awsSdk.clientsKafkaMod.StorageMode] = js.undefined
  
  /**
    * 
    size of the EBS volume to update.
    
    */
  var VolumeSizeGB: js.UndefOr[integer] = js.undefined
}
object UpdateStorageRequest {
  
  inline def apply(ClusterArn: string, CurrentVersion: string): UpdateStorageRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStorageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStorageRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setStorageMode(value: StorageMode): Self = StObject.set(x, "StorageMode", value.asInstanceOf[js.Any])
    
    inline def setStorageModeUndefined: Self = StObject.set(x, "StorageMode", js.undefined)
    
    inline def setVolumeSizeGB(value: integer): Self = StObject.set(x, "VolumeSizeGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeGBUndefined: Self = StObject.set(x, "VolumeSizeGB", js.undefined)
  }
}
