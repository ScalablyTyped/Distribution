package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline to retrieve tags for.
    */
  var Arn: PipelineArn
}
object ListTagsForResourceRequest {
  
  inline def apply(Arn: PipelineArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PipelineArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
