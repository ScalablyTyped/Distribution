package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGraphqlApiResponse extends StObject {
  
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}
object CreateGraphqlApiResponse {
  
  @scala.inline
  def apply(): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
  
  @scala.inline
  implicit class CreateGraphqlApiResponseMutableBuilder[Self <: CreateGraphqlApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
