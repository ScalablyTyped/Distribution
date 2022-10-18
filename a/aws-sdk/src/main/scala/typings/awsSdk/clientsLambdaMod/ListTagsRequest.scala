package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    * The function's Amazon Resource Name (ARN). Note: Lambda does not support adding tags to aliases or versions.
    */
  var Resource: FunctionArn
}
object ListTagsRequest {
  
  inline def apply(Resource: FunctionArn): ListTagsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  extension [Self <: ListTagsRequest](x: Self) {
    
    inline def setResource(value: FunctionArn): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
