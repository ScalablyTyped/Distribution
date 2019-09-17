package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEksMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ClusterStatus = _ClusterStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SubnetNotFound
    - typings.awsDashSdk.awsDashSdkStrings.SecurityGroupNotFound
    - typings.awsDashSdk.awsDashSdkStrings.EniLimitReached
    - typings.awsDashSdk.awsDashSdkStrings.IpNotAvailable
    - typings.awsDashSdk.awsDashSdkStrings.AccessDenied
    - typings.awsDashSdk.awsDashSdkStrings.OperationNotPermitted
    - typings.awsDashSdk.awsDashSdkStrings.VpcIdNotFound
    - typings.awsDashSdk.awsDashSdkStrings.Unknown
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  type ListClustersRequestMaxResults = Double
  type ListUpdatesRequestMaxResults = Double
  type LogSetups = js.Array[LogSetup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.api
    - typings.awsDashSdk.awsDashSdkStrings.audit
    - typings.awsDashSdk.awsDashSdkStrings.authenticator
    - typings.awsDashSdk.awsDashSdkStrings.controllerManager
    - typings.awsDashSdk.awsDashSdkStrings.scheduler
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type LogTypes = js.Array[LogType]
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Version
    - typings.awsDashSdk.awsDashSdkStrings.PlatformVersion
    - typings.awsDashSdk.awsDashSdkStrings.EndpointPrivateAccess
    - typings.awsDashSdk.awsDashSdkStrings.EndpointPublicAccess
    - typings.awsDashSdk.awsDashSdkStrings.ClusterLogging
    - java.lang.String
  */
  type UpdateParamType = _UpdateParamType | java.lang.String
  type UpdateParams = js.Array[UpdateParam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Successful
    - java.lang.String
  */
  type UpdateStatus = _UpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VersionUpdate
    - typings.awsDashSdk.awsDashSdkStrings.EndpointAccessUpdate
    - typings.awsDashSdk.awsDashSdkStrings.LoggingUpdate
    - java.lang.String
  */
  type UpdateType = _UpdateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
