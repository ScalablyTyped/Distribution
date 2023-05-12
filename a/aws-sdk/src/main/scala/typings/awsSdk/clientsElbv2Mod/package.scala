package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionOrder = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.forward__
  - typings.awsSdk.awsSdkStrings.`authenticate-oidc`
  - typings.awsSdk.awsSdkStrings.`authenticate-cognito`
  - typings.awsSdk.awsSdkStrings.redirect
  - typings.awsSdk.awsSdkStrings.`fixed-response`
  - java.lang.String
*/
type ActionTypeEnum = _ActionTypeEnum | java.lang.String

type Actions = js.Array[Action]

type AllocationId = java.lang.String

type AlpnPolicyName = js.Array[AlpnPolicyValue]

type AlpnPolicyValue = java.lang.String

type AuthenticateCognitoActionAuthenticationRequestExtraParams = StringDictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]

type AuthenticateCognitoActionAuthenticationRequestParamName = java.lang.String

type AuthenticateCognitoActionAuthenticationRequestParamValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.deny__
  - typings.awsSdk.awsSdkStrings.allow__
  - typings.awsSdk.awsSdkStrings.authenticate
  - java.lang.String
*/
type AuthenticateCognitoActionConditionalBehaviorEnum = _AuthenticateCognitoActionConditionalBehaviorEnum | java.lang.String

type AuthenticateCognitoActionScope = java.lang.String

type AuthenticateCognitoActionSessionCookieName = java.lang.String

type AuthenticateCognitoActionSessionTimeout = Double

type AuthenticateCognitoActionUserPoolArn = java.lang.String

type AuthenticateCognitoActionUserPoolClientId = java.lang.String

type AuthenticateCognitoActionUserPoolDomain = java.lang.String

type AuthenticateOidcActionAuthenticationRequestExtraParams = StringDictionary[AuthenticateOidcActionAuthenticationRequestParamValue]

type AuthenticateOidcActionAuthenticationRequestParamName = java.lang.String

type AuthenticateOidcActionAuthenticationRequestParamValue = java.lang.String

type AuthenticateOidcActionAuthorizationEndpoint = java.lang.String

type AuthenticateOidcActionClientId = java.lang.String

type AuthenticateOidcActionClientSecret = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.deny__
  - typings.awsSdk.awsSdkStrings.allow__
  - typings.awsSdk.awsSdkStrings.authenticate
  - java.lang.String
*/
type AuthenticateOidcActionConditionalBehaviorEnum = _AuthenticateOidcActionConditionalBehaviorEnum | java.lang.String

type AuthenticateOidcActionIssuer = java.lang.String

type AuthenticateOidcActionScope = java.lang.String

type AuthenticateOidcActionSessionCookieName = java.lang.String

type AuthenticateOidcActionSessionTimeout = Double

type AuthenticateOidcActionTokenEndpoint = java.lang.String

type AuthenticateOidcActionUseExistingClientSecret = Boolean

type AuthenticateOidcActionUserInfoEndpoint = java.lang.String

type AvailabilityZones = js.Array[AvailabilityZone]

type CanonicalHostedZoneId = java.lang.String

type CertificateArn = java.lang.String

type CertificateList = js.Array[Certificate]

type CipherName = java.lang.String

type CipherPriority = Double

type Ciphers = js.Array[Cipher]

type ConditionFieldName = java.lang.String

type CreatedTime = js.Date

type CustomerOwnedIpv4Pool = java.lang.String

type DNSName = java.lang.String

type Default = Boolean

type Description = java.lang.String

type FixedResponseActionContentType = java.lang.String

type FixedResponseActionMessage = java.lang.String

type FixedResponseActionStatusCode = java.lang.String

type GrpcCode = java.lang.String

type HealthCheckEnabled = Boolean

type HealthCheckIntervalSeconds = Double

type HealthCheckPort = java.lang.String

type HealthCheckThresholdCount = Double

type HealthCheckTimeoutSeconds = Double

type HttpCode = java.lang.String

type HttpHeaderConditionName = java.lang.String

type IPv6Address = java.lang.String

type IpAddress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.dualstack_
  - java.lang.String
*/
type IpAddressType = _IpAddressType | java.lang.String

type IsDefault = Boolean

type Limits = js.Array[Limit]

type ListOfString = js.Array[StringValue]

type ListenerArn = java.lang.String

type ListenerArns = js.Array[ListenerArn]

type Listeners = js.Array[Listener]

type LoadBalancerAddresses = js.Array[LoadBalancerAddress]

type LoadBalancerArn = java.lang.String

type LoadBalancerArns = js.Array[LoadBalancerArn]

type LoadBalancerAttributeKey = java.lang.String

type LoadBalancerAttributeValue = java.lang.String

type LoadBalancerAttributes = js.Array[LoadBalancerAttribute]

type LoadBalancerName = java.lang.String

type LoadBalancerNames = js.Array[LoadBalancerName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`internet-facing`
  - typings.awsSdk.awsSdkStrings.internal_
  - java.lang.String
*/
type LoadBalancerSchemeEnum = _LoadBalancerSchemeEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.provisioning_
  - typings.awsSdk.awsSdkStrings.active_impaired
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type LoadBalancerStateEnum = _LoadBalancerStateEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.application_
  - typings.awsSdk.awsSdkStrings.network_
  - typings.awsSdk.awsSdkStrings.gateway__
  - java.lang.String
*/
type LoadBalancerTypeEnum = _LoadBalancerTypeEnum | java.lang.String

type LoadBalancers = js.Array[LoadBalancer]

type Marker = java.lang.String

type Max = java.lang.String

type Name = java.lang.String

type OutpostId = java.lang.String

type PageSize = Double

type Path = java.lang.String

type Port = Double

type PrivateIPv4Address = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.TLS
  - typings.awsSdk.awsSdkStrings.UDP
  - typings.awsSdk.awsSdkStrings.TCP_UDP
  - typings.awsSdk.awsSdkStrings.GENEVE
  - java.lang.String
*/
type ProtocolEnum = _ProtocolEnum | java.lang.String

type ProtocolVersion = java.lang.String

type QueryStringKeyValuePairList = js.Array[QueryStringKeyValuePair]

type RedirectActionHost = java.lang.String

type RedirectActionPath = java.lang.String

type RedirectActionPort = java.lang.String

type RedirectActionProtocol = java.lang.String

type RedirectActionQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP_301
  - typings.awsSdk.awsSdkStrings.HTTP_302
  - java.lang.String
*/
type RedirectActionStatusCodeEnum = _RedirectActionStatusCodeEnum | java.lang.String

type ResourceArn = java.lang.String

type ResourceArns = js.Array[ResourceArn]

type RuleArn = java.lang.String

type RuleArns = js.Array[RuleArn]

type RuleConditionList = js.Array[RuleCondition]

type RulePriority = Double

type RulePriorityList = js.Array[RulePriorityPair]

type Rules = js.Array[Rule]

type SecurityGroupId = java.lang.String

type SecurityGroups = js.Array[SecurityGroupId]

type SslPolicies = js.Array[SslPolicy]

type SslPolicyName = java.lang.String

type SslPolicyNames = js.Array[SslPolicyName]

type SslProtocol = java.lang.String

type SslProtocols = js.Array[SslProtocol]

type StateReason = java.lang.String

type String = java.lang.String

type StringValue = java.lang.String

type SubnetId = java.lang.String

type SubnetMappings = js.Array[SubnetMapping]

type Subnets = js.Array[SubnetId]

type TagDescriptions = js.Array[TagDescription]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetDescriptions = js.Array[TargetDescription]

type TargetGroupArn = java.lang.String

type TargetGroupArns = js.Array[TargetGroupArn]

type TargetGroupAttributeKey = java.lang.String

type TargetGroupAttributeValue = java.lang.String

type TargetGroupAttributes = js.Array[TargetGroupAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type TargetGroupIpAddressTypeEnum = _TargetGroupIpAddressTypeEnum | java.lang.String

type TargetGroupList = js.Array[TargetGroupTuple]

type TargetGroupName = java.lang.String

type TargetGroupNames = js.Array[TargetGroupName]

type TargetGroupStickinessDurationSeconds = Double

type TargetGroupStickinessEnabled = Boolean

type TargetGroupWeight = Double

type TargetGroups = js.Array[TargetGroup]

type TargetHealthDescriptions = js.Array[TargetHealthDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElbDotRegistrationInProgress
  - typings.awsSdk.awsSdkStrings.ElbDotInitialHealthChecking
  - typings.awsSdk.awsSdkStrings.TargetDotResponseCodeMismatch
  - typings.awsSdk.awsSdkStrings.TargetDotTimeout
  - typings.awsSdk.awsSdkStrings.TargetDotFailedHealthChecks
  - typings.awsSdk.awsSdkStrings.TargetDotNotRegistered
  - typings.awsSdk.awsSdkStrings.TargetDotNotInUse
  - typings.awsSdk.awsSdkStrings.TargetDotDeregistrationInProgress
  - typings.awsSdk.awsSdkStrings.TargetDotInvalidState
  - typings.awsSdk.awsSdkStrings.TargetDotIpUnusable
  - typings.awsSdk.awsSdkStrings.TargetDotHealthCheckDisabled
  - typings.awsSdk.awsSdkStrings.ElbDotInternalError
  - java.lang.String
*/
type TargetHealthReasonEnum = _TargetHealthReasonEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.initial__
  - typings.awsSdk.awsSdkStrings.healthy__
  - typings.awsSdk.awsSdkStrings.unhealthy__
  - typings.awsSdk.awsSdkStrings.unused_
  - typings.awsSdk.awsSdkStrings.draining_
  - typings.awsSdk.awsSdkStrings.unavailable___
  - java.lang.String
*/
type TargetHealthStateEnum = _TargetHealthStateEnum | java.lang.String

type TargetId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.instance__
  - typings.awsSdk.awsSdkStrings.ip_
  - typings.awsSdk.awsSdkStrings.lambda__
  - typings.awsSdk.awsSdkStrings.alb_
  - java.lang.String
*/
type TargetTypeEnum = _TargetTypeEnum | java.lang.String

type VpcId = java.lang.String

type ZoneName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-12-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
