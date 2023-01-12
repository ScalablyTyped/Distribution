package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginSummary extends StObject {
  
  /**
    * The name of the host.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address at which the plugin is located.
    */
  var ipAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The ID of the plugin.
    */
  var pluginId: js.UndefOr[PluginId] = js.undefined
  
  /**
    * The time at which the plugin was registered.
    */
  var registeredTime: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the plugin.
    */
  var status: js.UndefOr[PluginHealth] = js.undefined
  
  /**
    * The version of the plugin.
    */
  var version: js.UndefOr[PluginVersion] = js.undefined
}
object PluginSummary {
  
  inline def apply(): PluginSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginSummary] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIpAddress(value: IPAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPluginId(value: PluginId): Self = StObject.set(x, "pluginId", value.asInstanceOf[js.Any])
    
    inline def setPluginIdUndefined: Self = StObject.set(x, "pluginId", js.undefined)
    
    inline def setRegisteredTime(value: String): Self = StObject.set(x, "registeredTime", value.asInstanceOf[js.Any])
    
    inline def setRegisteredTimeUndefined: Self = StObject.set(x, "registeredTime", js.undefined)
    
    inline def setStatus(value: PluginHealth): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: PluginVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
