package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMonitor extends StObject {
  
  /**
    * A structure that contains much of the configuration data for the app monitor.
    */
  var AppMonitorConfiguration: js.UndefOr[typings.awsSdk.clientsRumMod.AppMonitorConfiguration] = js.undefined
  
  /**
    * The date and time that this app monitor was created.
    */
  var Created: js.UndefOr[ISOTimestampString] = js.undefined
  
  /**
    * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM collects using CloudWatch Logs.
    */
  var DataStorage: js.UndefOr[typings.awsSdk.clientsRumMod.DataStorage] = js.undefined
  
  /**
    * The top-level internet domain name for which your application has administrative authority.
    */
  var Domain: js.UndefOr[AppMonitorDomain] = js.undefined
  
  /**
    * The unique ID of this app monitor.
    */
  var Id: js.UndefOr[AppMonitorId] = js.undefined
  
  /**
    * The date and time of the most recent changes to this app monitor's configuration.
    */
  var LastModified: js.UndefOr[ISOTimestampString] = js.undefined
  
  /**
    * The name of the app monitor.
    */
  var Name: js.UndefOr[AppMonitorName] = js.undefined
  
  /**
    * The current state of the app monitor.
    */
  var State: js.UndefOr[StateEnum] = js.undefined
  
  /**
    * The list of tag keys and values associated with this app monitor.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object AppMonitor {
  
  inline def apply(): AppMonitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMonitor]
  }
  
  extension [Self <: AppMonitor](x: Self) {
    
    inline def setAppMonitorConfiguration(value: AppMonitorConfiguration): Self = StObject.set(x, "AppMonitorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAppMonitorConfigurationUndefined: Self = StObject.set(x, "AppMonitorConfiguration", js.undefined)
    
    inline def setCreated(value: ISOTimestampString): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDataStorage(value: DataStorage): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    inline def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    inline def setDomain(value: AppMonitorDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setId(value: AppMonitorId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastModified(value: ISOTimestampString): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
