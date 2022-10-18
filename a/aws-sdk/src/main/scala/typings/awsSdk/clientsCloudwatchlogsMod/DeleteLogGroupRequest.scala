package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLogGroupRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object DeleteLogGroupRequest {
  
  inline def apply(logGroupName: LogGroupName): DeleteLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogGroupRequest]
  }
  
  extension [Self <: DeleteLogGroupRequest](x: Self) {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
