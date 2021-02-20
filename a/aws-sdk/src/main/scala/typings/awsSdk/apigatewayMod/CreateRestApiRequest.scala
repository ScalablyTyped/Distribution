package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRestApiRequest extends StObject {
  
  /**
    * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer.
    */
  var apiKeySource: js.UndefOr[ApiKeySourceType] = js.native
  
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  var binaryMediaTypes: js.UndefOr[ListOfString] = js.native
  
  /**
    * The ID of the RestApi that you want to clone from.
    */
  var cloneFrom: js.UndefOr[String] = js.native
  
  /**
    * The description of the RestApi.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var disableExecuteApiEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API.
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.native
  
  /**
    * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
    */
  var minimumCompressionSize: js.UndefOr[NullableInteger] = js.native
  
  /**
    * [Required] The name of the RestApi.
    */
  var name: String = js.native
  
  /**
    * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
    */
  var policy: js.UndefOr[String] = js.native
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * A version identifier for the API.
    */
  var version: js.UndefOr[String] = js.native
}
object CreateRestApiRequest {
  
  @scala.inline
  def apply(name: String): CreateRestApiRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRestApiRequest]
  }
  
  @scala.inline
  implicit class CreateRestApiRequestMutableBuilder[Self <: CreateRestApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeySource(value: ApiKeySourceType): Self = StObject.set(x, "apiKeySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySourceUndefined: Self = StObject.set(x, "apiKeySource", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypes(value: ListOfString): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setCloneFrom(value: String): Self = StObject.set(x, "cloneFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneFromUndefined: Self = StObject.set(x, "cloneFrom", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: Boolean): Self = StObject.set(x, "disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "disableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: NullableInteger): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
