package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestinationConfig extends StObject {
  
  /**
    * The name of the log group where the project stores evaluation events.
    */
  var logGroup: js.UndefOr[CwLogGroupSafeName] = js.undefined
}
object CloudWatchLogsDestinationConfig {
  
  inline def apply(): CloudWatchLogsDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestinationConfig]
  }
  
  extension [Self <: CloudWatchLogsDestinationConfig](x: Self) {
    
    inline def setLogGroup(value: CwLogGroupSafeName): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
