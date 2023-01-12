package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogAnomalyClass extends StObject {
  
  /**
    *  The explanation for why the log event is considered an anomaly. 
    */
  var Explanation: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.Explanation] = js.undefined
  
  /**
    *  The token where the anomaly was detected. This may refer to an exception or another location, or it may be blank for log anomalies such as format anomalies. 
    */
  var LogAnomalyToken: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.LogAnomalyToken] = js.undefined
  
  /**
    *  The type of log anomaly that has been detected. 
    */
  var LogAnomalyType: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.LogAnomalyType] = js.undefined
  
  /**
    *  The ID of the log event. 
    */
  var LogEventId: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.LogEventId] = js.undefined
  
  /**
    *  The time of the first occurrence of the anomalous log event. 
    */
  var LogEventTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The name of the Amazon CloudWatch log stream that the anomalous log event belongs to. A log stream is a sequence of log events that share the same source. 
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.LogStreamName] = js.undefined
  
  /**
    *  The number of log lines where this anomalous log event occurs. 
    */
  var NumberOfLogLinesOccurrences: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.NumberOfLogLinesOccurrences] = js.undefined
}
object LogAnomalyClass {
  
  inline def apply(): LogAnomalyClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogAnomalyClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogAnomalyClass] (val x: Self) extends AnyVal {
    
    inline def setExplanation(value: Explanation): Self = StObject.set(x, "Explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "Explanation", js.undefined)
    
    inline def setLogAnomalyToken(value: LogAnomalyToken): Self = StObject.set(x, "LogAnomalyToken", value.asInstanceOf[js.Any])
    
    inline def setLogAnomalyTokenUndefined: Self = StObject.set(x, "LogAnomalyToken", js.undefined)
    
    inline def setLogAnomalyType(value: LogAnomalyType): Self = StObject.set(x, "LogAnomalyType", value.asInstanceOf[js.Any])
    
    inline def setLogAnomalyTypeUndefined: Self = StObject.set(x, "LogAnomalyType", js.undefined)
    
    inline def setLogEventId(value: LogEventId): Self = StObject.set(x, "LogEventId", value.asInstanceOf[js.Any])
    
    inline def setLogEventIdUndefined: Self = StObject.set(x, "LogEventId", js.undefined)
    
    inline def setLogEventTimestamp(value: js.Date): Self = StObject.set(x, "LogEventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLogEventTimestampUndefined: Self = StObject.set(x, "LogEventTimestamp", js.undefined)
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "LogStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "LogStreamName", js.undefined)
    
    inline def setNumberOfLogLinesOccurrences(value: NumberOfLogLinesOccurrences): Self = StObject.set(x, "NumberOfLogLinesOccurrences", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLogLinesOccurrencesUndefined: Self = StObject.set(x, "NumberOfLogLinesOccurrences", js.undefined)
  }
}
