package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGraphqlApiResponse extends StObject {
  
  /**
    * The updated GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}
object UpdateGraphqlApiResponse {
  
  @scala.inline
  def apply(): UpdateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGraphqlApiResponse]
  }
  
  @scala.inline
  implicit class UpdateGraphqlApiResponseMutableBuilder[Self <: UpdateGraphqlApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
