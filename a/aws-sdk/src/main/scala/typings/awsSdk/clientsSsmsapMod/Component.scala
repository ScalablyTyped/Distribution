package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
  
  /**
    * 
    */
  var ComponentId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentId] = js.undefined
  
  /**
    * 
    */
  var ComponentType: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentType] = js.undefined
  
  /**
    * 
    */
  var Databases: js.UndefOr[DatabaseIdList] = js.undefined
  
  /**
    * 
    */
  var Hosts: js.UndefOr[HostList] = js.undefined
  
  /**
    * 
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    */
  var PrimaryHost: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var Status: js.UndefOr[ComponentStatus] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "ComponentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "ComponentType", js.undefined)
    
    inline def setDatabases(value: DatabaseIdList): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
    
    inline def setDatabasesVarargs(value: DatabaseId*): Self = StObject.set(x, "Databases", js.Array(value*))
    
    inline def setHosts(value: HostList): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    inline def setHostsVarargs(value: Host*): Self = StObject.set(x, "Hosts", js.Array(value*))
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setPrimaryHost(value: String): Self = StObject.set(x, "PrimaryHost", value.asInstanceOf[js.Any])
    
    inline def setPrimaryHostUndefined: Self = StObject.set(x, "PrimaryHost", js.undefined)
    
    inline def setStatus(value: ComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
