package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppMonitorRequest extends StObject {
  
  /**
    * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito identity pool to use for authorization. If you don't include AppMonitorConfiguration, you must set up your own authorization method. For more information, see Authorize your application to send data to Amazon Web Services.
    */
  var AppMonitorConfiguration: js.UndefOr[typings.awsSdk.clientsRumMod.AppMonitorConfiguration] = js.undefined
  
  /**
    * Specifies whether this app monitor allows the web client to define and send custom events. The default is for custom events to be DISABLED. For more information about custom events, see Send custom events.
    */
  var CustomEvents: js.UndefOr[typings.awsSdk.clientsRumMod.CustomEvents] = js.undefined
  
  /**
    * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
    */
  var CwLogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The top-level internet domain name for which your application has administrative authority.
    */
  var Domain: js.UndefOr[AppMonitorDomain] = js.undefined
  
  /**
    * The name of the app monitor to update.
    */
  var Name: AppMonitorName
}
object UpdateAppMonitorRequest {
  
  inline def apply(Name: AppMonitorName): UpdateAppMonitorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppMonitorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppMonitorRequest] (val x: Self) extends AnyVal {
    
    inline def setAppMonitorConfiguration(value: AppMonitorConfiguration): Self = StObject.set(x, "AppMonitorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAppMonitorConfigurationUndefined: Self = StObject.set(x, "AppMonitorConfiguration", js.undefined)
    
    inline def setCustomEvents(value: CustomEvents): Self = StObject.set(x, "CustomEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomEventsUndefined: Self = StObject.set(x, "CustomEvents", js.undefined)
    
    inline def setCwLogEnabled(value: Boolean): Self = StObject.set(x, "CwLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setCwLogEnabledUndefined: Self = StObject.set(x, "CwLogEnabled", js.undefined)
    
    inline def setDomain(value: AppMonitorDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
