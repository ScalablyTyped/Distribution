package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var accessLogSettings: js.UndefOr[AccessLogSettings] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  /**
    * The status of the cache cluster for the stage, if enabled.
    */
  var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.native
  /**
    * Settings for the canary deployment in this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.native
  /**
    * The identifier of a client certificate for an API stage.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  /**
    * The timestamp when the stage was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the Deployment that the stage points to.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The stage's description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.native
  /**
    * The timestamp when the stage last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
    */
  var methodSettings: js.UndefOr[MapOfMethodSettings] = js.native
  /**
    * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The ARN of the WebAcl associated with the Stage.
    */
  var webAclArn: js.UndefOr[String] = js.native
}

object Stage {
  @scala.inline
  def apply(
    accessLogSettings: AccessLogSettings = null,
    cacheClusterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cacheClusterSize: CacheClusterSize = null,
    cacheClusterStatus: CacheClusterStatus = null,
    canarySettings: CanarySettings = null,
    clientCertificateId: String = null,
    createdDate: Timestamp = null,
    deploymentId: String = null,
    description: String = null,
    documentationVersion: String = null,
    lastUpdatedDate: Timestamp = null,
    methodSettings: MapOfMethodSettings = null,
    stageName: String = null,
    tags: MapOfStringToString = null,
    tracingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    variables: MapOfStringToString = null,
    webAclArn: String = null
  ): Stage = {
    val __obj = js.Dynamic.literal()
    if (accessLogSettings != null) __obj.updateDynamic("accessLogSettings")(accessLogSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheClusterEnabled)) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled.asInstanceOf[js.Any])
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (cacheClusterStatus != null) __obj.updateDynamic("cacheClusterStatus")(cacheClusterStatus.asInstanceOf[js.Any])
    if (canarySettings != null) __obj.updateDynamic("canarySettings")(canarySettings.asInstanceOf[js.Any])
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (methodSettings != null) __obj.updateDynamic("methodSettings")(methodSettings.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(tracingEnabled)) __obj.updateDynamic("tracingEnabled")(tracingEnabled.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (webAclArn != null) __obj.updateDynamic("webAclArn")(webAclArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
}

