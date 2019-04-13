package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEksMod {
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ClusterStatus = _ClusterStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SubnetNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.SecurityGroupNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.EniLimitReached
    - awsDashSdkLib.awsDashSdkLibStrings.IpNotAvailable
    - awsDashSdkLib.awsDashSdkLibStrings.AccessDenied
    - awsDashSdkLib.awsDashSdkLibStrings.OperationNotPermitted
    - awsDashSdkLib.awsDashSdkLibStrings.VpcIdNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  type ListClustersRequestMaxResults = scala.Double
  type ListUpdatesRequestMaxResults = scala.Double
  type LogSetups = js.Array[LogSetup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.api
    - awsDashSdkLib.awsDashSdkLibStrings.audit
    - awsDashSdkLib.awsDashSdkLibStrings.authenticator
    - awsDashSdkLib.awsDashSdkLibStrings.controllerManager
    - awsDashSdkLib.awsDashSdkLibStrings.scheduler
    - java.lang.String
  */
  type LogType = _LogType | java.lang.String
  type LogTypes = js.Array[LogType]
  type String = java.lang.String
  type StringList = js.Array[String]
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Version
    - awsDashSdkLib.awsDashSdkLibStrings.PlatformVersion
    - awsDashSdkLib.awsDashSdkLibStrings.EndpointPrivateAccess
    - awsDashSdkLib.awsDashSdkLibStrings.EndpointPublicAccess
    - awsDashSdkLib.awsDashSdkLibStrings.ClusterLogging
    - java.lang.String
  */
  type UpdateParamType = _UpdateParamType | java.lang.String
  type UpdateParams = js.Array[UpdateParam]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - java.lang.String
  */
  type UpdateStatus = _UpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VersionUpdate
    - awsDashSdkLib.awsDashSdkLibStrings.EndpointAccessUpdate
    - awsDashSdkLib.awsDashSdkLibStrings.LoggingUpdate
    - java.lang.String
  */
  type UpdateType = _UpdateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
