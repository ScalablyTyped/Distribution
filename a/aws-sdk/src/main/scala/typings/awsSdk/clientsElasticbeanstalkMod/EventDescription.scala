package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDescription extends StObject {
  
  /**
    * The application associated with the event.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The name of the environment associated with this event.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The date when the event occurred.
    */
  var EventDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The event message.
    */
  var Message: js.UndefOr[EventMessage] = js.undefined
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The web service request ID for the activity of this event.
    */
  var RequestId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.RequestId] = js.undefined
  
  /**
    * The severity level of this event.
    */
  var Severity: js.UndefOr[EventSeverity] = js.undefined
  
  /**
    * The name of the configuration associated with this event.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  
  /**
    * The release label for the application version associated with this event.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}
object EventDescription {
  
  inline def apply(): EventDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescription]
  }
  
  extension [Self <: EventDescription](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setEventDate(value: js.Date): Self = StObject.set(x, "EventDate", value.asInstanceOf[js.Any])
    
    inline def setEventDateUndefined: Self = StObject.set(x, "EventDate", js.undefined)
    
    inline def setMessage(value: EventMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setSeverity(value: EventSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
