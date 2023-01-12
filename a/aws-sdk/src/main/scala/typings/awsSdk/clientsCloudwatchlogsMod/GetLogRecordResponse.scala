package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogRecordResponse extends StObject {
  
  /**
    * The requested log event, as a JSON string.
    */
  var logRecord: js.UndefOr[LogRecord] = js.undefined
}
object GetLogRecordResponse {
  
  inline def apply(): GetLogRecordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogRecordResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogRecordResponse] (val x: Self) extends AnyVal {
    
    inline def setLogRecord(value: LogRecord): Self = StObject.set(x, "logRecord", value.asInstanceOf[js.Any])
    
    inline def setLogRecordUndefined: Self = StObject.set(x, "logRecord", js.undefined)
  }
}
