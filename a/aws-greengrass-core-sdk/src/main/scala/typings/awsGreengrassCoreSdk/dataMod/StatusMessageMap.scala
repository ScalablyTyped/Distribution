package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusMessageMap extends StObject {
  
  var eventType: EventTypeMap
  
  var message: js.UndefOr[String] = js.undefined
  
  var status: StatusMap
  
  var statusContext: StatusContextMap
  
  var statusLevel: StatusLevelMap
  
  var timestampEpochMs: js.UndefOr[Double] = js.undefined
}
object StatusMessageMap {
  
  inline def apply(
    eventType: EventTypeMap,
    status: StatusMap,
    statusContext: StatusContextMap,
    statusLevel: StatusLevelMap
  ): StatusMessageMap = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusContext = statusContext.asInstanceOf[js.Any], statusLevel = statusLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusMessageMap]
  }
  
  extension [Self <: StatusMessageMap](x: Self) {
    
    inline def setEventType(value: EventTypeMap): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: StatusMap): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusContext(value: StatusContextMap): Self = StObject.set(x, "statusContext", value.asInstanceOf[js.Any])
    
    inline def setStatusLevel(value: StatusLevelMap): Self = StObject.set(x, "statusLevel", value.asInstanceOf[js.Any])
    
    inline def setTimestampEpochMs(value: Double): Self = StObject.set(x, "timestampEpochMs", value.asInstanceOf[js.Any])
    
    inline def setTimestampEpochMsUndefined: Self = StObject.set(x, "timestampEpochMs", js.undefined)
  }
}
