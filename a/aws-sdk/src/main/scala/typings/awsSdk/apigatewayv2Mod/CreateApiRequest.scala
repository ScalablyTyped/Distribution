package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiRequest extends js.Object {
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * A CORS configuration. Supported only for HTTP APIs. See Configuring CORS for more information.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  /**
    * This property is part of quick create. It specifies the credentials required for the integration, if any. For a Lambda integration, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null. Currently, this property is not used for HTTP integrations. Supported only for HTTP APIs.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  /**
    * The name of the API.
    */
  var Name: StringWithLengthBetween1And128 = js.native
  /**
    * The API protocol.
    */
  var ProtocolType: typings.awsSdk.apigatewayv2Mod.ProtocolType = js.native
  /**
    * This property is part of quick create. If you don't specify a routeKey, a default route of $default is created. The $default route acts as a catch-all for any request made to your API, for a particular stage. The $default route key can't be modified. You can add routes after creating the API, and you can update the route keys of additional routes. Supported only for HTTP APIs.
    */
  var RouteKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * This property is part of quick create. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes. For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
    */
  var Target: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
}

object CreateApiRequest {
  @scala.inline
  def apply(Name: StringWithLengthBetween1And128, ProtocolType: ProtocolType): CreateApiRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiRequest]
  }
  @scala.inline
  implicit class CreateApiRequestOps[Self <: CreateApiRequest] (val x: Self) extends AnyVal {
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
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolType(value: ProtocolType): Self = this.set("ProtocolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiKeySelectionExpression(value: SelectionExpression): Self = this.set("ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeySelectionExpression: Self = this.set("ApiKeySelectionExpression", js.undefined)
    @scala.inline
    def setCorsConfiguration(value: Cors): Self = this.set("CorsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorsConfiguration: Self = this.set("CorsConfiguration", js.undefined)
    @scala.inline
    def setCredentialsArn(value: Arn): Self = this.set("CredentialsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialsArn: Self = this.set("CredentialsArn", js.undefined)
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisableSchemaValidation(value: boolean): Self = this.set("DisableSchemaValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSchemaValidation: Self = this.set("DisableSchemaValidation", js.undefined)
    @scala.inline
    def setRouteKey(value: SelectionKey): Self = this.set("RouteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteKey: Self = this.set("RouteKey", js.undefined)
    @scala.inline
    def setRouteSelectionExpression(value: SelectionExpression): Self = this.set("RouteSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteSelectionExpression: Self = this.set("RouteSelectionExpression", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTarget(value: UriWithLengthBetween1And2048): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    @scala.inline
    def setVersion(value: StringWithLengthBetween1And64): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

