package typings.applicationinsights.outDeclarationsContractsGeneratedContextTagKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextTagKeys extends js.Object {
  /**
    * Application version. Information in the application context fields is always about the application that is sending the telemetry.
    */
  var applicationVersion: String
  /**
    * Name of the role the application is a part of. For Azure environment, this should be initialized with
    * [Microsoft.WindowsAzure.ServiceRuntime.RoleEnvironment]::CurrentRoleInstance.Role.Name
    * See more details here: https://dzone.com/articles/accessing-azure-role-0
    * It is recommended that you initialize environment variable with this value during machine startup, and then set context field from environment variable
    * appInsights.client.context.tags[appInsights.client.context.keys.cloudRole] = process.env.RoleName
    */
  var cloudRole: String
  /**
    * Name of the instance where the application is running. For Azure environment, this should be initialized with
    * [Microsoft.WindowsAzure.ServiceRuntime.RoleEnvironment]::CurrentRoleInstance.Id
    * See more details here: https://dzone.com/articles/accessing-azure-role-0
    * It is recommended that you initialize environment variable with this value during machine startup, and then set context field from environment variable
    * appInsights.client.context.tags[appInsights.client.context.keys.cloudRoleInstance] = process.env.RoleInstanceId
    */
  var cloudRoleInstance: String
  /**
    * Unique client device id. Computer name in most cases.
    */
  var deviceId: String
  /**
    * Device locale using <language>-<REGION> pattern, following RFC 5646. Example 'en-US'.
    */
  var deviceLocale: String
  /**
    * Model of the device the end user of the application is using. Used for client scenarios. If this field is empty then it is derived from the user agent.
    */
  var deviceModel: String
  /**
    * Client device OEM name taken from the browser.
    */
  var deviceOEMName: String
  /**
    * Operating system name and version of the device the end user of the application is using. If this field is empty then it is derived from the user agent. Example 'Windows 10 Pro 10.0.10586.0'
    */
  var deviceOSVersion: String
  /**
    * The type of the device the end user of the application is using. Used primarily to distinguish JavaScript telemetry from server side telemetry. Examples: 'PC', 'Phone', 'Browser'. 'PC' is the default value.
    */
  var deviceType: String
  /**
    * Agent version. Used to indicate the version of StatusMonitor installed on the computer if it is used for data collection.
    */
  var internalAgentVersion: String
  /**
    * This is the node name used for billing purposes. Use it to override the standard detection of nodes.
    */
  var internalNodeName: String
  /**
    * SDK version. See https://github.com/Microsoft/ApplicationInsights-Home/blob/master/SDK-AUTHORING.md#sdk-version-specification for information.
    */
  var internalSdkVersion: String
  /**
    * The IP address of the client device. IPv4 and IPv6 are supported. Information in the location context fields is always about the end user. When telemetry is sent from a service, the location context is about the user that initiated the operation in the service.
    */
  var locationIp: String
  /**
    * The correlation vector is a light weight vector clock which can be used to identify and order related events across clients and services.
    */
  var operationCorrelationVector: String
  /**
    * A unique identifier for the operation instance. The operation.id is created by either a request or a page view. All other telemetry sets this to the value for the containing request or page view. Operation.id is used for finding all the telemetry items for a specific operation instance.
    */
  var operationId: String
  /**
    * The name (group) of the operation. The operation.name is created by either a request or a page view. All other telemetry items set this to the value for the containing request or page view. Operation.name is used for finding all the telemetry items for a group of operations (i.e. 'GET Home/Index').
    */
  var operationName: String
  /**
    * The unique identifier of the telemetry item's immediate parent.
    */
  var operationParentId: String
  /**
    * Name of synthetic source. Some telemetry from the application may represent a synthetic traffic. It may be web crawler indexing the web site, site availability tests or traces from diagnostic libraries like Application Insights SDK itself.
    */
  var operationSyntheticSource: String
  /**
    * Session ID - the instance of the user's interaction with the app. Information in the session context fields is always about the end user. When telemetry is sent from a service, the session context is about the user that initiated the operation in the service.
    */
  var sessionId: String
  /**
    * Boolean value indicating whether the session identified by ai.session.id is first for the user or not.
    */
  var sessionIsFirst: String
  /**
    * In multi-tenant applications this is the account ID or name which the user is acting with. Examples may be subscription ID for Azure portal or blog name blogging platform.
    */
  var userAccountId: String
  /**
    * Authenticated user id. The opposite of ai.user.id, this represents the user with a friendly name. Since it's PII information it is not collected by default by most SDKs.
    */
  var userAuthUserId: String
  /**
    * Anonymous user id. Represents the end user of the application. When telemetry is sent from a service, the user context is about the user that initiated the operation in the service.
    */
  var userId: String
}

object ContextTagKeys {
  @scala.inline
  def apply(
    applicationVersion: String,
    cloudRole: String,
    cloudRoleInstance: String,
    deviceId: String,
    deviceLocale: String,
    deviceModel: String,
    deviceOEMName: String,
    deviceOSVersion: String,
    deviceType: String,
    internalAgentVersion: String,
    internalNodeName: String,
    internalSdkVersion: String,
    locationIp: String,
    operationCorrelationVector: String,
    operationId: String,
    operationName: String,
    operationParentId: String,
    operationSyntheticSource: String,
    sessionId: String,
    sessionIsFirst: String,
    userAccountId: String,
    userAuthUserId: String,
    userId: String
  ): ContextTagKeys = {
    val __obj = js.Dynamic.literal(applicationVersion = applicationVersion.asInstanceOf[js.Any], cloudRole = cloudRole.asInstanceOf[js.Any], cloudRoleInstance = cloudRoleInstance.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceLocale = deviceLocale.asInstanceOf[js.Any], deviceModel = deviceModel.asInstanceOf[js.Any], deviceOEMName = deviceOEMName.asInstanceOf[js.Any], deviceOSVersion = deviceOSVersion.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], internalAgentVersion = internalAgentVersion.asInstanceOf[js.Any], internalNodeName = internalNodeName.asInstanceOf[js.Any], internalSdkVersion = internalSdkVersion.asInstanceOf[js.Any], locationIp = locationIp.asInstanceOf[js.Any], operationCorrelationVector = operationCorrelationVector.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], operationParentId = operationParentId.asInstanceOf[js.Any], operationSyntheticSource = operationSyntheticSource.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionIsFirst = sessionIsFirst.asInstanceOf[js.Any], userAccountId = userAccountId.asInstanceOf[js.Any], userAuthUserId = userAuthUserId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextTagKeys]
  }
}

