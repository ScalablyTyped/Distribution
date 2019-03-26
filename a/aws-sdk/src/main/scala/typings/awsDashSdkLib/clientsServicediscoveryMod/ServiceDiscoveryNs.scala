package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/servicediscovery", "ServiceDiscovery")
@js.native
object ServiceDiscoveryNs extends js.Object {
  trait Attributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttrValue]
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateHttpNamespaceRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed CreateHttpNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A description for the namespace.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The name that you want to assign to this namespace.
      */
    var Name: NamespaceName
  }
  
  trait CreateHttpNamespaceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait CreatePrivateDnsNamespaceRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A description for the namespace.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The name that you want to assign to this namespace. When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
      */
    var Name: NamespaceName
    /**
      * The ID of the Amazon VPC that you want to associate the namespace with.
      */
    var Vpc: ResourceId
  }
  
  trait CreatePrivateDnsNamespaceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait CreatePublicDnsNamespaceRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed CreatePublicDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A description for the namespace.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The name that you want to assign to this namespace.
      */
    var Name: NamespaceName
  }
  
  trait CreatePublicDnsNamespaceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait CreateServiceRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A description for the service.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
      */
    var DnsConfig: js.UndefOr[DnsConfig] = js.undefined
    /**
      *  Public DNS namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
      */
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    /**
      * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
      */
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined
    /**
      * The name that you want to assign to the service.
      */
    var Name: ServiceName
    /**
      * The ID of the namespace that you want to use to create the service.
      */
    var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait CreateServiceResponse extends js.Object {
    /**
      * A complex type that contains information about the new service.
      */
    var Service: js.UndefOr[Service] = js.undefined
  }
  
  trait DeleteNamespaceRequest extends js.Object {
    /**
      * The ID of the namespace that you want to delete.
      */
    var Id: ResourceId
  }
  
  trait DeleteNamespaceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait DeleteServiceRequest extends js.Object {
    /**
      * The ID of the service that you want to delete.
      */
    var Id: ResourceId
  }
  
  trait DeleteServiceResponse extends js.Object
  
  trait DeregisterInstanceRequest extends js.Object {
    /**
      * The value that you specified for Id in the RegisterInstance request.
      */
    var InstanceId: ResourceId
    /**
      * The ID of the service that the instance is associated with.
      */
    var ServiceId: ResourceId
  }
  
  trait DeregisterInstanceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. For more information, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait DiscoverInstancesRequest extends js.Object {
    /**
      * The health status of the instances that you want to discover.
      */
    var HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined
    /**
      * The maximum number of instances that you want Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the namespace that you specified when you registered the instance.
      */
    var NamespaceName: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.NamespaceName
    /**
      * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all the specified key/value pairs will be returned.
      */
    var QueryParameters: js.UndefOr[Attributes] = js.undefined
    /**
      * The name of the service that you specified when you registered the instance.
      */
    var ServiceName: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ServiceName
  }
  
  trait DiscoverInstancesResponse extends js.Object {
    /**
      * A complex type that contains one HttpInstanceSummary for each registered instance.
      */
    var Instances: js.UndefOr[HttpInstanceSummaryList] = js.undefined
  }
  
  trait DnsConfig extends js.Object {
    /**
      * An array that contains one DnsRecord object for each Route 53 DNS record that you want AWS Cloud Map to create when you register an instance.
      */
    var DnsRecords: DnsRecordList
    /**
      * The ID of the namespace to use for DNS configuration.
      */
    var NamespaceId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you register an instance and specify this service.  If you want to use this service to register instances that create alias records, specify WEIGHTED for the routing policy.  You can specify the following values:  MULTIVALUE  If you define a health check for the service and the health check is healthy, Route 53 returns the applicable value for up to eight instances. For example, suppose the service includes configurations for one A record and a health check, and you use the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses for all of the healthy instances. If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns the values for up to eight instances. For more information about the multivalue routing policy, see Multivalue Answer Routing in the Route 53 Developer Guide.  WEIGHTED  Route 53 returns the applicable value from one randomly selected instance from among the instances that you registered using the same service. Currently, all records have the same weight, so you can't route more or less traffic to any instances. For example, suppose the service includes configurations for one A record and a health check, and you use the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if all of the instances were healthy. If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns the applicable value for one randomly selected instance. For more information about the weighted routing policy, see Weighted Routing in the Route 53 Developer Guide.
      */
    var RoutingPolicy: js.UndefOr[RoutingPolicy] = js.undefined
  }
  
  trait DnsConfigChange extends js.Object {
    /**
      * An array that contains one DnsRecord object for each Route 53 record that you want AWS Cloud Map to create when you register an instance.
      */
    var DnsRecords: DnsRecordList
  }
  
  trait DnsProperties extends js.Object {
    /**
      * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
      */
    var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait DnsRecord extends js.Object {
    /**
      * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.  Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record routes traffic to. If you include the AWS_ALIAS_DNS_NAME attribute when you submit a RegisterInstance request, the TTL value is ignored. Always specify a TTL for the service; you can use a service to register instances that create either alias or non-alias records. 
      */
    var TTL: RecordTTL
    /**
      * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries. Note the following:    A, AAAA, and SRV records: You can specify settings for a maximum of one A, one AAAA, and one SRV record. You can specify them in any combination.    CNAME records: If you specify CNAME for Type, you can't define any other records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the same name as a CNAME record.    Alias records: If you want AWS Cloud Map to create a Route 53 alias record when you register an instance, specify A or AAAA for Type.    All records: You specify settings other than TTL and Type when you register an instance.   The following values are supported:  A  Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.  AAAA  Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.  CNAME  Route 53 returns the domain name of the resource, such as www.example.com. Note the following:   You specify the domain name that you want to route traffic to when you register an instance. For more information, see RegisterInstanceRequest$Attributes.   You must specify WEIGHTED for the value of RoutingPolicy.   You can't specify both CNAME for Type and settings for HealthCheckConfig. If you do, the request will fail with an InvalidInput error.    SRV  Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:  priority weight port service-hostname  Note the following about the values:   The values of priority and weight are both set to 1 and can't be changed.    The value of port comes from the value that you specify for the AWS_INSTANCE_PORT attribute when you submit a RegisterInstance request.    The value of service-hostname is a concatenation of the following values:   The value that you specify for InstanceId when you register an instance.   The name of the service.   The name of the namespace.    For example, if the value of InstanceId is test, the name of the service is backend, and the name of the namespace is example.com, the value of service-hostname is:  test.backend.example.com    If you specify settings for an SRV record and if you specify values for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both in the RegisterInstance request, AWS Cloud Map automatically creates A and/or AAAA records that have the same name as the value of service-hostname in the SRV record. You can ignore these records.
      */
    var Type: RecordType
  }
  
  trait GetInstanceRequest extends js.Object {
    /**
      * The ID of the instance that you want to get information about.
      */
    var InstanceId: ResourceId
    /**
      * The ID of the service that the instance is associated with.
      */
    var ServiceId: ResourceId
  }
  
  trait GetInstanceResponse extends js.Object {
    /**
      * A complex type that contains information about a specified instance.
      */
    var Instance: js.UndefOr[Instance] = js.undefined
  }
  
  trait GetInstancesHealthStatusRequest extends js.Object {
    /**
      * An array that contains the IDs of all the instances that you want to get the health status for. If you omit Instances, AWS Cloud Map returns the health status for all the instances that are associated with the specified service.  To get the IDs for the instances that you've registered by using a specified service, submit a ListInstances request. 
      */
    var Instances: js.UndefOr[InstanceIdList] = js.undefined
    /**
      * The maximum number of instances that you want AWS Cloud Map to return in the response to a GetInstancesHealthStatus request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first GetInstancesHealthStatus request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the service that the instance is associated with.
      */
    var ServiceId: ResourceId
  }
  
  trait GetInstancesHealthStatusResponse extends js.Object {
    /**
      * If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A complex type that contains the IDs and the health status of the instances that you specified in the GetInstancesHealthStatus request.
      */
    var Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined
  }
  
  trait GetNamespaceRequest extends js.Object {
    /**
      * The ID of the namespace that you want to get information about.
      */
    var Id: ResourceId
  }
  
  trait GetNamespaceResponse extends js.Object {
    /**
      * A complex type that contains information about the specified namespace.
      */
    var Namespace: js.UndefOr[Namespace] = js.undefined
  }
  
  trait GetOperationRequest extends js.Object {
    /**
      * The ID of the operation that you want to get more information about.
      */
    var OperationId: ResourceId
  }
  
  trait GetOperationResponse extends js.Object {
    /**
      * A complex type that contains information about the operation.
      */
    var Operation: js.UndefOr[Operation] = js.undefined
  }
  
  trait GetServiceRequest extends js.Object {
    /**
      * The ID of the service that you want to get settings for.
      */
    var Id: ResourceId
  }
  
  trait GetServiceResponse extends js.Object {
    /**
      * A complex type that contains information about the service.
      */
    var Service: js.UndefOr[Service] = js.undefined
  }
  
  trait HealthCheckConfig extends js.Object {
    /**
      * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Route 53 Developer Guide.
      */
    var FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    /**
      * The path that you want Route 53 to request when performing health checks. The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file /docs/route53-health-check.html. Route 53 automatically adds the DNS name for the service. If you don't specify a value for ResourcePath, the default value is /. If you specify TCP for Type, you must not specify a value for ResourcePath.
      */
    var ResourcePath: js.UndefOr[ResourcePath] = js.undefined
    /**
      * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy.  You can't change the value of Type after you create a health check.  You can create the following types of health checks:    HTTP: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.    HTTPS: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.  If you specify HTTPS for the value of Type, the endpoint must support TLS v1.0 or later.     TCP: Route 53 tries to establish a TCP connection. If you specify TCP for Type, don't specify a value for ResourcePath.   For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Route 53 Developer Guide.
      */
    var Type: HealthCheckType
  }
  
  trait HealthCheckCustomConfig extends js.Object {
    /**
      * The number of 30-second intervals that you want Cloud Map to wait after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status of a service instance. For example, suppose you specify a value of 2 for FailureTheshold, and then your application sends an UpdateInstanceCustomHealthStatus request. Cloud Map waits for approximately 60 seconds (2 x 30) before changing the status of the service instance based on that request. Sending a second or subsequent UpdateInstanceCustomHealthStatus request with the same value before FailureThreshold x 30 seconds has passed doesn't accelerate the change. Cloud Map still waits FailureThreshold x 30 seconds after the first request to make the change.
      */
    var FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
  }
  
  trait HttpInstanceSummary extends js.Object {
    /**
      * If you included any attributes when you registered the instance, the values of those attributes.
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * If you configured health checking in the service, the current health status of the service instance.
      */
    var HealthStatus: js.UndefOr[HealthStatus] = js.undefined
    /**
      * The ID of an instance that matches the values that you specified in the request.
      */
    var InstanceId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The name of the namespace that you specified when you registered the instance.
      */
    var NamespaceName: js.UndefOr[NamespaceName] = js.undefined
    /**
      * The name of the service that you specified when you registered the instance.
      */
    var ServiceName: js.UndefOr[ServiceName] = js.undefined
  }
  
  trait HttpProperties extends js.Object {
    /**
      * The name of an HTTP namespace.
      */
    var HttpName: js.UndefOr[NamespaceName] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * A string map that contains the following information for the service that you specify in ServiceId:   The attributes that apply to the records that are defined in the service.    For each attribute, the applicable value.   Supported attribute keys include the following:  AWS_ALIAS_DNS_NAME     If you want AWS Cloud Map to create a Route 53 alias record that routes traffic to an Elastic Load Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about how to get the DNS name, see "DNSName" in the topic AliasTarget. Note the following:   The configuration for the service that is specified by ServiceId must include settings for an A record, an AAAA record, or both.   In the service that is specified by ServiceId, the value of RoutingPolicy must be WEIGHTED.   If the service that is specified by ServiceId includes HealthCheckConfig settings, AWS Cloud Map will create the health check, but it won't associate the health check with the alias record.   Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB load balancers.   If you specify a value for AWS_ALIAS_DNS_NAME, don't specify values for any of the AWS_INSTANCE attributes.    AWS_INSTANCE_CNAME  If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in response to DNS queries, for example, example.com. This value is required if the service specified by ServiceId includes settings for an CNAME record.  AWS_INSTANCE_IPV4  If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response to DNS queries, for example, 192.0.2.44. This value is required if the service specified by ServiceId includes settings for an A record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_IPV6  If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in response to DNS queries, for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. This value is required if the service specified by ServiceId includes settings for an AAAA record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_PORT  If the service includes an SRV record, the value that you want Route 53 to return for the port. If the service includes HealthCheckConfig, the port on the endpoint that you want Route 53 to send requests to.  This value is required if you specified settings for an SRV record when you created the service.
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * A unique string that identifies the request and that allows failed RegisterInstance requests to be retried without the risk of executing the operation twice. You must use a unique CreatorRequestId string every time you submit a RegisterInstance request if you're registering additional instances for the same namespace and service. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * An identifier that you want to associate with the instance. Note the following:   If the service that is specified by ServiceId includes settings for an SRV record, the value of InstanceId is automatically included as part of the value for the SRV record. For more information, see DnsRecord$Type.   You can use this value to update an existing instance.   To register a new instance, you must specify a value that is unique among instances that you register by using the same service.    If you specify an existing InstanceId and ServiceId, AWS Cloud Map updates the existing DNS records. If there's also an existing health check, AWS Cloud Map deletes the old health check and creates a new one.   The health check isn't deleted immediately, so it will still appear for a while if you submit a ListHealthChecks request, for example.   
      */
    var Id: ResourceId
  }
  
  trait InstanceHealthStatusMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[HealthStatus]
  
  trait InstanceSummary extends js.Object {
    /**
      * A string map that contains the following information:   The attributes that are associate with the instance.    For each attribute, the applicable value.   Supported attribute keys include the following:    AWS_ALIAS_DNS_NAME: For an alias record that routes traffic to an Elastic Load Balancing load balancer, the DNS name that is associated with the load balancer.     AWS_INSTANCE_CNAME: For a CNAME record, the domain name that Route 53 returns in response to DNS queries, for example, example.com.    AWS_INSTANCE_IPV4: For an A record, the IPv4 address that Route 53 returns in response to DNS queries, for example, 192.0.2.44.    AWS_INSTANCE_IPV6: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS queries, for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345.    AWS_INSTANCE_PORT: For an SRV record, the value that Route 53 returns for the port. In addition, if the service includes HealthCheckConfig, the port on the endpoint that Route 53 sends requests to.  
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The ID for an instance that you created by using a specified service.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait ListInstancesRequest extends js.Object {
    /**
      * The maximum number of instances that you want AWS Cloud Map to return in the response to a ListInstances request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListInstances request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the service that you want to list instances for.
      */
    var ServiceId: ResourceId
  }
  
  trait ListInstancesResponse extends js.Object {
    /**
      * Summary information about the instances that are associated with the specified service.
      */
    var Instances: js.UndefOr[InstanceSummaryList] = js.undefined
    /**
      * If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListNamespacesRequest extends js.Object {
    /**
      * A complex type that contains specifications for the namespaces that you want to list. If you specify more than one filter, a namespace must match all filters to be returned by ListNamespaces.
      */
    var Filters: js.UndefOr[NamespaceFilters] = js.undefined
    /**
      * The maximum number of namespaces that you want AWS Cloud Map to return in the response to a ListNamespaces request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 namespaces.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListNamespaces request, omit this value. If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListNamespacesResponse extends js.Object {
    /**
      * An array that contains one NamespaceSummary object for each namespace that matches the specified filter criteria.
      */
    var Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined
    /**
      * If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListOperationsRequest extends js.Object {
    /**
      * A complex type that contains specifications for the operations that you want to list, for example, operations that you started between a specified start date and end date. If you specify more than one filter, an operation must match all filters to be returned by ListOperations.
      */
    var Filters: js.UndefOr[OperationFilters] = js.undefined
    /**
      * The maximum number of items that you want AWS Cloud Map to return in the response to a ListOperations request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 operations.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListOperations request, omit this value. If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListOperationsResponse extends js.Object {
    /**
      * If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Summary information about the operations that match the specified criteria.
      */
    var Operations: js.UndefOr[OperationSummaryList] = js.undefined
  }
  
  trait ListServicesRequest extends js.Object {
    /**
      * A complex type that contains specifications for the namespaces that you want to list services for.  If you specify more than one filter, an operation must match all filters to be returned by ListServices.
      */
    var Filters: js.UndefOr[ServiceFilters] = js.undefined
    /**
      * The maximum number of services that you want AWS Cloud Map to return in the response to a ListServices request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 services.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListServices request, omit this value. If the response contains NextToken, submit another ListServices request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults services and then filters them based on the specified criteria. It's possible that no services in the first MaxResults services matched the specified criteria but that subsequent groups of MaxResults services do contain services that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListServicesResponse extends js.Object {
    /**
      * If the response contains NextToken, submit another ListServices request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults services and then filters them based on the specified criteria. It's possible that no services in the first MaxResults services matched the specified criteria but that subsequent groups of MaxResults services do contain services that match the criteria. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array that contains one ServiceSummary object for each service that matches the specified filter criteria.
      */
    var Services: js.UndefOr[ServiceSummariesList] = js.undefined
  }
  
  trait Namespace extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing an operation twice. 
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The description that you specify for the namespace when you create it.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The ID of a namespace.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The name of the namespace, such as example.com.
      */
    var Name: js.UndefOr[NamespaceName] = js.undefined
    /**
      * A complex type that contains information that's specific to the type of the namespace.
      */
    var Properties: js.UndefOr[NamespaceProperties] = js.undefined
    /**
      * The number of services that are associated with the namespace.
      */
    var ServiceCount: js.UndefOr[ResourceCount] = js.undefined
    /**
      * The type of the namespace. Valid values are DNS_PUBLIC and DNS_PRIVATE.
      */
    var Type: js.UndefOr[NamespaceType] = js.undefined
  }
  
  trait NamespaceFilter extends js.Object {
    /**
      * The operator that you want to use to determine whether ListNamespaces returns a namespace. Valid values for condition include:    EQ: When you specify EQ for the condition, you can choose to list only public namespaces or private namespaces, but not both. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can choose to list public namespaces, private namespaces, or both.     BETWEEN: Not applicable  
      */
    var Condition: js.UndefOr[FilterCondition] = js.undefined
    /**
      * Specify TYPE.
      */
    var Name: NamespaceFilterName
    /**
      * If you specify EQ for Condition, specify either DNS_PUBLIC or DNS_PRIVATE. If you specify IN for Condition, you can specify DNS_PUBLIC, DNS_PRIVATE, or both.
      */
    var Values: FilterValues
  }
  
  trait NamespaceProperties extends js.Object {
    /**
      * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
      */
    var DnsProperties: js.UndefOr[DnsProperties] = js.undefined
    /**
      * A complex type that contains the name of an HTTP namespace.
      */
    var HttpProperties: js.UndefOr[HttpProperties] = js.undefined
  }
  
  trait NamespaceSummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The date and time that the namespace was created.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description for the namespace.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * The ID of the namespace.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted zone that has the same name as the namespace.
      */
    var Name: js.UndefOr[NamespaceName] = js.undefined
    var Properties: js.UndefOr[NamespaceProperties] = js.undefined
    /**
      * The number of services that were created using the namespace.
      */
    var ServiceCount: js.UndefOr[ResourceCount] = js.undefined
    /**
      * The type of the namespace, either public or private.
      */
    var Type: js.UndefOr[NamespaceType] = js.undefined
  }
  
  trait Operation extends js.Object {
    /**
      * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The code associated with ErrorMessage. Values for ErrorCode include the following:    ACCESS_DENIED     CANNOT_CREATE_HOSTED_ZONE     EXPIRED_TOKEN     HOSTED_ZONE_NOT_FOUND     INTERNAL_FAILURE     INVALID_CHANGE_BATCH     THROTTLED_REQUEST   
      */
    var ErrorCode: js.UndefOr[Code] = js.undefined
    /**
      * If the value of Status is FAIL, the reason that the operation failed.
      */
    var ErrorMessage: js.UndefOr[Message] = js.undefined
    /**
      * The ID of the operation that you want to get information about.
      */
    var Id: js.UndefOr[OperationId] = js.undefined
    /**
      * The status of the operation. Values include the following:    SUBMITTED: This is the initial state immediately after you submit a request.    PENDING: AWS Cloud Map is performing the operation.    SUCCESS: The operation succeeded.    FAIL: The operation failed. For the failure reason, see ErrorMessage.  
      */
    var Status: js.UndefOr[OperationStatus] = js.undefined
    /**
      * The name of the target entity that is associated with the operation:    NAMESPACE: The namespace ID is returned in the ResourceId property.    SERVICE: The service ID is returned in the ResourceId property.    INSTANCE: The instance ID is returned in the ResourceId property.  
      */
    var Targets: js.UndefOr[OperationTargetsMap] = js.undefined
    /**
      * The name of the operation that is associated with the specified ID.
      */
    var Type: js.UndefOr[OperationType] = js.undefined
    /**
      * The date and time that the value of Status changed to the current value, in Unix date/time format and Coordinated Universal Time (UTC). The value of UpdateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var UpdateDate: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait OperationFilter extends js.Object {
    /**
      * The operator that you want to use to determine whether an operation matches the specified value. Valid values for condition include:    EQ: When you specify EQ for the condition, you can specify only one value. EQ is supported for NAMESPACE_ID, SERVICE_ID, STATUS, and TYPE. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can specify a list of one or more values. IN is supported for STATUS and TYPE. An operation must match one of the specified values to be returned in the response.    BETWEEN: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value. BETWEEN is supported for UPDATE_DATE.   
      */
    var Condition: js.UndefOr[FilterCondition] = js.undefined
    /**
      * Specify the operations that you want to get:    NAMESPACE_ID: Gets operations related to specified namespaces.    SERVICE_ID: Gets operations related to specified services.    STATUS: Gets operations based on the status of the operations: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Gets specified types of operation.    UPDATE_DATE: Gets operations that changed status during a specified date/time range.   
      */
    var Name: OperationFilterName
    /**
      * Specify values that are applicable to the value that you specify for Name:     NAMESPACE_ID: Specify one namespace ID.    SERVICE_ID: Specify one service ID.    STATUS: Specify one or more statuses: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Specify one or more of the following types: CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, or DEREGISTER_INSTANCE.    UPDATE_DATE: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value.  
      */
    var Values: FilterValues
  }
  
  trait OperationSummary extends js.Object {
    /**
      * The ID for an operation.
      */
    var Id: js.UndefOr[OperationId] = js.undefined
    /**
      * The status of the operation. Values include the following:    SUBMITTED: This is the initial state immediately after you submit a request.    PENDING: AWS Cloud Map is performing the operation.    SUCCESS: The operation succeeded.    FAIL: The operation failed. For the failure reason, see ErrorMessage.  
      */
    var Status: js.UndefOr[OperationStatus] = js.undefined
  }
  
  trait OperationTargetsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ResourceId]
  
  trait RegisterInstanceRequest extends js.Object {
    /**
      * A string map that contains the following information for the service that you specify in ServiceId:   The attributes that apply to the records that are defined in the service.    For each attribute, the applicable value.   Supported attribute keys include the following:  AWS_ALIAS_DNS_NAME     If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about how to get the DNS name, see "DNSName" in the topic AliasTarget in the Route 53 API Reference. Note the following:   The configuration for the service that is specified by ServiceId must include settings for an A record, an AAAA record, or both.   In the service that is specified by ServiceId, the value of RoutingPolicy must be WEIGHTED.   If the service that is specified by ServiceId includes HealthCheckConfig settings, AWS Cloud Map will create the Route 53 health check, but it won't associate the health check with the alias record.   Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB load balancers.   If you specify a value for AWS_ALIAS_DNS_NAME, don't specify values for any of the AWS_INSTANCE attributes.    AWS_INIT_HEALTH_STATUS  If the service configuration includes HealthCheckCustomConfig, you can optionally use AWS_INIT_HEALTH_STATUS to specify the initial status of the custom health check, HEALTHY or UNHEALTHY. If you don't specify a value for AWS_INIT_HEALTH_STATUS, the initial status is HEALTHY.  AWS_INSTANCE_CNAME  If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in response to DNS queries, for example, example.com. This value is required if the service specified by ServiceId includes settings for an CNAME record.  AWS_INSTANCE_IPV4  If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response to DNS queries, for example, 192.0.2.44. This value is required if the service specified by ServiceId includes settings for an A record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_IPV6  If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in response to DNS queries, for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. This value is required if the service specified by ServiceId includes settings for an AAAA record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_PORT  If the service includes an SRV record, the value that you want Route 53 to return for the port. If the service includes HealthCheckConfig, the port on the endpoint that you want Route 53 to send requests to.  This value is required if you specified settings for an SRV record when you created the service.  Custom attributes  You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name is 255 characters, and the maximum length of the attribute value is 1,024 characters. 
      */
    var Attributes: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.Attributes
    /**
      * A unique string that identifies the request and that allows failed RegisterInstance requests to be retried without the risk of executing the operation twice. You must use a unique CreatorRequestId string every time you submit a RegisterInstance request if you're registering additional instances for the same namespace and service. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * An identifier that you want to associate with the instance. Note the following:   If the service that is specified by ServiceId includes settings for an SRV record, the value of InstanceId is automatically included as part of the value for the SRV record. For more information, see DnsRecord$Type.   You can use this value to update an existing instance.   To register a new instance, you must specify a value that is unique among instances that you register by using the same service.    If you specify an existing InstanceId and ServiceId, AWS Cloud Map updates the existing DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old health check and creates a new one.   The health check isn't deleted immediately, so it will still appear for a while if you submit a ListHealthChecks request, for example.   
      */
    var InstanceId: ResourceId
    /**
      * The ID of the service that you want to use for settings for the instance.
      */
    var ServiceId: ResourceId
  }
  
  trait RegisterInstanceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait Service extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The date and time that the service was created, in Unix format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
      */
    var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The description of the service.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
      */
    var DnsConfig: js.UndefOr[DnsConfig] = js.undefined
    /**
      *  Public DNS namespaces only. A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in DnsConfig. For information about the charges for health checks, see Amazon Route 53 Pricing.
      */
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    /**
      * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
      */
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined
    /**
      * The ID that AWS Cloud Map assigned to the service when you created it.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count.
      */
    var InstanceCount: js.UndefOr[ResourceCount] = js.undefined
    /**
      * The name of the service.
      */
    var Name: js.UndefOr[ServiceName] = js.undefined
    /**
      * The ID of the namespace that was used to create the service.
      */
    var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait ServiceChange extends js.Object {
    /**
      * A description for the service.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    /**
      * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
      */
    var DnsConfig: DnsConfigChange
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
  }
  
  trait ServiceFilter extends js.Object {
    /**
      * The operator that you want to use to determine whether a service is returned by ListServices. Valid values for Condition include the following:    EQ: When you specify EQ, specify one namespace ID for Values. EQ is the default condition and can be omitted.    IN: When you specify IN, specify a list of the IDs for the namespaces that you want ListServices to return a list of services for.    BETWEEN: Not applicable.  
      */
    var Condition: js.UndefOr[FilterCondition] = js.undefined
    /**
      * Specify NAMESPACE_ID.
      */
    var Name: ServiceFilterName
    /**
      * The values that are applicable to the value that you specify for Condition to filter the list of services.
      */
    var Values: FilterValues
  }
  
  trait ServiceSummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The date and time that the service was created.
      */
    var CreateDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description that you specify when you create the service.
      */
    var Description: js.UndefOr[ResourceDescription] = js.undefined
    var DnsConfig: js.UndefOr[DnsConfig] = js.undefined
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined
    /**
      * The ID that AWS Cloud Map assigned to the service when you created it.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count.
      */
    var InstanceCount: js.UndefOr[ResourceCount] = js.undefined
    /**
      * The name of the service.
      */
    var Name: js.UndefOr[ServiceName] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS.  For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createHttpNamespace(): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHttpNamespace(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHttpNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS.  For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createHttpNamespace(params: CreateHttpNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHttpNamespace(
      params: CreateHttpNamespaceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHttpNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createPrivateDnsNamespace(): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPrivateDnsNamespace(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePrivateDnsNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPrivateDnsNamespace(
      params: CreatePrivateDnsNamespaceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePrivateDnsNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createPublicDnsNamespace(): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPublicDnsNamespace(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePublicDnsNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPublicDnsNamespace(
      params: CreatePublicDnsNamespaceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePublicDnsNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a service, which defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:   A   AAAA   A and AAAA   SRV   CNAME     Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and AWS Cloud Map uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createService(): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a service, which defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:   A   AAAA   A and AAAA   SRV   CNAME     Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and AWS Cloud Map uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def createService(params: CreateServiceRequest): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createService(
      params: CreateServiceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
      */
    def deleteNamespace(): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNamespace(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
      */
    def deleteNamespace(params: DeleteNamespaceRequest): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteNamespace(
      params: DeleteNamespaceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
      */
    def deleteService(): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
      */
    def deleteService(params: DeleteServiceRequest): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteService(
      params: DeleteServiceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified instance.
      */
    def deregisterInstance(): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified instance.
      */
    def deregisterInstance(params: DeregisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstance(
      params: DeregisterInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Discovers registered instances for a specified namespace and service.
      */
    def discoverInstances(): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def discoverInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DiscoverInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Discovers registered instances for a specified namespace and service.
      */
    def discoverInstances(params: DiscoverInstancesRequest): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def discoverInstances(
      params: DiscoverInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DiscoverInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified instance.
      */
    def getInstance(): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified instance.
      */
    def getInstance(params: GetInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstance(
      params: GetInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
      */
    def getInstancesHealthStatus(): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstancesHealthStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstancesHealthStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
      */
    def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstancesHealthStatus(
      params: GetInstancesHealthStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstancesHealthStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a namespace.
      */
    def getNamespace(): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNamespace(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a namespace.
      */
    def getNamespace(params: GetNamespaceRequest): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getNamespace(
      params: GetNamespaceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetNamespaceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
      */
    def getOperation(): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOperation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOperationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
      */
    def getOperation(params: GetOperationRequest): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOperation(
      params: GetOperationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOperationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the settings for a specified service.
      */
    def getService(): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the settings for a specified service.
      */
    def getService(params: GetServiceRequest): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getService(
      params: GetServiceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information about the instances that you registered by using a specified service.
      */
    def listInstances(): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information about the instances that you registered by using a specified service.
      */
    def listInstances(params: ListInstancesRequest): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstances(
      params: ListInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information about the namespaces that were created by the current AWS account.
      */
    def listNamespaces(): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listNamespaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamespacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information about the namespaces that were created by the current AWS account.
      */
    def listNamespaces(params: ListNamespacesRequest): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listNamespaces(
      params: ListNamespacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNamespacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists operations that match the criteria that you specify.
      */
    def listOperations(): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOperations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOperationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists operations that match the criteria that you specify.
      */
    def listOperations(params: ListOperationsRequest): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOperations(
      params: ListOperationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOperationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information for all the services that are associated with one or more specified namespaces.
      */
    def listServices(): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists summary information for all the services that are associated with one or more specified namespaces.
      */
    def listServices(params: ListServicesRequest): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServices(
      params: ListServicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that is specified by ServiceId, a record is created or updated in the hosted zone that is associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def registerInstance(): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that is specified by ServiceId, a record is created or updated in the hosted zone that is associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
      */
    def registerInstance(params: RegisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstance(
      params: RegisterInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
      */
    def updateInstanceCustomHealthStatus(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInstanceCustomHealthStatus(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
      */
    def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInstanceCustomHealthStatus(
      params: UpdateInstanceCustomHealthStatusRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   For public and private DNS namespaces, you must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
      */
    def updateService(): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   For public and private DNS namespaces, you must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
      */
    def updateService(params: UpdateServiceRequest): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateService(
      params: UpdateServiceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServiceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
    /**
      * The ID of the instance that you want to change the health status for.
      */
    var InstanceId: ResourceId
    /**
      * The ID of the service that includes the configuration for the custom health check that you want to change the status for.
      */
    var ServiceId: ResourceId
    /**
      * The new status of the instance, HEALTHY or UNHEALTHY.
      */
    var Status: CustomHealthStatus
  }
  
  trait UpdateServiceRequest extends js.Object {
    /**
      * The ID of the service that you want to update.
      */
    var Id: ResourceId
    /**
      * A complex type that contains the new settings for the service.
      */
    var Service: ServiceChange
  }
  
  trait UpdateServiceResponse extends js.Object {
    /**
      * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
      */
    var OperationId: js.UndefOr[OperationId] = js.undefined
  }
  
  trait _CustomHealthStatus extends js.Object
  
  trait _FilterCondition extends js.Object
  
  trait _HealthCheckType extends js.Object
  
  trait _HealthStatus extends js.Object
  
  trait _HealthStatusFilter extends js.Object
  
  trait _NamespaceType extends js.Object
  
  trait _OperationFilterName extends js.Object
  
  trait _OperationStatus extends js.Object
  
  trait _OperationTargetType extends js.Object
  
  trait _OperationType extends js.Object
  
  trait _RecordType extends js.Object
  
  trait _RoutingPolicy extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type AttrKey = java.lang.String
  type AttrValue = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Code = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - java.lang.String
  */
  type CustomHealthStatus = _CustomHealthStatus | java.lang.String
  type DnsRecordList = js.Array[DnsRecord]
  type FailureThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQ
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.BETWEEN
    - java.lang.String
  */
  type FilterCondition = _FilterCondition | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - java.lang.String
  */
  type HealthCheckType = _HealthCheckType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = _HealthStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type HealthStatusFilter = _HealthStatusFilter | java.lang.String
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceIdList = js.Array[ResourceId]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NamespaceFilterName = awsDashSdkLib.awsDashSdkLibStrings.TYPE | java.lang.String
  type NamespaceFilters = js.Array[NamespaceFilter]
  type NamespaceName = java.lang.String
  type NamespaceSummariesList = js.Array[NamespaceSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DNS_PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.DNS_PRIVATE
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - java.lang.String
  */
  type NamespaceType = _NamespaceType | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_DATE
    - java.lang.String
  */
  type OperationFilterName = _OperationFilterName | java.lang.String
  type OperationFilters = js.Array[OperationFilter]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAIL
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE
    - java.lang.String
  */
  type OperationTargetType = _OperationTargetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTER_INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTER_INSTANCE
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type RecordTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SRV
    - awsDashSdkLib.awsDashSdkLibStrings.A
    - awsDashSdkLib.awsDashSdkLibStrings.AAAA
    - awsDashSdkLib.awsDashSdkLibStrings.CNAME
    - java.lang.String
  */
  type RecordType = _RecordType | java.lang.String
  type ResourceCount = scala.Double
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MULTIVALUE
    - awsDashSdkLib.awsDashSdkLibStrings.WEIGHTED
    - java.lang.String
  */
  type RoutingPolicy = _RoutingPolicy | java.lang.String
  type ServiceFilterName = awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE_ID | java.lang.String
  type ServiceFilters = js.Array[ServiceFilter]
  type ServiceName = java.lang.String
  type ServiceSummariesList = js.Array[ServiceSummary]
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-03-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

