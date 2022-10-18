package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationFilterConfig extends StObject {
  
  /**
    *  The events that you want to receive notifications for. For example, you can choose to receive notifications only when the severity level is upgraded or a new insight is created. 
    */
  var MessageTypes: js.UndefOr[NotificationMessageTypes] = js.undefined
  
  /**
    *  The severity levels that you want to receive notifications for. For example, you can choose to receive notifications only for insights with HIGH and MEDIUM severity levels. For more information, see Understanding insight severities. 
    */
  var Severities: js.UndefOr[InsightSeverities] = js.undefined
}
object NotificationFilterConfig {
  
  inline def apply(): NotificationFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationFilterConfig]
  }
  
  extension [Self <: NotificationFilterConfig](x: Self) {
    
    inline def setMessageTypes(value: NotificationMessageTypes): Self = StObject.set(x, "MessageTypes", value.asInstanceOf[js.Any])
    
    inline def setMessageTypesUndefined: Self = StObject.set(x, "MessageTypes", js.undefined)
    
    inline def setMessageTypesVarargs(value: NotificationMessageType*): Self = StObject.set(x, "MessageTypes", js.Array(value*))
    
    inline def setSeverities(value: InsightSeverities): Self = StObject.set(x, "Severities", value.asInstanceOf[js.Any])
    
    inline def setSeveritiesUndefined: Self = StObject.set(x, "Severities", js.undefined)
    
    inline def setSeveritiesVarargs(value: InsightSeverity*): Self = StObject.set(x, "Severities", js.Array(value*))
  }
}
