package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesRequest extends StObject {
  
  /**
    * A query parameter used to retrieve the specified resources embedded in the returned Resources resource in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources?embed=methods.
    */
  var embed: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetResourcesRequest {
  
  @scala.inline
  def apply(restApiId: String): GetResourcesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesRequest]
  }
  
  @scala.inline
  implicit class GetResourcesRequestMutableBuilder[Self <: GetResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbed(value: ListOfString): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setEmbedVarargs(value: String*): Self = StObject.set(x, "embed", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
