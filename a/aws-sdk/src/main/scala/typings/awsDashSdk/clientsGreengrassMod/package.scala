package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGreengrassMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type BulkDeploymentResults = js.Array[BulkDeploymentResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Initializing_
    - typings.awsDashSdk.awsDashSdkStrings.Running_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type BulkDeploymentStatus = _BulkDeploymentStatus | String
  type BulkDeployments = js.Array[BulkDeployment]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NewDeployment
    - typings.awsDashSdk.awsDashSdkStrings.Redeployment
    - typings.awsDashSdk.awsDashSdkStrings.ResetDeployment
    - typings.awsDashSdk.awsDashSdkStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = _DeploymentType | String
  type Deployments = js.Array[Deployment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.binary__
    - typings.awsDashSdk.awsDashSdkStrings.json_
    - java.lang.String
  */
  type EncodingType = _EncodingType | String
  type ErrorDetails = js.Array[ErrorDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GreengrassContainer
    - typings.awsDashSdk.awsDashSdkStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = _FunctionIsolationMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GreengrassSystem
    - typings.awsDashSdk.awsDashSdkStrings.Lambda_
    - java.lang.String
  */
  type LoggerComponent = _LoggerComponent | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = _LoggerLevel | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FileSystem
    - typings.awsDashSdk.awsDashSdkStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = _LoggerType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ro_
    - typings.awsDashSdk.awsDashSdkStrings.rw_
    - java.lang.String
  */
  type Permission = _Permission | String
  type S3UrlSignerRole = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.core__
    - typings.awsDashSdk.awsDashSdkStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = _SoftwareToUpdate | String
  type Tags = StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.TRACE
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - typings.awsDashSdk.awsDashSdkStrings.VERBOSE
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.FATAL
    - java.lang.String
  */
  type UpdateAgentLogLevel = _UpdateAgentLogLevel | String
  type UpdateTargets = js.Array[__string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.armv6l
    - typings.awsDashSdk.awsDashSdkStrings.armv7l
    - typings.awsDashSdk.awsDashSdkStrings.x86_64_
    - typings.awsDashSdk.awsDashSdkStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = _UpdateTargetsArchitecture | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ubuntu_
    - typings.awsDashSdk.awsDashSdkStrings.raspbian
    - typings.awsDashSdk.awsDashSdkStrings.amazon_linux_
    - typings.awsDashSdk.awsDashSdkStrings.openwrt
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = _UpdateTargetsOperatingSystem | String
  type __boolean = Boolean
  type __integer = Double
  type __listOfConnectivityInfo = js.Array[ConnectivityInfo]
  type __listOfConnector = js.Array[Connector]
  type __listOfCore = js.Array[Core]
  type __listOfDefinitionInformation = js.Array[DefinitionInformation]
  type __listOfDevice = js.Array[Device]
  type __listOfFunction = js.Array[Function]
  type __listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]
  type __listOfGroupInformation = js.Array[GroupInformation]
  type __listOfLogger = js.Array[Logger]
  type __listOfResource = js.Array[Resource]
  type __listOfResourceAccessPolicy = js.Array[ResourceAccessPolicy]
  type __listOfSubscription = js.Array[Subscription]
  type __listOfVersionInformation = js.Array[VersionInformation]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-06-07`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
