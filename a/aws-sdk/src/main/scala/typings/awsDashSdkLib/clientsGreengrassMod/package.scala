package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGreengrassMod {
  type BulkDeploymentResults = js.Array[BulkDeploymentResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Initializing
    - awsDashSdkLib.awsDashSdkLibStrings.Running
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type BulkDeploymentStatus = _BulkDeploymentStatus | java.lang.String
  type BulkDeployments = js.Array[BulkDeployment]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NewDeployment
    - awsDashSdkLib.awsDashSdkLibStrings.Redeployment
    - awsDashSdkLib.awsDashSdkLibStrings.ResetDeployment
    - awsDashSdkLib.awsDashSdkLibStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = _DeploymentType | java.lang.String
  type Deployments = js.Array[Deployment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.binary
    - awsDashSdkLib.awsDashSdkLibStrings.json
    - java.lang.String
  */
  type EncodingType = _EncodingType | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassContainer
    - awsDashSdkLib.awsDashSdkLibStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = _FunctionIsolationMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassSystem
    - awsDashSdkLib.awsDashSdkLibStrings.Lambda
    - java.lang.String
  */
  type LoggerComponent = _LoggerComponent | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = _LoggerLevel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FileSystem
    - awsDashSdkLib.awsDashSdkLibStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = _LoggerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ro
    - awsDashSdkLib.awsDashSdkLibStrings.rw
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  type S3UrlSignerRole = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.core
    - awsDashSdkLib.awsDashSdkLibStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = _SoftwareToUpdate | java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.TRACE
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.VERBOSE
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FATAL
    - java.lang.String
  */
  type UpdateAgentLogLevel = _UpdateAgentLogLevel | java.lang.String
  type UpdateTargets = js.Array[__string]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.armv7l
    - awsDashSdkLib.awsDashSdkLibStrings.x86_64
    - awsDashSdkLib.awsDashSdkLibStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = _UpdateTargetsArchitecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ubuntu
    - awsDashSdkLib.awsDashSdkLibStrings.raspbian
    - awsDashSdkLib.awsDashSdkLibStrings.amazon_linux
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = _UpdateTargetsOperatingSystem | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
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
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-06-07`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
