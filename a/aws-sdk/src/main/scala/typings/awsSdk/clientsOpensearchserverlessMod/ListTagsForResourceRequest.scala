package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. The resource must be active (not in the DELETING state), and must be owned by the account ID included in the request.
    */
  var resourceArn: Arn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
