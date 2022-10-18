package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which to retrieve tags.
    */
  var ResourceArn: GlueResourceArn
}
object GetTagsRequest {
  
  inline def apply(ResourceArn: GlueResourceArn): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  
  extension [Self <: GetTagsRequest](x: Self) {
    
    inline def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
