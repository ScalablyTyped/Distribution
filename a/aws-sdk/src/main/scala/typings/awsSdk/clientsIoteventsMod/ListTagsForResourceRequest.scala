package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
