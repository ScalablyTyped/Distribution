package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * Specifies the Amazon Resoure Name (ARN) of the resource share that you want to add tags to.
    */
  var resourceShareArn: String
  
  /**
    * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag value must be present but can be an empty string.
    */
  var tags: TagList
}
object TagResourceRequest {
  
  inline def apply(resourceShareArn: String, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
