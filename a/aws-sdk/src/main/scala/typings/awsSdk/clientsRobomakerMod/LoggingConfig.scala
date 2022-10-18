package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /**
    * A boolean indicating whether to record all ROS topics.  This API is no longer supported and will throw an error if used. 
    */
  var recordAllRosTopics: js.UndefOr[BoxedBoolean] = js.undefined
}
object LoggingConfig {
  
  inline def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  
  extension [Self <: LoggingConfig](x: Self) {
    
    inline def setRecordAllRosTopics(value: BoxedBoolean): Self = StObject.set(x, "recordAllRosTopics", value.asInstanceOf[js.Any])
    
    inline def setRecordAllRosTopicsUndefined: Self = StObject.set(x, "recordAllRosTopics", js.undefined)
  }
}
