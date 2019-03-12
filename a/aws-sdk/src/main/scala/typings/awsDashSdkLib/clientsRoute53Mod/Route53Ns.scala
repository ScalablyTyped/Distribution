package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/route53", "Route53")
@js.native
object Route53Ns extends js.Object {
  trait AccountLimit extends js.Object {
    /**
      * The limit that you requested. Valid values include the following:    MAX_HEALTH_CHECKS_BY_OWNER: The maximum number of health checks that you can create using the current account.    MAX_HOSTED_ZONES_BY_OWNER: The maximum number of hosted zones that you can create using the current account.    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: The maximum number of reusable delegation sets that you can create using the current account.    MAX_TRAFFIC_POLICIES_BY_OWNER: The maximum number of traffic policies that you can create using the current account.    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: The maximum number of traffic policy instances that you can create using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon Route 53 console.)  
      */
    var Type: AccountLimitType
    /**
      * The current value for the limit that is specified by AccountLimit$Type.
      */
    var Value: LimitValue
  }
  
  trait AlarmIdentifier extends js.Object {
    /**
      * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.  Route 53 supports CloudWatch alarms with the following features:   Standard-resolution metrics. High-resolution metrics aren't supported. For more information, see High-Resolution Metrics in the Amazon CloudWatch User Guide.   Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended statistics aren't supported.   
      */
    var Name: AlarmName
    /**
      * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in. For the current list of CloudWatch regions, see Amazon CloudWatch in the AWS Regions and Endpoints chapter of the Amazon Web Services General Reference.
      */
    var Region: CloudWatchRegion
  }
  
  trait AliasTarget extends js.Object {
    /**
      *  Alias resource record sets only: The value that you specify depends on where you want to route queries:  CloudFront distribution  Specify the domain name that CloudFront assigned when you created your distribution. Your CloudFront distribution must include an alternate domain name that matches the name of the resource record set. For example, if the name of the resource record set is acme.example.com, your CloudFront distribution must include acme.example.com as one of the alternate domain names. For more information, see Using Alternate Domain Names (CNAMEs) in the Amazon CloudFront Developer Guide.  For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary records. A distribution must include an alternate domain name that matches the name of the record. However, the primary and secondary records have the same name, and you can't include the same alternate domain name in more than one distribution.    Elastic Beanstalk environment  If the domain name for your Elastic Beanstalk environment includes the region that you deployed the environment in, you can create an alias record that routes traffic to the environment. For example, the domain name my-environment.us-west-2.elasticbeanstalk.com is a regionalized domain name.   For environments that were created before early 2016, the domain name doesn't include the region. To route traffic to these environments, you must create a CNAME record instead of an alias record. Note that you can't create a CNAME record for the root domain name. For example, if your domain name is example.com, you can create a record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but you can't create a record that routes traffic for example.com to your Elastic Beanstalk environment.  For Elastic Beanstalk environments that have regionalized subdomains, specify the CNAME attribute for the environment. You can use the following methods to get the value of the CNAME attribute:    AWS Management Console: For information about how to get the value by using the console, see Using Custom Domains with AWS Elastic Beanstalk in the AWS Elastic Beanstalk Developer Guide.    Elastic Beanstalk API: Use the DescribeEnvironments action to get the value of the CNAME attribute. For more information, see DescribeEnvironments in the AWS Elastic Beanstalk API Reference.    AWS CLI: Use the describe-environments command to get the value of the CNAME attribute. For more information, see describe-environments in the AWS Command Line Interface Reference.    ELB load balancer  Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS Management Console, the ELB API, or the AWS CLI.     AWS Management Console: Go to the EC2 page, choose Load Balancers in the navigation pane, choose the load balancer, choose the Description tab, and get the value of the DNS name field.  If you're routing traffic to a Classic Load Balancer, get the value that begins with dualstack. If you're routing traffic to another type of load balancer, get the value that applies to the record type, A or AAAA.    Elastic Load Balancing API: Use DescribeLoadBalancers to get the value of DNSName. For more information, see the applicable guide:   Classic Load Balancers: DescribeLoadBalancers    Application and Network Load Balancers: DescribeLoadBalancers       AWS CLI: Use describe-load-balancers to get the value of DNSName. For more information, see the applicable guide:   Classic Load Balancers: describe-load-balancers    Application and Network Load Balancers: describe-load-balancers       Amazon S3 bucket that is configured as a static website  Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example, s3-website.us-east-2.amazonaws.com. For more information about valid values, see the table Amazon Simple Storage Service (S3) Website Endpoints in the Amazon Web Services General Reference. For more information about using S3 buckets for websites, see Getting Started with Amazon Route 53 in the Amazon Route 53 Developer Guide.   Another Route 53 resource record set  Specify the value of the Name element for a resource record set in the current hosted zone.  If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't specify the domain name for a record for which the value of Type is CNAME. This is because the alias record must have the same type as the record that you're routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an alias record.   
      */
    var DNSName: awsDashSdkLib.clientsRoute53Mod.Route53Ns.DNSName
    /**
      *  Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record sets: When EvaluateTargetHealth is true, an alias resource record set inherits the health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted zone. Note the following:  CloudFront distributions  You can't set EvaluateTargetHealth to true when the alias target is a CloudFront distribution.  Elastic Beanstalk environments that have regionalized subdomains  If you specify an Elastic Beanstalk environment in DNSName and the environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one Amazon EC2 instance.) If you set EvaluateTargetHealth to true and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available resources that are healthy, if any.  If the environment contains a single Amazon EC2 instance, there are no special requirements.  ELB load balancers  Health checking behavior depends on the type of load balancer:    Classic Load Balancers: If you specify an ELB Classic Load Balancer in DNSName, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If you set EvaluateTargetHealth to true and either no EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other resources.    Application and Network Load Balancers: If you specify an ELB Application or Network Load Balancer and you set EvaluateTargetHealth to true, Route 53 routes queries to the load balancer based on the health of the target groups that are associated with the load balancer:   For an Application or Network Load Balancer to be considered healthy, every target group that contains targets must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries to other resources.   A target group that has no registered targets is considered healthy.      When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2 instances that you register with an ELB load balancer.    S3 buckets  There are no special requirements for setting EvaluateTargetHealth to true when the alias target is an S3 bucket.  Other records in the same hosted zone  If the AWS resource that you specify in DNSName is a record or a group of records (for example, a group of weighted records) but is not another alias record, we recommend that you associate a health check with all of the records in the alias target. For more information, see What Happens When You Omit Health Checks? in the Amazon Route 53 Developer Guide.   For more information and examples, see Amazon Route 53 Health Checks and DNS Failover in the Amazon Route 53 Developer Guide.
      */
    var EvaluateTargetHealth: AliasHealthEnabled
    /**
      *  Alias resource records sets only: The value used depends on where you want to route traffic:  CloudFront distribution  Specify Z2FDTNDATAQYW2.  Alias resource record sets for CloudFront can't be created in a private zone.   Elastic Beanstalk environment  Specify the hosted zone ID for the region that you created the environment in. The environment must have a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see AWS Elastic Beanstalk in the "AWS Regions and Endpoints" chapter of the Amazon Web Services General Reference.  ELB load balancer  Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted zone ID:    Elastic Load Balancing table in the "AWS Regions and Endpoints" chapter of the Amazon Web Services General Reference: Use the value that corresponds with the region that you created your load balancer in. Note that there are separate columns for Application and Classic Load Balancers and for Network Load Balancers.    AWS Management Console: Go to the Amazon EC2 page, choose Load Balancers in the navigation pane, select the load balancer, and get the value of the Hosted zone field on the Description tab.    Elastic Load Balancing API: Use DescribeLoadBalancers to get the applicable value. For more information, see the applicable guide:   Classic Load Balancers: Use DescribeLoadBalancers to get the value of CanonicalHostedZoneNameId.   Application and Network Load Balancers: Use DescribeLoadBalancers to get the value of CanonicalHostedZoneId.      AWS CLI: Use describe-load-balancers to get the applicable value. For more information, see the applicable guide:   Classic Load Balancers: Use describe-load-balancers to get the value of CanonicalHostedZoneNameId.   Application and Network Load Balancers: Use describe-load-balancers to get the value of CanonicalHostedZoneId.      An Amazon S3 bucket configured as a static website  Specify the hosted zone ID for the region that you created the bucket in. For more information about valid values, see the Amazon Simple Storage Service Website Endpoints table in the "AWS Regions and Endpoints" chapter of the Amazon Web Services General Reference.  Another Route 53 resource record set in your hosted zone  Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record set in a different hosted zone.)  
      */
    var HostedZoneId: ResourceId
  }
  
  trait AssociateVPCWithHostedZoneRequest extends js.Object {
    /**
      *  Optional: A comment about the association request.
      */
    var Comment: js.UndefOr[AssociateVPCComment] = js.undefined
    /**
      * The ID of the private hosted zone that you want to associate an Amazon VPC with. Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
      */
    var HostedZoneId: ResourceId
    /**
      * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
      */
    var VPC: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPC
  }
  
  trait AssociateVPCWithHostedZoneResponse extends js.Object {
    /**
      * A complex type that describes the changes made to your hosted zone.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
  }
  
  trait Change extends js.Object {
    /**
      * The action to perform:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes a existing resource record set.  To delete the resource record set that is associated with a traffic policy instance, use  DeleteTrafficPolicyInstance . Amazon Route 53 will delete the resource record set automatically. If you delete the resource record set by using ChangeResourceRecordSets, Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.      UPSERT: If a resource record set doesn't already exist, Route 53 creates it. If a resource record set does exist, Route 53 updates it with the values in the request.  
      */
    var Action: ChangeAction
    /**
      * Information about the resource record set to create, delete, or update.
      */
    var ResourceRecordSet: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ResourceRecordSet
  }
  
  trait ChangeBatch extends js.Object {
    /**
      * Information about the changes to make to the record sets.
      */
    var Changes: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Changes
    /**
      *  Optional: Any comments you want to include about a change batch request.
      */
    var Comment: js.UndefOr[ResourceDescription] = js.undefined
  }
  
  trait ChangeInfo extends js.Object {
    /**
      * A complex type that describes change information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
      */
    var Comment: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The ID of the request.
      */
    var Id: ResourceId
    /**
      * The current state of the request. PENDING indicates that this request has not yet been applied to all Amazon Route 53 DNS servers.
      */
    var Status: ChangeStatus
    /**
      * The date and time that the change request was submitted in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
      */
    var SubmittedAt: TimeStamp
  }
  
  trait ChangeResourceRecordSetsRequest extends js.Object {
    /**
      * A complex type that contains an optional comment and the Changes element.
      */
    var ChangeBatch: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeBatch
    /**
      * The ID of the hosted zone that contains the resource record sets that you want to change.
      */
    var HostedZoneId: ResourceId
  }
  
  trait ChangeResourceRecordSetsResponse extends js.Object {
    /**
      * A complex type that contains information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
  }
  
  trait ChangeTagsForResourceRequest extends js.Object {
    /**
      * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone and/or the tags that you want to edit Value for. You can add a maximum of 10 tags to a health check or a hosted zone.
      */
    var AddTags: js.UndefOr[TagList] = js.undefined
    /**
      * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted zone. You can specify up to 10 keys.
      */
    var RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * The ID of the resource for which you want to add, change, or delete tags.
      */
    var ResourceId: TagResourceId
    /**
      * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
      */
    var ResourceType: TagResourceType
  }
  
  trait ChangeTagsForResourceResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchAlarmConfiguration extends js.Object {
    /**
      * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the comparison.
      */
    var ComparisonOperator: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ComparisonOperator
    /**
      * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the dimensions for the metric. For information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
      */
    var Dimensions: js.UndefOr[DimensionList] = js.undefined
    /**
      * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to the threshold.
      */
    var EvaluationPeriods: awsDashSdkLib.clientsRoute53Mod.Route53Ns.EvaluationPeriods
    /**
      * The name of the CloudWatch metric that the alarm is associated with.
      */
    var MetricName: awsDashSdkLib.clientsRoute53Mod.Route53Ns.MetricName
    /**
      * The namespace of the metric that the alarm is associated with. For more information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
      */
    var Namespace: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Namespace
    /**
      * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
      */
    var Period: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Period
    /**
      * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
      */
    var Statistic: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Statistic
    /**
      * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
      */
    var Threshold: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Threshold
  }
  
  trait CreateHealthCheckRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows you to retry a failed CreateHealthCheck request without the risk of creating two identical health checks:   If you send a CreateHealthCheck request with the same CallerReference and settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health check does exist, Route 53 returns the settings for the existing health check.   If you send a CreateHealthCheck request with the same CallerReference as a deleted health check, regardless of the settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with the same CallerReference as an existing health check but with different settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with a unique CallerReference but settings identical to an existing health check, Route 53 creates the health check.  
      */
    var CallerReference: HealthCheckNonce
    /**
      * A complex type that contains settings for a new health check.
      */
    var HealthCheckConfig: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckConfig
  }
  
  trait CreateHealthCheckResponse extends js.Object {
    /**
      * A complex type that contains identifying information about the health check.
      */
    var HealthCheck: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheck
    /**
      * The unique URL representing the new health check.
      */
    var Location: ResourceURI
  }
  
  trait CreateHostedZoneRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed CreateHostedZone requests to be retried without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateHostedZone request. CallerReference can be any unique string, for example, a date/time stamp.
      */
    var CallerReference: Nonce
    /**
      * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to the reusable delegation set when you created it. For more information about reusable delegation sets, see CreateReusableDelegationSet.
      */
    var DelegationSetId: js.UndefOr[ResourceId] = js.undefined
    /**
      * (Optional) A complex type that contains the following optional values:   For public and private hosted zones, an optional comment   For private hosted zones, an optional PrivateZone element   If you don't specify a comment or the PrivateZone element, omit HostedZoneConfig and the other elements.
      */
    var HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined
    /**
      * The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical. If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that CreateHostedZone returns in DelegationSet.
      */
    var Name: DNSName
    /**
      * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating with this hosted zone. You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs with the hosted zone, use AssociateVPCWithHostedZone after you create a hosted zone.
      */
    var VPC: js.UndefOr[VPC] = js.undefined
  }
  
  trait CreateHostedZoneResponse extends js.Object {
    /**
      * A complex type that contains information about the CreateHostedZone request.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
    /**
      * A complex type that describes the name servers for this hosted zone.
      */
    var DelegationSet: awsDashSdkLib.clientsRoute53Mod.Route53Ns.DelegationSet
    /**
      * A complex type that contains general information about the hosted zone.
      */
    var HostedZone: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZone
    /**
      * The unique URL representing the new hosted zone.
      */
    var Location: ResourceURI
    /**
      * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
      */
    var VPC: js.UndefOr[VPC] = js.undefined
  }
  
  trait CreateQueryLoggingConfigRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is the format of the ARN: arn:aws:logs:region:account-id:log-group:log_group_name  To get the ARN for a log group, you can use the CloudWatch console, the DescribeLogGroups API action, the describe-log-groups command, or the applicable command in one of the AWS SDKs.
      */
    var CloudWatchLogsLogGroupArn: awsDashSdkLib.clientsRoute53Mod.Route53Ns.CloudWatchLogsLogGroupArn
    /**
      * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
      */
    var HostedZoneId: ResourceId
  }
  
  trait CreateQueryLoggingConfigResponse extends js.Object {
    /**
      * The unique URL representing the new query logging configuration.
      */
    var Location: ResourceURI
    /**
      * A complex type that contains the ID for a query logging configuration, the ID of the hosted zone that you want to log queries for, and the ARN for the log group that you want Amazon Route 53 to send query logs to.
      */
    var QueryLoggingConfig: awsDashSdkLib.clientsRoute53Mod.Route53Ns.QueryLoggingConfig
  }
  
  trait CreateReusableDelegationSetRequest extends js.Object {
    /**
      * A unique string that identifies the request, and that allows you to retry failed CreateReusableDelegationSet requests without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateReusableDelegationSet request. CallerReference can be any unique string, for example a date/time stamp.
      */
    var CallerReference: Nonce
    /**
      * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
      */
    var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait CreateReusableDelegationSetResponse extends js.Object {
    /**
      * A complex type that contains name server information.
      */
    var DelegationSet: awsDashSdkLib.clientsRoute53Mod.Route53Ns.DelegationSet
    /**
      * The unique URL representing the new reusable delegation set.
      */
    var Location: ResourceURI
  }
  
  trait CreateTrafficPolicyInstanceRequest extends js.Object {
    /**
      * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the configuration in a traffic policy.
      */
    var HostedZoneId: ResourceId
    /**
      * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
      */
    var Name: DNSName
    /**
      * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in the specified hosted zone.
      */
    var TTL: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TTL
    /**
      * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
      */
    var TrafficPolicyId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyId
    /**
      * The version of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
      */
    var TrafficPolicyVersion: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyVersion
  }
  
  trait CreateTrafficPolicyInstanceResponse extends js.Object {
    /**
      * A unique URL that represents a new traffic policy instance.
      */
    var Location: ResourceURI
    /**
      * A complex type that contains settings for the new traffic policy instance.
      */
    var TrafficPolicyInstance: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstance
  }
  
  trait CreateTrafficPolicyRequest extends js.Object {
    /**
      * (Optional) Any comments that you want to include about the traffic policy.
      */
    var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    /**
      * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
      */
    var Document: TrafficPolicyDocument
    /**
      * The name of the traffic policy.
      */
    var Name: TrafficPolicyName
  }
  
  trait CreateTrafficPolicyResponse extends js.Object {
    /**
      * A unique URL that represents a new traffic policy.
      */
    var Location: ResourceURI
    /**
      * A complex type that contains settings for the new traffic policy.
      */
    var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicy
  }
  
  trait CreateTrafficPolicyVersionRequest extends js.Object {
    /**
      * The comment that you specified in the CreateTrafficPolicyVersion request, if any.
      */
    var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    /**
      * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the CreateTrafficPolicyVersion request. For more information about the JSON format, see CreateTrafficPolicy.
      */
    var Document: TrafficPolicyDocument
    /**
      * The ID of the traffic policy for which you want to create a new version.
      */
    var Id: TrafficPolicyId
  }
  
  trait CreateTrafficPolicyVersionResponse extends js.Object {
    /**
      * A unique URL that represents a new traffic policy version.
      */
    var Location: ResourceURI
    /**
      * A complex type that contains settings for the new version of the traffic policy.
      */
    var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicy
  }
  
  trait CreateVPCAssociationAuthorizationRequest extends js.Object {
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    var HostedZoneId: ResourceId
    /**
      * A complex type that contains the VPC ID and region for the VPC that you want to authorize associating with your hosted zone.
      */
    var VPC: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPC
  }
  
  trait CreateVPCAssociationAuthorizationResponse extends js.Object {
    /**
      * The ID of the hosted zone that you authorized associating a VPC with.
      */
    var HostedZoneId: ResourceId
    /**
      * The VPC that you authorized associating with a hosted zone.
      */
    var VPC: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPC
  }
  
  trait DelegationSet extends js.Object {
    /**
      * The value that you specified for CallerReference when you created the reusable delegation set.
      */
    var CallerReference: js.UndefOr[Nonce] = js.undefined
    /**
      * The ID that Amazon Route 53 assigns to a reusable delegation set.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation set.
      */
    var NameServers: DelegationSetNameServers
  }
  
  trait DeleteHealthCheckRequest extends js.Object {
    /**
      * The ID of the health check that you want to delete.
      */
    var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckId
  }
  
  trait DeleteHealthCheckResponse extends js.Object
  
  trait DeleteHostedZoneRequest extends js.Object {
    /**
      * The ID of the hosted zone you want to delete.
      */
    var Id: ResourceId
  }
  
  trait DeleteHostedZoneResponse extends js.Object {
    /**
      * A complex type that contains the ID, the status, and the date and time of a request to delete a hosted zone.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
  }
  
  trait DeleteQueryLoggingConfigRequest extends js.Object {
    /**
      * The ID of the configuration that you want to delete. 
      */
    var Id: QueryLoggingConfigId
  }
  
  trait DeleteQueryLoggingConfigResponse extends js.Object
  
  trait DeleteReusableDelegationSetRequest extends js.Object {
    /**
      * The ID of the reusable delegation set that you want to delete.
      */
    var Id: ResourceId
  }
  
  trait DeleteReusableDelegationSetResponse extends js.Object
  
  trait DeleteTrafficPolicyInstanceRequest extends js.Object {
    /**
      * The ID of the traffic policy instance that you want to delete.   When you delete a traffic policy instance, Amazon Route 53 also deletes all of the resource record sets that were created when you created the traffic policy instance. 
      */
    var Id: TrafficPolicyInstanceId
  }
  
  trait DeleteTrafficPolicyInstanceResponse extends js.Object
  
  trait DeleteTrafficPolicyRequest extends js.Object {
    /**
      * The ID of the traffic policy that you want to delete.
      */
    var Id: TrafficPolicyId
    /**
      * The version number of the traffic policy that you want to delete.
      */
    var Version: TrafficPolicyVersion
  }
  
  trait DeleteTrafficPolicyResponse extends js.Object
  
  trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
    /**
      * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account, the ID of the hosted zone.
      */
    var HostedZoneId: ResourceId
    /**
      * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account, a complex type that includes the ID and region of the VPC.
      */
    var VPC: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPC
  }
  
  trait DeleteVPCAssociationAuthorizationResponse extends js.Object
  
  trait Dimension extends js.Object {
    /**
      * For the metric that the CloudWatch alarm is associated with, the name of one dimension.
      */
    var Name: DimensionField
    /**
      * For the metric that the CloudWatch alarm is associated with, the value of one dimension.
      */
    var Value: DimensionField
  }
  
  trait DisassociateVPCFromHostedZoneRequest extends js.Object {
    /**
      *  Optional: A comment about the disassociation request.
      */
    var Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
    /**
      * The ID of the private hosted zone that you want to disassociate a VPC from.
      */
    var HostedZoneId: ResourceId
    /**
      * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
      */
    var VPC: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPC
  }
  
  trait DisassociateVPCFromHostedZoneResponse extends js.Object {
    /**
      * A complex type that describes the changes made to the specified private hosted zone.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
  }
  
  trait GeoLocation extends js.Object {
    /**
      * The two-letter code for the continent. Valid values: AF | AN | AS | EU | OC | NA | SA  Constraint: Specifying ContinentCode with either CountryCode or SubdivisionCode returns an InvalidInput error.
      */
    var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
    /**
      * The two-letter code for the country.
      */
    var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
    /**
      * The code for the subdivision. Route 53 currently supports only states in the United States.
      */
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  }
  
  trait GeoLocationDetails extends js.Object {
    /**
      * The two-letter code for the continent.
      */
    var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
    /**
      * The full name of the continent.
      */
    var ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined
    /**
      * The two-letter code for the country.
      */
    var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
    /**
      * The name of the country.
      */
    var CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined
    /**
      * The code for the subdivision. Route 53 currently supports only states in the United States.
      */
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    /**
      * The full name of the subdivision. Route 53 currently supports only states in the United States.
      */
    var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined
  }
  
  trait GetAccountLimitRequest extends js.Object {
    /**
      * The limit that you want to get. Valid values include the following:    MAX_HEALTH_CHECKS_BY_OWNER: The maximum number of health checks that you can create using the current account.    MAX_HOSTED_ZONES_BY_OWNER: The maximum number of hosted zones that you can create using the current account.    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: The maximum number of reusable delegation sets that you can create using the current account.    MAX_TRAFFIC_POLICIES_BY_OWNER: The maximum number of traffic policies that you can create using the current account.    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: The maximum number of traffic policy instances that you can create using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon Route 53 console.)  
      */
    var Type: AccountLimitType
  }
  
  trait GetAccountLimitResponse extends js.Object {
    /**
      * The current number of entities that you have created of the specified type. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Count is the current number of health checks that you have created using the current account.
      */
    var Count: UsageCount
    /**
      * The current setting for the specified limit. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Limit is the maximum number of health checks that you can create using the current account.
      */
    var Limit: AccountLimit
  }
  
  trait GetChangeRequest extends js.Object {
    /**
      * The ID of the change batch request. The value that you specify here is the value that ChangeResourceRecordSets returned in the Id element when you submitted the request.
      */
    var Id: ResourceId
  }
  
  trait GetChangeResponse extends js.Object {
    /**
      * A complex type that contains information about the specified change batch.
      */
    var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ChangeInfo
  }
  
  trait GetCheckerIpRangesRequest extends js.Object
  
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: awsDashSdkLib.clientsRoute53Mod.Route53Ns.CheckerIpRanges
  }
  
  trait GetGeoLocationRequest extends js.Object {
    /**
      * Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
      */
    var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
    /**
      * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
      */
    var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
    /**
      * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in ISO standard 3166-1 alpha-2. Route 53 doesn't support subdivision codes for all countries. If you specify subdivisioncode, you must also specify countrycode. 
      */
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  }
  
  trait GetGeoLocationResponse extends js.Object {
    /**
      * A complex type that contains the codes and full continent, country, and subdivision names for the specified geolocation code.
      */
    var GeoLocationDetails: awsDashSdkLib.clientsRoute53Mod.Route53Ns.GeoLocationDetails
  }
  
  trait GetHealthCheckCountRequest extends js.Object
  
  trait GetHealthCheckCountResponse extends js.Object {
    /**
      * The number of health checks associated with the current AWS account.
      */
    var HealthCheckCount: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckCount
  }
  
  trait GetHealthCheckLastFailureReasonRequest extends js.Object {
    /**
      * The ID for the health check for which you want the last failure reason. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to get the last failure reason for a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckLastFailureReason for a calculated health check. 
      */
    var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckId
  }
  
  trait GetHealthCheckLastFailureReasonResponse extends js.Object {
    /**
      * A list that contains one Observation element for each Amazon Route 53 health checker that is reporting a last failure reason. 
      */
    var HealthCheckObservations: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckObservations
  }
  
  trait GetHealthCheckRequest extends js.Object {
    /**
      * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long.
      */
    var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckId
  }
  
  trait GetHealthCheckResponse extends js.Object {
    /**
      * A complex type that contains information about one health check that is associated with the current AWS account.
      */
    var HealthCheck: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheck
  }
  
  trait GetHealthCheckStatusRequest extends js.Object {
    /**
      * The ID for the health check that you want the current status for. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to check the status of a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckStatus to get the status of a calculated health check. 
      */
    var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckId
  }
  
  trait GetHealthCheckStatusResponse extends js.Object {
    /**
      * A list that contains one HealthCheckObservation element for each Amazon Route 53 health checker that is reporting a status about the health check endpoint.
      */
    var HealthCheckObservations: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckObservations
  }
  
  trait GetHostedZoneCountRequest extends js.Object
  
  trait GetHostedZoneCountResponse extends js.Object {
    /**
      * The total number of public and private hosted zones that are associated with the current AWS account.
      */
    var HostedZoneCount: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZoneCount
  }
  
  trait GetHostedZoneLimitRequest extends js.Object {
    /**
      * The ID of the hosted zone that you want to get a limit for.
      */
    var HostedZoneId: ResourceId
    /**
      * The limit that you want to get. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
      */
    var Type: HostedZoneLimitType
  }
  
  trait GetHostedZoneLimitResponse extends js.Object {
    /**
      * The current number of entities that you have created of the specified type. For example, if you specified MAX_RRSETS_BY_ZONE for the value of Type in the request, the value of Count is the current number of records that you have created in the specified hosted zone.
      */
    var Count: UsageCount
    /**
      * The current setting for the specified limit. For example, if you specified MAX_RRSETS_BY_ZONE for the value of Type in the request, the value of Limit is the maximum number of records that you can create in the specified hosted zone.
      */
    var Limit: HostedZoneLimit
  }
  
  trait GetHostedZoneRequest extends js.Object {
    /**
      * The ID of the hosted zone that you want to get information about.
      */
    var Id: ResourceId
  }
  
  trait GetHostedZoneResponse extends js.Object {
    /**
      * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
      */
    var DelegationSet: js.UndefOr[DelegationSet] = js.undefined
    /**
      * A complex type that contains general information about the specified hosted zone.
      */
    var HostedZone: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZone
    /**
      * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
      */
    var VPCs: js.UndefOr[VPCs] = js.undefined
  }
  
  trait GetQueryLoggingConfigRequest extends js.Object {
    /**
      * The ID of the configuration for DNS query logging that you want to get information about.
      */
    var Id: QueryLoggingConfigId
  }
  
  trait GetQueryLoggingConfigResponse extends js.Object {
    /**
      * A complex type that contains information about the query logging configuration that you specified in a GetQueryLoggingConfig request.
      */
    var QueryLoggingConfig: awsDashSdkLib.clientsRoute53Mod.Route53Ns.QueryLoggingConfig
  }
  
  trait GetReusableDelegationSetLimitRequest extends js.Object {
    /**
      * The ID of the delegation set that you want to get the limit for.
      */
    var DelegationSetId: ResourceId
    /**
      * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
      */
    var Type: ReusableDelegationSetLimitType
  }
  
  trait GetReusableDelegationSetLimitResponse extends js.Object {
    /**
      * The current number of hosted zones that you can associate with the specified reusable delegation set.
      */
    var Count: UsageCount
    /**
      * The current setting for the limit on hosted zones that you can associate with the specified reusable delegation set.
      */
    var Limit: ReusableDelegationSetLimit
  }
  
  trait GetReusableDelegationSetRequest extends js.Object {
    /**
      * The ID of the reusable delegation set that you want to get a list of name servers for.
      */
    var Id: ResourceId
  }
  
  trait GetReusableDelegationSetResponse extends js.Object {
    /**
      * A complex type that contains information about the reusable delegation set.
      */
    var DelegationSet: awsDashSdkLib.clientsRoute53Mod.Route53Ns.DelegationSet
  }
  
  trait GetTrafficPolicyInstanceCountRequest extends js.Object
  
  trait GetTrafficPolicyInstanceCountResponse extends js.Object {
    /**
      * The number of traffic policy instances that are associated with the current AWS account.
      */
    var TrafficPolicyInstanceCount: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstanceCount
  }
  
  trait GetTrafficPolicyInstanceRequest extends js.Object {
    /**
      * The ID of the traffic policy instance that you want to get information about.
      */
    var Id: TrafficPolicyInstanceId
  }
  
  trait GetTrafficPolicyInstanceResponse extends js.Object {
    /**
      * A complex type that contains settings for the traffic policy instance.
      */
    var TrafficPolicyInstance: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstance
  }
  
  trait GetTrafficPolicyRequest extends js.Object {
    /**
      * The ID of the traffic policy that you want to get information about.
      */
    var Id: TrafficPolicyId
    /**
      * The version number of the traffic policy that you want to get information about.
      */
    var Version: TrafficPolicyVersion
  }
  
  trait GetTrafficPolicyResponse extends js.Object {
    /**
      * A complex type that contains settings for the specified traffic policy.
      */
    var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicy
  }
  
  trait HealthCheck extends js.Object {
    /**
      * A unique string that you specified when you created the health check.
      */
    var CallerReference: HealthCheckNonce
    /**
      * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
      */
    var CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration] = js.undefined
    /**
      * A complex type that contains detailed information about one health check.
      */
    var HealthCheckConfig: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckConfig
    /**
      * The version of the health check. You can optionally pass this value in a call to UpdateHealthCheck to prevent overwriting another change to the health check.
      */
    var HealthCheckVersion: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckVersion
    /**
      * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long. 
      */
    var Id: HealthCheckId
    /**
      * If the health check was created by another service, the service that created the health check. When a health check is created by another service, you can't edit or delete it using Amazon Route 53. 
      */
    var LinkedService: js.UndefOr[LinkedService] = js.undefined
  }
  
  trait HealthCheckConfig extends js.Object {
    /**
      * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
      */
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined
    /**
      * (CALCULATED Health Checks Only) A complex type that contains one ChildHealthCheck element for each health check that you want to associate with a CALCULATED health check.
      */
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined
    /**
      * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:    Health checks that check the health of endpoints: Route 53 stops submitting requests to your application, server, or other resource.    Calculated health checks: Route 53 stops aggregating the status of the referenced health checks.    Health checks that monitor CloudWatch alarms: Route 53 stops monitoring the corresponding CloudWatch metrics.   After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop routing traffic to a resource, change the value of UpdateHealthCheckRequest$Inverted. Charges for a health check still apply when the health check is disabled. For more information, see Amazon Route 53 Pricing.
      */
    var Disabled: js.UndefOr[Disabled] = js.undefined
    /**
      * Specify whether you want Amazon Route 53 to send the value of FullyQualifiedDomainName to the endpoint in the client_hello message during TLS negotiation. This allows the endpoint to respond to HTTPS health check requests with the applicable SSL/TLS certificate. Some endpoints require that HTTPS requests include the host name in the client_hello message. If you don't enable SNI, the status of the health check will be SSL alert handshake_failure. A health check can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid. The SSL/TLS certificate on your endpoint includes a domain name in the Common Name field and possibly several more in the Subject Alternative Names field. One of the domain names in the certificate should match the value that you specify for FullyQualifiedDomainName. If the endpoint responds to the client_hello message with a certificate that does not include the domain name that you specified in FullyQualifiedDomainName, a health checker will retry the handshake. In the second attempt, the health checker will omit FullyQualifiedDomainName from the client_hello message.
      */
    var EnableSNI: js.UndefOr[EnableSNI] = js.undefined
    /**
      * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see How Amazon Route 53 Determines Whether an Endpoint Is Healthy in the Amazon Route 53 Developer Guide. If you don't specify a value for FailureThreshold, the default value is three health checks.
      */
    var FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    /**
      * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.  If you specify a value for IPAddress: Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform health checks. When Route 53 checks the health of an endpoint, here is how it constructs the Host header:   If you specify a value of 80 for Port and HTTP or HTTP_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.    If you specify a value of 443 for Port and HTTPS or HTTPS_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.   If you specify another value for Port and any value except TCP for Type, Route 53 passes FullyQualifiedDomainName:Port to the endpoint in the Host header.   If you don't specify a value for FullyQualifiedDomainName, Route 53 substitutes the value of IPAddress in the Host header in each of the preceding cases.  If you don't specify a value for IPAddress : Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at the interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the endpoint.  If you don't specify a value for IPAddress, Route 53 uses only IPv4 to send health checks to the endpoint. If there's no resource record set with a type of A for the name that you specify for FullyQualifiedDomainName, the health check fails with a "DNS resolution failed" error.  If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify the endpoint only by FullyQualifiedDomainName, we recommend that you create a separate health check for each endpoint. For example, create a health check for each HTTP server that is serving content for www.example.com. For the value of FullyQualifiedDomainName, specify the domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).  In this configuration, if you create a health check for which the value of FullyQualifiedDomainName matches the name of the resource record sets and you then associate the health check with those resource record sets, health check results will be unpredictable.  In addition, if the value that you specify for Type is HTTP, HTTPS, HTTP_STR_MATCH, or HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it does when you specify a value for IPAddress. If the value of Type is TCP, Route 53 doesn't pass a Host header.
      */
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined
    /**
      * The number of child health checks that are associated with a CALCULATED health that Amazon Route 53 must consider healthy for the CALCULATED health check to be considered healthy. To specify the child health checks that you want to associate with a CALCULATED health check, use the HealthCheckConfig$ChildHealthChecks and HealthCheckConfig$ChildHealthChecks elements. Note the following:   If you specify a number greater than the number of child health checks, Route 53 always considers this health check to be unhealthy.   If you specify 0, Route 53 always considers this health check to be healthy.  
      */
    var HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined
    /**
      * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the domain name that you specify in FullyQualifiedDomainName at the interval that you specify in RequestInterval. Using an IP address returned by DNS, Route 53 then checks the health of the endpoint. Use one of the following formats for the value of IPAddress:     IPv4 address: four values between 0 and 255, separated by periods (.), for example, 192.0.2.44.    IPv6 address: eight groups of four hexadecimal values, separated by colons (:), for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. You can also shorten IPv6 addresses as described in RFC 5952, for example, 2001:db8:85a3::abcd:1:2345.   If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your EC2 instance, and specify the Elastic IP address for IPAddress. This ensures that the IP address of your instance will never change. For more information, see HealthCheckConfig$FullyQualifiedDomainName. Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private, non-routable, or multicast ranges. For more information about IP addresses for which you can't create health checks, see the following documents:    RFC 5735, Special Use IPv4 Addresses     RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space     RFC 5156, Special-Use IPv6 Addresses    When the value of Type is CALCULATED or CLOUDWATCH_METRIC, omit IPAddress.
      */
    var IPAddress: js.UndefOr[IPAddress] = js.undefined
    /**
      * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want Amazon Route 53 to assign to the health check:    Healthy: Route 53 considers the health check to be healthy.    Unhealthy: Route 53 considers the health check to be unhealthy.    LastKnownStatus: Route 53 uses the status of the health check from the last time that CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known status, the default status for the health check is healthy.  
      */
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined
    /**
      * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a health check unhealthy when it otherwise would be considered healthy.
      */
    var Inverted: js.UndefOr[Inverted] = js.undefined
    /**
      * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint, and to display CloudWatch latency graphs on the Health Checks page in the Route 53 console.  You can't change the value of MeasureLatency after you create a health check. 
      */
    var MeasureLatency: js.UndefOr[MeasureLatency] = js.undefined
    /**
      * The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for Port only when you specify a value for IPAddress.
      */
    var Port: js.UndefOr[Port] = js.undefined
    /**
      * A complex type that contains one Region element for each region from which you want Amazon Route 53 health checkers to check the specified endpoint. If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions that are listed under Valid Values. If you update a health check to remove a region that has been performing health checks, Route 53 will briefly continue to perform checks from that region to ensure that some health checkers are always checking the endpoint (for example, if you replace three regions with four different regions). 
      */
    var Regions: js.UndefOr[HealthCheckRegionList] = js.undefined
    /**
      * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health check request. Each Route 53 health checker makes requests at this interval.  You can't change the value of RequestInterval after you create a health check.  If you don't specify a value for RequestInterval, the default value is 30 seconds.
      */
    var RequestInterval: js.UndefOr[RequestInterval] = js.undefined
    /**
      * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example, the file /docs/route53-health-check.html. You can also include query string parameters, for example, /welcome.html?language=jp&amp;login=y. 
      */
    var ResourcePath: js.UndefOr[ResourcePath] = js.undefined
    /**
      * If the value of Type is HTTP_STR_MATCH or HTTP_STR_MATCH, the string that you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the response body, Route 53 considers the resource healthy. Route 53 considers case when searching for SearchString in the response body. 
      */
    var SearchString: js.UndefOr[SearchString] = js.undefined
    /**
      * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an endpoint is healthy.  You can't change the value of Type after you create a health check.  You can create the following types of health checks:    HTTP: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.    HTTPS: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.  If you specify HTTPS for the value of Type, the endpoint must support TLS v1.0 or later.     HTTP_STR_MATCH: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in SearchString.    HTTPS_STR_MATCH: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and searches the first 5,120 bytes of the response body for the string that you specify in SearchString.    TCP: Route 53 tries to establish a TCP connection.    CLOUDWATCH_METRIC: The health check is associated with a CloudWatch alarm. If the state of the alarm is OK, the health check is considered healthy. If the state is ALARM, the health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is OK or ALARM, the health check status depends on the setting for InsufficientDataHealthStatus: Healthy, Unhealthy, or LastKnownStatus.     CALCULATED: For health checks that monitor the status of other health checks, Route 53 adds up the number of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of HealthThreshold.    For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Amazon Route 53 Developer Guide.
      */
    var Type: HealthCheckType
  }
  
  trait HealthCheckObservation extends js.Object {
    /**
      * The IP address of the Amazon Route 53 health checker that provided the failure reason in StatusReport.
      */
    var IPAddress: js.UndefOr[IPAddress] = js.undefined
    /**
      * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
      */
    var Region: js.UndefOr[HealthCheckRegion] = js.undefined
    /**
      * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the time of the failed health check.
      */
    var StatusReport: js.UndefOr[StatusReport] = js.undefined
  }
  
  trait HostedZone extends js.Object {
    /**
      * The value that you specified for CallerReference when you created the hosted zone.
      */
    var CallerReference: Nonce
    /**
      * A complex type that includes the Comment and PrivateZone elements. If you omitted the HostedZoneConfig and Comment elements from the request, the Config and Comment elements don't appear in the response.
      */
    var Config: js.UndefOr[HostedZoneConfig] = js.undefined
    /**
      * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
      */
    var Id: ResourceId
    /**
      * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone is created by another service, you can't edit or delete it using Route 53. 
      */
    var LinkedService: js.UndefOr[LinkedService] = js.undefined
    /**
      * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS registrar. For information about how to specify characters other than a-z, 0-9, and - (hyphen) and how to specify internationalized domain names, see CreateHostedZone.
      */
    var Name: DNSName
    /**
      * The number of resource record sets in the hosted zone.
      */
    var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined
  }
  
  trait HostedZoneConfig extends js.Object {
    /**
      * Any comments that you want to include about the hosted zone.
      */
    var Comment: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * A value that indicates whether this is a private hosted zone.
      */
    var PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
  }
  
  trait HostedZoneLimit extends js.Object {
    /**
      * The limit that you requested. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
      */
    var Type: HostedZoneLimitType
    /**
      * The current value for the limit that is specified by Type.
      */
    var Value: LimitValue
  }
  
  trait LinkedService extends js.Object {
    /**
      * If the health check or hosted zone was created by another service, an optional description that can be provided by the other service. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * If the health check or hosted zone was created by another service, the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
      */
    var ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
  }
  
  trait ListGeoLocationsRequest extends js.Object {
    /**
      * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than maxitems geolocations remain to be listed, then the value of the IsTruncated element in the response is true.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextContinentCode from the previous response has a value, enter that value in startcontinentcode to return the next page of results. Include startcontinentcode only if you want to list continents. Don't include startcontinentcode when you're listing countries or countries with their subdivisions.
      */
    var StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
    /**
      * The code for the country with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextCountryCode from the previous response has a value, enter that value in startcountrycode to return the next page of results. Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
      */
    var StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
    /**
      * The code for the subdivision (for example, state or province) with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextSubdivisionCode from the previous response has a value, enter that value in startsubdivisioncode to return the next page of results. To list subdivisions of a country, you must include both startcountrycode and startsubdivisioncode.
      */
    var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  }
  
  trait ListGeoLocationsResponse extends js.Object {
    /**
      * A complex type that contains one GeoLocationDetails element for each location that Amazon Route 53 supports for geolocation.
      */
    var GeoLocationDetailsList: awsDashSdkLib.clientsRoute53Mod.Route53Ns.GeoLocationDetailsList
    /**
      * A value that indicates whether more locations remain to be listed after the last location in this response. If so, the value of IsTruncated is true. To get more values, submit another request and include the values of NextContinentCode, NextCountryCode, and NextSubdivisionCode in the startcontinentcode, startcountrycode, and startsubdivisioncode, as applicable.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for MaxItems in the request.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextContinentCode in the startcontinentcode parameter in another ListGeoLocations request.
      */
    var NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
    /**
      * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextCountryCode in the startcountrycode parameter in another ListGeoLocations request.
      */
    var NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
    /**
      * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextSubdivisionCode in the startsubdivisioncode parameter in another ListGeoLocations request.
      */
    var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  }
  
  trait ListHealthChecksRequest extends js.Object {
    /**
      * If the value of IsTruncated in the previous response was true, you have more health checks. To get another group, submit another ListHealthChecks request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first health check that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more health checks to get.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * The maximum number of health checks that you want ListHealthChecks to return in response to the current request. Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Route 53 returns only the first 100 health checks. 
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  }
  
  trait ListHealthChecksResponse extends js.Object {
    /**
      * A complex type that contains one HealthCheck element for each health check that is associated with the current AWS account.
      */
    var HealthChecks: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthChecks
    /**
      * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can get the next group of health checks by submitting another ListHealthChecks request and specifying the value of NextMarker in the marker parameter.
      */
    var IsTruncated: PageTruncated
    /**
      * For the second and subsequent calls to ListHealthChecks, Marker is the value that you specified for the marker parameter in the previous request.
      */
    var Marker: PageMarker
    /**
      * The value that you specified for the maxitems parameter in the call to ListHealthChecks that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, the value of NextMarker identifies the first health check that Amazon Route 53 returns if you submit another ListHealthChecks request and specify the value of NextMarker in the marker parameter.
      */
    var NextMarker: js.UndefOr[PageMarker] = js.undefined
  }
  
  trait ListHostedZonesByNameRequest extends js.Object {
    /**
      * (Optional) For your first request to ListHostedZonesByName, include the dnsname parameter only if you want to specify the name of the first hosted zone in the response. If you don't include the dnsname parameter, Amazon Route 53 returns all of the hosted zones that were created by the current AWS account, in ASCII order. For subsequent requests, include both dnsname and hostedzoneid parameters. For dnsname, specify the value of NextDNSName from the previous response.
      */
    var DNSName: js.UndefOr[DNSName] = js.undefined
    /**
      * (Optional) For your first request to ListHostedZonesByName, do not include the hostedzoneid parameter. If you have more hosted zones than the value of maxitems, ListHostedZonesByName returns only the first maxitems hosted zones. To get the next group of maxitems hosted zones, submit another request to ListHostedZonesByName and include both dnsname and hostedzoneid parameters. For the value of hostedzoneid, specify the value of the NextHostedZoneId element from the previous response.
      */
    var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The maximum number of hosted zones to be included in the response body for this request. If you have more than maxitems hosted zones, then the value of the IsTruncated element in the response is true, and the values of NextDNSName and NextHostedZoneId specify the first hosted zone in the next group of maxitems hosted zones. 
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  }
  
  trait ListHostedZonesByNameResponse extends js.Object {
    /**
      * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
      */
    var DNSName: js.UndefOr[DNSName] = js.undefined
    /**
      * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
      */
    var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A complex type that contains general information about the hosted zone.
      */
    var HostedZones: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZones
    /**
      * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
      */
    var NextDNSName: js.UndefOr[DNSName] = js.undefined
    /**
      * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
      */
    var NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait ListHostedZonesRequest extends js.Object {
    /**
      * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a reusable delegation set, specify the ID of that reusable delegation set. 
      */
    var DelegationSetId: js.UndefOr[ResourceId] = js.undefined
    /**
      * If the value of IsTruncated in the previous response was true, you have more hosted zones. To get more hosted zones, submit another ListHostedZones request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more hosted zones to get.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than maxitems hosted zones, the value of IsTruncated in the response is true, and the value of NextMarker is the hosted zone ID of the first hosted zone that Route 53 will return if you submit another request.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  }
  
  trait ListHostedZonesResponse extends js.Object {
    /**
      * A complex type that contains general information about the hosted zone.
      */
    var HostedZones: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZones
    /**
      * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get more hosted zones by submitting another ListHostedZones request and specifying the value of NextMarker in the marker parameter.
      */
    var IsTruncated: PageTruncated
    /**
      * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker parameter in the request that produced the current response.
      */
    var Marker: PageMarker
    /**
      * The value that you specified for the maxitems parameter in the call to ListHostedZones that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, the value of NextMarker identifies the first hosted zone in the next group of hosted zones. Submit another ListHostedZones request, and specify the value of NextMarker from the response in the marker parameter. This element is present only if IsTruncated is true.
      */
    var NextMarker: js.UndefOr[PageMarker] = js.undefined
  }
  
  trait ListQueryLoggingConfigsRequest extends js.Object {
    /**
      * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the ID in HostedZoneId.  If you don't specify a hosted zone ID, ListQueryLoggingConfigs returns all of the configurations that are associated with the current AWS account.
      */
    var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    /**
      * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response to the current request. If the current AWS account has more than MaxResults configurations, use the value of ListQueryLoggingConfigsResponse$NextToken in the response to get the next page of results. If you don't specify a value for MaxResults, Route 53 returns up to 100 configurations.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * (Optional) If the current AWS account has more than MaxResults query logging configurations, use NextToken to get the second and subsequent pages of results. For the first ListQueryLoggingConfigs request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListQueryLoggingConfigsResponse extends js.Object {
    /**
      * If a response includes the last of the query logging configurations that are associated with the current AWS account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListQueryLoggingConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * An array that contains one QueryLoggingConfig element for each configuration for DNS query logging that is associated with the current AWS account.
      */
    var QueryLoggingConfigs: awsDashSdkLib.clientsRoute53Mod.Route53Ns.QueryLoggingConfigs
  }
  
  trait ListResourceRecordSetsRequest extends js.Object {
    /**
      * The ID of the hosted zone that contains the resource record sets that you want to list.
      */
    var HostedZoneId: ResourceId
    /**
      * (Optional) The maximum number of resource records sets to include in the response body for this request. If the response includes more than maxitems resource record sets, the value of the IsTruncated element in the response is true, and the values of the NextRecordName and NextRecordType elements in the response identify the first resource record set in the next group of maxitems resource record sets.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      *  Weighted resource record sets only: If results were truncated for a given DNS name and type, specify the value of NextRecordIdentifier from the previous response to get the next resource record set that has the current DNS name and type.
      */
    var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined
    /**
      * The first name in the lexicographic ordering of resource record sets that you want to list.
      */
    var StartRecordName: js.UndefOr[DNSName] = js.undefined
    /**
      * The type of resource record set to begin the record listing from. Valid values for basic resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | NS | PTR | SOA | SPF | SRV | TXT  Values for weighted, latency, geolocation, and failover resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | PTR | SPF | SRV | TXT  Values for alias resource record sets:     CloudFront distribution: A or AAAA    Elastic Beanstalk environment that has a regionalized subdomain: A    ELB load balancer: A | AAAA    Amazon S3 bucket: A    Another resource record set in this hosted zone: The type of the resource record set that the alias references.   Constraint: Specifying type without specifying name returns an InvalidInput error.
      */
    var StartRecordType: js.UndefOr[RRType] = js.undefined
  }
  
  trait ListResourceRecordSetsResponse extends js.Object {
    /**
      * A flag that indicates whether more resource record sets remain to be listed. If your results were truncated, you can make a follow-up pagination request by using the NextRecordName element.
      */
    var IsTruncated: PageTruncated
    /**
      * The maximum number of records you requested.
      */
    var MaxItems: PageMaxItems
    /**
      *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, the value of SetIdentifier for the next resource record set that has the current DNS name and type. For information about routing policies, see Choosing a Routing Policy in the Amazon Route 53 Developer Guide.
      */
    var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined
    /**
      * If the results were truncated, the name of the next record in the list. This element is present only if IsTruncated is true. 
      */
    var NextRecordName: js.UndefOr[DNSName] = js.undefined
    /**
      * If the results were truncated, the type of the next record in the list. This element is present only if IsTruncated is true. 
      */
    var NextRecordType: js.UndefOr[RRType] = js.undefined
    /**
      * Information about multiple resource record sets.
      */
    var ResourceRecordSets: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ResourceRecordSets
  }
  
  trait ListReusableDelegationSetsRequest extends js.Object {
    /**
      * If the value of IsTruncated in the previous response was true, you have more reusable delegation sets. To get another group, submit another ListReusableDelegationSets request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first reusable delegation set that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more reusable delegation sets to get.
      */
    var Marker: js.UndefOr[PageMarker] = js.undefined
    /**
      * The number of reusable delegation sets that you want Amazon Route 53 to return in the response to this request. If you specify a value greater than 100, Route 53 returns only the first 100 reusable delegation sets.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  }
  
  trait ListReusableDelegationSetsResponse extends js.Object {
    /**
      * A complex type that contains one DelegationSet element for each reusable delegation set that was created by the current AWS account.
      */
    var DelegationSets: awsDashSdkLib.clientsRoute53Mod.Route53Ns.DelegationSets
    /**
      * A flag that indicates whether there are more reusable delegation sets to be listed.
      */
    var IsTruncated: PageTruncated
    /**
      * For the second and subsequent calls to ListReusableDelegationSets, Marker is the value that you specified for the marker parameter in the request that produced the current response.
      */
    var Marker: PageMarker
    /**
      * The value that you specified for the maxitems parameter in the call to ListReusableDelegationSets that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, the value of NextMarker identifies the next reusable delegation set that Amazon Route 53 will return if you submit another ListReusableDelegationSets request and specify the value of NextMarker in the marker parameter.
      */
    var NextMarker: js.UndefOr[PageMarker] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The ID of the resource for which you want to retrieve tags.
      */
    var ResourceId: TagResourceId
    /**
      * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
      */
    var ResourceType: TagResourceType
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * A ResourceTagSet containing tags associated with the specified resource.
      */
    var ResourceTagSet: awsDashSdkLib.clientsRoute53Mod.Route53Ns.ResourceTagSet
  }
  
  trait ListTagsForResourcesRequest extends js.Object {
    /**
      * A complex type that contains the ResourceId element for each resource for which you want to get a list of tags.
      */
    var ResourceIds: TagResourceIdList
    /**
      * The type of the resources.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
      */
    var ResourceType: TagResourceType
  }
  
  trait ListTagsForResourcesResponse extends js.Object {
    /**
      * A list of ResourceTagSets containing tags associated with the specified resources.
      */
    var ResourceTagSets: ResourceTagSetList
  }
  
  trait ListTrafficPoliciesRequest extends js.Object {
    /**
      * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this request. If you have more than MaxItems traffic policies, the value of IsTruncated in the response is true, and the value of TrafficPolicyIdMarker is the ID of the first traffic policy that Route 53 will return if you submit another request.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * (Conditional) For your first request to ListTrafficPolicies, don't include the TrafficPolicyIdMarker parameter. If you have more traffic policies than the value of MaxItems, ListTrafficPolicies returns only the first MaxItems traffic policies. To get the next group of policies, submit another request to ListTrafficPolicies. For the value of TrafficPolicyIdMarker, specify the value of TrafficPolicyIdMarker that was returned in the previous response.
      */
    var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined
  }
  
  trait ListTrafficPoliciesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicies request and specifying the value of TrafficPolicyIdMarker in the TrafficPolicyIdMarker request parameter.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the MaxItems parameter in the ListTrafficPolicies request that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If the value of IsTruncated is true, TrafficPolicyIdMarker is the ID of the first traffic policy in the next group of MaxItems traffic policies.
      */
    var TrafficPolicyIdMarker: TrafficPolicyId
    /**
      * A list that contains one TrafficPolicySummary element for each traffic policy that was created by the current AWS account.
      */
    var TrafficPolicySummaries: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicySummaries
  }
  
  trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
    /**
      * The ID of the hosted zone that you want to list traffic policy instances for.
      */
    var HostedZoneId: ResourceId
    /**
      * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  }
  
  trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
    /**
      * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by submitting another ListTrafficPolicyInstancesByHostedZone request and specifying the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the MaxItems parameter in the ListTrafficPolicyInstancesByHostedZone request that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of traffic policy instances.
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of traffic policy instances.
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    /**
      * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request. 
      */
    var TrafficPolicyInstances: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstances
  }
  
  trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request.  For the value of hostedzoneid, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
    /**
      * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * The ID of the traffic policy for which you want to list traffic policy instances.
      */
    var TrafficPolicyId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyId
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    /**
      * The version of the traffic policy for which you want to list traffic policy instances. The version must be associated with the traffic policy that is specified by TrafficPolicyId.
      */
    var TrafficPolicyVersion: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyVersion
  }
  
  trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
    /**
      * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance in the next group of traffic policy instances.
      */
    var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
    /**
      * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by calling ListTrafficPolicyInstancesByPolicy again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker elements in the corresponding request parameters.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstancesByPolicy that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of MaxItems traffic policy instances.
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of MaxItems traffic policy instances.
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    /**
      * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
      */
    var TrafficPolicyInstances: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstances
  }
  
  trait ListTrafficPolicyInstancesRequest extends js.Object {
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of HostedZoneId, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
    /**
      * The maximum number of traffic policy instances that you want Amazon Route 53 to return in response to a ListTrafficPolicyInstances request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance in the next group of MaxItems traffic policy instances.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  }
  
  trait ListTrafficPolicyInstancesResponse extends js.Object {
    /**
      * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
      */
    var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
    /**
      * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get more traffic policy instances by calling ListTrafficPolicyInstances again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstances that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
      */
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    /**
      * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance that Amazon Route 53 will return if you submit another ListTrafficPolicyInstances request. 
      */
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    /**
      * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
      */
    var TrafficPolicyInstances: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstances
  }
  
  trait ListTrafficPolicyVersionsRequest extends js.Object {
    /**
      * Specify the value of Id of the traffic policy for which you want to list all versions.
      */
    var Id: TrafficPolicyId
    /**
      * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for this request. If the specified traffic policy has more than MaxItems versions, the value of IsTruncated in the response is true, and the value of the TrafficPolicyVersionMarker element is the ID of the first version that Route 53 will return if you submit another request.
      */
    var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    /**
      * For your first request to ListTrafficPolicyVersions, don't include the TrafficPolicyVersionMarker parameter. If you have more traffic policy versions than the value of MaxItems, ListTrafficPolicyVersions returns only the first group of MaxItems versions. To get more traffic policy versions, submit another ListTrafficPolicyVersions request. For the value of TrafficPolicyVersionMarker, specify the value of TrafficPolicyVersionMarker in the previous response.
      */
    var TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined
  }
  
  trait ListTrafficPolicyVersionsResponse extends js.Object {
    /**
      * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicyVersions request and specifying the value of NextMarker in the marker parameter.
      */
    var IsTruncated: PageTruncated
    /**
      * The value that you specified for the maxitems parameter in the ListTrafficPolicyVersions request that produced the current response.
      */
    var MaxItems: PageMaxItems
    /**
      * A list that contains one TrafficPolicy element for each traffic policy version that is associated with the specified traffic policy.
      */
    var TrafficPolicies: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicies
    /**
      * If IsTruncated is true, the value of TrafficPolicyVersionMarker identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call ListTrafficPolicyVersions again and specify the value of TrafficPolicyVersionMarker in the TrafficPolicyVersionMarker request parameter. This element is present only if IsTruncated is true.
      */
    var TrafficPolicyVersionMarker: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyVersionMarker
  }
  
  trait ListVPCAssociationAuthorizationsRequest extends js.Object {
    /**
      * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
      */
    var HostedZoneId: ResourceId
    /**
      *  Optional: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If you don't specify a value for MaxResults, Route 53 returns up to 50 VPCs per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      *  Optional: If a response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of results, submit another request, and include the value of NextToken from the response in the nexttoken parameter in another ListVPCAssociationAuthorizations request.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListVPCAssociationAuthorizationsResponse extends js.Object {
    /**
      * The ID of the hosted zone that you can associate the listed VPCs with.
      */
    var HostedZoneId: ResourceId
    /**
      * When the response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of VPCs, submit another ListVPCAssociationAuthorizations request, and include the value of the NextToken element from the response in the nexttoken request parameter.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The list of VPCs that are authorized to be associated with the specified hosted zone.
      */
    var VPCs: awsDashSdkLib.clientsRoute53Mod.Route53Ns.VPCs
  }
  
  trait QueryLoggingConfig extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
      */
    var CloudWatchLogsLogGroupArn: awsDashSdkLib.clientsRoute53Mod.Route53Ns.CloudWatchLogsLogGroupArn
    /**
      * The ID of the hosted zone that CloudWatch Logs is logging queries for. 
      */
    var HostedZoneId: ResourceId
    /**
      * The ID for a configuration for DNS query logging.
      */
    var Id: QueryLoggingConfigId
  }
  
  trait ResourceRecord extends js.Object {
    /**
      * The current or new DNS record value, not to exceed 4,000 characters. In the case of a DELETE action, if the current value does not match the actual value, an error is returned. For descriptions about how to format Value for different record types, see Supported DNS Resource Record Types in the Amazon Route 53 Developer Guide. You can specify more than one value for all record types except CNAME and SOA.   If you're creating an alias resource record set, omit Value. 
      */
    var Value: RData
  }
  
  trait ResourceRecordSet extends js.Object {
    /**
      *  Alias resource record sets only: Information about the CloudFront distribution, AWS Elastic Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set to which you're redirecting queries. The AWS Elastic Beanstalk environment must have a regionalized subdomain. If you're creating resource records sets for a private hosted zone, note the following:   You can't create alias resource record sets for CloudFront distributions in a private hosted zone.   Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.   For information about creating failover resource record sets in a private hosted zone, see Configuring Failover in a Private Hosted Zone in the Amazon Route 53 Developer Guide.  
      */
    var AliasTarget: js.UndefOr[AliasTarget] = js.undefined
    /**
      *  Failover resource record sets only: To configure failover, you add the Failover element to two resource record sets. For one resource record set, you specify PRIMARY as the value for Failover; for the other resource record set, you specify SECONDARY. In addition, you include the HealthCheckId element and specify the health check that you want Amazon Route 53 to perform for each resource record set. Except where noted, the following failover behaviors assume that you have included the HealthCheckId element in both resource record sets:   When the primary resource record set is healthy, Route 53 responds to DNS queries with the applicable value from the primary resource record set regardless of the health of the secondary resource record set.   When the primary resource record set is unhealthy and the secondary resource record set is healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource record set.   When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with the applicable value from the primary resource record set regardless of the health of the primary resource record set.   If you omit the HealthCheckId element for the secondary resource record set, and if the primary resource record set is unhealthy, Route 53 always responds to DNS queries with the applicable value from the secondary resource record set. This is true regardless of the health of the associated endpoint.   You can't create non-failover resource record sets that have the same values for the Name and Type elements as failover resource record sets. For failover alias resource record sets, you must also include the EvaluateTargetHealth element and set the value to true. For more information about configuring failover for Route 53, see the following topics in the Amazon Route 53 Developer Guide:     Route 53 Health Checks and DNS Failover     Configuring Failover in a Private Hosted Zone   
      */
    var Failover: js.UndefOr[ResourceRecordSetFailover] = js.undefined
    /**
      *  Geolocation resource record sets only: A complex type that lets you control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query. For example, if you want all queries from Africa to be routed to a web server with an IP address of 192.0.2.111, create a resource record set with a Type of A and a ContinentCode of AF.  Creating geolocation and geolocation alias resource record sets in private hosted zones is not supported.  If you create separate resource record sets for overlapping geographic regions (for example, one resource record set for a continent and one for a country on the same continent), priority goes to the smallest geographic region. This allows you to route most queries for a continent to one resource and to route queries for a country on that continent to a different resource. You can't create two geolocation resource record sets that specify the same geographic location. The value * in the CountryCode element matches all geographic locations that aren't specified in other geolocation resource record sets that have the same values for the Name and Type elements.  Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't mapped to geographic locations, so even if you create geolocation resource record sets that cover all seven continents, Route 53 will receive some DNS queries from locations that it can't identify. We recommend that you create a resource record set for which the value of CountryCode is *, which handles both queries that come from locations for which you haven't created geolocation resource record sets and queries from IP addresses that aren't mapped to a location. If you don't create a * resource record set, Route 53 returns a "no answer" response for queries from those locations.  You can't create non-geolocation resource record sets that have the same values for the Name and Type elements as geolocation resource record sets.
      */
    var GeoLocation: js.UndefOr[GeoLocation] = js.undefined
    /**
      * If you want Amazon Route 53 to return this resource record set in response to a DNS query only when the status of a health check is healthy, include the HealthCheckId element and specify the ID of the applicable health check. Route 53 determines whether a resource record set is healthy based on one of the following:   By periodically sending a request to the endpoint that is specified in the health check   By aggregating the status of a specified group of health checks (calculated health checks)   By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)    Route 53 doesn't check the health of the endpoint that is specified in the resource record set, for example, the endpoint specified by the IP address in the Value element. When you add a HealthCheckId element to a resource record set, Route 53 checks the health of the endpoint that you specified in the health check.   For more information, see the following topics in the Amazon Route 53 Developer Guide:    How Amazon Route 53 Determines Whether an Endpoint Is Healthy     Route 53 Health Checks and DNS Failover     Configuring Failover in a Private Hosted Zone     When to Specify HealthCheckId  Specifying a value for HealthCheckId is useful only when Route 53 is choosing between two or more resource record sets to respond to a DNS query, and you want Route 53 to base the choice in part on the status of a health check. Configuring health checks makes sense only in the following configurations:    Non-alias resource record sets: You're checking the health of a group of non-alias resource record sets that have the same routing policy, name, and type (such as multiple weighted records named www.example.com with a type of A) and you specify health check IDs for all the resource record sets.  If the health check status for a resource record set is healthy, Route 53 includes the record among the records that it responds to DNS queries with. If the health check status for a resource record set is unhealthy, Route 53 stops responding to DNS queries using the value for that resource record set. If the health check status for all resource record sets in the group is unhealthy, Route 53 considers all resource record sets in the group healthy and responds to DNS queries accordingly.     Alias resource record sets: You specify the following settings:   You set EvaluateTargetHealth to true for an alias resource record set in a group of resource record sets that have the same routing policy, name, and type (such as multiple weighted records named www.example.com with a type of A).    You configure the alias resource record set to route traffic to a non-alias resource record set in the same hosted zone.   You specify a health check ID for the non-alias resource record set.    If the health check status is healthy, Route 53 considers the alias resource record set to be healthy and includes the alias record among the records that it responds to DNS queries with. If the health check status is unhealthy, Route 53 stops responding to DNS queries using the alias resource record set.  The alias resource record set can also route traffic to a group of non-alias resource record sets that have the same routing policy, name, and type. In that configuration, associate health checks with all of the resource record sets in the group of non-alias resource record sets.     Geolocation Routing  For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a resource record set for the larger, associated geographic region. For example, suppose you have resource record sets for a state in the United States, for the entire United States, for North America, and a resource record set that has * for CountryCode is *, which applies to all locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for healthy resource record sets in the following order until it finds a resource record set for which the endpoint is healthy:   The United States   North America   The default resource record set    Specifying the Health Check Endpoint by Domain Name  If your health checks specify the endpoint only by domain name, we recommend that you create a separate health check for each endpoint. For example, create a health check for each HTTP server that is serving content for www.example.com. For the value of FullyQualifiedDomainName, specify the domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).  Health check results will be unpredictable if you do the following:   Create a health check that has the same value for FullyQualifiedDomainName as the name of a resource record set.   Associate that health check with the resource record set.   
      */
    var HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined
    /**
      *  Multivalue answer resource record sets only: To route traffic approximately randomly to multiple resources, such as web servers, create one multivalue answer record for each resource and specify true for MultiValueAnswer. Note the following:   If you associate a health check with a multivalue answer resource record set, Amazon Route 53 responds to DNS queries with the corresponding IP address only when the health check is healthy.   If you don't associate a health check with a multivalue answer record, Route 53 always considers the record to be healthy.   Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.   If you have more than eight healthy records, Route 53 responds to different DNS resolvers with different combinations of healthy records.   When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy records.   If a resource becomes unavailable after a resolver caches a response, client software typically tries another of the IP addresses in the response.   You can't create multivalue answer alias records.
      */
    var MultiValueAnswer: js.UndefOr[ResourceRecordSetMultiValueAnswer] = js.undefined
    /**
      * For ChangeResourceRecordSets requests, the name of the record that you want to create, update, or delete. For ListResourceRecordSets responses, the name of a record in the specified hosted zone.  ChangeResourceRecordSets Only  Enter a fully qualified domain name, for example, www.example.com. You can optionally include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain name that you specify is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical. For information about how to specify characters other than a-z, 0-9, and - (hyphen) and how to specify internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for example, *.example.com. Note the following:   The * must replace the entire label. For example, you can't specify *prod.example.com or prod*.example.com.   The * can't replace any of the middle labels, for example, marketing.*.example.com.   If you include * in any position other than the leftmost label in a domain name, DNS treats it as an * character (ASCII 42), not as a wildcard.  You can't use the * wildcard for resource records sets that have a type of NS.    You can use the * wildcard as the leftmost label in a domain name, for example, *.example.com. You can't use an * for one of the middle labels, for example, marketing.*.example.com. In addition, the * must replace the entire label; for example, you can't specify prod*.example.com.
      */
    var Name: DNSName
    /**
      *  Latency-based resource record sets only: The Amazon EC2 Region where you created the resource that this resource record set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer, and is referred to by an IP address or a DNS domain name, depending on the record type.  Creating latency and latency alias resource record sets in private hosted zones is not supported.  When Amazon Route 53 receives a DNS query for a domain name and type for which you have created latency resource record sets, Route 53 selects the latency resource record set that has the lowest latency between the end user and the associated Amazon EC2 Region. Route 53 then returns the value that is associated with the selected resource record set. Note the following:   You can only specify one ResourceRecord per latency resource record set.   You can only create one latency resource record set for each Amazon EC2 Region.   You aren't required to create latency resource record sets for all Amazon EC2 Regions. Route 53 will choose the region with the best latency from among the regions that you create latency resource record sets for.   You can't create non-latency resource record sets that have the same values for the Name and Type elements as latency resource record sets.  
      */
    var Region: js.UndefOr[ResourceRecordSetRegion] = js.undefined
    /**
      * Information about the resource records to act upon.  If you're creating an alias resource record set, omit ResourceRecords. 
      */
    var ResourceRecords: js.UndefOr[ResourceRecords] = js.undefined
    /**
      *  Resource record sets that have a routing policy other than simple: An identifier that differentiates among multiple resource record sets that have the same combination of name and type, such as multiple weighted resource record sets named acme.example.com that have a type of A. In a group of resource record sets that have the same name and type, the value of SetIdentifier must be unique for each resource record set.  For information about routing policies, see Choosing a Routing Policy in the Amazon Route 53 Developer Guide.
      */
    var SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined
    /**
      * The resource record cache time to live (TTL), in seconds. Note the following:   If you're creating or updating an alias resource record set, omit TTL. Amazon Route 53 uses the value of TTL for the alias target.    If you're associating this resource record set with a health check (if you're adding a HealthCheckId element), we recommend that you specify a TTL of 60 seconds or less so clients respond quickly to changes in health status.   All of the resource record sets in a group of weighted resource record sets must have the same value for TTL.   If a group of weighted resource record sets includes one or more weighted alias resource record sets for which the alias target is an ELB load balancer, we recommend that you specify a TTL of 60 seconds for all of the non-alias weighted resource record sets that have the same name and type. Values other than 60 seconds (the TTL for load balancers) will change the effect of the values that you specify for Weight.  
      */
    var TTL: js.UndefOr[TTL] = js.undefined
    /**
      * When you create a traffic policy instance, Amazon Route 53 automatically creates a resource record set. TrafficPolicyInstanceId is the ID of the traffic policy instance that Route 53 created this resource record set for.  To delete the resource record set that is associated with a traffic policy instance, use DeleteTrafficPolicyInstance. Route 53 will delete the resource record set automatically. If you delete the resource record set by using ChangeResourceRecordSets, Route 53 doesn't automatically delete the traffic policy instance, and you'll continue to be charged for it even though it's no longer in use.  
      */
    var TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId] = js.undefined
    /**
      * The DNS record type. For information about different record types and how data is encoded for them, see Supported DNS Resource Record Types in the Amazon Route 53 Developer Guide. Valid values for basic resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | NS | PTR | SOA | SPF | SRV | TXT  Values for weighted, latency, geolocation, and failover resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | PTR | SPF | SRV | TXT. When creating a group of weighted, latency, geolocation, or failover resource record sets, specify the same value for all of the resource record sets in the group. Valid values for multivalue answer resource record sets: A | AAAA | MX | NAPTR | PTR | SPF | SRV | TXT   SPF records were formerly used to verify the identity of the sender of email messages. However, we no longer recommend that you create resource record sets for which the value of Type is SPF. RFC 7208, Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1, has been updated to say, "...[I]ts existence and mechanism defined in [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section 14.1, The SPF DNS Record Type.  Values for alias resource record sets:    CloudFront distributions: A  If IPv6 is enabled for the distribution, create two resource record sets to route traffic to your distribution, one with a value of A and one with a value of AAAA.     AWS Elastic Beanstalk environment that has a regionalized subdomain: A     ELB load balancers: A | AAAA     Amazon S3 buckets: A     Another resource record set in this hosted zone: Specify the type of the resource record set that you're creating the alias for. All values are supported except NS and SOA.  If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't route traffic to a record for which the value of Type is CNAME. This is because the alias record must have the same type as the record you're routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an alias record.   
      */
    var Type: RRType
    /**
      *  Weighted resource record sets only: Among resource record sets that have the same combination of DNS name and type, a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the current resource record set. Route 53 calculates the sum of the weights for the resource record sets that have the same combination of DNS name and type. Route 53 then responds to queries based on the ratio of a resource's weight to the total. Note the following:   You must specify a value for the Weight element for every weighted resource record set.   You can only specify one ResourceRecord per weighted resource record set.   You can't create latency, failover, or geolocation resource record sets that have the same values for the Name and Type elements as weighted resource record sets.   You can create a maximum of 100 weighted resource record sets that have the same values for the Name and Type elements.   For weighted (but not weighted alias) resource record sets, if you set Weight to 0 for a resource record set, Route 53 never responds to queries with the applicable value for that resource record set. However, if you set Weight to 0 for all resource record sets that have the same combination of DNS name and type, traffic is routed to all resources with equal probability. The effect of setting Weight to 0 is different when you associate health checks with weighted resource record sets. For more information, see Options for Configuring Route 53 Active-Active and Active-Passive Failover in the Amazon Route 53 Developer Guide.  
      */
    var Weight: js.UndefOr[ResourceRecordSetWeight] = js.undefined
  }
  
  trait ResourceTagSet extends js.Object {
    /**
      * The ID for the specified resource.
      */
    var ResourceId: js.UndefOr[TagResourceId] = js.undefined
    /**
      * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
      */
    var ResourceType: js.UndefOr[TagResourceType] = js.undefined
    /**
      * The tags associated with the specified resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ReusableDelegationSetLimit extends js.Object {
    /**
      * The limit that you requested: MAX_ZONES_BY_REUSABLE_DELEGATION_SET, the maximum number of hosted zones that you can associate with the specified reusable delegation set.
      */
    var Type: ReusableDelegationSetLimitType
    /**
      * The current value for the MAX_ZONES_BY_REUSABLE_DELEGATION_SET limit.
      */
    var Value: LimitValue
  }
  
  trait StatusReport extends js.Object {
    /**
      * The date and time that the health checker performed the health check in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
      */
    var CheckedTime: js.UndefOr[TimeStamp] = js.undefined
    /**
      * A description of the status of the health check endpoint as reported by one of the Amazon Route 53 health checkers.
      */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The value of Key depends on the operation that you want to perform:    Add a tag to a health check or hosted zone: Key is the name that you want to give the new tag.    Edit a tag: Key is the name of the tag that you want to change the Value for.     Delete a key: Key is the name of the tag you want to remove.    Give a name to a health check: Edit the default Name tag. In the Amazon Route 53 console, the list of your health checks includes a Name column that lets you see the name that you've given to each health check.  
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of Value depends on the operation that you want to perform:    Add a tag to a health check or hosted zone: Value is the value that you want to give the new tag.    Edit a tag: Value is the new value that you want to assign the tag.  
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TestDNSAnswerRequest extends js.Object {
    /**
      * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in the applicable location, for example, 192.0.2.44 or 2001:db8:85a3::8a2e:370:7334.
      */
    var EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined
    /**
      * If you specify an IP address for edns0clientsubnetip, you can optionally specify the number of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you specify 192.0.2.44 for edns0clientsubnetip and 24 for edns0clientsubnetmask, the checking tool will simulate a request from 192.0.2.0/24. The default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses. The range of valid values depends on whether edns0clientsubnetip is an IPv4 or an IPv6 address:    IPv4: Specify a value between 0 and 32    IPv6: Specify a value between 0 and 128  
      */
    var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined
    /**
      * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
      */
    var HostedZoneId: ResourceId
    /**
      * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
      */
    var RecordName: DNSName
    /**
      * The type of the resource record set.
      */
    var RecordType: RRType
    /**
      * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you omit this value, TestDnsAnswer uses the IP address of a DNS resolver in the AWS US East (N. Virginia) Region (us-east-1).
      */
    var ResolverIP: js.UndefOr[IPAddress] = js.undefined
  }
  
  trait TestDNSAnswerResponse extends js.Object {
    /**
      * The Amazon Route 53 name server used to respond to the request.
      */
    var Nameserver: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Nameserver
    /**
      * The protocol that Amazon Route 53 used to respond to the request, either UDP or TCP. 
      */
    var Protocol: TransportProtocol
    /**
      * A list that contains values that Amazon Route 53 returned for this resource record set.
      */
    var RecordData: awsDashSdkLib.clientsRoute53Mod.Route53Ns.RecordData
    /**
      * The name of the resource record set that you submitted a request for.
      */
    var RecordName: DNSName
    /**
      * The type of the resource record set that you submitted a request for.
      */
    var RecordType: RRType
    /**
      * A code that indicates whether the request is valid or not. The most common response code is NOERROR, meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that describes the error. For a list of possible response codes, see DNS RCODES on the IANA website. 
      */
    var ResponseCode: DNSRCode
  }
  
  trait TrafficPolicy extends js.Object {
    /**
      * The comment that you specify in the CreateTrafficPolicy request, if any.
      */
    var Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    /**
      * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy in the CreateTrafficPolicy request. For more information about the JSON format, see Traffic Policy Document Format.
      */
    var Document: TrafficPolicyDocument
    /**
      * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
      */
    var Id: TrafficPolicyId
    /**
      * The name that you specified when you created the traffic policy.
      */
    var Name: TrafficPolicyName
    /**
      * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
      */
    var Type: RRType
    /**
      * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of Version is always 1.
      */
    var Version: TrafficPolicyVersion
  }
  
  trait TrafficPolicyInstance extends js.Object {
    /**
      * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
      */
    var HostedZoneId: ResourceId
    /**
      * The ID that Amazon Route 53 assigned to the new traffic policy instance.
      */
    var Id: TrafficPolicyInstanceId
    /**
      * If State is Failed, an explanation of the reason for the failure. If State is another value, Message is empty.
      */
    var Message: awsDashSdkLib.clientsRoute53Mod.Route53Ns.Message
    /**
      * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record sets that are associated with this traffic policy instance. 
      */
    var Name: DNSName
    /**
      * The value of State is one of the following values:  Applied  Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge locations.  Creating  Route 53 is creating the resource record sets. Use GetTrafficPolicyInstance to confirm that the CreateTrafficPolicyInstance request completed successfully.  Failed  Route 53 wasn't able to create or update the resource record sets. When the value of State is Failed, see Message for an explanation of what caused the request to fail.  
      */
    var State: TrafficPolicyInstanceState
    /**
      * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted zone.
      */
    var TTL: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TTL
    /**
      * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted zone.
      */
    var TrafficPolicyId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyId
    /**
      * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic policy instance. 
      */
    var TrafficPolicyType: RRType
    /**
      * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted zone.
      */
    var TrafficPolicyVersion: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyVersion
  }
  
  trait TrafficPolicySummary extends js.Object {
    /**
      * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
      */
    var Id: TrafficPolicyId
    /**
      * The version number of the latest version of the traffic policy.
      */
    var LatestVersion: TrafficPolicyVersion
    /**
      * The name that you specified for the traffic policy when you created it.
      */
    var Name: TrafficPolicyName
    /**
      * The number of traffic policies that are associated with the current AWS account.
      */
    var TrafficPolicyCount: TrafficPolicyVersion
    /**
      * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
      */
    var Type: RRType
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was created by using a different account, the AWS account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request. 
      */
    def associateVPCWithHostedZone(): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateVPCWithHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateVPCWithHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was created by using a different account, the AWS account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request. 
      */
    def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateVPCWithHostedZone(
      params: AssociateVPCWithHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateVPCWithHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes to the resource record sets in a hosted zone.  For example, a change batch request that deletes the CNAME record for www.example.com and creates an alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If either the DELETE or the CREATE action fails, then both changes (plus any other changes in the batch) fail, and the original CNAME record continues to exist.  Due to the nature of transactional changes, you can't delete the same resource record set more than once in a single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource record set does not already exist, AWS creates it. If a resource set does exist, Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
      */
    def changeResourceRecordSets(): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changeResourceRecordSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ChangeResourceRecordSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes to the resource record sets in a hosted zone.  For example, a change batch request that deletes the CNAME record for www.example.com and creates an alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If either the DELETE or the CREATE action fails, then both changes (plus any other changes in the batch) fail, and the original CNAME record continues to exist.  Due to the nature of transactional changes, you can't delete the same resource record set more than once in a single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource record set does not already exist, AWS creates it. If a resource set does exist, Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
      */
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changeResourceRecordSets(
      params: ChangeResourceRecordSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ChangeResourceRecordSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def changeTagsForResource(): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changeTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ChangeTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def changeTagsForResource(params: ChangeTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changeTagsForResource(
      params: ChangeTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ChangeTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new health check. For information about adding health checks to resource record sets, see ResourceRecordSet$HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
      */
    def createHealthCheck(): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHealthCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new health check. For information about adding health checks to resource record sets, see ResourceRecordSet$HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
      */
    def createHealthCheck(params: CreateHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHealthCheck(
      params: CreateHealthCheckRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC.
      */
    def createHostedZone(): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC.
      */
    def createHostedZone(params: CreateHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHostedZone(
      params: CreateHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same AWS account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *   You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
      */
    def createQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createQueryLoggingConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same AWS account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *   You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
      */
    def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createQueryLoggingConfig(
      params: CreateQueryLoggingConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted zoned ID is specified, CreateReusableDelegationSet marks the delegation set associated with that zone as reusable.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
      */
    def createReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReusableDelegationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted zoned ID is specified, CreateReusableDelegationSet marks the delegation set associated with that zone as reusable.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
      */
    def createReusableDelegationSet(params: CreateReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReusableDelegationSet(
      params: CreateReusableDelegationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
      */
    def createTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
      */
    def createTrafficPolicy(params: CreateTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicy(
      params: CreateTrafficPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
      */
    def createTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicyInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
      */
    def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicyInstance(
      params: CreateTrafficPolicyInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
      */
    def createTrafficPolicyVersion(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicyVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
      */
    def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrafficPolicyVersion(
      params: CreateTrafficPolicyVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrafficPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
      */
    def createVPCAssociationAuthorization(): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVPCAssociationAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVPCAssociationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
      */
    def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVPCAssociationAuthorization(
      params: CreateVPCAssociationAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVPCAssociationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide. 
      */
    def deleteHealthCheck(): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHealthCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide. 
      */
    def deleteHealthCheck(params: DeleteHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHealthCheck(
      params: DeleteHealthCheckRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a hosted zone.  If the name servers for the hosted zone are associated with a domain and if you want to make the domain unavailable on the Internet, we recommend that you delete the name servers from the domain to prevent future DNS queries from possibly being misrouted. If the domain is registered with Amazon Route 53, see UpdateDomainNameservers. If the domain is registered with another registrar, use the method provided by the registrar to delete name servers for the domain. Some domain registries don't allow you to remove all of the name servers for a domain. If the registry for your domain requires one or more name servers, we recommend that you delete the hosted zone only if you transfer DNS service to another service provider, and you replace the name servers for the domain with name servers from the new provider.  You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current AWS account.  
      */
    def deleteHostedZone(): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a hosted zone.  If the name servers for the hosted zone are associated with a domain and if you want to make the domain unavailable on the Internet, we recommend that you delete the name servers from the domain to prevent future DNS queries from possibly being misrouted. If the domain is registered with Amazon Route 53, see UpdateDomainNameservers. If the domain is registered with another registrar, use the method provided by the registrar to delete name servers for the domain. Some domain registries don't allow you to remove all of the name servers for a domain. If the registry for your domain requires one or more name servers, we recommend that you delete the hosted zone only if you transfer DNS service to another service provider, and you replace the name servers for the domain with name servers from the new provider.  You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current AWS account.  
      */
    def deleteHostedZone(params: DeleteHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHostedZone(
      params: DeleteHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
      */
    def deleteQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteQueryLoggingConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
      */
    def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteQueryLoggingConfig(
      params: DeleteQueryLoggingConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
      */
    def deleteReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReusableDelegationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
      */
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReusableDelegationSet(
      params: DeleteReusableDelegationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a traffic policy.
      */
    def deleteTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrafficPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a traffic policy.
      */
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrafficPolicy(
      params: DeleteTrafficPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
      */
    def deleteTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrafficPolicyInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
      */
    def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrafficPolicyInstance(
      params: DeleteTrafficPolicyInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
      */
    def deleteVPCAssociationAuthorization(): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVPCAssociationAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVPCAssociationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
      */
    def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVPCAssociationAuthorization(
      params: DeleteVPCAssociationAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVPCAssociationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the VPC.  
      */
    def disassociateVPCFromHostedZone(): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateVPCFromHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateVPCFromHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the VPC.  
      */
    def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateVPCFromHostedZone(
      params: DisassociateVPCFromHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateVPCFromHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getAccountLimit(): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getAccountLimit(params: GetAccountLimitRequest): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountLimit(
      params: GetAccountLimitRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
      */
    def getChange(): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getChange(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
      */
    def getChange(params: GetChangeRequest): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getChange(
      params: GetChangeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all AWS services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
      */
    def getCheckerIpRanges(): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCheckerIpRanges(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCheckerIpRangesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all AWS services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
      */
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCheckerIpRanges(
      params: GetCheckerIpRangesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCheckerIpRangesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
      */
    def getGeoLocation(): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGeoLocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGeoLocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
      */
    def getGeoLocation(params: GetGeoLocationRequest): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGeoLocation(
      params: GetGeoLocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGeoLocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified health check.
      */
    def getHealthCheck(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified health check.
      */
    def getHealthCheck(params: GetHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheck(
      params: GetHealthCheckRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the number of health checks that are associated with the current AWS account.
      */
    def getHealthCheckCount(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the number of health checks that are associated with the current AWS account.
      */
    def getHealthCheckCount(params: GetHealthCheckCountRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckCount(
      params: GetHealthCheckCountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the reason that a specified health check failed most recently.
      */
    def getHealthCheckLastFailureReason(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckLastFailureReason(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckLastFailureReasonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the reason that a specified health check failed most recently.
      */
    def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckLastFailureReason(
      params: GetHealthCheckLastFailureReasonRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckLastFailureReasonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets status of a specified health check. 
      */
    def getHealthCheckStatus(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets status of a specified health check. 
      */
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHealthCheckStatus(
      params: GetHealthCheckStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHealthCheckStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
      */
    def getHostedZone(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
      */
    def getHostedZone(params: GetHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZone(
      params: GetHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the number of hosted zones that are associated with the current AWS account.
      */
    def getHostedZoneCount(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZoneCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the number of hosted zones that are associated with the current AWS account.
      */
    def getHostedZoneCount(params: GetHostedZoneCountRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZoneCount(
      params: GetHostedZoneCountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getHostedZoneLimit(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZoneLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getHostedZoneLimit(params: GetHostedZoneLimitRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostedZoneLimit(
      params: GetHostedZoneLimitRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostedZoneLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
      */
    def getQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryLoggingConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
      */
    def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryLoggingConfig(
      params: GetQueryLoggingConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryLoggingConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
      */
    def getReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReusableDelegationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
      */
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReusableDelegationSet(
      params: GetReusableDelegationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReusableDelegationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getReusableDelegationSetLimit(): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReusableDelegationSetLimit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReusableDelegationSetLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
      */
    def getReusableDelegationSetLimit(params: GetReusableDelegationSetLimitRequest): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReusableDelegationSetLimit(
      params: GetReusableDelegationSetLimitRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReusableDelegationSetLimitResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specific traffic policy version.
      */
    def getTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specific traffic policy version.
      */
    def getTrafficPolicy(params: GetTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicy(
      params: GetTrafficPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
      */
    def getTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicyInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
      */
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicyInstance(
      params: GetTrafficPolicyInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the number of traffic policy instances that are associated with the current AWS account.
      */
    def getTrafficPolicyInstanceCount(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicyInstanceCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyInstanceCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the number of traffic policy instances that are associated with the current AWS account.
      */
    def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrafficPolicyInstanceCount(
      params: GetTrafficPolicyInstanceCountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrafficPolicyInstanceCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country.
      */
    def listGeoLocations(): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGeoLocations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGeoLocationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country.
      */
    def listGeoLocations(params: ListGeoLocationsRequest): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGeoLocations(
      params: ListGeoLocationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGeoLocationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of the health checks that are associated with the current AWS account. 
      */
    def listHealthChecks(): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHealthChecks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHealthChecksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of the health checks that are associated with the current AWS account. 
      */
    def listHealthChecks(params: ListHealthChecksRequest): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHealthChecks(
      params: ListHealthChecksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHealthChecksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
      */
    def listHostedZones(): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHostedZones(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHostedZonesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
      */
    def listHostedZones(params: ListHostedZonesRequest): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHostedZones(
      params: ListHostedZonesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHostedZonesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current AWS account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current AWS account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
      */
    def listHostedZonesByName(): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHostedZonesByName(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHostedZonesByNameResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current AWS account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current AWS account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
      */
    def listHostedZonesByName(params: ListHostedZonesByNameRequest): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHostedZonesByName(
      params: ListHostedZonesByNameRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHostedZonesByNameResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the configurations for DNS query logging that are associated with the current AWS account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
      */
    def listQueryLoggingConfigs(): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQueryLoggingConfigs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryLoggingConfigsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the configurations for DNS query logging that are associated with the current AWS account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
      */
    def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQueryLoggingConfigs(
      params: ListQueryLoggingConfigsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueryLoggingConfigsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 100 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
      */
    def listResourceRecordSets(): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceRecordSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceRecordSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 100 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
      */
    def listResourceRecordSets(params: ListResourceRecordSetsRequest): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceRecordSets(
      params: ListResourceRecordSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceRecordSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
      */
    def listReusableDelegationSets(): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReusableDelegationSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReusableDelegationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
      */
    def listReusableDelegationSets(params: ListReusableDelegationSetsRequest): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReusableDelegationSets(
      params: ListReusableDelegationSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReusableDelegationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def listTagsForResources(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
      */
    def listTagsForResources(params: ListTagsForResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResources(
      params: ListTagsForResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the latest version for every traffic policy that is associated with the current AWS account. Policies are listed in the order that they were created in. 
      */
    def listTrafficPolicies(): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the latest version for every traffic policy that is associated with the current AWS account. Policies are listed in the order that they were created in. 
      */
    def listTrafficPolicies(params: ListTrafficPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicies(
      params: ListTrafficPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created by using the current AWS account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstances(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created by using the current AWS account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstances(
      params: ListTrafficPolicyInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstancesByHostedZone(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstancesByHostedZone(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstancesByHostedZone(
      params: ListTrafficPolicyInstancesByHostedZoneRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstancesByPolicy(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstancesByPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesByPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
      */
    def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyInstancesByPolicy(
      params: ListTrafficPolicyInstancesByPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyInstancesByPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
      */
    def listTrafficPolicyVersions(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
      */
    def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTrafficPolicyVersions(
      params: ListTrafficPolicyVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTrafficPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
      */
    def listVPCAssociationAuthorizations(): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVPCAssociationAuthorizations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVPCAssociationAuthorizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
      */
    def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVPCAssociationAuthorizations(
      params: ListVPCAssociationAuthorizationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVPCAssociationAuthorizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. 
      */
    def testDNSAnswer(): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testDNSAnswer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestDNSAnswerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. 
      */
    def testDNSAnswer(params: TestDNSAnswerRequest): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testDNSAnswer(
      params: TestDNSAnswerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestDNSAnswerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
      */
    def updateHealthCheck(): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHealthCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
      */
    def updateHealthCheck(params: UpdateHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHealthCheck(
      params: UpdateHealthCheckRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHealthCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the comment for a specified hosted zone.
      */
    def updateHostedZoneComment(): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHostedZoneComment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHostedZoneCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the comment for a specified hosted zone.
      */
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHostedZoneComment(
      params: UpdateHostedZoneCommentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHostedZoneCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the comment for a specified traffic policy version.
      */
    def updateTrafficPolicyComment(): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrafficPolicyComment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrafficPolicyCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the comment for a specified traffic policy version.
      */
    def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrafficPolicyComment(
      params: UpdateTrafficPolicyCommentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrafficPolicyCommentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
      */
    def updateTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrafficPolicyInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
      */
    def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrafficPolicyInstance(
      params: UpdateTrafficPolicyInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrafficPolicyInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_resourceRecordSetsChanged(state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_resourceRecordSetsChanged(
      state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_resourceRecordSetsChanged(
      state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
      params: GetChangeRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_resourceRecordSetsChanged(
      state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
      params: GetChangeRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateHealthCheckRequest extends js.Object {
    /**
      * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
      */
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined
    /**
      * A complex type that contains one ChildHealthCheck element for each health check that you want to associate with a CALCULATED health check.
      */
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined
    /**
      * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:    Health checks that check the health of endpoints: Route 53 stops submitting requests to your application, server, or other resource.    Calculated health checks: Route 53 stops aggregating the status of the referenced health checks.    Health checks that monitor CloudWatch alarms: Route 53 stops monitoring the corresponding CloudWatch metrics.   After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop routing traffic to a resource, change the value of UpdateHealthCheckRequest$Inverted. Charges for a health check still apply when the health check is disabled. For more information, see Amazon Route 53 Pricing.
      */
    var Disabled: js.UndefOr[Disabled] = js.undefined
    /**
      * Specify whether you want Amazon Route 53 to send the value of FullyQualifiedDomainName to the endpoint in the client_hello message during TLS negotiation. This allows the endpoint to respond to HTTPS health check requests with the applicable SSL/TLS certificate. Some endpoints require that HTTPS requests include the host name in the client_hello message. If you don't enable SNI, the status of the health check will be SSL alert handshake_failure. A health check can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid. The SSL/TLS certificate on your endpoint includes a domain name in the Common Name field and possibly several more in the Subject Alternative Names field. One of the domain names in the certificate should match the value that you specify for FullyQualifiedDomainName. If the endpoint responds to the client_hello message with a certificate that does not include the domain name that you specified in FullyQualifiedDomainName, a health checker will retry the handshake. In the second attempt, the health checker will omit FullyQualifiedDomainName from the client_hello message.
      */
    var EnableSNI: js.UndefOr[EnableSNI] = js.undefined
    /**
      * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see How Amazon Route 53 Determines Whether an Endpoint Is Healthy in the Amazon Route 53 Developer Guide. If you don't specify a value for FailureThreshold, the default value is three health checks.
      */
    var FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    /**
      * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.  If a health check already has a value for IPAddress, you can change the value. However, you can't update an existing health check to add or remove the value of IPAddress.    If you specify a value for IPAddress: Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform health checks. When Route 53 checks the health of an endpoint, here is how it constructs the Host header:   If you specify a value of 80 for Port and HTTP or HTTP_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.   If you specify a value of 443 for Port and HTTPS or HTTPS_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.   If you specify another value for Port and any value except TCP for Type, Route 53 passes  FullyQualifiedDomainName:Port  to the endpoint in the Host header.   If you don't specify a value for FullyQualifiedDomainName, Route 53 substitutes the value of IPAddress in the Host header in each of the above cases.  If you don't specify a value for IPAddress: If you don't specify a value for IPAddress, Route 53 sends a DNS request to the domain that you specify in FullyQualifiedDomainName at the interval you specify in RequestInterval. Using an IPv4 address that is returned by DNS, Route 53 then checks the health of the endpoint.  If you don't specify a value for IPAddress, Route 53 uses only IPv4 to send health checks to the endpoint. If there's no resource record set with a type of A for the name that you specify for FullyQualifiedDomainName, the health check fails with a "DNS resolution failed" error.  If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify the endpoint only by FullyQualifiedDomainName, we recommend that you create a separate health check for each endpoint. For example, create a health check for each HTTP server that is serving content for www.example.com. For the value of FullyQualifiedDomainName, specify the domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).  In this configuration, if the value of FullyQualifiedDomainName matches the name of the resource record sets and you then associate the health check with those resource record sets, health check results will be unpredictable.  In addition, if the value of Type is HTTP, HTTPS, HTTP_STR_MATCH, or HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it does when you specify a value for IPAddress. If the value of Type is TCP, Route 53 doesn't pass a Host header.
      */
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined
    /**
      * The ID for the health check for which you want detailed information. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.
      */
    var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheckId
    /**
      * A sequential counter that Amazon Route 53 sets to 1 when you create a health check and increments by 1 each time you update settings for the health check. We recommend that you use GetHealthCheck or ListHealthChecks to get the current value of HealthCheckVersion for the health check that you want to update, and that you include that value in your UpdateHealthCheck request. This prevents Route 53 from overwriting an intervening update:   If the value in the UpdateHealthCheck request matches the value of HealthCheckVersion in the health check, Route 53 updates the health check with the new settings.   If the value of HealthCheckVersion in the health check is greater, the health check was changed after you got the version number. Route 53 does not update the health check, and it returns a HealthCheckVersionMismatch error.  
      */
    var HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined
    /**
      * The number of child health checks that are associated with a CALCULATED health that Amazon Route 53 must consider healthy for the CALCULATED health check to be considered healthy. To specify the child health checks that you want to associate with a CALCULATED health check, use the ChildHealthChecks and ChildHealthCheck elements. Note the following:   If you specify a number greater than the number of child health checks, Route 53 always considers this health check to be unhealthy.   If you specify 0, Route 53 always considers this health check to be healthy.  
      */
    var HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined
    /**
      * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the domain name that you specify in FullyQualifiedDomainName at the interval that you specify in RequestInterval. Using an IP address that is returned by DNS, Route 53 then checks the health of the endpoint. Use one of the following formats for the value of IPAddress:     IPv4 address: four values between 0 and 255, separated by periods (.), for example, 192.0.2.44.    IPv6 address: eight groups of four hexadecimal values, separated by colons (:), for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. You can also shorten IPv6 addresses as described in RFC 5952, for example, 2001:db8:85a3::abcd:1:2345.   If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your EC2 instance, and specify the Elastic IP address for IPAddress. This ensures that the IP address of your instance never changes. For more information, see the applicable documentation:   Linux: Elastic IP Addresses (EIP) in the Amazon EC2 User Guide for Linux Instances    Windows: Elastic IP Addresses (EIP) in the Amazon EC2 User Guide for Windows Instances     If a health check already has a value for IPAddress, you can change the value. However, you can't update an existing health check to add or remove the value of IPAddress.   For more information, see UpdateHealthCheckRequest$FullyQualifiedDomainName. Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private, non-routable, or multicast ranges. For more information about IP addresses for which you can't create health checks, see the following documents:    RFC 5735, Special Use IPv4 Addresses     RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space     RFC 5156, Special-Use IPv6 Addresses   
      */
    var IPAddress: js.UndefOr[IPAddress] = js.undefined
    /**
      * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want Amazon Route 53 to assign to the health check:    Healthy: Route 53 considers the health check to be healthy.    Unhealthy: Route 53 considers the health check to be unhealthy.    LastKnownStatus: Route 53 uses the status of the health check from the last time CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known status, the default status for the health check is healthy.  
      */
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined
    /**
      * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a health check unhealthy when it otherwise would be considered healthy.
      */
    var Inverted: js.UndefOr[Inverted] = js.undefined
    /**
      * The port on the endpoint on which you want Amazon Route 53 to perform health checks.
      */
    var Port: js.UndefOr[Port] = js.undefined
    /**
      * A complex type that contains one Region element for each region that you want Amazon Route 53 health checkers to check the specified endpoint from.
      */
    var Regions: js.UndefOr[HealthCheckRegionList] = js.undefined
    /**
      * A complex type that contains one ResettableElementName element for each element that you want to reset to the default value. Valid values for ResettableElementName include the following:    ChildHealthChecks: Amazon Route 53 resets HealthCheckConfig$ChildHealthChecks to null.    FullyQualifiedDomainName: Route 53 resets HealthCheckConfig$FullyQualifiedDomainName to null.    Regions: Route 53 resets the HealthCheckConfig$Regions list to the default set of regions.     ResourcePath: Route 53 resets HealthCheckConfig$ResourcePath to null.  
      */
    var ResetElements: js.UndefOr[ResettableElementNameList] = js.undefined
    /**
      * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example the file /docs/route53-health-check.html. You can also include query string parameters, for example, /welcome.html?language=jp&amp;login=y.  Specify this value only if you want to change it.
      */
    var ResourcePath: js.UndefOr[ResourcePath] = js.undefined
    /**
      * If the value of Type is HTTP_STR_MATCH or HTTP_STR_MATCH, the string that you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the response body, Route 53 considers the resource healthy. (You can't change the value of Type when you update a health check.)
      */
    var SearchString: js.UndefOr[SearchString] = js.undefined
  }
  
  trait UpdateHealthCheckResponse extends js.Object {
    /**
      * A complex type that contains the response to an UpdateHealthCheck request.
      */
    var HealthCheck: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HealthCheck
  }
  
  trait UpdateHostedZoneCommentRequest extends js.Object {
    /**
      * The new comment for the hosted zone. If you don't specify a value for Comment, Amazon Route 53 deletes the existing value of the Comment element, if any.
      */
    var Comment: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The ID for the hosted zone that you want to update the comment for.
      */
    var Id: ResourceId
  }
  
  trait UpdateHostedZoneCommentResponse extends js.Object {
    /**
      * A complex type that contains the response to the UpdateHostedZoneComment request.
      */
    var HostedZone: awsDashSdkLib.clientsRoute53Mod.Route53Ns.HostedZone
  }
  
  trait UpdateTrafficPolicyCommentRequest extends js.Object {
    /**
      * The new comment for the specified traffic policy and version.
      */
    var Comment: TrafficPolicyComment
    /**
      * The value of Id for the traffic policy that you want to update the comment for.
      */
    var Id: TrafficPolicyId
    /**
      * The value of Version for the traffic policy that you want to update the comment for.
      */
    var Version: TrafficPolicyVersion
  }
  
  trait UpdateTrafficPolicyCommentResponse extends js.Object {
    /**
      * A complex type that contains settings for the specified traffic policy.
      */
    var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicy
  }
  
  trait UpdateTrafficPolicyInstanceRequest extends js.Object {
    /**
      * The ID of the traffic policy instance that you want to update.
      */
    var Id: TrafficPolicyInstanceId
    /**
      * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
      */
    var TTL: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TTL
    /**
      * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
      */
    var TrafficPolicyId: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyId
    /**
      * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
      */
    var TrafficPolicyVersion: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyVersion
  }
  
  trait UpdateTrafficPolicyInstanceResponse extends js.Object {
    /**
      * A complex type that contains settings for the updated traffic policy instance.
      */
    var TrafficPolicyInstance: awsDashSdkLib.clientsRoute53Mod.Route53Ns.TrafficPolicyInstance
  }
  
  trait VPC extends js.Object {
    var VPCId: js.UndefOr[VPCId] = js.undefined
    /**
      * (Private hosted zones only) The region that an Amazon VPC was created in.
      */
    var VPCRegion: js.UndefOr[VPCRegion] = js.undefined
  }
  
  trait _AccountLimitType extends js.Object
  
  trait _ChangeAction extends js.Object
  
  trait _ChangeStatus extends js.Object
  
  trait _CloudWatchRegion extends js.Object
  
  trait _ComparisonOperator extends js.Object
  
  trait _HealthCheckRegion extends js.Object
  
  trait _HealthCheckType extends js.Object
  
  trait _HostedZoneLimitType extends js.Object
  
  trait _InsufficientDataHealthStatus extends js.Object
  
  trait _RRType extends js.Object
  
  trait _ResettableElementName extends js.Object
  
  trait _ResourceRecordSetFailover extends js.Object
  
  trait _ResourceRecordSetRegion extends js.Object
  
  trait _Statistic extends js.Object
  
  trait _TagResourceType extends js.Object
  
  trait _VPCRegion extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountLimitType = _AccountLimitType | java.lang.String
  type AlarmName = java.lang.String
  type AliasHealthEnabled = scala.Boolean
  type AssociateVPCComment = java.lang.String
  type ChangeAction = _ChangeAction | java.lang.String
  type ChangeStatus = _ChangeStatus | java.lang.String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
  type CloudWatchRegion = _CloudWatchRegion | java.lang.String
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type DNSName = java.lang.String
  type DNSRCode = java.lang.String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DimensionField = java.lang.String
  type DimensionList = js.Array[Dimension]
  type Disabled = scala.Boolean
  type DisassociateVPCComment = java.lang.String
  type EnableSNI = scala.Boolean
  type EvaluationPeriods = scala.Double
  type FailureThreshold = scala.Double
  type FullyQualifiedDomainName = java.lang.String
  type GeoLocationContinentCode = java.lang.String
  type GeoLocationContinentName = java.lang.String
  type GeoLocationCountryCode = java.lang.String
  type GeoLocationCountryName = java.lang.String
  type GeoLocationDetailsList = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode = java.lang.String
  type GeoLocationSubdivisionName = java.lang.String
  type HealthCheckCount = scala.Double
  type HealthCheckId = java.lang.String
  type HealthCheckNonce = java.lang.String
  type HealthCheckObservations = js.Array[HealthCheckObservation]
  type HealthCheckRegion = _HealthCheckRegion | java.lang.String
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  type HealthCheckType = _HealthCheckType | java.lang.String
  type HealthCheckVersion = scala.Double
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = scala.Double
  type HostedZoneCount = scala.Double
  type HostedZoneLimitType = _HostedZoneLimitType | java.lang.String
  type HostedZoneRRSetCount = scala.Double
  type HostedZones = js.Array[HostedZone]
  type IPAddress = java.lang.String
  type IPAddressCidr = java.lang.String
  type InsufficientDataHealthStatus = _InsufficientDataHealthStatus | java.lang.String
  type Inverted = scala.Boolean
  type IsPrivateZone = scala.Boolean
  type LimitValue = scala.Double
  type MaxResults = java.lang.String
  type MeasureLatency = scala.Boolean
  type Message = java.lang.String
  type MetricName = java.lang.String
  type Nameserver = java.lang.String
  type Namespace = java.lang.String
  type Nonce = java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = java.lang.String
  type PageTruncated = scala.Boolean
  type PaginationToken = java.lang.String
  type Period = scala.Double
  type Port = scala.Double
  type QueryLoggingConfigId = java.lang.String
  type QueryLoggingConfigs = js.Array[QueryLoggingConfig]
  type RData = java.lang.String
  type RRType = _RRType | java.lang.String
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = java.lang.String
  type RequestInterval = scala.Double
  type ResettableElementName = _ResettableElementName | java.lang.String
  type ResettableElementNameList = js.Array[ResettableElementName]
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  type ResourceRecordSetFailover = _ResourceRecordSetFailover | java.lang.String
  type ResourceRecordSetIdentifier = java.lang.String
  type ResourceRecordSetMultiValueAnswer = scala.Boolean
  type ResourceRecordSetRegion = _ResourceRecordSetRegion | java.lang.String
  type ResourceRecordSetWeight = scala.Double
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = java.lang.String
  type ReusableDelegationSetLimitType = awsDashSdkLib.awsDashSdkLibStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET | java.lang.String
  type SearchString = java.lang.String
  type ServicePrincipal = java.lang.String
  type Statistic = _Statistic | java.lang.String
  type Status = java.lang.String
  type SubnetMask = java.lang.String
  type TTL = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = java.lang.String
  type TagResourceIdList = js.Array[TagResourceId]
  type TagResourceType = _TagResourceType | java.lang.String
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type TimeStamp = stdLib.Date
  type TrafficPolicies = js.Array[TrafficPolicy]
  type TrafficPolicyComment = java.lang.String
  type TrafficPolicyDocument = java.lang.String
  type TrafficPolicyId = java.lang.String
  type TrafficPolicyInstanceCount = scala.Double
  type TrafficPolicyInstanceId = java.lang.String
  type TrafficPolicyInstanceState = java.lang.String
  type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName = java.lang.String
  type TrafficPolicySummaries = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion = scala.Double
  type TrafficPolicyVersionMarker = java.lang.String
  type TransportProtocol = java.lang.String
  type UsageCount = scala.Double
  type VPCId = java.lang.String
  type VPCRegion = _VPCRegion | java.lang.String
  type VPCs = js.Array[VPC]
  type apiVersion = _apiVersion | java.lang.String
}

