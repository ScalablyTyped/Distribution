package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/elbv2", "ELBv2")
@js.native
object ELBv2Ns extends js.Object {
  
  trait Action extends js.Object {
    /**
         * [HTTPS listener] Information for using Amazon Cognito to authenticate users. Specify only when Type is authenticate-cognito.
         */
    var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.undefined
    /**
         * [HTTPS listener] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify only when Type is authenticate-oidc.
         */
    var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.undefined
    /**
         * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only when Type is fixed-response.
         */
    var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.undefined
    /**
         * The order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. The final action to be performed must be a forward or a fixed-response action.
         */
    var Order: js.UndefOr[ActionOrder] = js.undefined
    /**
         * [Application Load Balancer] Information for creating a redirect action. Specify only when Type is redirect.
         */
    var RedirectConfig: js.UndefOr[RedirectActionConfig] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the target group. Specify only when Type is forward.
         */
    var TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined
    /**
         * The type of action. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect.
         */
    var Type: ActionTypeEnum
  }
  
  
  trait AddListenerCertificatesInput extends js.Object {
    /**
         * The certificate to add. You can specify one certificate per call.
         */
    var Certificates: CertificateList
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
  }
  
  
  trait AddListenerCertificatesOutput extends js.Object {
    /**
         * Information about the certificates.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
  }
  
  
  trait AddTagsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var ResourceArns: ResourceArns
    /**
         * The tags. Each resource can have a maximum of 10 tags.
         */
    var Tags: TagList
  }
  
  
  trait AddTagsOutput extends js.Object
  
  
  trait AuthenticateCognitoActionAuthenticationRequestExtraParams
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]
  
  
  trait AuthenticateCognitoActionConfig extends js.Object {
    /**
         * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
         */
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.undefined
    /**
         * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
         */
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.undefined
    /**
         * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
         */
    var Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.undefined
    /**
         * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
         */
    var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.undefined
    /**
         * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
         */
    var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
         */
    var UserPoolArn: AuthenticateCognitoActionUserPoolArn
    /**
         * The ID of the Amazon Cognito user pool client.
         */
    var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId
    /**
         * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
         */
    var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
  }
  
  
  trait AuthenticateOidcActionAuthenticationRequestExtraParams
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AuthenticateOidcActionAuthenticationRequestParamValue]
  
  
  trait AuthenticateOidcActionConfig extends js.Object {
    /**
         * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
         */
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.undefined
    /**
         * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
         */
    var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint
    /**
         * The OAuth 2.0 client identifier.
         */
    var ClientId: AuthenticateOidcActionClientId
    /**
         * The OAuth 2.0 client secret.
         */
    var ClientSecret: AuthenticateOidcActionClientSecret
    /**
         * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
         */
    var Issuer: AuthenticateOidcActionIssuer
    /**
         * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
         */
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.undefined
    /**
         * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
         */
    var Scope: js.UndefOr[AuthenticateOidcActionScope] = js.undefined
    /**
         * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
         */
    var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.undefined
    /**
         * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
         */
    var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.undefined
    /**
         * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
         */
    var TokenEndpoint: AuthenticateOidcActionTokenEndpoint
    /**
         * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
         */
    var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
  }
  
  
  trait AvailabilityZone extends js.Object {
    /**
         * [Network Load Balancers] The static IP address.
         */
    var LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses] = js.undefined
    /**
         * The ID of the subnet.
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
         * The name of the Availability Zone.
         */
    var ZoneName: js.UndefOr[ZoneName] = js.undefined
  }
  
  
  trait Certificate extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the certificate.
         */
    var CertificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
         * Indicates whether the certificate is the default certificate.
         */
    var IsDefault: js.UndefOr[Default] = js.undefined
  }
  
  
  trait Cipher extends js.Object {
    /**
         * The name of the cipher.
         */
    var Name: js.UndefOr[CipherName] = js.undefined
    /**
         * The priority of the cipher.
         */
    var Priority: js.UndefOr[CipherPriority] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateListenerInput extends js.Object {
    /**
         * [HTTPS listeners] The default SSL server certificate. You must provide exactly one default certificate. To create a certificate list, use AddListenerCertificates.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
         * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you can specify a single target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or TCP for a Network Load Balancer. [HTTPS listener] If the action type is authenticate-oidc, you can use an identity provider that is OpenID Connect (OIDC) compliant to authenticate users as they access your application. [HTTPS listener] If the action type is authenticate-cognito, you can use Amazon Cognito to authenticate users as they access your application. [Application Load Balancer] If the action type is redirect, you can redirect HTTP and HTTPS requests. [Application Load Balancer] If the action type is fixed-response, you can return a custom HTTP response.
         */
    var DefaultActions: Actions
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
    /**
         * The port on which the load balancer is listening.
         */
    var Port: Port
    /**
         * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocol is TCP.
         */
    var Protocol: ProtocolEnum
    /**
         * [HTTPS listeners] The security policy that defines which ciphers and protocols are supported. The default is the current predefined security policy.
         */
    var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
  }
  
  
  trait CreateListenerOutput extends js.Object {
    /**
         * Information about the listener.
         */
    var Listeners: js.UndefOr[Listeners] = js.undefined
  }
  
  
  trait CreateLoadBalancerInput extends js.Object {
    /**
         * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4.
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    /**
         * The name of the load balancer. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
         */
    var Name: LoadBalancerName
    /**
         * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only route requests from clients with access to the VPC for the load balancer. The default is an Internet-facing load balancer.
         */
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
    /**
         * [Application Load Balancers] The IDs of the security groups for the load balancer.
         */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
         * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet.
         */
    var SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined
    /**
         * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones.
         */
    var Subnets: js.UndefOr[Subnets] = js.undefined
    /**
         * One or more tags to assign to the load balancer.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The type of load balancer. The default is application.
         */
    var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
  }
  
  
  trait CreateLoadBalancerOutput extends js.Object {
    /**
         * Information about the load balancer.
         */
    var LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  }
  
  
  trait CreateRuleInput extends js.Object {
    /**
         * The actions. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect. If the action type is forward, you can specify a single target group. [HTTPS listener] If the action type is authenticate-oidc, you can use an identity provider that is OpenID Connect (OIDC) compliant to authenticate users as they access your application. [HTTPS listener] If the action type is authenticate-cognito, you can use Amazon Cognito to authenticate users as they access your application. [Application Load Balancer] If the action type is redirect, you can redirect HTTP and HTTPS requests. [Application Load Balancer] If the action type is fixed-response, you can return a custom HTTP response.
         */
    var Actions: Actions
    /**
         * The conditions. Each condition specifies a field name and a single value. If the field name is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If the field name is path-pattern, you can specify a single path pattern. A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
         */
    var Conditions: RuleConditionList
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
    /**
         * The rule priority. A listener can't have multiple rules with the same priority.
         */
    var Priority: RulePriority
  }
  
  
  trait CreateRuleOutput extends js.Object {
    /**
         * Information about the rule.
         */
    var Rules: js.UndefOr[Rules] = js.undefined
  }
  
  
  trait CreateTargetGroupInput extends js.Object {
    /**
         * The approximate amount of time, in seconds, between health checks of an individual target. For Application Load Balancers, the range is 5–300 seconds. For Network Load Balancers, the supported values are 10 or 30 seconds. The default is 30 seconds.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * [HTTP/HTTPS health checks] The ping path that is the destination on the targets for health checks. The default is /.
         */
    var HealthCheckPath: js.UndefOr[Path] = js.undefined
    /**
         * The port the load balancer uses when performing health checks on targets. The default is traffic-port, which is the port on which each target receives traffic from the load balancer.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported only if the protocol of the target group is TCP. For Application Load Balancers, the default is HTTP. For Network Load Balancers, the default is TCP.
         */
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * The amount of time, in seconds, during which no response from a target means a failed health check. For Application Load Balancers, the range is 2–60 seconds and the default is 5 seconds. For Network Load Balancers, this is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
         */
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
    /**
         * The number of consecutive health checks successes required before considering an unhealthy target healthy. For Application Load Balancers, the default is 5. For Network Load Balancers, the default is 3.
         */
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    /**
         * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target.
         */
    var Matcher: js.UndefOr[Matcher] = js.undefined
    /**
         * The name of the target group. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
         */
    var Name: TargetGroupName
    /**
         * The port on which the targets receive traffic. This port is used unless you specify a port override when registering the target.
         */
    var Port: Port
    /**
         * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocol is TCP.
         */
    var Protocol: ProtocolEnum
    /**
         * The type of target that you must specify when registering targets with this target group. The possible values are instance (targets are specified by instance ID) or ip (targets are specified by IP address). The default is instance. You can't specify targets for a target group using both instance IDs and IP addresses. If the target type is ip, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.
         */
    var TargetType: js.UndefOr[TargetTypeEnum] = js.undefined
    /**
         * The number of consecutive health check failures required before considering a target unhealthy. For Application Load Balancers, the default is 2. For Network Load Balancers, this value must be the same as the healthy threshold count.
         */
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    /**
         * The identifier of the virtual private cloud (VPC).
         */
    var VpcId: VpcId
  }
  
  
  trait CreateTargetGroupOutput extends js.Object {
    /**
         * Information about the target group.
         */
    var TargetGroups: js.UndefOr[TargetGroups] = js.undefined
  }
  
  
  trait DeleteListenerInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
  }
  
  
  trait DeleteListenerOutput extends js.Object
  
  
  trait DeleteLoadBalancerInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
  }
  
  
  trait DeleteLoadBalancerOutput extends js.Object
  
  
  trait DeleteRuleInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var RuleArn: RuleArn
  }
  
  
  trait DeleteRuleOutput extends js.Object
  
  
  trait DeleteTargetGroupInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
  }
  
  
  trait DeleteTargetGroupOutput extends js.Object
  
  
  trait DeregisterTargetsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
    /**
         * The targets. If you specified a port override when you registered a target, you must specify both the target ID and the port when you deregister it.
         */
    var Targets: TargetDescriptions
  }
  
  
  trait DeregisterTargetsOutput extends js.Object
  
  
  trait DescribeAccountLimitsInput extends js.Object {
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  
  trait DescribeAccountLimitsOutput extends js.Object {
    /**
         * Information about the limits.
         */
    var Limits: js.UndefOr[Limits] = js.undefined
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait DescribeListenerCertificatesInput extends js.Object {
    /**
         * The Amazon Resource Names (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  
  trait DescribeListenerCertificatesOutput extends js.Object {
    /**
         * Information about the certificates.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait DescribeListenersInput extends js.Object {
    /**
         * The Amazon Resource Names (ARN) of the listeners.
         */
    var ListenerArns: js.UndefOr[ListenerArns] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  
  trait DescribeListenersOutput extends js.Object {
    /**
         * Information about the listeners.
         */
    var Listeners: js.UndefOr[Listeners] = js.undefined
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
  }
  
  
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    /**
         * Information about the load balancer attributes.
         */
    var Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
  }
  
  
  trait DescribeLoadBalancersInput extends js.Object {
    /**
         * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
         */
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The names of the load balancers.
         */
    var Names: js.UndefOr[LoadBalancerNames] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  
  trait DescribeLoadBalancersOutput extends js.Object {
    /**
         * Information about the load balancers.
         */
    var LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait DescribeRulesInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: js.UndefOr[ListenerArn] = js.undefined
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The Amazon Resource Names (ARN) of the rules.
         */
    var RuleArns: js.UndefOr[RuleArns] = js.undefined
  }
  
  
  trait DescribeRulesOutput extends js.Object {
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
    /**
         * Information about the rules.
         */
    var Rules: js.UndefOr[Rules] = js.undefined
  }
  
  
  trait DescribeSSLPoliciesInput extends js.Object {
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The names of the policies.
         */
    var Names: js.UndefOr[SslPolicyNames] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  
  trait DescribeSSLPoliciesOutput extends js.Object {
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
    /**
         * Information about the policies.
         */
    var SslPolicies: js.UndefOr[SslPolicies] = js.undefined
  }
  
  
  trait DescribeTagsInput extends js.Object {
    /**
         * The Amazon Resource Names (ARN) of the resources.
         */
    var ResourceArns: ResourceArns
  }
  
  
  trait DescribeTagsOutput extends js.Object {
    /**
         * Information about the tags.
         */
    var TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined
  }
  
  
  trait DescribeTargetGroupAttributesInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
  }
  
  
  trait DescribeTargetGroupAttributesOutput extends js.Object {
    /**
         * Information about the target group attributes
         */
    var Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
  }
  
  
  trait DescribeTargetGroupsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
    /**
         * The marker for the next set of results. (You received this marker from a previous call.)
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The names of the target groups.
         */
    var Names: js.UndefOr[TargetGroupNames] = js.undefined
    /**
         * The maximum number of results to return with this call.
         */
    var PageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * The Amazon Resource Names (ARN) of the target groups.
         */
    var TargetGroupArns: js.UndefOr[TargetGroupArns] = js.undefined
  }
  
  
  trait DescribeTargetGroupsOutput extends js.Object {
    /**
         * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
         */
    var NextMarker: js.UndefOr[Marker] = js.undefined
    /**
         * Information about the target groups.
         */
    var TargetGroups: js.UndefOr[TargetGroups] = js.undefined
  }
  
  
  trait DescribeTargetHealthInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
    /**
         * The targets.
         */
    var Targets: js.UndefOr[TargetDescriptions] = js.undefined
  }
  
  
  trait DescribeTargetHealthOutput extends js.Object {
    /**
         * Information about the health of the targets.
         */
    var TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions] = js.undefined
  }
  
  
  trait FixedResponseActionConfig extends js.Object {
    /**
         * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
         */
    var ContentType: js.UndefOr[FixedResponseActionContentType] = js.undefined
    /**
         * The message.
         */
    var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined
    /**
         * The HTTP response code (2XX, 4XX, or 5XX).
         */
    var StatusCode: FixedResponseActionStatusCode
  }
  
  
  trait Limit extends js.Object {
    /**
         * The maximum value of the limit.
         */
    var Max: js.UndefOr[Max] = js.undefined
    /**
         * The name of the limit. The possible values are:   application-load-balancers   listeners-per-application-load-balancer   listeners-per-network-load-balancer   network-load-balancers   rules-per-application-load-balancer   target-groups   targets-per-application-load-balancer   targets-per-availability-zone-per-network-load-balancer   targets-per-network-load-balancer  
         */
    var Name: js.UndefOr[Name] = js.undefined
  }
  
  
  trait Listener extends js.Object {
    /**
         * The SSL server certificate. You must provide a certificate if the protocol is HTTPS.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
         * The default actions for the listener.
         */
    var DefaultActions: js.UndefOr[Actions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: js.UndefOr[ListenerArn] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
    /**
         * The port on which the load balancer is listening.
         */
    var Port: js.UndefOr[Port] = js.undefined
    /**
         * The protocol for connections from clients to the load balancer.
         */
    var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * The security policy that defines which ciphers and protocols are supported. The default is the current predefined security policy.
         */
    var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
  }
  
  
  trait LoadBalancer extends js.Object {
    /**
         * The Availability Zones for the load balancer.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
         */
    var CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId] = js.undefined
    /**
         * The date and time the load balancer was created.
         */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
         * The public DNS name of the load balancer.
         */
    var DNSName: js.UndefOr[DNSName] = js.undefined
    /**
         * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
    /**
         * The name of the load balancer.
         */
    var LoadBalancerName: js.UndefOr[LoadBalancerName] = js.undefined
    /**
         * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only route requests from clients with access to the VPC for the load balancer.
         */
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
    /**
         * The IDs of the security groups for the load balancer.
         */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
         * The state of the load balancer.
         */
    var State: js.UndefOr[LoadBalancerState] = js.undefined
    /**
         * The type of load balancer.
         */
    var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
    /**
         * The ID of the VPC for the load balancer.
         */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  
  trait LoadBalancerAddress extends js.Object {
    /**
         * [Network Load Balancers] The allocation ID of the Elastic IP address.
         */
    var AllocationId: js.UndefOr[AllocationId] = js.undefined
    /**
         * The static IP address.
         */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
  }
  
  
  trait LoadBalancerAttribute extends js.Object {
    /**
         * The name of the attribute. The following attributes are supported by both Application Load Balancers and Network Load Balancers:    deletion_protection.enabled - Indicates whether deletion protection is enabled. The value is true or false. The default is false.   The following attributes are supported by only Application Load Balancers:    access_logs.s3.enabled - Indicates whether access logs are enabled. The value is true or false. The default is false.    access_logs.s3.bucket - The name of the S3 bucket for the access logs. This attribute is required if access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.    access_logs.s3.prefix - The prefix for the location in the S3 bucket for the access logs.    idle_timeout.timeout_seconds - The idle timeout value, in seconds. The valid range is 1-4000 seconds. The default is 60 seconds.    routing.http2.enabled - Indicates whether HTTP/2 is enabled. The value is true or false. The default is true.   The following attributes are supported by only Network Load Balancers:    load_balancing.cross_zone.enabled - Indicates whether cross-zone load balancing is enabled. The value is true or false. The default is false.  
         */
    var Key: js.UndefOr[LoadBalancerAttributeKey] = js.undefined
    /**
         * The value of the attribute.
         */
    var Value: js.UndefOr[LoadBalancerAttributeValue] = js.undefined
  }
  
  
  trait LoadBalancerState extends js.Object {
    /**
         * The state code. The initial state of the load balancer is provisioning. After the load balancer is fully set up and ready to route traffic, its state is active. If the load balancer could not be set up, its state is failed.
         */
    var Code: js.UndefOr[LoadBalancerStateEnum] = js.undefined
    /**
         * A description of the state.
         */
    var Reason: js.UndefOr[StateReason] = js.undefined
  }
  
  
  trait Matcher extends js.Object {
    /**
         * The HTTP codes. For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). For Network Load Balancers, this is 200–399.
         */
    var HttpCode: HttpCode
  }
  
  
  trait ModifyListenerInput extends js.Object {
    /**
         * [HTTPS listeners] The default SSL server certificate. You must provide exactly one default certificate. To create a certificate list, use AddListenerCertificates.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
         * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you can specify a single target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer or TCP for a Network Load Balancer. [HTTPS listener] If the action type is authenticate-oidc, you can use an identity provider that is OpenID Connect (OIDC) compliant to authenticate users as they access your application. [HTTPS listener] If the action type is authenticate-cognito, you can use Amazon Cognito to authenticate users as they access your application. [Application Load Balancer] If the action type is redirect, you can redirect HTTP and HTTPS requests. [Application Load Balancer] If the action type is fixed-response, you can return a custom HTTP response.
         */
    var DefaultActions: js.UndefOr[Actions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
    /**
         * The port for connections from clients to the load balancer.
         */
    var Port: js.UndefOr[Port] = js.undefined
    /**
         * The protocol for connections from clients to the load balancer. Application Load Balancers support HTTP and HTTPS and Network Load Balancers support TCP.
         */
    var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * [HTTPS listeners] The security policy that defines which protocols and ciphers are supported. For more information, see Security Policies in the Application Load Balancers Guide.
         */
    var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
  }
  
  
  trait ModifyListenerOutput extends js.Object {
    /**
         * Information about the modified listener.
         */
    var Listeners: js.UndefOr[Listeners] = js.undefined
  }
  
  
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    /**
         * The load balancer attributes.
         */
    var Attributes: LoadBalancerAttributes
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
  }
  
  
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    /**
         * Information about the load balancer attributes.
         */
    var Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
  }
  
  
  trait ModifyRuleInput extends js.Object {
    /**
         * The actions. If the action type is forward, you can specify a single target group. If the action type is authenticate-oidc, you can use an identity provider that is OpenID Connect (OIDC) compliant to authenticate users as they access your application. If the action type is authenticate-cognito, you can use Amazon Cognito to authenticate users as they access your application.
         */
    var Actions: js.UndefOr[Actions] = js.undefined
    /**
         * The conditions. Each condition specifies a field name and a single value. If the field name is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If the field name is path-pattern, you can specify a single path pattern. A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
         */
    var Conditions: js.UndefOr[RuleConditionList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var RuleArn: RuleArn
  }
  
  
  trait ModifyRuleOutput extends js.Object {
    /**
         * Information about the modified rule.
         */
    var Rules: js.UndefOr[Rules] = js.undefined
  }
  
  
  trait ModifyTargetGroupAttributesInput extends js.Object {
    /**
         * The attributes.
         */
    var Attributes: TargetGroupAttributes
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
  }
  
  
  trait ModifyTargetGroupAttributesOutput extends js.Object {
    /**
         * Information about the attributes.
         */
    var Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
  }
  
  
  trait ModifyTargetGroupInput extends js.Object {
    /**
         * The approximate amount of time, in seconds, between health checks of an individual target. For Application Load Balancers, the range is 5–300 seconds. For Network Load Balancers, the supported values are 10 or 30 seconds.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * [HTTP/HTTPS health checks] The ping path that is the destination for the health check request.
         */
    var HealthCheckPath: js.UndefOr[Path] = js.undefined
    /**
         * The port the load balancer uses when performing health checks on targets.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported only if the protocol of the target group is TCP.
         */
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * [HTTP/HTTPS health checks] The amount of time, in seconds, during which no response means a failed health check.
         */
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
    /**
         * The number of consecutive health checks successes required before considering an unhealthy target healthy.
         */
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    /**
         * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target.
         */
    var Matcher: js.UndefOr[Matcher] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
    /**
         * The number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the healthy threshold count.
         */
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  }
  
  
  trait ModifyTargetGroupOutput extends js.Object {
    /**
         * Information about the modified target group.
         */
    var TargetGroups: js.UndefOr[TargetGroups] = js.undefined
  }
  
  
  trait RedirectActionConfig extends js.Object {
    /**
         * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
         */
    var Host: js.UndefOr[RedirectActionHost] = js.undefined
    /**
         * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
         */
    var Path: js.UndefOr[RedirectActionPath] = js.undefined
    /**
         * The port. You can specify a value from 1 to 65535 or #{port}.
         */
    var Port: js.UndefOr[RedirectActionPort] = js.undefined
    /**
         * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
         */
    var Protocol: js.UndefOr[RedirectActionProtocol] = js.undefined
    /**
         * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it is automatically added. You can specify any of the reserved keywords.
         */
    var Query: js.UndefOr[RedirectActionQuery] = js.undefined
    /**
         * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
         */
    var StatusCode: RedirectActionStatusCodeEnum
  }
  
  
  trait RegisterTargetsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: TargetGroupArn
    /**
         * The targets.
         */
    var Targets: TargetDescriptions
  }
  
  
  trait RegisterTargetsOutput extends js.Object
  
  
  trait RemoveListenerCertificatesInput extends js.Object {
    /**
         * The certificate to remove. You can specify one certificate per call.
         */
    var Certificates: CertificateList
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: ListenerArn
  }
  
  
  trait RemoveListenerCertificatesOutput extends js.Object
  
  
  trait RemoveTagsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var ResourceArns: ResourceArns
    /**
         * The tag keys for the tags to remove.
         */
    var TagKeys: TagKeys
  }
  
  
  trait RemoveTagsOutput extends js.Object
  
  
  trait Rule extends js.Object {
    /**
         * The actions.
         */
    var Actions: js.UndefOr[Actions] = js.undefined
    /**
         * The conditions.
         */
    var Conditions: js.UndefOr[RuleConditionList] = js.undefined
    /**
         * Indicates whether this is the default rule.
         */
    var IsDefault: js.UndefOr[IsDefault] = js.undefined
    /**
         * The priority.
         */
    var Priority: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var RuleArn: js.UndefOr[RuleArn] = js.undefined
  }
  
  
  trait RuleCondition extends js.Object {
    /**
         * The name of the field. The possible values are host-header and path-pattern.
         */
    var Field: js.UndefOr[ConditionFieldName] = js.undefined
    /**
         * The condition value. If the field name is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If the field name is path-pattern, you can specify a single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
         */
    var Values: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait RulePriorityPair extends js.Object {
    /**
         * The rule priority.
         */
    var Priority: js.UndefOr[RulePriority] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var RuleArn: js.UndefOr[RuleArn] = js.undefined
  }
  
  
  trait SetIpAddressTypeInput extends js.Object {
    /**
         * The IP address type. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4.
         */
    var IpAddressType: IpAddressType
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
  }
  
  
  trait SetIpAddressTypeOutput extends js.Object {
    /**
         * The IP address type.
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
  }
  
  
  trait SetRulePrioritiesInput extends js.Object {
    /**
         * The rule priorities.
         */
    var RulePriorities: RulePriorityList
  }
  
  
  trait SetRulePrioritiesOutput extends js.Object {
    /**
         * Information about the rules.
         */
    var Rules: js.UndefOr[Rules] = js.undefined
  }
  
  
  trait SetSecurityGroupsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
    /**
         * The IDs of the security groups.
         */
    var SecurityGroups: SecurityGroups
  }
  
  
  trait SetSecurityGroupsOutput extends js.Object {
    /**
         * The IDs of the security groups associated with the load balancer.
         */
    var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.undefined
  }
  
  
  trait SetSubnetsInput extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
    var LoadBalancerArn: LoadBalancerArn
    /**
         * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. You cannot specify Elastic IP addresses for your subnets.
         */
    var SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined
    /**
         * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
         */
    var Subnets: js.UndefOr[Subnets] = js.undefined
  }
  
  
  trait SetSubnetsOutput extends js.Object {
    /**
         * Information about the subnet and Availability Zone.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  }
  
  
  trait SslPolicy extends js.Object {
    /**
         * The ciphers.
         */
    var Ciphers: js.UndefOr[Ciphers] = js.undefined
    /**
         * The name of the policy.
         */
    var Name: js.UndefOr[SslPolicyName] = js.undefined
    /**
         * The protocols.
         */
    var SslProtocols: js.UndefOr[SslProtocols] = js.undefined
  }
  
  
  trait SubnetMapping extends js.Object {
    /**
         * [Network Load Balancers] The allocation ID of the Elastic IP address.
         */
    var AllocationId: js.UndefOr[AllocationId] = js.undefined
    /**
         * The ID of the subnet.
         */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The key of the tag.
         */
    var Key: TagKey
    /**
         * The value of the tag.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagDescription extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    /**
         * Information about the tags.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait TargetDescription extends js.Object {
    /**
         * An Availability Zone or all. This determines whether the target receives traffic from the load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer. This parameter is not supported if the target type of the target group is instance. If the IP address is in a subnet of the VPC for the target group, the Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC, this parameter is required. With an Application Load Balancer, if the IP address is outside the VPC for the target group, the only supported value is all.
         */
    var AvailabilityZone: js.UndefOr[ZoneName] = js.undefined
    /**
         * The ID of the target. If the target type of the target group is instance, specify an instance ID. If the target type is ip, specify an IP address.
         */
    var Id: TargetId
    /**
         * The port on which the target is listening.
         */
    var Port: js.UndefOr[Port] = js.undefined
  }
  
  
  trait TargetGroup extends js.Object {
    /**
         * The approximate amount of time, in seconds, between health checks of an individual target.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * The destination for the health check request.
         */
    var HealthCheckPath: js.UndefOr[Path] = js.undefined
    /**
         * The port to use to connect with the target.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol to use to connect with the target.
         */
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * The amount of time, in seconds, during which no response means a failed health check.
         */
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
    /**
         * The number of consecutive health checks successes required before considering an unhealthy target healthy.
         */
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    /**
         * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
         */
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined
    /**
         * The HTTP codes to use when checking for a successful response from a target.
         */
    var Matcher: js.UndefOr[Matcher] = js.undefined
    /**
         * The port on which the targets are listening.
         */
    var Port: js.UndefOr[Port] = js.undefined
    /**
         * The protocol to use for routing traffic to the targets.
         */
    var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined
    /**
         * The name of the target group.
         */
    var TargetGroupName: js.UndefOr[TargetGroupName] = js.undefined
    /**
         * The type of target that you must specify when registering targets with this target group. The possible values are instance (targets are specified by instance ID) or ip (targets are specified by IP address).
         */
    var TargetType: js.UndefOr[TargetTypeEnum] = js.undefined
    /**
         * The number of consecutive health check failures required before considering the target unhealthy.
         */
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    /**
         * The ID of the VPC for the targets.
         */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  
  trait TargetGroupAttribute extends js.Object {
    /**
         * The name of the attribute. The following attributes are supported by both Application Load Balancers and Network Load Balancers:    deregistration_delay.timeout_seconds - The amount of time, in seconds, for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.   The following attributes are supported by only Application Load Balancers:    slow_start.duration_seconds - The time period, in seconds, during which a newly registered target receives a linearly increasing share of the traffic to the target group. After this time period ends, the target receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start mode is disabled by default.    stickiness.enabled - Indicates whether sticky sessions are enabled. The value is true or false. The default is false.    stickiness.type - The type of sticky sessions. The possible value is lb_cookie.    stickiness.lb_cookie.duration_seconds - The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).   The following attributes are supported by only Network Load Balancers:    proxy_protocol_v2.enabled - Indicates whether Proxy Protocol version 2 is enabled. The value is true or false. The default is false.  
         */
    var Key: js.UndefOr[TargetGroupAttributeKey] = js.undefined
    /**
         * The value of the attribute.
         */
    var Value: js.UndefOr[TargetGroupAttributeValue] = js.undefined
  }
  
  
  trait TargetHealth extends js.Object {
    /**
         * A description of the target health that provides additional details. If the state is healthy, a description is not provided.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The reason code. If the target state is healthy, a reason code is not provided. If the target state is initial, the reason code can be one of the following values:    Elb.RegistrationInProgress - The target is in the process of being registered with the load balancer.    Elb.InitialHealthChecking - The load balancer is still sending the target the minimum number of health checks required to determine its health status.   If the target state is unhealthy, the reason code can be one of the following values:    Target.ResponseCodeMismatch - The health checks did not return an expected HTTP code.    Target.Timeout - The health check requests timed out.    Target.FailedHealthChecks - The health checks failed because the connection to the target timed out, the target response was malformed, or the target failed the health check for an unknown reason.    Elb.InternalError - The health checks failed due to an internal error.   If the target state is unused, the reason code can be one of the following values:    Target.NotRegistered - The target is not registered with the target group.    Target.NotInUse - The target group is not used by any load balancer or the target is in an Availability Zone that is not enabled for its load balancer.    Target.IpUnusable - The target IP address is reserved for use by a load balancer.    Target.InvalidState - The target is in the stopped or terminated state.   If the target state is draining, the reason code can be the following value:    Target.DeregistrationInProgress - The target is in the process of being deregistered and the deregistration delay period has not expired.  
         */
    var Reason: js.UndefOr[TargetHealthReasonEnum] = js.undefined
    /**
         * The state of the target.
         */
    var State: js.UndefOr[TargetHealthStateEnum] = js.undefined
  }
  
  
  trait TargetHealthDescription extends js.Object {
    /**
         * The port to use to connect with the target.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The description of the target.
         */
    var Target: js.UndefOr[TargetDescription] = js.undefined
    /**
         * The health information for the target.
         */
    var TargetHealth: js.UndefOr[TargetHealth] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds the specified certificate to the specified secure listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates.
       */
    def addListenerCertificates(): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified certificate to the specified secure listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates.
       */
    def addListenerCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified certificate to the specified secure listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates.
       */
    def addListenerCertificates(params: AddListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified certificate to the specified secure listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates.
       */
    def addListenerCertificates(
      params: AddListenerCertificatesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
       */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
       */
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
       */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
       */
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createListener(): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createListener(params: CreateListenerInput): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createListener(
      params: CreateListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
       */
    def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
       */
    def createLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
       */
    def createLoadBalancer(params: CreateLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
       */
    def createLoadBalancer(
      params: CreateLoadBalancerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
       */
    def createRule(): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
       */
    def createRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
       */
    def createRule(params: CreateRuleInput): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
       */
    def createRule(
      params: CreateRuleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createTargetGroup(): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createTargetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createTargetGroup(params: CreateTargetGroupInput): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def createTargetGroup(
      params: CreateTargetGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
       */
    def deleteListener(): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
       */
    def deleteListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
       */
    def deleteListener(params: DeleteListenerInput): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
       */
    def deleteListener(
      params: DeleteListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
       */
    def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
       */
    def deleteLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
       */
    def deleteLoadBalancer(params: DeleteLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
       */
    def deleteLoadBalancer(
      params: DeleteLoadBalancerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule.
       */
    def deleteRule(): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule.
       */
    def deleteRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule.
       */
    def deleteRule(params: DeleteRuleInput): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule.
       */
    def deleteRule(
      params: DeleteRuleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
       */
    def deleteTargetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
       */
    def deleteTargetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
       */
    def deleteTargetGroup(params: DeleteTargetGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
       */
    def deleteTargetGroup(
      params: DeleteTargetGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
       */
    def deregisterTargets(): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
       */
    def deregisterTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
       */
    def deregisterTargets(params: DeregisterTargetsInput): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
       */
    def deregisterTargets(
      params: DeregisterTargetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def describeAccountLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def describeAccountLimits(params: DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
       */
    def describeAccountLimits(
      params: DescribeAccountLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the certificates for the specified secure listener.
       */
    def describeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the certificates for the specified secure listener.
       */
    def describeListenerCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the certificates for the specified secure listener.
       */
    def describeListenerCertificates(params: DescribeListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the certificates for the specified secure listener.
       */
    def describeListenerCertificates(
      params: DescribeListenerCertificatesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
       */
    def describeListeners(): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
       */
    def describeListeners(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
       */
    def describeListeners(params: DescribeListenersInput): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
       */
    def describeListeners(
      params: DescribeListenersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
       */
    def describeLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
       */
    def describeLoadBalancerAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
       */
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
       */
    def describeLoadBalancerAttributes(
      params: DescribeLoadBalancerAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
       */
    def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
       */
    def describeLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
       */
    def describeLoadBalancers(params: DescribeLoadBalancersInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
       */
    def describeLoadBalancers(
      params: DescribeLoadBalancersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
       */
    def describeRules(): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
       */
    def describeRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRulesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
       */
    def describeRules(params: DescribeRulesInput): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
       */
    def describeRules(
      params: DescribeRulesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRulesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
       */
    def describeSSLPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
       */
    def describeSSLPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSSLPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
       */
    def describeSSLPolicies(params: DescribeSSLPoliciesInput): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
       */
    def describeSSLPolicies(
      params: DescribeSSLPoliciesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSSLPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
       */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
       */
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
       */
    def describeTags(params: DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
       */
    def describeTags(
      params: DescribeTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
       */
    def describeTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
       */
    def describeTargetGroupAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetGroupAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
       */
    def describeTargetGroupAttributes(params: DescribeTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
       */
    def describeTargetGroupAttributes(
      params: DescribeTargetGroupAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetGroupAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
       */
    def describeTargetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
       */
    def describeTargetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
       */
    def describeTargetGroups(params: DescribeTargetGroupsInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
       */
    def describeTargetGroups(
      params: DescribeTargetGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the health of the specified targets or all of your targets.
       */
    def describeTargetHealth(): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the health of the specified targets or all of your targets.
       */
    def describeTargetHealth(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the health of the specified targets or all of your targets.
       */
    def describeTargetHealth(params: DescribeTargetHealthInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the health of the specified targets or all of your targets.
       */
    def describeTargetHealth(
      params: DescribeTargetHealthInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS, you must add the security policy and server certificate.
       */
    def modifyListener(): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS, you must add the security policy and server certificate.
       */
    def modifyListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS, you must add the security policy and server certificate.
       */
    def modifyListener(params: ModifyListenerInput): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS, you must add the security policy and server certificate.
       */
    def modifyListener(
      params: ModifyListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
       */
    def modifyLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
       */
    def modifyLoadBalancerAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
       */
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
       */
    def modifyLoadBalancerAttributes(
      params: ModifyLoadBalancerAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
       */
    def modifyRule(): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
       */
    def modifyRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
       */
    def modifyRule(params: ModifyRuleInput): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
       */
    def modifyRule(
      params: ModifyRuleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyRuleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
       */
    def modifyTargetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
       */
    def modifyTargetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
       */
    def modifyTargetGroup(params: ModifyTargetGroupInput): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
       */
    def modifyTargetGroup(
      params: ModifyTargetGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyTargetGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified target group.
       */
    def modifyTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified target group.
       */
    def modifyTargetGroupAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyTargetGroupAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified target group.
       */
    def modifyTargetGroupAttributes(params: ModifyTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the specified attributes of the specified target group.
       */
    def modifyTargetGroupAttributes(
      params: ModifyTargetGroupAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyTargetGroupAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the specified targets with the specified target group. You can register targets by instance ID or by IP address. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
       */
    def registerTargets(): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the specified targets with the specified target group. You can register targets by instance ID or by IP address. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
       */
    def registerTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the specified targets with the specified target group. You can register targets by instance ID or by IP address. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
       */
    def registerTargets(params: RegisterTargetsInput): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the specified targets with the specified target group. You can register targets by instance ID or by IP address. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
       */
    def registerTargets(
      params: RegisterTargetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified certificate from the specified secure listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
       */
    def removeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified certificate from the specified secure listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
       */
    def removeListenerCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified certificate from the specified secure listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
       */
    def removeListenerCertificates(params: RemoveListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified certificate from the specified secure listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
       */
    def removeListenerCertificates(
      params: RemoveListenerCertificatesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveListenerCertificatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
       */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
       */
    def removeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
       */
    def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
       */
    def removeTags(
      params: RemoveTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
       */
    def setIpAddressType(): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
       */
    def setIpAddressType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIpAddressTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
       */
    def setIpAddressType(params: SetIpAddressTypeInput): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
       */
    def setIpAddressType(
      params: SetIpAddressTypeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetIpAddressTypeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
       */
    def setRulePriorities(): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
       */
    def setRulePriorities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetRulePrioritiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
       */
    def setRulePriorities(params: SetRulePrioritiesInput): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
       */
    def setRulePriorities(
      params: SetRulePrioritiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetRulePrioritiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
       */
    def setSecurityGroups(): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
       */
    def setSecurityGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSecurityGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
       */
    def setSecurityGroups(params: SetSecurityGroupsInput): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
       */
    def setSecurityGroups(
      params: SetSecurityGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSecurityGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
       */
    def setSubnets(): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
       */
    def setSubnets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
       */
    def setSubnets(params: SetSubnetsInput): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
       */
    def setSubnets(
      params: SetSubnetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerExists(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancerExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancersDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancersDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancersDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_loadBalancersDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
      params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetDeregistered(state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
      params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
      params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetInService(state: awsDashSdkLib.awsDashSdkLibStrings.targetInService): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
      params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
       */
    @JSName("waitFor")
    def waitFor_targetInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
      params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTargetHealthOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ActionOrder = scala.Double
  type ActionTypeEnum = awsDashSdkLib.awsDashSdkLibStrings.forward | awsDashSdkLib.awsDashSdkLibStrings.`authenticate-oidc` | awsDashSdkLib.awsDashSdkLibStrings.`authenticate-cognito` | awsDashSdkLib.awsDashSdkLibStrings.redirect | awsDashSdkLib.awsDashSdkLibStrings.`fixed-response` | java.lang.String
  type Actions = js.Array[Action]
  type AllocationId = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = java.lang.String
  type AuthenticateCognitoActionConditionalBehaviorEnum = awsDashSdkLib.awsDashSdkLibStrings.deny | awsDashSdkLib.awsDashSdkLibStrings.allow | awsDashSdkLib.awsDashSdkLibStrings.authenticate | java.lang.String
  type AuthenticateCognitoActionScope = java.lang.String
  type AuthenticateCognitoActionSessionCookieName = java.lang.String
  type AuthenticateCognitoActionSessionTimeout = scala.Double
  type AuthenticateCognitoActionUserPoolArn = java.lang.String
  type AuthenticateCognitoActionUserPoolClientId = java.lang.String
  type AuthenticateCognitoActionUserPoolDomain = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestParamValue = java.lang.String
  type AuthenticateOidcActionAuthorizationEndpoint = java.lang.String
  type AuthenticateOidcActionClientId = java.lang.String
  type AuthenticateOidcActionClientSecret = java.lang.String
  type AuthenticateOidcActionConditionalBehaviorEnum = awsDashSdkLib.awsDashSdkLibStrings.deny | awsDashSdkLib.awsDashSdkLibStrings.allow | awsDashSdkLib.awsDashSdkLibStrings.authenticate | java.lang.String
  type AuthenticateOidcActionIssuer = java.lang.String
  type AuthenticateOidcActionScope = java.lang.String
  type AuthenticateOidcActionSessionCookieName = java.lang.String
  type AuthenticateOidcActionSessionTimeout = scala.Double
  type AuthenticateOidcActionTokenEndpoint = java.lang.String
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
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = java.lang.String
  type HealthCheckThresholdCount = scala.Double
  type HealthCheckTimeoutSeconds = scala.Double
  type HttpCode = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = awsDashSdkLib.awsDashSdkLibStrings.ipv4 | awsDashSdkLib.awsDashSdkLibStrings.dualstack | java.lang.String
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
  type LoadBalancerSchemeEnum = awsDashSdkLib.awsDashSdkLibStrings.`internet-facing` | awsDashSdkLib.awsDashSdkLibStrings.internal | java.lang.String
  type LoadBalancerStateEnum = awsDashSdkLib.awsDashSdkLibStrings.active | awsDashSdkLib.awsDashSdkLibStrings.provisioning | awsDashSdkLib.awsDashSdkLibStrings.active_impaired | awsDashSdkLib.awsDashSdkLibStrings.failed | java.lang.String
  type LoadBalancerTypeEnum = awsDashSdkLib.awsDashSdkLibStrings.application | awsDashSdkLib.awsDashSdkLibStrings.network | java.lang.String
  type LoadBalancers = js.Array[LoadBalancer]
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type Path = java.lang.String
  type Port = scala.Double
  type ProtocolEnum = awsDashSdkLib.awsDashSdkLibStrings.HTTP | awsDashSdkLib.awsDashSdkLibStrings.HTTPS | awsDashSdkLib.awsDashSdkLibStrings.TCP | java.lang.String
  type RedirectActionHost = java.lang.String
  type RedirectActionPath = java.lang.String
  type RedirectActionPort = java.lang.String
  type RedirectActionProtocol = java.lang.String
  type RedirectActionQuery = java.lang.String
  type RedirectActionStatusCodeEnum = awsDashSdkLib.awsDashSdkLibStrings.HTTP_301 | awsDashSdkLib.awsDashSdkLibStrings.HTTP_302 | java.lang.String
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
  type TargetHealthReasonEnum = awsDashSdkLib.awsDashSdkLibStrings.ElbDOTRegistrationInProgress | awsDashSdkLib.awsDashSdkLibStrings.ElbDOTInitialHealthChecking | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTResponseCodeMismatch | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTTimeout | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTFailedHealthChecks | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTNotRegistered | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTNotInUse | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTDeregistrationInProgress | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTInvalidState | awsDashSdkLib.awsDashSdkLibStrings.TargetDOTIpUnusable | awsDashSdkLib.awsDashSdkLibStrings.ElbDOTInternalError | java.lang.String
  type TargetHealthStateEnum = awsDashSdkLib.awsDashSdkLibStrings.initial | awsDashSdkLib.awsDashSdkLibStrings.healthy | awsDashSdkLib.awsDashSdkLibStrings.unhealthy | awsDashSdkLib.awsDashSdkLibStrings.unused | awsDashSdkLib.awsDashSdkLibStrings.draining | awsDashSdkLib.awsDashSdkLibStrings.unavailable | java.lang.String
  type TargetId = java.lang.String
  type TargetTypeEnum = awsDashSdkLib.awsDashSdkLibStrings.instance | awsDashSdkLib.awsDashSdkLibStrings.ip | java.lang.String
  type VpcId = java.lang.String
  type ZoneName = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-12-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

