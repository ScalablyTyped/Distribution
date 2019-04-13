package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElbMod {
  type AccessLogEnabled = scala.Boolean
  type AccessLogInterval = scala.Double
  type AccessLogPrefix = java.lang.String
  type AccessPointName = java.lang.String
  type AccessPointPort = scala.Double
  type AdditionalAttributeKey = java.lang.String
  type AdditionalAttributeValue = java.lang.String
  type AdditionalAttributes = js.Array[AdditionalAttribute]
  type AppCookieStickinessPolicies = js.Array[AppCookieStickinessPolicy]
  type AttributeName = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type BackendServerDescriptions = js.Array[BackendServerDescription]
  type Cardinality = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectionDrainingEnabled = scala.Boolean
  type ConnectionDrainingTimeout = scala.Double
  type CookieExpirationPeriod = scala.Double
  type CookieName = java.lang.String
  type CreatedTime = stdLib.Date
  type CrossZoneLoadBalancingEnabled = scala.Boolean
  type DNSName = java.lang.String
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type EndPointPort = scala.Double
  type HealthCheckInterval = scala.Double
  type HealthCheckTarget = java.lang.String
  type HealthCheckTimeout = scala.Double
  type HealthyThreshold = scala.Double
  type IdleTimeout = scala.Double
  type InstanceId = java.lang.String
  type InstancePort = scala.Double
  type InstanceStates = js.Array[InstanceState]
  type Instances = js.Array[Instance]
  type LBCookieStickinessPolicies = js.Array[LBCookieStickinessPolicy]
  type Limits = js.Array[Limit]
  type ListenerDescriptions = js.Array[ListenerDescription]
  type Listeners = js.Array[Listener]
  type LoadBalancerDescriptions = js.Array[LoadBalancerDescription]
  type LoadBalancerNames = js.Array[AccessPointName]
  type LoadBalancerNamesMax20 = js.Array[AccessPointName]
  type LoadBalancerScheme = java.lang.String
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PolicyAttributeDescriptions = js.Array[PolicyAttributeDescription]
  type PolicyAttributeTypeDescriptions = js.Array[PolicyAttributeTypeDescription]
  type PolicyAttributes = js.Array[PolicyAttribute]
  type PolicyDescriptions = js.Array[PolicyDescription]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTypeDescriptions = js.Array[PolicyTypeDescription]
  type PolicyTypeName = java.lang.String
  type PolicyTypeNames = js.Array[PolicyTypeName]
  type Ports = js.Array[AccessPointPort]
  type Protocol = java.lang.String
  type ReasonCode = java.lang.String
  type S3BucketName = java.lang.String
  type SSLCertificateId = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupName = java.lang.String
  type SecurityGroupOwnerAlias = java.lang.String
  type SecurityGroups = js.Array[SecurityGroupId]
  type State = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  type TagDescriptions = js.Array[TagDescription]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKeyOnly]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type UnhealthyThreshold = scala.Double
  type VPCId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-06-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
