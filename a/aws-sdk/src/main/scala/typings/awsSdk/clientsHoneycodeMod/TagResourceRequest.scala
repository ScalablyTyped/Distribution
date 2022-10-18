package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The resource's Amazon Resource Name (ARN).
    */
  var resourceArn: ResourceArn
  
  /**
    * A list of tags to apply to the resource.
    */
  var tags: TagsMap
}
object TagResourceRequest {
  
  inline def apply(resourceArn: ResourceArn, tags: TagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
