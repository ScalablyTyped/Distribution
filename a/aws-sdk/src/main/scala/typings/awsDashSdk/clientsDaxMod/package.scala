package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDaxMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AvailabilityZoneList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMMEDIATE
    - typings.awsDashSdk.awsDashSdkStrings.REQUIRES_REBOOT
    - java.lang.String
  */
  type ChangeType = _ChangeType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterList = js.Array[Cluster]
  type ClusterNameList = js.Array[String]
  type EventList = js.Array[Event]
  type Integer = Double
  type IntegerOptional = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRUE
    - typings.awsDashSdk.awsDashSdkStrings.FALSE
    - typings.awsDashSdk.awsDashSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type IsModifiable = _IsModifiable | java.lang.String
  type KeyList = js.Array[String]
  type NodeIdentifierList = js.Array[String]
  type NodeList = js.Array[Node]
  type NodeTypeSpecificValueList = js.Array[NodeTypeSpecificValue]
  type ParameterGroupList = js.Array[ParameterGroup]
  type ParameterGroupNameList = js.Array[String]
  type ParameterList = js.Array[Parameter]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.NODE_TYPE_SPECIFIC
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type SSEEnabled = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type SSEStatus = _SSEStatus | java.lang.String
  type SecurityGroupIdentifierList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLUSTER
    - typings.awsDashSdk.awsDashSdkStrings.PARAMETER_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.SUBNET_GROUP
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetGroupList = js.Array[SubnetGroup]
  type SubnetGroupNameList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = Date
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-04-19`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
