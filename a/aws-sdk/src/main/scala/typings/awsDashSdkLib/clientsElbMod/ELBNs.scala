package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/elb", "ELB")
@js.native
object ELBNs extends js.Object {
  trait AccessLog extends js.Object {
    /**
      * The interval for publishing the access logs. You can specify an interval of either 5 minutes or 60 minutes. Default: 60 minutes
      */
    var EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined
    /**
      * Specifies whether access logs are enabled for the load balancer.
      */
    var Enabled: AccessLogEnabled
    /**
      * The name of the Amazon S3 bucket where the access logs are stored.
      */
    var S3BucketName: js.UndefOr[S3BucketName] = js.undefined
    /**
      * The logical hierarchy you created for your Amazon S3 bucket, for example my-bucket-prefix/prod. If the prefix is not provided, the log is placed at the root level of the bucket.
      */
    var S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.undefined
  }
  
  trait AddAvailabilityZonesInput extends js.Object {
    /**
      * The Availability Zones. These must be in the same region as the load balancer.
      */
    var AvailabilityZones: awsDashSdkLib.clientsElbMod.ELBNs.AvailabilityZones
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait AddAvailabilityZonesOutput extends js.Object {
    /**
      * The updated list of Availability Zones for the load balancer.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  }
  
  trait AddTagsInput extends js.Object {
    /**
      * The name of the load balancer. You can specify one load balancer only.
      */
    var LoadBalancerNames: awsDashSdkLib.clientsElbMod.ELBNs.LoadBalancerNames
    /**
      * The tags.
      */
    var Tags: TagList
  }
  
  trait AddTagsOutput extends js.Object
  
  trait AdditionalAttribute extends js.Object {
    /**
      * This parameter is reserved.
      */
    var Key: js.UndefOr[AdditionalAttributeKey] = js.undefined
    /**
      * This parameter is reserved.
      */
    var Value: js.UndefOr[AdditionalAttributeValue] = js.undefined
  }
  
  trait AppCookieStickinessPolicy extends js.Object {
    /**
      * The name of the application cookie used for stickiness.
      */
    var CookieName: js.UndefOr[CookieName] = js.undefined
    /**
      * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
      */
    var PolicyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The IDs of the security groups to associate with the load balancer. Note that you cannot specify the name of the security group.
      */
    var SecurityGroups: awsDashSdkLib.clientsElbMod.ELBNs.SecurityGroups
  }
  
  trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
    /**
      * The IDs of the security groups associated with the load balancer.
      */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
  }
  
  trait AttachLoadBalancerToSubnetsInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The IDs of the subnets to add. You can add only one subnet per Availability Zone.
      */
    var Subnets: awsDashSdkLib.clientsElbMod.ELBNs.Subnets
  }
  
  trait AttachLoadBalancerToSubnetsOutput extends js.Object {
    /**
      * The IDs of the subnets attached to the load balancer.
      */
    var Subnets: js.UndefOr[Subnets] = js.undefined
  }
  
  trait BackendServerDescription extends js.Object {
    /**
      * The port on which the EC2 instance is listening.
      */
    var InstancePort: js.UndefOr[InstancePort] = js.undefined
    /**
      * The names of the policies enabled for the EC2 instance.
      */
    var PolicyNames: js.UndefOr[PolicyNames] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ConfigureHealthCheckInput extends js.Object {
    /**
      * The configuration information.
      */
    var HealthCheck: awsDashSdkLib.clientsElbMod.ELBNs.HealthCheck
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait ConfigureHealthCheckOutput extends js.Object {
    /**
      * The updated health check.
      */
    var HealthCheck: js.UndefOr[HealthCheck] = js.undefined
  }
  
  trait ConnectionDraining extends js.Object {
    /**
      * Specifies whether connection draining is enabled for the load balancer.
      */
    var Enabled: ConnectionDrainingEnabled
    /**
      * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
      */
    var Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.undefined
  }
  
  trait ConnectionSettings extends js.Object {
    /**
      * The time, in seconds, that the connection is allowed to be idle (no data has been sent over the connection) before it is closed by the load balancer.
      */
    var IdleTimeout: awsDashSdkLib.clientsElbMod.ELBNs.IdleTimeout
  }
  
  trait CreateAccessPointInput extends js.Object {
    /**
      * One or more Availability Zones from the same region as the load balancer. You must specify at least one Availability Zone. You can add more Availability Zones after you create the load balancer using EnableAvailabilityZonesForLoadBalancer.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * The listeners. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    var Listeners: awsDashSdkLib.clientsElbMod.ELBNs.Listeners
    /**
      * The name of the load balancer. This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The type of a load balancer. Valid only for load balancers in a VPC. By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to public IP addresses. For more information about Internet-facing and Internal load balancers, see Load Balancer Scheme in the Elastic Load Balancing User Guide. Specify internal to create a load balancer with a DNS name that resolves to private IP addresses.
      */
    var Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined
    /**
      * The IDs of the security groups to assign to the load balancer.
      */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
      * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone specified in AvailabilityZones.
      */
    var Subnets: js.UndefOr[Subnets] = js.undefined
    /**
      * A list of tags to assign to the load balancer. For more information about tagging your load balancer, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateAccessPointOutput extends js.Object {
    /**
      * The DNS name of the load balancer.
      */
    var DNSName: js.UndefOr[DNSName] = js.undefined
  }
  
  trait CreateAppCookieStickinessPolicyInput extends js.Object {
    /**
      * The name of the application cookie used for stickiness.
      */
    var CookieName: awsDashSdkLib.clientsElbMod.ELBNs.CookieName
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
      */
    var PolicyName: awsDashSdkLib.clientsElbMod.ELBNs.PolicyName
  }
  
  trait CreateAppCookieStickinessPolicyOutput extends js.Object
  
  trait CreateLBCookieStickinessPolicyInput extends js.Object {
    /**
      * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this parameter, the default value is 0, which indicates that the sticky session should last for the duration of the browser session.
      */
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
      */
    var PolicyName: awsDashSdkLib.clientsElbMod.ELBNs.PolicyName
  }
  
  trait CreateLBCookieStickinessPolicyOutput extends js.Object
  
  trait CreateLoadBalancerListenerInput extends js.Object {
    /**
      * The listeners.
      */
    var Listeners: awsDashSdkLib.clientsElbMod.ELBNs.Listeners
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait CreateLoadBalancerListenerOutput extends js.Object
  
  trait CreateLoadBalancerPolicyInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The policy attributes.
      */
    var PolicyAttributes: js.UndefOr[PolicyAttributes] = js.undefined
    /**
      * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
      */
    var PolicyName: awsDashSdkLib.clientsElbMod.ELBNs.PolicyName
    /**
      * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
      */
    var PolicyTypeName: awsDashSdkLib.clientsElbMod.ELBNs.PolicyTypeName
  }
  
  trait CreateLoadBalancerPolicyOutput extends js.Object
  
  trait CrossZoneLoadBalancing extends js.Object {
    /**
      * Specifies whether cross-zone load balancing is enabled for the load balancer.
      */
    var Enabled: CrossZoneLoadBalancingEnabled
  }
  
  trait DeleteAccessPointInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait DeleteAccessPointOutput extends js.Object
  
  trait DeleteLoadBalancerListenerInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The client port numbers of the listeners.
      */
    var LoadBalancerPorts: Ports
  }
  
  trait DeleteLoadBalancerListenerOutput extends js.Object
  
  trait DeleteLoadBalancerPolicyInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The name of the policy.
      */
    var PolicyName: awsDashSdkLib.clientsElbMod.ELBNs.PolicyName
  }
  
  trait DeleteLoadBalancerPolicyOutput extends js.Object
  
  trait DeregisterEndPointsInput extends js.Object {
    /**
      * The IDs of the instances.
      */
    var Instances: awsDashSdkLib.clientsElbMod.ELBNs.Instances
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait DeregisterEndPointsOutput extends js.Object {
    /**
      * The remaining instances registered with the load balancer.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
  }
  
  trait DescribeAccessPointsInput extends js.Object {
    /**
      * The names of the load balancers.
      */
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined
    /**
      * The marker for the next set of results. (You received this marker from a previous call.)
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * The maximum number of results to return with this call (a number from 1 to 400). The default is 400.
      */
    var PageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait DescribeAccessPointsOutput extends js.Object {
    /**
      * Information about the load balancers.
      */
    var LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions] = js.undefined
    /**
      * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
      */
    var NextMarker: js.UndefOr[Marker] = js.undefined
  }
  
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
  
  trait DescribeEndPointStateInput extends js.Object {
    /**
      * The IDs of the instances.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait DescribeEndPointStateOutput extends js.Object {
    /**
      * Information about the health of the instances.
      */
    var InstanceStates: js.UndefOr[InstanceStates] = js.undefined
  }
  
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    /**
      * Information about the load balancer attributes.
      */
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
  }
  
  trait DescribeLoadBalancerPoliciesInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    /**
      * The names of the policies.
      */
    var PolicyNames: js.UndefOr[PolicyNames] = js.undefined
  }
  
  trait DescribeLoadBalancerPoliciesOutput extends js.Object {
    /**
      * Information about the policies.
      */
    var PolicyDescriptions: js.UndefOr[PolicyDescriptions] = js.undefined
  }
  
  trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
    /**
      * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
      */
    var PolicyTypeNames: js.UndefOr[PolicyTypeNames] = js.undefined
  }
  
  trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
    /**
      * Information about the policy types.
      */
    var PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions] = js.undefined
  }
  
  trait DescribeTagsInput extends js.Object {
    /**
      * The names of the load balancers.
      */
    var LoadBalancerNames: LoadBalancerNamesMax20
  }
  
  trait DescribeTagsOutput extends js.Object {
    /**
      * Information about the tags.
      */
    var TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined
  }
  
  trait DetachLoadBalancerFromSubnetsInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The IDs of the subnets.
      */
    var Subnets: awsDashSdkLib.clientsElbMod.ELBNs.Subnets
  }
  
  trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
    /**
      * The IDs of the remaining subnets for the load balancer.
      */
    var Subnets: js.UndefOr[Subnets] = js.undefined
  }
  
  trait HealthCheck extends js.Object {
    /**
      * The number of consecutive health checks successes required before moving the instance to the Healthy state.
      */
    var HealthyThreshold: awsDashSdkLib.clientsElbMod.ELBNs.HealthyThreshold
    /**
      * The approximate interval, in seconds, between health checks of an individual instance.
      */
    var Interval: HealthCheckInterval
    /**
      * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1) through 65535. TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a health check simply attempts to open a TCP connection to the instance on the specified port. Failure to connect within the configured timeout is considered unhealthy. SSL is also specified as SSL: port pair, for example, SSL:5000. For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is issued to the instance on the given port and path. Any answer other than "200 OK" within the timeout period is considered unhealthy. The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
      */
    var Target: HealthCheckTarget
    /**
      * The amount of time, in seconds, during which no response means a failed health check. This value must be less than the Interval value.
      */
    var Timeout: HealthCheckTimeout
    /**
      * The number of consecutive health check failures required before moving the instance to the Unhealthy state.
      */
    var UnhealthyThreshold: awsDashSdkLib.clientsElbMod.ELBNs.UnhealthyThreshold
  }
  
  trait Instance extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
  }
  
  trait InstanceState extends js.Object {
    /**
      * A description of the instance state. This string can contain one or more of the following messages.    N/A     A transient error occurred. Please try again later.     Instance has failed at least the UnhealthyThreshold number of health checks consecutively.     Instance has not passed the configured HealthyThreshold number of health checks consecutively.     Instance registration is still in progress.     Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.     Instance is not currently registered with the LoadBalancer.     Instance deregistration currently in progress.     Disable Availability Zone is currently in progress.     Instance is in pending state.     Instance is in stopped state.     Instance is in terminated state.   
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The ID of the instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * Information about the cause of OutOfService instances. Specifically, whether the cause is Elastic Load Balancing or the instance. Valid values: ELB | Instance | N/A 
      */
    var ReasonCode: js.UndefOr[ReasonCode] = js.undefined
    /**
      * The current state of the instance. Valid values: InService | OutOfService | Unknown 
      */
    var State: js.UndefOr[State] = js.undefined
  }
  
  trait LBCookieStickinessPolicy extends js.Object {
    /**
      * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
      */
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
    /**
      * The name of the policy. This name must be unique within the set of policies for this load balancer.
      */
    var PolicyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait Limit extends js.Object {
    /**
      * The maximum value of the limit.
      */
    var Max: js.UndefOr[Max] = js.undefined
    /**
      * The name of the limit. The possible values are:   classic-listeners   classic-load-balancers   classic-registered-instances  
      */
    var Name: js.UndefOr[Name] = js.undefined
  }
  
  trait Listener extends js.Object {
    /**
      * The port on which the instance is listening.
      */
    var InstancePort: awsDashSdkLib.clientsElbMod.ELBNs.InstancePort
    /**
      * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL. If the front-end protocol is HTTP, HTTPS, TCP, or SSL, InstanceProtocol must be at the same protocol. If there is another listener with the same InstancePort whose InstanceProtocol is secure, (HTTPS or SSL), the listener's InstanceProtocol must also be secure. If there is another listener with the same InstancePort whose InstanceProtocol is HTTP or TCP, the listener's InstanceProtocol must be HTTP or TCP.
      */
    var InstanceProtocol: js.UndefOr[Protocol] = js.undefined
    /**
      * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
      */
    var LoadBalancerPort: AccessPointPort
    /**
      * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
      */
    var Protocol: awsDashSdkLib.clientsElbMod.ELBNs.Protocol
    /**
      * The Amazon Resource Name (ARN) of the server certificate.
      */
    var SSLCertificateId: js.UndefOr[SSLCertificateId] = js.undefined
  }
  
  trait ListenerDescription extends js.Object {
    /**
      * The listener.
      */
    var Listener: js.UndefOr[Listener] = js.undefined
    /**
      * The policies. If there are no policies enabled, the list is empty.
      */
    var PolicyNames: js.UndefOr[PolicyNames] = js.undefined
  }
  
  trait LoadBalancerAttributes extends js.Object {
    /**
      * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
      */
    var AccessLog: js.UndefOr[AccessLog] = js.undefined
    /**
      * This parameter is reserved.
      */
    var AdditionalAttributes: js.UndefOr[AdditionalAttributes] = js.undefined
    /**
      * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away from a deregistered or unhealthy instance. For more information, see Configure Connection Draining in the Classic Load Balancers Guide.
      */
    var ConnectionDraining: js.UndefOr[ConnectionDraining] = js.undefined
    /**
      * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the specified duration. By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end connections of your load balancer. For more information, see Configure Idle Connection Timeout in the Classic Load Balancers Guide.
      */
    var ConnectionSettings: js.UndefOr[ConnectionSettings] = js.undefined
    /**
      * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones. For more information, see Configure Cross-Zone Load Balancing in the Classic Load Balancers Guide.
      */
    var CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing] = js.undefined
  }
  
  trait LoadBalancerDescription extends js.Object {
    /**
      * The Availability Zones for the load balancer.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * Information about your EC2 instances.
      */
    var BackendServerDescriptions: js.UndefOr[BackendServerDescriptions] = js.undefined
    /**
      * The DNS name of the load balancer. For more information, see Configure a Custom Domain Name in the Classic Load Balancers Guide.
      */
    var CanonicalHostedZoneName: js.UndefOr[DNSName] = js.undefined
    /**
      * The ID of the Amazon Route 53 hosted zone for the load balancer.
      */
    var CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.undefined
    /**
      * The date and time the load balancer was created.
      */
    var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
    /**
      * The DNS name of the load balancer.
      */
    var DNSName: js.UndefOr[DNSName] = js.undefined
    /**
      * Information about the health checks conducted on the load balancer.
      */
    var HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    /**
      * The IDs of the instances for the load balancer.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
    /**
      * The listeners for the load balancer.
      */
    var ListenerDescriptions: js.UndefOr[ListenerDescriptions] = js.undefined
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    /**
      * The policies defined for the load balancer.
      */
    var Policies: js.UndefOr[Policies] = js.undefined
    /**
      * The type of load balancer. Valid only for load balancers in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
      */
    var Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined
    /**
      * The security groups for the load balancer. Valid only for load balancers in a VPC.
      */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
      * The security group for the load balancer, which you can use as part of your inbound rules for your registered instances. To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
      */
    var SourceSecurityGroup: js.UndefOr[SourceSecurityGroup] = js.undefined
    /**
      * The IDs of the subnets for the load balancer.
      */
    var Subnets: js.UndefOr[Subnets] = js.undefined
    /**
      * The ID of the VPC for the load balancer.
      */
    var VPCId: js.UndefOr[VPCId] = js.undefined
  }
  
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    /**
      * The attributes for the load balancer.
      */
    var LoadBalancerAttributes: awsDashSdkLib.clientsElbMod.ELBNs.LoadBalancerAttributes
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    /**
      * Information about the load balancer attributes.
      */
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
  }
  
  trait Policies extends js.Object {
    /**
      * The stickiness policies created using CreateAppCookieStickinessPolicy.
      */
    var AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies] = js.undefined
    /**
      * The stickiness policies created using CreateLBCookieStickinessPolicy.
      */
    var LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies] = js.undefined
    /**
      * The policies other than the stickiness policies.
      */
    var OtherPolicies: js.UndefOr[PolicyNames] = js.undefined
  }
  
  trait PolicyAttribute extends js.Object {
    /**
      * The name of the attribute.
      */
    var AttributeName: js.UndefOr[AttributeName] = js.undefined
    /**
      * The value of the attribute.
      */
    var AttributeValue: js.UndefOr[AttributeValue] = js.undefined
  }
  
  trait PolicyAttributeDescription extends js.Object {
    /**
      * The name of the attribute.
      */
    var AttributeName: js.UndefOr[AttributeName] = js.undefined
    /**
      * The value of the attribute.
      */
    var AttributeValue: js.UndefOr[AttributeValue] = js.undefined
  }
  
  trait PolicyAttributeTypeDescription extends js.Object {
    /**
      * The name of the attribute.
      */
    var AttributeName: js.UndefOr[AttributeName] = js.undefined
    /**
      * The type of the attribute. For example, Boolean or Integer.
      */
    var AttributeType: js.UndefOr[AttributeType] = js.undefined
    /**
      * The cardinality of the attribute. Valid values:   ONE(1) : Single value required   ZERO_OR_ONE(0..1) : Up to one value is allowed   ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed   ONE_OR_MORE(1..*0) : Required. Multiple values are allowed  
      */
    var Cardinality: js.UndefOr[Cardinality] = js.undefined
    /**
      * The default value of the attribute, if applicable.
      */
    var DefaultValue: js.UndefOr[DefaultValue] = js.undefined
    /**
      * A description of the attribute.
      */
    var Description: js.UndefOr[Description] = js.undefined
  }
  
  trait PolicyDescription extends js.Object {
    /**
      * The policy attributes.
      */
    var PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions] = js.undefined
    /**
      * The name of the policy.
      */
    var PolicyName: js.UndefOr[PolicyName] = js.undefined
    /**
      * The name of the policy type.
      */
    var PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined
  }
  
  trait PolicyTypeDescription extends js.Object {
    /**
      * A description of the policy type.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
      */
    var PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions] = js.undefined
    /**
      * The name of the policy type.
      */
    var PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined
  }
  
  trait RegisterEndPointsInput extends js.Object {
    /**
      * The IDs of the instances.
      */
    var Instances: awsDashSdkLib.clientsElbMod.ELBNs.Instances
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait RegisterEndPointsOutput extends js.Object {
    /**
      * The updated list of instances for the load balancer.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
  }
  
  trait RemoveAvailabilityZonesInput extends js.Object {
    /**
      * The Availability Zones.
      */
    var AvailabilityZones: awsDashSdkLib.clientsElbMod.ELBNs.AvailabilityZones
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
  }
  
  trait RemoveAvailabilityZonesOutput extends js.Object {
    /**
      * The remaining Availability Zones for the load balancer.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  }
  
  trait RemoveTagsInput extends js.Object {
    /**
      * The name of the load balancer. You can specify a maximum of one load balancer name.
      */
    var LoadBalancerNames: awsDashSdkLib.clientsElbMod.ELBNs.LoadBalancerNames
    /**
      * The list of tag keys to remove.
      */
    var Tags: TagKeyList
  }
  
  trait RemoveTagsOutput extends js.Object
  
  trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The port that uses the specified SSL certificate.
      */
    var LoadBalancerPort: AccessPointPort
    /**
      * The Amazon Resource Name (ARN) of the SSL certificate.
      */
    var SSLCertificateId: awsDashSdkLib.clientsElbMod.ELBNs.SSLCertificateId
  }
  
  trait SetLoadBalancerListenerSSLCertificateOutput extends js.Object
  
  trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
    /**
      * The port number associated with the EC2 instance.
      */
    var InstancePort: EndPointPort
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The names of the policies. If the list is empty, then all current polices are removed from the EC2 instance.
      */
    var PolicyNames: awsDashSdkLib.clientsElbMod.ELBNs.PolicyNames
  }
  
  trait SetLoadBalancerPoliciesForBackendServerOutput extends js.Object
  
  trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
    /**
      * The name of the load balancer.
      */
    var LoadBalancerName: AccessPointName
    /**
      * The external port of the load balancer.
      */
    var LoadBalancerPort: AccessPointPort
    /**
      * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is currently enabled, it is disabled. If the list is empty, all current policies are disabled.
      */
    var PolicyNames: awsDashSdkLib.clientsElbMod.ELBNs.PolicyNames
  }
  
  trait SetLoadBalancerPoliciesOfListenerOutput extends js.Object
  
  trait SourceSecurityGroup extends js.Object {
    /**
      * The name of the security group.
      */
    var GroupName: js.UndefOr[SecurityGroupName] = js.undefined
    /**
      * The owner of the security group.
      */
    var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined
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
      * The name of the load balancer.
      */
    var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    /**
      * The tags.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait TagKeyOnly extends js.Object {
    /**
      * The name of the key.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load balancer, AddTags updates its value. For more information, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load balancer, AddTags updates its value. For more information, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified security groups override the previously associated security groups. For more information, see Security Groups for Load Balancers in a VPC in the Classic Load Balancers Guide.
      */
    def applySecurityGroupsToLoadBalancer(): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applySecurityGroupsToLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplySecurityGroupsToLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified security groups override the previously associated security groups. For more information, see Security Groups for Load Balancers in a VPC in the Classic Load Balancers Guide.
      */
    def applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applySecurityGroupsToLoadBalancer(
      params: ApplySecurityGroupsToLoadBalancerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplySecurityGroupsToLoadBalancerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more subnets to the set of configured subnets for the specified load balancer. The load balancer evenly distributes requests across all registered subnets. For more information, see Add or Remove Subnets for Your Load Balancer in a VPC in the Classic Load Balancers Guide.
      */
    def attachLoadBalancerToSubnets(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachLoadBalancerToSubnets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancerToSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more subnets to the set of configured subnets for the specified load balancer. The load balancer evenly distributes requests across all registered subnets. For more information, see Add or Remove Subnets for Your Load Balancer in a VPC in the Classic Load Balancers Guide.
      */
    def attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachLoadBalancerToSubnets(
      params: AttachLoadBalancerToSubnetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancerToSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies the health check settings to use when evaluating the health state of your EC2 instances. For more information, see Configure Health Checks for Your Load Balancer in the Classic Load Balancers Guide.
      */
    def configureHealthCheck(): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def configureHealthCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigureHealthCheckOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies the health check settings to use when evaluating the health state of your EC2 instances. For more information, see Configure Health Checks for Your Load Balancer in the Classic Load Balancers Guide.
      */
    def configureHealthCheck(params: ConfigureHealthCheckInput): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def configureHealthCheck(
      params: ConfigureHealthCheckInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigureHealthCheckOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie. This policy can be associated only with HTTP/HTTPS listeners. This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime of the special Elastic Load Balancing cookie, AWSELB, follows the lifetime of the application-generated cookie specified in the policy configuration. The load balancer only inserts a new stickiness cookie when the application response includes a new application cookie. If the application cookie is explicitly removed or expires, the session stops being sticky until a new application cookie is issued. For more information, see Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
      */
    def createAppCookieStickinessPolicy(): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAppCookieStickinessPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAppCookieStickinessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie. This policy can be associated only with HTTP/HTTPS listeners. This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime of the special Elastic Load Balancing cookie, AWSELB, follows the lifetime of the application-generated cookie specified in the policy configuration. The load balancer only inserts a new stickiness cookie when the application response includes a new application cookie. If the application cookie is explicitly removed or expires, the session stops being sticky until a new application cookie is issued. For more information, see Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
      */
    def createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAppCookieStickinessPolicy(
      params: CreateAppCookieStickinessPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAppCookieStickinessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners. When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for each request. When the load balancer receives a request, it first checks to see if this cookie is present in the request. If so, the load balancer sends the request to the application server specified in the cookie. If not, the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm. A cookie is inserted into the response for binding subsequent requests from the same user to that server. The validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration. For more information, see Duration-Based Session Stickiness in the Classic Load Balancers Guide.
      */
    def createLBCookieStickinessPolicy(): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLBCookieStickinessPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLBCookieStickinessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners. When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for each request. When the load balancer receives a request, it first checks to see if this cookie is present in the request. If so, the load balancer sends the request to the application server specified in the cookie. If not, the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm. A cookie is inserted into the response for binding subsequent requests from the same user to that server. The validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration. For more information, see Duration-Based Session Stickiness in the Classic Load Balancers Guide.
      */
    def createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLBCookieStickinessPolicy(
      params: CreateLBCookieStickinessPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLBCookieStickinessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Classic Load Balancer. You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them later using CreateLoadBalancerListeners, ApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. You can create up to 20 load balancers per region per account. You can request an increase for the number of load balancers for your account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccessPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Classic Load Balancer. You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them later using CreateLoadBalancerListeners, ApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. You can create up to 20 load balancers per region per account. You can request an increase for the number of load balancers for your account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def createLoadBalancer(params: CreateAccessPointInput): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancer(
      params: CreateAccessPointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccessPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more listeners for the specified load balancer. If a listener with the specified port does not already exist, it is created; otherwise, the properties of the new listener must match the properties of the existing listener. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def createLoadBalancerListeners(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancerListeners(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more listeners for the specified load balancer. If a listener with the specified port does not already exist, it is created; otherwise, the properties of the new listener must match the properties of the existing listener. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def createLoadBalancerListeners(params: CreateLoadBalancerListenerInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancerListeners(
      params: CreateLoadBalancerListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a policy with the specified attributes for the specified load balancer. Policies are settings that are saved for your load balancer and that can be applied to the listener or the application server, depending on the policy type.
      */
    def createLoadBalancerPolicy(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancerPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a policy with the specified attributes for the specified load balancer. Policies are settings that are saved for your load balancer and that can be applied to the listener or the application server, depending on the policy type.
      */
    def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoadBalancerPolicy(
      params: CreateLoadBalancerPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoadBalancerPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified load balancer. If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances. If the load balancer does not exist or has already been deleted, the call to DeleteLoadBalancer still succeeds.
      */
    def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccessPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified load balancer. If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances. If the load balancer does not exist or has already been deleted, the call to DeleteLoadBalancer still succeeds.
      */
    def deleteLoadBalancer(params: DeleteAccessPointInput): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancer(
      params: DeleteAccessPointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccessPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified listeners from the specified load balancer.
      */
    def deleteLoadBalancerListeners(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancerListeners(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified listeners from the specified load balancer.
      */
    def deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancerListeners(
      params: DeleteLoadBalancerListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
      */
    def deleteLoadBalancerPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancerPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
      */
    def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoadBalancerPolicy(
      params: DeleteLoadBalancerPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoadBalancerPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no longer receives traffic from the load balancer. You can use DescribeLoadBalancers to verify that the instance is deregistered from the load balancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
      */
    def deregisterInstancesFromLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstancesFromLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterEndPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no longer receives traffic from the load balancer. You can use DescribeLoadBalancers to verify that the instance is deregistered from the load balancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
      */
    def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstancesFromLoadBalancer(
      params: DeregisterEndPointsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterEndPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
      */
    def describeAccountLimits(params: DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountLimits(
      params: DescribeAccountLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the state of the specified instances with respect to the specified load balancer. If no instances are specified, the call describes the state of all instances that are currently registered with the load balancer. If instances are specified, their state is returned even if they are no longer registered with the load balancer. The state of terminated instances is not returned.
      */
    def describeInstanceHealth(): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceHealth(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the state of the specified instances with respect to the specified load balancer. If no instances are specified, the call describes the state of all instances that are currently registered with the load balancer. If instances are specified, their state is returned even if they are no longer registered with the load balancer. The state of terminated instances is not returned.
      */
    def describeInstanceHealth(params: DescribeEndPointStateInput): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstanceHealth(
      params: DescribeEndPointStateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the attributes for the specified load balancer.
      */
    def describeLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the attributes for the specified load balancer.
      */
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerAttributes(
      params: DescribeLoadBalancerAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified policies. If you specify a load balancer name, the action returns the descriptions of all policies created for the load balancer. If you specify a policy name associated with your load balancer, the action returns the description of that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample policies, or descriptions of all sample policies. The names of the sample policies have the ELBSample- prefix.
      */
    def describeLoadBalancerPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified policies. If you specify a load balancer name, the action returns the descriptions of all policies created for the load balancer. If you specify a policy name associated with your load balancer, the action returns the description of that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample policies, or descriptions of all sample policies. The names of the sample policies have the ELBSample- prefix.
      */
    def describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerPolicies(
      params: DescribeLoadBalancerPoliciesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified load balancer policy types or all load balancer policy types. The description of each type indicates how it can be used. For example, some policies can be used only with layer 7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your EC2 instances. You can use CreateLoadBalancerPolicy to create a policy configuration for any of these policy types. Then, depending on the policy type, use either SetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to set the policy.
      */
    def describeLoadBalancerPolicyTypes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerPolicyTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerPolicyTypesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified load balancer policy types or all load balancer policy types. The description of each type indicates how it can be used. For example, some policies can be used only with layer 7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your EC2 instances. You can use CreateLoadBalancerPolicy to create a policy configuration for any of these policy types. Then, depending on the policy type, use either SetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to set the policy.
      */
    def describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancerPolicyTypes(
      params: DescribeLoadBalancerPolicyTypesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerPolicyTypesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your load balancers.
      */
    def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccessPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your load balancers.
      */
    def describeLoadBalancers(params: DescribeAccessPointsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBalancers(
      params: DescribeAccessPointsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccessPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the tags associated with the specified load balancers.
      */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the tags associated with the specified load balancers.
      */
    def describeTags(params: DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      params: DescribeTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified subnets from the set of configured subnets for the load balancer. After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the OutOfService state. Then, the load balancer balances the traffic among the remaining routable subnets.
      */
    def detachLoadBalancerFromSubnets(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachLoadBalancerFromSubnets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancerFromSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified subnets from the set of configured subnets for the load balancer. After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the OutOfService state. Then, the load balancer balances the traffic among the remaining routable subnets.
      */
    def detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachLoadBalancerFromSubnets(
      params: DetachLoadBalancerFromSubnetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancerFromSubnetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets. There must be at least one Availability Zone registered with a load balancer at all times. After an Availability Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go into the OutOfService state. Then, the load balancer attempts to equally balance the traffic among its remaining Availability Zones. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
      */
    def disableAvailabilityZonesForLoadBalancer(): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableAvailabilityZonesForLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAvailabilityZonesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets. There must be at least one Availability Zone registered with a load balancer at all times. After an Availability Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go into the OutOfService state. Then, the load balancer attempts to equally balance the traffic among its remaining Availability Zones. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
      */
    def disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableAvailabilityZonesForLoadBalancer(
      params: RemoveAvailabilityZonesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAvailabilityZonesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets. The load balancer evenly distributes requests across all its registered Availability Zones that contain instances. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
      */
    def enableAvailabilityZonesForLoadBalancer(): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableAvailabilityZonesForLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAvailabilityZonesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets. The load balancer evenly distributes requests across all its registered Availability Zones that contain instances. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
      */
    def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableAvailabilityZonesForLoadBalancer(
      params: AddAvailabilityZonesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAvailabilityZonesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the attributes of the specified load balancer. You can modify the load balancer attributes, such as AccessLogs, ConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling them. Or, you can modify the load balancer attribute ConnectionSettings by specifying an idle connection timeout value for your load balancer. For more information, see the following in the Classic Load Balancers Guide:    Cross-Zone Load Balancing     Connection Draining     Access Logs     Idle Connection Timeout   
      */
    def modifyLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyLoadBalancerAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the attributes of the specified load balancer. You can modify the load balancer attributes, such as AccessLogs, ConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling them. Or, you can modify the load balancer attribute ConnectionSettings by specifying an idle connection timeout value for your load balancer. For more information, see the following in the Classic Load Balancers Guide:    Cross-Zone Load Balancing     Connection Draining     Access Logs     Idle Connection Timeout   
      */
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyLoadBalancerAttributes(
      params: ModifyLoadBalancerAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyLoadBalancerAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified instances to the specified load balancer. The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in the VPC. Note that RegisterInstanceWithLoadBalancer completes when the request has been registered. Instance registration takes a little time to complete. To check the state of the registered instances, use DescribeLoadBalancers or DescribeInstanceHealth. After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance that is not in one of the Availability Zones registered for the load balancer is moved to the OutOfService state. If an Availability Zone is added to the load balancer later, any instances registered with the load balancer move to the InService state. To deregister instances from a load balancer, use DeregisterInstancesFromLoadBalancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
      */
    def registerInstancesWithLoadBalancer(): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstancesWithLoadBalancer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEndPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified instances to the specified load balancer. The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in the VPC. Note that RegisterInstanceWithLoadBalancer completes when the request has been registered. Instance registration takes a little time to complete. To check the state of the registered instances, use DescribeLoadBalancers or DescribeInstanceHealth. After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance that is not in one of the Availability Zones registered for the load balancer is moved to the OutOfService state. If an Availability Zone is added to the load balancer later, any instances registered with the load balancer move to the InService state. To deregister instances from a load balancer, use DeregisterInstancesFromLoadBalancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
      */
    def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstancesWithLoadBalancer(
      params: RegisterEndPointsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEndPointsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the specified load balancer.
      */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from the specified load balancer.
      */
    def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      params: RemoveTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces any prior certificate that was used on the same load balancer and port. For more information about updating your SSL certificate, see Replace the SSL Certificate for Your Load Balancer in the Classic Load Balancers Guide.
      */
    def setLoadBalancerListenerSSLCertificate(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerListenerSSLCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerListenerSSLCertificateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces any prior certificate that was used on the same load balancer and port. For more information about updating your SSL certificate, see Replace the SSL Certificate for Your Load Balancer in the Classic Load Balancers Guide.
      */
    def setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerListenerSSLCertificate(
      params: SetLoadBalancerListenerSSLCertificateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerListenerSSLCertificateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new set of policies. At this time, only the back-end server authentication policy type can be applied to the instance ports; this policy type is composed of multiple public key policies. Each time you use SetLoadBalancerPoliciesForBackendServer to enable the policies, use the PolicyNames parameter to list the policies that you want to enable. You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify that the policy is associated with the EC2 instance. For more information about enabling back-end instance authentication, see Configure Back-end Instance Authentication in the Classic Load Balancers Guide. For more information about Proxy Protocol, see Configure Proxy Protocol Support in the Classic Load Balancers Guide.
      */
    def setLoadBalancerPoliciesForBackendServer(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerPoliciesForBackendServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerPoliciesForBackendServerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new set of policies. At this time, only the back-end server authentication policy type can be applied to the instance ports; this policy type is composed of multiple public key policies. Each time you use SetLoadBalancerPoliciesForBackendServer to enable the policies, use the PolicyNames parameter to list the policies that you want to enable. You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify that the policy is associated with the EC2 instance. For more information about enabling back-end instance authentication, see Configure Back-end Instance Authentication in the Classic Load Balancers Guide. For more information about Proxy Protocol, see Configure Proxy Protocol Support in the Classic Load Balancers Guide.
      */
    def setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerPoliciesForBackendServer(
      params: SetLoadBalancerPoliciesForBackendServerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerPoliciesForBackendServerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the current set of policies for the specified load balancer port with the specified set of policies. To enable back-end server authentication, use SetLoadBalancerPoliciesForBackendServer. For more information about setting policies, see Update the SSL Negotiation Configuration, Duration-Based Session Stickiness, and Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
      */
    def setLoadBalancerPoliciesOfListener(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerPoliciesOfListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerPoliciesOfListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the current set of policies for the specified load balancer port with the specified set of policies. To enable back-end server authentication, use SetLoadBalancerPoliciesForBackendServer. For more information about setting policies, see Update the SSL Negotiation Configuration, Duration-Based Session Stickiness, and Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
      */
    def setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBalancerPoliciesOfListener(
      params: SetLoadBalancerPoliciesOfListenerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetLoadBalancerPoliciesOfListenerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the anyInstanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_anyInstanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_anyInstanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the anyInstanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_anyInstanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_anyInstanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceDeregistered state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceDeregistered(state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceDeregistered state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceDeregistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceInService(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
      params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndPointStateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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

