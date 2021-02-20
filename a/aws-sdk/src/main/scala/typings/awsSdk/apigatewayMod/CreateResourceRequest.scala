package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceRequest extends StObject {
  
  /**
    * [Required] The parent resource's identifier.
    */
  var parentId: String = js.native
  
  /**
    * The last path segment for this resource.
    */
  var pathPart: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object CreateResourceRequest {
  
  @scala.inline
  def apply(parentId: String, pathPart: String, restApiId: String): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceRequest]
  }
  
  @scala.inline
  implicit class CreateResourceRequestMutableBuilder[Self <: CreateResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPart(value: String): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
