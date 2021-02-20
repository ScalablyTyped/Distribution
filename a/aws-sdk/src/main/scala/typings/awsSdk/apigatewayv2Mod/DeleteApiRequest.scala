package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
}
object DeleteApiRequest {
  
  @scala.inline
  def apply(ApiId: string): DeleteApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiRequest]
  }
  
  @scala.inline
  implicit class DeleteApiRequestMutableBuilder[Self <: DeleteApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
  }
}
