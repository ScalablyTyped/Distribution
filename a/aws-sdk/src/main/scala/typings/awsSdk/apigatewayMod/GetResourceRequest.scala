package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceRequest extends StObject {
  
  /**
    * A query parameter to retrieve the specified resources embedded in the returned Resource representation in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods.
    */
  var embed: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * [Required] The identifier for the Resource resource.
    */
  var resourceId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetResourceRequest {
  
  @scala.inline
  def apply(resourceId: String, restApiId: String): GetResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceRequest]
  }
  
  @scala.inline
  implicit class GetResourceRequestMutableBuilder[Self <: GetResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbed(value: ListOfString): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setEmbedVarargs(value: String*): Self = StObject.set(x, "embed", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
