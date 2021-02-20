package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGraphqlApiResponse extends StObject {
  
  /**
    * The GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}
object GetGraphqlApiResponse {
  
  @scala.inline
  def apply(): GetGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGraphqlApiResponse]
  }
  
  @scala.inline
  implicit class GetGraphqlApiResponseMutableBuilder[Self <: GetGraphqlApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
