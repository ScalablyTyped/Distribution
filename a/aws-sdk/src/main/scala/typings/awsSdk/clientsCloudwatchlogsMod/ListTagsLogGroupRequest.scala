package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsLogGroupRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object ListTagsLogGroupRequest {
  
  inline def apply(logGroupName: LogGroupName): ListTagsLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsLogGroupRequest]
  }
  
  extension [Self <: ListTagsLogGroupRequest](x: Self) {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
