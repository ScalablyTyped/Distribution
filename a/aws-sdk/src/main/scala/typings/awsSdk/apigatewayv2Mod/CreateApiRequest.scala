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
  def apply(
    Name: StringWithLengthBetween1And128,
    ProtocolType: ProtocolType,
    ApiKeySelectionExpression: SelectionExpression = null,
    CorsConfiguration: Cors = null,
    CredentialsArn: Arn = null,
    Description: StringWithLengthBetween0And1024 = null,
    DisableSchemaValidation: js.UndefOr[boolean] = js.undefined,
    RouteKey: SelectionKey = null,
    RouteSelectionExpression: SelectionExpression = null,
    Tags: Tags = null,
    Target: UriWithLengthBetween1And2048 = null,
    Version: StringWithLengthBetween1And64 = null
  ): CreateApiRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProtocolType = ProtocolType.asInstanceOf[js.Any])
    if (ApiKeySelectionExpression != null) __obj.updateDynamic("ApiKeySelectionExpression")(ApiKeySelectionExpression.asInstanceOf[js.Any])
    if (CorsConfiguration != null) __obj.updateDynamic("CorsConfiguration")(CorsConfiguration.asInstanceOf[js.Any])
    if (CredentialsArn != null) __obj.updateDynamic("CredentialsArn")(CredentialsArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableSchemaValidation)) __obj.updateDynamic("DisableSchemaValidation")(DisableSchemaValidation.get.asInstanceOf[js.Any])
    if (RouteKey != null) __obj.updateDynamic("RouteKey")(RouteKey.asInstanceOf[js.Any])
    if (RouteSelectionExpression != null) __obj.updateDynamic("RouteSelectionExpression")(RouteSelectionExpression.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiRequest]
  }
}

