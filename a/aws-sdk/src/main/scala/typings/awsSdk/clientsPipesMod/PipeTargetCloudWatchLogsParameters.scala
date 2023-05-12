package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetCloudWatchLogsParameters extends StObject {
  
  /**
    * The name of the log stream.
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.clientsPipesMod.LogStreamName] = js.undefined
  
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var Timestamp: js.UndefOr[JsonPath] = js.undefined
}
object PipeTargetCloudWatchLogsParameters {
  
  inline def apply(): PipeTargetCloudWatchLogsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetCloudWatchLogsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetCloudWatchLogsParameters] (val x: Self) extends AnyVal {
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "LogStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "LogStreamName", js.undefined)
    
    inline def setTimestamp(value: JsonPath): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
