package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiResponse extends js.Object {
  
  /**
    * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether an API is managed by API Gateway. You can't update or delete a managed API by using API Gateway. A managed API can be deleted only through the tooling or service that created it.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  
  /**
    * The API ID.
    */
  var ApiId: js.UndefOr[Id] = js.native
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  
  /**
    * The timestamp when the API was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var DisableExecuteApiEndpoint: js.UndefOr[boolean] = js.native
  
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  
  /**
    * The validation information during API import. This may include particular properties of your OpenAPI definition which are ignored during import. Supported only for HTTP APIs.
    */
  var ImportInfo: js.UndefOr[listOfString] = js.native
  
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The API protocol.
    */
  var ProtocolType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ProtocolType] = js.native
  
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * A collection of tags associated with the API.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var Warnings: js.UndefOr[listOfString] = js.native
}
object CreateApiResponse {
  
  @scala.inline
  def apply(): CreateApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiResponse]
  }
  
  @scala.inline
  implicit class CreateApiResponseOps[Self <: CreateApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiEndpoint(value: string): Self = this.set("ApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiEndpoint: Self = this.set("ApiEndpoint", js.undefined)
    
    @scala.inline
    def setApiGatewayManaged(value: boolean): Self = this.set("ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiGatewayManaged: Self = this.set("ApiGatewayManaged", js.undefined)
    
    @scala.inline
    def setApiId(value: Id): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiId: Self = this.set("ApiId", js.undefined)
    
    @scala.inline
    def setApiKeySelectionExpression(value: SelectionExpression): Self = this.set("ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySelectionExpression: Self = this.set("ApiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: Cors): Self = this.set("CorsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsConfiguration: Self = this.set("CorsConfiguration", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: boolean): Self = this.set("DisableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExecuteApiEndpoint: Self = this.set("DisableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setDisableSchemaValidation(value: boolean): Self = this.set("DisableSchemaValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSchemaValidation: Self = this.set("DisableSchemaValidation", js.undefined)
    
    @scala.inline
    def setImportInfoVarargs(value: string*): Self = this.set("ImportInfo", js.Array(value :_*))
    
    @scala.inline
    def setImportInfo(value: listOfString): Self = this.set("ImportInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportInfo: Self = this.set("ImportInfo", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProtocolType(value: ProtocolType): Self = this.set("ProtocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolType: Self = this.set("ProtocolType", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: SelectionExpression): Self = this.set("RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSelectionExpression: Self = this.set("RouteSelectionExpression", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVersion(value: StringWithLengthBetween1And64): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: string*): Self = this.set("Warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: listOfString): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("Warnings", js.undefined)
  }
}
