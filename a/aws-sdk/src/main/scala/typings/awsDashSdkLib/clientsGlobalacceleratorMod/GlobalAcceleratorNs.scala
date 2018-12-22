package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/globalaccelerator", "GlobalAccelerator")
@js.native
object GlobalAcceleratorNs extends js.Object {
  
  trait Accelerator extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator.
         */
    var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
    /**
         * The date and time that the accelerator was created.
         */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
         */
    var Enabled: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The value for the address type must be IPv4. 
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    /**
         * IP address set associated with the accelerator.
         */
    var IpSets: js.UndefOr[IpSets] = js.undefined
    /**
         * The date and time that the accelerator was last modified.
         */
    var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
         */
    var Name: js.UndefOr[GenericString] = js.undefined
    /**
         * Describes the deployment status of the accelerator.
         */
    var Status: js.UndefOr[AcceleratorStatus] = js.undefined
  }
  
  
  trait AcceleratorAttributes extends js.Object {
    /**
         * Indicates whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
         */
    var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
         */
    var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined
    /**
         * The prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. If you don’t specify a prefix, the flow logs are stored in the root of the bucket.
         */
    var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAcceleratorRequest extends js.Object {
    /**
         * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
         */
    var Enabled: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The value for the address type must be IPv4. 
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    /**
         * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
         */
    var Name: GenericString
  }
  
  
  trait CreateAcceleratorResponse extends js.Object {
    /**
         * The accelerator that is created by specifying a listener and the supported IP address types.
         */
    var Accelerator: js.UndefOr[Accelerator] = js.undefined
  }
  
  
  trait CreateEndpointGroupRequest extends js.Object {
    /**
         * The list of endpoint objects.
         */
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined
    /**
         * The name of the AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
         */
    var EndpointGroupRegion: GenericString
    /**
         * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
         */
    var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
    /**
         * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
         */
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined
    /**
         * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: GenericString
    /**
         * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
         */
    var ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined
    /**
         * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
         */
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
  }
  
  
  trait CreateEndpointGroupResponse extends js.Object {
    /**
         * The information about the endpoint group that was created.
         */
    var EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
  }
  
  
  trait CreateListenerRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of your accelerator.
         */
    var AcceleratorArn: GenericString
    /**
         * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
         */
    var ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    /**
         * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
         */
    var IdempotencyToken: IdempotencyToken
    /**
         * The list of port ranges to support for connections from clients to your accelerator.
         */
    var PortRanges: PortRanges
    /**
         * The protocol for connections from clients to your accelerator.
         */
    var Protocol: Protocol
  }
  
  
  trait CreateListenerResponse extends js.Object {
    /**
         * The listener that you've created.
         */
    var Listener: js.UndefOr[Listener] = js.undefined
  }
  
  
  trait DeleteAcceleratorRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of an accelerator.
         */
    var AcceleratorArn: GenericString
  }
  
  
  trait DeleteEndpointGroupRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the endpoint group to delete.
         */
    var EndpointGroupArn: GenericString
  }
  
  
  trait DeleteListenerRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: GenericString
  }
  
  
  trait DescribeAcceleratorAttributesRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is required.
         */
    var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait DescribeAcceleratorAttributesResponse extends js.Object {
    /**
         * The attributes of the accelerator.
         */
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
  }
  
  
  trait DescribeAcceleratorRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator to describe.
         */
    var AcceleratorArn: GenericString
  }
  
  
  trait DescribeAcceleratorResponse extends js.Object {
    /**
         * The description of the accelerator.
         */
    var Accelerator: js.UndefOr[Accelerator] = js.undefined
  }
  
  
  trait DescribeEndpointGroupRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the endpoint group to describe.
         */
    var EndpointGroupArn: GenericString
  }
  
  
  trait DescribeEndpointGroupResponse extends js.Object {
    /**
         * The description of an endpoint group.
         */
    var EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
  }
  
  
  trait DescribeListenerRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the listener to describe.
         */
    var ListenerArn: GenericString
  }
  
  
  trait DescribeListenerResponse extends js.Object {
    /**
         * The description of a listener.
         */
    var Listener: js.UndefOr[Listener] = js.undefined
  }
  
  
  trait EndpointConfiguration extends js.Object {
    /**
         * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
         */
    var EndpointId: js.UndefOr[GenericString] = js.undefined
    /**
         * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide.
         */
    var Weight: js.UndefOr[EndpointWeight] = js.undefined
  }
  
  
  trait EndpointDescription extends js.Object {
    /**
         * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
         */
    var EndpointId: js.UndefOr[GenericString] = js.undefined
    /**
         * The reason code associated with why the endpoint is not healthy. If the endpoint state is healthy, a reason code is not provided. If the endpoint state is unhealthy, the reason code can be one of the following values:    Timeout: The health check requests to the endpoint are timing out before returning a status.    Failed: The health check failed, for example because the endpoint response was invalid (malformed).   If the endpoint state is initial, the reason code can be one of the following values:    ProvisioningInProgress: The endpoint is in the process of being provisioned.    InitialHealthChecking: Global Accelerator is still setting up the minimum number of health checks for the endpoint that are required to determine its health status.  
         */
    var HealthReason: js.UndefOr[GenericString] = js.undefined
    /**
         * The health status of the endpoint.
         */
    var HealthState: js.UndefOr[HealthState] = js.undefined
    /**
         * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide. 
         */
    var Weight: js.UndefOr[EndpointWeight] = js.undefined
  }
  
  
  trait EndpointGroup extends js.Object {
    /**
         * The list of endpoint objects.
         */
    var EndpointDescriptions: js.UndefOr[EndpointDescriptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the endpoint group.
         */
    var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region that this endpoint group belongs.
         */
    var EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined
    /**
         * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the destination on the endpoints for health checks. The default is slash (/).
         */
    var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
    /**
         * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.  The default port is the port for the listener that this endpoint group is associated with. If the listener port is a list, Global Accelerator uses the first specified port in the list of ports.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group. The default value is TCP.
         */
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined
    /**
         * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
         */
    var ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined
    /**
         * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
         */
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
  }
  
  
  trait IpSet extends js.Object {
    /**
         * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
         */
    var IpAddresses: js.UndefOr[IpAddresses] = js.undefined
    /**
         * The types of IP addresses included in this IP set.
         */
    var IpFamily: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListAcceleratorsRequest extends js.Object {
    /**
         * The number of Global Accelerator objects that you want to return with this call. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListAcceleratorsResponse extends js.Object {
    /**
         * The list of accelerators for a customer account.
         */
    var Accelerators: js.UndefOr[Accelerators] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListEndpointGroupsRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: GenericString
    /**
         * The number of endpoint group objects that you want to return with this call. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListEndpointGroupsResponse extends js.Object {
    /**
         * The list of the endpoint groups associated with a listener.
         */
    var EndpointGroups: js.UndefOr[EndpointGroups] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListListenersRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator for which you want to list listener objects.
         */
    var AcceleratorArn: GenericString
    /**
         * The number of listener objects that you want to return with this call. The default value is 10.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ListListenersResponse extends js.Object {
    /**
         * The list of listeners for an accelerator.
         */
    var Listeners: js.UndefOr[Listeners] = js.undefined
    /**
         * The token for the next set of results. You receive this token from a previous call.
         */
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait Listener extends js.Object {
    /**
         * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
         */
    var ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the listener.
         */
    var ListenerArn: js.UndefOr[GenericString] = js.undefined
    /**
         * The list of port ranges for the connections from clients to the accelerator.
         */
    var PortRanges: js.UndefOr[PortRanges] = js.undefined
    /**
         * The protocol for the connections from clients to the accelerator.
         */
    var Protocol: js.UndefOr[Protocol] = js.undefined
  }
  
  
  trait PortRange extends js.Object {
    /**
         * The first port in the range of ports, inclusive.
         */
    var FromPort: js.UndefOr[PortNumber] = js.undefined
    /**
         * The last port in the range of ports, inclusive.
         */
    var ToPort: js.UndefOr[PortNumber] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
       */
    def createAccelerator(): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
       */
    def createAccelerator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
       */
    def createAccelerator(params: CreateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
       */
    def createAccelerator(
      params: CreateAcceleratorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
       */
    def createEndpointGroup(): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
       */
    def createEndpointGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
       */
    def createEndpointGroup(params: CreateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
       */
    def createEndpointGroup(
      params: CreateEndpointGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
       */
    def createListener(): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
       */
    def createListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
       */
    def createListener(params: CreateListenerRequest): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
       */
    def createListener(
      params: CreateListenerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
       */
    def deleteAccelerator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
       */
    def deleteAccelerator(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
       */
    def deleteAccelerator(params: DeleteAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
       */
    def deleteAccelerator(
      params: DeleteAcceleratorRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an endpoint group from a listener.
       */
    def deleteEndpointGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an endpoint group from a listener.
       */
    def deleteEndpointGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an endpoint group from a listener.
       */
    def deleteEndpointGroup(params: DeleteEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete an endpoint group from a listener.
       */
    def deleteEndpointGroup(
      params: DeleteEndpointGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete a listener from an accelerator.
       */
    def deleteListener(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete a listener from an accelerator.
       */
    def deleteListener(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete a listener from an accelerator.
       */
    def deleteListener(params: DeleteListenerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Delete a listener from an accelerator.
       */
    def deleteListener(
      params: DeleteListenerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
       */
    def describeAccelerator(): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
       */
    def describeAccelerator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
       */
    def describeAccelerator(params: DescribeAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
       */
    def describeAccelerator(
      params: DescribeAcceleratorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe the attributes of an accelerator.
       */
    def describeAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe the attributes of an accelerator.
       */
    def describeAcceleratorAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAcceleratorAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe the attributes of an accelerator.
       */
    def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe the attributes of an accelerator.
       */
    def describeAcceleratorAttributes(
      params: DescribeAcceleratorAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAcceleratorAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an endpoint group.
       */
    def describeEndpointGroup(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an endpoint group.
       */
    def describeEndpointGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an endpoint group.
       */
    def describeEndpointGroup(params: DescribeEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an endpoint group.
       */
    def describeEndpointGroup(
      params: DescribeEndpointGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a listener.
       */
    def describeListener(): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a listener.
       */
    def describeListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a listener.
       */
    def describeListener(params: DescribeListenerRequest): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a listener.
       */
    def describeListener(
      params: DescribeListenerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the accelerators for an AWS account.
       */
    def listAccelerators(): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the accelerators for an AWS account.
       */
    def listAccelerators(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAcceleratorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the accelerators for an AWS account.
       */
    def listAccelerators(params: ListAcceleratorsRequest): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the accelerators for an AWS account.
       */
    def listAccelerators(
      params: ListAcceleratorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAcceleratorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the endpoint groups that are associated with a listener.
       */
    def listEndpointGroups(): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the endpoint groups that are associated with a listener.
       */
    def listEndpointGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEndpointGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the endpoint groups that are associated with a listener.
       */
    def listEndpointGroups(params: ListEndpointGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the endpoint groups that are associated with a listener.
       */
    def listEndpointGroups(
      params: ListEndpointGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEndpointGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the listeners for an accelerator.
       */
    def listListeners(): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the listeners for an accelerator.
       */
    def listListeners(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListListenersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the listeners for an accelerator.
       */
    def listListeners(params: ListListenersRequest): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the listeners for an accelerator.
       */
    def listListeners(
      params: ListListenersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListListenersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an accelerator.
       */
    def updateAccelerator(): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an accelerator.
       */
    def updateAccelerator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an accelerator.
       */
    def updateAccelerator(params: UpdateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an accelerator.
       */
    def updateAccelerator(
      params: UpdateAcceleratorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAcceleratorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
       */
    def updateAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
       */
    def updateAcceleratorAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAcceleratorAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
       */
    def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
       */
    def updateAcceleratorAttributes(
      params: UpdateAcceleratorAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAcceleratorAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
       */
    def updateEndpointGroup(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
       */
    def updateEndpointGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
       */
    def updateEndpointGroup(params: UpdateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
       */
    def updateEndpointGroup(
      params: UpdateEndpointGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update a listener.
       */
    def updateListener(): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update a listener.
       */
    def updateListener(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update a listener.
       */
    def updateListener(params: UpdateListenerRequest): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Update a listener.
       */
    def updateListener(
      params: UpdateListenerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateListenerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateAcceleratorAttributesRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator that you want to update. Attribute is required.
         */
    var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
    /**
         * Update whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
         */
    var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
         */
    var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined
    /**
         * Update the prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. If you don’t specify a prefix, the flow logs are stored in the root of the bucket.
         */
    var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait UpdateAcceleratorAttributesResponse extends js.Object {
    /**
         * Updated attributes for the accelerator.
         */
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
  }
  
  
  trait UpdateAcceleratorRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the accelerator to update.
         */
    var AcceleratorArn: GenericString
    /**
         * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, the accelerator can be deleted.
         */
    var Enabled: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The value for the address type must be IPv4. 
         */
    var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    /**
         * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
         */
    var Name: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait UpdateAcceleratorResponse extends js.Object {
    /**
         * Information about the updated accelerator.
         */
    var Accelerator: js.UndefOr[Accelerator] = js.undefined
  }
  
  
  trait UpdateEndpointGroupRequest extends js.Object {
    /**
         * The list of endpoint objects.
         */
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the endpoint group.
         */
    var EndpointGroupArn: GenericString
    /**
         * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
         */
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
    /**
         * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
         */
    var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
    /**
         * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If the listener port is a list of ports, Global Accelerator uses the first port in the list.
         */
    var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
    /**
         * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
         */
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined
    /**
         * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
         */
    var ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined
    /**
         * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
         */
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
  }
  
  
  trait UpdateEndpointGroupResponse extends js.Object {
    /**
         * The information about the endpoint group that was updated.
         */
    var EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
  }
  
  
  trait UpdateListenerRequest extends js.Object {
    /**
         * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
         */
    var ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the listener to update.
         */
    var ListenerArn: GenericString
    /**
         * The updated list of port ranges for the connections from clients to the accelerator.
         */
    var PortRanges: js.UndefOr[PortRanges] = js.undefined
    /**
         * The updated protocol for the connections from clients to the accelerator.
         */
    var Protocol: js.UndefOr[Protocol] = js.undefined
  }
  
  
  trait UpdateListenerResponse extends js.Object {
    /**
         * Information for the updated listener.
         */
    var Listener: js.UndefOr[Listener] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AcceleratorStatus = awsDashSdkLib.awsDashSdkLibStrings.DEPLOYED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | java.lang.String
  type Accelerators = js.Array[Accelerator]
  type ClientAffinity = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SOURCE_IP | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EndpointConfigurations = js.Array[EndpointConfiguration]
  type EndpointDescriptions = js.Array[EndpointDescription]
  type EndpointGroups = js.Array[EndpointGroup]
  type EndpointWeight = scala.Double
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = scala.Double
  type HealthCheckProtocol = awsDashSdkLib.awsDashSdkLibStrings.TCP | awsDashSdkLib.awsDashSdkLibStrings.HTTP | awsDashSdkLib.awsDashSdkLibStrings.HTTPS | java.lang.String
  type HealthState = awsDashSdkLib.awsDashSdkLibStrings.INITIAL | awsDashSdkLib.awsDashSdkLibStrings.HEALTHY | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | java.lang.String
  type IdempotencyToken = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = awsDashSdkLib.awsDashSdkLibStrings.IPV4 | java.lang.String
  type IpAddresses = js.Array[IpAddress]
  type IpSets = js.Array[IpSet]
  type Listeners = js.Array[Listener]
  type MaxResults = scala.Double
  type PortNumber = scala.Double
  type PortRanges = js.Array[PortRange]
  type Protocol = awsDashSdkLib.awsDashSdkLibStrings.TCP | awsDashSdkLib.awsDashSdkLibStrings.UDP | java.lang.String
  type ThresholdCount = scala.Double
  type Timestamp = stdLib.Date
  type TrafficDialPercentage = scala.Double
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-08-08` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

