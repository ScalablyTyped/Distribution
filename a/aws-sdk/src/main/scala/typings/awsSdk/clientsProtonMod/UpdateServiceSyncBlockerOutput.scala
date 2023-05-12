package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSyncBlockerOutput extends StObject {
  
  /**
    * The name of the service instance that you want to update the service sync blocker for.
    */
  var serviceInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the service that you want to update the service sync blocker for.
    */
  var serviceName: ResourceName
  
  /**
    * The detailed data on the service sync blocker that was updated.
    */
  var serviceSyncBlocker: SyncBlocker
}
object UpdateServiceSyncBlockerOutput {
  
  inline def apply(serviceName: ResourceName, serviceSyncBlocker: SyncBlocker): UpdateServiceSyncBlockerOutput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceSyncBlocker = serviceSyncBlocker.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSyncBlockerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceSyncBlockerOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncBlocker(value: SyncBlocker): Self = StObject.set(x, "serviceSyncBlocker", value.asInstanceOf[js.Any])
  }
}
