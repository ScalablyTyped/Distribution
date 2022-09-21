package typings.auth0.mod

import typings.auth0.anon.Cityname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEvent extends StObject {
  
  /** API audience the event applies to. */
  var audience: js.UndefOr[String] = js.undefined
  
  /** ID of the client (application). */
  var client_id: js.UndefOr[String] = js.undefined
  
  /** Name of the client (application). */
  var client_name: js.UndefOr[String] = js.undefined
  
  /** Name of the connection the event relates to. */
  var connection: js.UndefOr[String] = js.undefined
  
  /** ID of the connection the event relates to. */
  var connection_id: js.UndefOr[String] = js.undefined
  
  /** Date when the event occurred in ISO 8601 format. */
  var date: js.UndefOr[String] = js.undefined
  
  /** Description of this event. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Additional useful details about this event (structure is dependent upon event type). */
  var details: js.UndefOr[Any] = js.undefined
  
  /** Hostname the event applies to. */
  var hostname: js.UndefOr[String] = js.undefined
  
  /** IP address of the log event source. */
  var ip: js.UndefOr[String] = js.undefined
  
  /** Whether the client was a mobile device (true) or desktop/laptop/server (false). */
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  /** Information about the location that triggered this event based on the ip. */
  var location_info: js.UndefOr[Cityname] = js.undefined
  
  /** Unique ID of the event. */
  var log_id: js.UndefOr[String] = js.undefined
  
  /** Scope permissions applied to the event. */
  var scope: js.UndefOr[String] = js.undefined
  
  /** Name of the strategy involved in the event. */
  var strategy: js.UndefOr[String] = js.undefined
  
  /** Type of strategy involved in the event. */
  var strategy_type: js.UndefOr[String] = js.undefined
  
  /** Type of event. */
  var `type`: js.UndefOr[LogEventTypeCode] = js.undefined
  
  /** User agent string from the client device that caused the event. */
  var user_agent: js.UndefOr[String] = js.undefined
  
  /** ID of the user involved in the event. */
  var user_id: js.UndefOr[String] = js.undefined
  
  /** Name of the user involved in the event. */
  var user_name: js.UndefOr[String] = js.undefined
}
object LogEvent {
  
  inline def apply(): LogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEvent]
  }
  
  extension [Self <: LogEvent](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setClient_name(value: String): Self = StObject.set(x, "client_name", value.asInstanceOf[js.Any])
    
    inline def setClient_nameUndefined: Self = StObject.set(x, "client_name", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    inline def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setLocation_info(value: Cityname): Self = StObject.set(x, "location_info", value.asInstanceOf[js.Any])
    
    inline def setLocation_infoUndefined: Self = StObject.set(x, "location_info", js.undefined)
    
    inline def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    inline def setLog_idUndefined: Self = StObject.set(x, "log_id", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setStrategy_type(value: String): Self = StObject.set(x, "strategy_type", value.asInstanceOf[js.Any])
    
    inline def setStrategy_typeUndefined: Self = StObject.set(x, "strategy_type", js.undefined)
    
    inline def setType(value: LogEventTypeCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setUser_name(value: String): Self = StObject.set(x, "user_name", value.asInstanceOf[js.Any])
    
    inline def setUser_nameUndefined: Self = StObject.set(x, "user_name", js.undefined)
  }
}
