package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource. 
    */
  var resourceArn: Arn
  
  /**
    * The tags to add to the resource.
    */
  var tags: TagMap
}
object TagResourceRequest {
  
  inline def apply(resourceArn: Arn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
