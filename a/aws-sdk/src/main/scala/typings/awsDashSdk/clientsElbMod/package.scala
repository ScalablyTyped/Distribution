package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElbMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccessLogEnabled = Boolean
  type AccessLogInterval = Double
  type AccessLogPrefix = String
  type AccessPointName = String
  type AccessPointPort = Double
  type AdditionalAttributeKey = String
  type AdditionalAttributeValue = String
  type AdditionalAttributes = js.Array[AdditionalAttribute]
  type AppCookieStickinessPolicies = js.Array[AppCookieStickinessPolicy]
  type AttributeName = String
  type AttributeType = String
  type AttributeValue = String
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type BackendServerDescriptions = js.Array[BackendServerDescription]
  type Cardinality = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConnectionDrainingEnabled = Boolean
  type ConnectionDrainingTimeout = Double
  type CookieExpirationPeriod = Double
  type CookieName = String
  type CreatedTime = Date
  type CrossZoneLoadBalancingEnabled = Boolean
  type DNSName = String
  type DefaultValue = String
  type Description = String
  type EndPointPort = Double
  type HealthCheckInterval = Double
  type HealthCheckTarget = String
  type HealthCheckTimeout = Double
  type HealthyThreshold = Double
  type IdleTimeout = Double
  type InstanceId = String
  type InstancePort = Double
  type InstanceStates = js.Array[InstanceState]
  type Instances = js.Array[Instance]
  type LBCookieStickinessPolicies = js.Array[LBCookieStickinessPolicy]
  type Limits = js.Array[Limit]
  type ListenerDescriptions = js.Array[ListenerDescription]
  type Listeners = js.Array[Listener]
  type LoadBalancerDescriptions = js.Array[LoadBalancerDescription]
  type LoadBalancerNames = js.Array[AccessPointName]
  type LoadBalancerNamesMax20 = js.Array[AccessPointName]
  type LoadBalancerScheme = String
  type Marker = String
  type Max = String
  type Name = String
  type PageSize = Double
  type PolicyAttributeDescriptions = js.Array[PolicyAttributeDescription]
  type PolicyAttributeTypeDescriptions = js.Array[PolicyAttributeTypeDescription]
  type PolicyAttributes = js.Array[PolicyAttribute]
  type PolicyDescriptions = js.Array[PolicyDescription]
  type PolicyName = String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTypeDescriptions = js.Array[PolicyTypeDescription]
  type PolicyTypeName = String
  type PolicyTypeNames = js.Array[PolicyTypeName]
  type Ports = js.Array[AccessPointPort]
  type Protocol = String
  type ReasonCode = String
  type S3BucketName = String
  type SSLCertificateId = String
  type SecurityGroupId = String
  type SecurityGroupName = String
  type SecurityGroupOwnerAlias = String
  type SecurityGroups = js.Array[SecurityGroupId]
  type State = String
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type TagDescriptions = js.Array[TagDescription]
  type TagKey = String
  type TagKeyList = js.Array[TagKeyOnly]
  type TagList = js.Array[Tag]
  type TagValue = String
  type UnhealthyThreshold = Double
  type VPCId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-06-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
