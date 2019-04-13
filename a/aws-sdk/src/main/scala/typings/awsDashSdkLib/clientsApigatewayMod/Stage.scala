package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stage extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var accessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
  /**
    * Specifies whether a cache cluster is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the cache cluster for the stage, if enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
  /**
    * The status of the cache cluster for the stage, if enabled.
    */
  var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.undefined
  /**
    * Settings for the canary deployment in this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.undefined
  /**
    * The identifier of a client certificate for an API stage.
    */
  var clientCertificateId: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the stage was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the Deployment that the stage points to.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  /**
    * The stage's description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the stage last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
    */
  var methodSettings: js.UndefOr[MapOfMethodSettings] = js.undefined
  /**
    * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway.
    */
  var stageName: js.UndefOr[String] = js.undefined
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The ARN of the WebAcl associated with the Stage.
    */
  var webAclArn: js.UndefOr[String] = js.undefined
}

object Stage {
  @scala.inline
  def apply(
    accessLogSettings: AccessLogSettings = null,
    cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
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
    tracingEnabled: js.UndefOr[Boolean] = js.undefined,
    variables: MapOfStringToString = null,
    webAclArn: String = null
  ): Stage = {
    val __obj = js.Dynamic.literal()
    if (accessLogSettings != null) __obj.updateDynamic("accessLogSettings")(accessLogSettings)
    if (!js.isUndefined(cacheClusterEnabled)) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled)
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (cacheClusterStatus != null) __obj.updateDynamic("cacheClusterStatus")(cacheClusterStatus.asInstanceOf[js.Any])
    if (canarySettings != null) __obj.updateDynamic("canarySettings")(canarySettings)
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (methodSettings != null) __obj.updateDynamic("methodSettings")(methodSettings)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tracingEnabled)) __obj.updateDynamic("tracingEnabled")(tracingEnabled)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    if (webAclArn != null) __obj.updateDynamic("webAclArn")(webAclArn)
    __obj.asInstanceOf[Stage]
  }
}

