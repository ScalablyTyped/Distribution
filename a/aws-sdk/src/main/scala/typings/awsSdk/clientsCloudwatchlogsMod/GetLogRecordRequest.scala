package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogRecordRequest extends StObject {
  
  /**
    * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a GetQueryResults operation. In that response, the value of the @ptr field for a log event is the value to use as logRecordPointer to retrieve that complete log event record.
    */
  var logRecordPointer: LogRecordPointer
  
  /**
    * Specify true to display the log event fields with all sensitive data unmasked and visible. The default is false. To use this operation with this parameter, you must be signed into an account with the logs:Unmask permission.
    */
  var unmask: js.UndefOr[Unmask] = js.undefined
}
object GetLogRecordRequest {
  
  inline def apply(logRecordPointer: LogRecordPointer): GetLogRecordRequest = {
    val __obj = js.Dynamic.literal(logRecordPointer = logRecordPointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRecordRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogRecordRequest] (val x: Self) extends AnyVal {
    
    inline def setLogRecordPointer(value: LogRecordPointer): Self = StObject.set(x, "logRecordPointer", value.asInstanceOf[js.Any])
    
    inline def setUnmask(value: Unmask): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
  }
}
