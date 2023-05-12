package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSyncBlockerSummary extends StObject {
  
  /**
    * The latest active blockers for the synced service.
    */
  var latestBlockers: js.UndefOr[LatestSyncBlockers] = js.undefined
  
  /**
    * The name of the service instance that you want sync your service configuration with.
    */
  var serviceInstanceName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service that you want to get the sync blocker summary for. If given a service instance name and a service name, it will return the blockers only applying to the instance that is blocked. If given only a service name, it will return the blockers that apply to all of the instances. In order to get the blockers for a single instance, you will need to make two distinct calls, one to get the sync blocker summary for the service and the other to get the sync blocker for the service instance.
    */
  var serviceName: String
}
object ServiceSyncBlockerSummary {
  
  inline def apply(serviceName: String): ServiceSyncBlockerSummary = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSyncBlockerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceSyncBlockerSummary] (val x: Self) extends AnyVal {
    
    inline def setLatestBlockers(value: LatestSyncBlockers): Self = StObject.set(x, "latestBlockers", value.asInstanceOf[js.Any])
    
    inline def setLatestBlockersUndefined: Self = StObject.set(x, "latestBlockers", js.undefined)
    
    inline def setLatestBlockersVarargs(value: SyncBlocker*): Self = StObject.set(x, "latestBlockers", js.Array(value*))
    
    inline def setServiceInstanceName(value: String): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
