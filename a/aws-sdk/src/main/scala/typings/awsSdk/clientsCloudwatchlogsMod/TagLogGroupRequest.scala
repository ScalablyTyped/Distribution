package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagLogGroupRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The key-value pairs to use for the tags.
    */
  var tags: Tags
}
object TagLogGroupRequest {
  
  inline def apply(logGroupName: LogGroupName, tags: Tags): TagLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagLogGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagLogGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
