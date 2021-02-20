package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGraphqlApiRequest extends StObject {
  
  /**
    * The API ID for the GraphQL API.
    */
  var apiId: String = js.native
}
object GetGraphqlApiRequest {
  
  @scala.inline
  def apply(apiId: String): GetGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGraphqlApiRequest]
  }
  
  @scala.inline
  implicit class GetGraphqlApiRequestMutableBuilder[Self <: GetGraphqlApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
