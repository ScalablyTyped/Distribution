package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElbv2Mod {
  type ActionOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.forward
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticate-oidc`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticate-cognito`
    - awsDashSdkLib.awsDashSdkLibStrings.redirect
    - awsDashSdkLib.awsDashSdkLibStrings.`fixed-response`
    - java.lang.String
  */
  type ActionTypeEnum = _ActionTypeEnum | java.lang.String
  type Actions = js.Array[Action]
  type AllocationId = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]
  type AuthenticateCognitoActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.deny
    - awsDashSdkLib.awsDashSdkLibStrings.allow
    - awsDashSdkLib.awsDashSdkLibStrings.authenticate
    - java.lang.String
  */
  type AuthenticateCognitoActionConditionalBehaviorEnum = _AuthenticateCognitoActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateCognitoActionScope = java.lang.String
  type AuthenticateCognitoActionSessionCookieName = java.lang.String
  type AuthenticateCognitoActionSessionTimeout = scala.Double
  type AuthenticateCognitoActionUserPoolArn = java.lang.String
  type AuthenticateCognitoActionUserPoolClientId = java.lang.String
  type AuthenticateCognitoActionUserPoolDomain = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[AuthenticateOidcActionAuthenticationRequestParamValue]
  type AuthenticateOidcActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestParamValue = java.lang.String
  type AuthenticateOidcActionAuthorizationEndpoint = java.lang.String
  type AuthenticateOidcActionClientId = java.lang.String
  type AuthenticateOidcActionClientSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.deny
    - awsDashSdkLib.awsDashSdkLibStrings.allow
    - awsDashSdkLib.awsDashSdkLibStrings.authenticate
    - java.lang.String
  */
  type AuthenticateOidcActionConditionalBehaviorEnum = _AuthenticateOidcActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateOidcActionIssuer = java.lang.String
  type AuthenticateOidcActionScope = java.lang.String
  type AuthenticateOidcActionSessionCookieName = java.lang.String
  type AuthenticateOidcActionSessionTimeout = scala.Double
  type AuthenticateOidcActionTokenEndpoint = java.lang.String
  type AuthenticateOidcActionUseExistingClientSecret = scala.Boolean
  type AuthenticateOidcActionUserInfoEndpoint = java.lang.String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CanonicalHostedZoneId = java.lang.String
  type CertificateArn = java.lang.String
  type CertificateList = js.Array[Certificate]
  type CipherName = java.lang.String
  type CipherPriority = scala.Double
  type Ciphers = js.Array[Cipher]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConditionFieldName = java.lang.String
  type CreatedTime = stdLib.Date
  type DNSName = java.lang.String
  type Default = scala.Boolean
  type Description = java.lang.String
  type FixedResponseActionContentType = java.lang.String
  type FixedResponseActionMessage = java.lang.String
  type FixedResponseActionStatusCode = java.lang.String
  type HealthCheckEnabled = scala.Boolean
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = java.lang.String
  type HealthCheckThresholdCount = scala.Double
  type HealthCheckTimeoutSeconds = scala.Double
  type HttpCode = java.lang.String
  type HttpHeaderConditionName = java.lang.String
  type IpAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ipv4
    - awsDashSdkLib.awsDashSdkLibStrings.dualstack
    - java.lang.String
  */
  type IpAddressType = _IpAddressType | java.lang.String
  type IsDefault = scala.Boolean
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
    - awsDashSdkLib.awsDashSdkLibStrings.`internet-facing`
    - awsDashSdkLib.awsDashSdkLibStrings.internal
    - java.lang.String
  */
  type LoadBalancerSchemeEnum = _LoadBalancerSchemeEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.provisioning
    - awsDashSdkLib.awsDashSdkLibStrings.active_impaired
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type LoadBalancerStateEnum = _LoadBalancerStateEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.application
    - awsDashSdkLib.awsDashSdkLibStrings.network
    - java.lang.String
  */
  type LoadBalancerTypeEnum = _LoadBalancerTypeEnum | java.lang.String
  type LoadBalancers = js.Array[LoadBalancer]
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type Path = java.lang.String
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.TLS
    - java.lang.String
  */
  type ProtocolEnum = _ProtocolEnum | java.lang.String
  type QueryStringKeyValuePairList = js.Array[QueryStringKeyValuePair]
  type RedirectActionHost = java.lang.String
  type RedirectActionPath = java.lang.String
  type RedirectActionPort = java.lang.String
  type RedirectActionProtocol = java.lang.String
  type RedirectActionQuery = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_301
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_302
    - java.lang.String
  */
  type RedirectActionStatusCodeEnum = _RedirectActionStatusCodeEnum | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[ResourceArn]
  type RuleArn = java.lang.String
  type RuleArns = js.Array[RuleArn]
  type RuleConditionList = js.Array[RuleCondition]
  type RulePriority = scala.Double
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
  type TargetGroupName = java.lang.String
  type TargetGroupNames = js.Array[TargetGroupName]
  type TargetGroups = js.Array[TargetGroup]
  type TargetHealthDescriptions = js.Array[TargetHealthDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ElbDOTRegistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.ElbDOTInitialHealthChecking
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTResponseCodeMismatch
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTTimeout
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTFailedHealthChecks
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTNotRegistered
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTNotInUse
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTDeregistrationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTInvalidState
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTIpUnusable
    - awsDashSdkLib.awsDashSdkLibStrings.TargetDOTHealthCheckDisabled
    - awsDashSdkLib.awsDashSdkLibStrings.ElbDOTInternalError
    - java.lang.String
  */
  type TargetHealthReasonEnum = _TargetHealthReasonEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.initial
    - awsDashSdkLib.awsDashSdkLibStrings.healthy
    - awsDashSdkLib.awsDashSdkLibStrings.unhealthy
    - awsDashSdkLib.awsDashSdkLibStrings.unused
    - awsDashSdkLib.awsDashSdkLibStrings.draining
    - awsDashSdkLib.awsDashSdkLibStrings.unavailable
    - java.lang.String
  */
  type TargetHealthStateEnum = _TargetHealthStateEnum | java.lang.String
  type TargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.instance
    - awsDashSdkLib.awsDashSdkLibStrings.ip
    - awsDashSdkLib.awsDashSdkLibStrings.lambda
    - java.lang.String
  */
  type TargetTypeEnum = _TargetTypeEnum | java.lang.String
  type VpcId = java.lang.String
  type ZoneName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
