package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The resource's ARN.
    */
  var resourceArn: TagArn
  
  /**
    * Tags for the resource.
    */
  var tags: TagResourceRequestTagsMap
}
object TagResourceRequest {
  
  inline def apply(resourceArn: TagArn, tags: TagResourceRequestTagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: TagArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagResourceRequestTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
