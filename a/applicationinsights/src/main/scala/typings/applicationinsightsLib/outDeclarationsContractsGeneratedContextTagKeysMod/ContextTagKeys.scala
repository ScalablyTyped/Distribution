package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedContextTagKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextTagKeys extends js.Object {
  /**
    * Application version. Information in the application context fields is always about the application that is sending the telemetry.
    */
  var applicationVersion: java.lang.String
  /**
    * Name of the role the application is a part of. For Azure environment, this should be initialized with
    * [Microsoft.WindowsAzure.ServiceRuntime.RoleEnvironment]::CurrentRoleInstance.Role.Name
    * See more details here: https://dzone.com/articles/accessing-azure-role-0
    * It is recommended that you initialize environment variable with this value during machine startup, and then set context field from environment variable
    * appInsights.client.context.tags[appInsights.client.context.keys.cloudRole] = process.env.RoleName
    */
  var cloudRole: java.lang.String
  /**
    * Name of the instance where the application is running. For Azure environment, this should be initialized with
    * [Microsoft.WindowsAzure.ServiceRuntime.RoleEnvironment]::CurrentRoleInstance.Id
    * See more details here: https://dzone.com/articles/accessing-azure-role-0
    * It is recommended that you initialize environment variable with this value during machine startup, and then set context field from environment variable
    * appInsights.client.context.tags[appInsights.client.context.keys.cloudRoleInstance] = process.env.RoleInstanceId
    */
  var cloudRoleInstance: java.lang.String
  /**
    * Unique client device id. Computer name in most cases.
    */
  var deviceId: java.lang.String
  /**
    * Device locale using <language>-<REGION> pattern, following RFC 5646. Example 'en-US'.
    */
  var deviceLocale: java.lang.String
  /**
    * Model of the device the end user of the application is using. Used for client scenarios. If this field is empty then it is derived from the user agent.
    */
  var deviceModel: java.lang.String
  /**
    * Client device OEM name taken from the browser.
    */
  var deviceOEMName: java.lang.String
  /**
    * Operating system name and version of the device the end user of the application is using. If this field is empty then it is derived from the user agent. Example 'Windows 10 Pro 10.0.10586.0'
    */
  var deviceOSVersion: java.lang.String
  /**
    * The type of the device the end user of the application is using. Used primarily to distinguish JavaScript telemetry from server side telemetry. Examples: 'PC', 'Phone', 'Browser'. 'PC' is the default value.
    */
  var deviceType: java.lang.String
  /**
    * Agent version. Used to indicate the version of StatusMonitor installed on the computer if it is used for data collection.
    */
  var internalAgentVersion: java.lang.String
  /**
    * This is the node name used for billing purposes. Use it to override the standard detection of nodes.
    */
  var internalNodeName: java.lang.String
  /**
    * SDK version. See https://github.com/Microsoft/ApplicationInsights-Home/blob/master/SDK-AUTHORING.md#sdk-version-specification for information.
    */
  var internalSdkVersion: java.lang.String
  /**
    * The IP address of the client device. IPv4 and IPv6 are supported. Information in the location context fields is always about the end user. When telemetry is sent from a service, the location context is about the user that initiated the operation in the service.
    */
  var locationIp: java.lang.String
  /**
    * The correlation vector is a light weight vector clock which can be used to identify and order related events across clients and services.
    */
  var operationCorrelationVector: java.lang.String
  /**
    * A unique identifier for the operation instance. The operation.id is created by either a request or a page view. All other telemetry sets this to the value for the containing request or page view. Operation.id is used for finding all the telemetry items for a specific operation instance.
    */
  var operationId: java.lang.String
  /**
    * The name (group) of the operation. The operation.name is created by either a request or a page view. All other telemetry items set this to the value for the containing request or page view. Operation.name is used for finding all the telemetry items for a group of operations (i.e. 'GET Home/Index').
    */
  var operationName: java.lang.String
  /**
    * The unique identifier of the telemetry item's immediate parent.
    */
  var operationParentId: java.lang.String
  /**
    * Name of synthetic source. Some telemetry from the application may represent a synthetic traffic. It may be web crawler indexing the web site, site availability tests or traces from diagnostic libraries like Application Insights SDK itself.
    */
  var operationSyntheticSource: java.lang.String
  /**
    * Session ID - the instance of the user's interaction with the app. Information in the session context fields is always about the end user. When telemetry is sent from a service, the session context is about the user that initiated the operation in the service.
    */
  var sessionId: java.lang.String
  /**
    * Boolean value indicating whether the session identified by ai.session.id is first for the user or not.
    */
  var sessionIsFirst: java.lang.String
  /**
    * In multi-tenant applications this is the account ID or name which the user is acting with. Examples may be subscription ID for Azure portal or blog name blogging platform.
    */
  var userAccountId: java.lang.String
  /**
    * Authenticated user id. The opposite of ai.user.id, this represents the user with a friendly name. Since it's PII information it is not collected by default by most SDKs.
    */
  var userAuthUserId: java.lang.String
  /**
    * Anonymous user id. Represents the end user of the application. When telemetry is sent from a service, the user context is about the user that initiated the operation in the service.
    */
  var userId: java.lang.String
}

object ContextTagKeys {
  @scala.inline
  def apply(
    applicationVersion: java.lang.String,
    cloudRole: java.lang.String,
    cloudRoleInstance: java.lang.String,
    deviceId: java.lang.String,
    deviceLocale: java.lang.String,
    deviceModel: java.lang.String,
    deviceOEMName: java.lang.String,
    deviceOSVersion: java.lang.String,
    deviceType: java.lang.String,
    internalAgentVersion: java.lang.String,
    internalNodeName: java.lang.String,
    internalSdkVersion: java.lang.String,
    locationIp: java.lang.String,
    operationCorrelationVector: java.lang.String,
    operationId: java.lang.String,
    operationName: java.lang.String,
    operationParentId: java.lang.String,
    operationSyntheticSource: java.lang.String,
    sessionId: java.lang.String,
    sessionIsFirst: java.lang.String,
    userAccountId: java.lang.String,
    userAuthUserId: java.lang.String,
    userId: java.lang.String
  ): ContextTagKeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.updateDynamic("cloudRole")(cloudRole)
    __obj.updateDynamic("cloudRoleInstance")(cloudRoleInstance)
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("deviceLocale")(deviceLocale)
    __obj.updateDynamic("deviceModel")(deviceModel)
    __obj.updateDynamic("deviceOEMName")(deviceOEMName)
    __obj.updateDynamic("deviceOSVersion")(deviceOSVersion)
    __obj.updateDynamic("deviceType")(deviceType)
    __obj.updateDynamic("internalAgentVersion")(internalAgentVersion)
    __obj.updateDynamic("internalNodeName")(internalNodeName)
    __obj.updateDynamic("internalSdkVersion")(internalSdkVersion)
    __obj.updateDynamic("locationIp")(locationIp)
    __obj.updateDynamic("operationCorrelationVector")(operationCorrelationVector)
    __obj.updateDynamic("operationId")(operationId)
    __obj.updateDynamic("operationName")(operationName)
    __obj.updateDynamic("operationParentId")(operationParentId)
    __obj.updateDynamic("operationSyntheticSource")(operationSyntheticSource)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.updateDynamic("sessionIsFirst")(sessionIsFirst)
    __obj.updateDynamic("userAccountId")(userAccountId)
    __obj.updateDynamic("userAuthUserId")(userAuthUserId)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[ContextTagKeys]
  }
}

