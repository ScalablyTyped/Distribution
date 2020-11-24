package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApi extends js.Object {
  
  /**
    * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer.
    */
  var apiKeySource: js.UndefOr[ApiKeySourceType] = js.native
  
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  var binaryMediaTypes: js.UndefOr[ListOfString] = js.native
  
  /**
    * The timestamp when the API was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The API's description.
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
    * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
    */
  var minimumCompressionSize: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The API's name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
    */
  var policy: js.UndefOr[String] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * A version identifier for the API.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var warnings: js.UndefOr[ListOfString] = js.native
}
object RestApi {
  
  @scala.inline
  def apply(): RestApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApi]
  }
  
  @scala.inline
  implicit class RestApiOps[Self <: RestApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKeySource(value: ApiKeySourceType): Self = this.set("apiKeySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySource: Self = this.set("apiKeySource", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: String*): Self = this.set("binaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setBinaryMediaTypes(value: ListOfString): Self = this.set("binaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryMediaTypes: Self = this.set("binaryMediaTypes", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: Boolean): Self = this.set("disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExecuteApiEndpoint: Self = this.set("disableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: NullableInteger): Self = this.set("minimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCompressionSize: Self = this.set("minimumCompressionSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: ListOfString): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
