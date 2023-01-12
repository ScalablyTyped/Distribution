package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  The ARN of the Elastic Inference Accelerator to list the tags for. 
    */
  var resourceArn: ResourceARN_
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: ResourceARN_): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceARN_): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
