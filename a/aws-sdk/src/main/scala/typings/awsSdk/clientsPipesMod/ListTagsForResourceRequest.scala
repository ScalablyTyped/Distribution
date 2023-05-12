package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the pipe for which you want to view tags.
    */
  var resourceArn: PipeArn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: PipeArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: PipeArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
