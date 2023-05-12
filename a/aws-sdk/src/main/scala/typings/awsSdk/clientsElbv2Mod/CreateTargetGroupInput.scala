package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetGroupInput extends StObject {
  
  /**
    * Indicates whether health checks are enabled. If the target type is lambda, health checks are disabled by default but can be enabled. If the target type is instance, ip, or alb, health checks are always enabled and cannot be disabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.clientsElbv2Mod.HealthCheckEnabled] = js.undefined
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If the target type is lambda, the default is 35 seconds.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.clientsElbv2Mod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * [HTTP/HTTPS health checks] The destination for health checks on the targets. [HTTP1 or HTTP2 protocol version] The ping path. The default is /. [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The default is /Amazon Web Services.ALB/healthcheck.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.undefined
  
  /**
    * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is traffic-port, which is the port on which each target receives traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.clientsElbv2Mod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * The amount of time, in seconds, during which no response from a target means a failed health check. The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6 seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is lambda, the default is 30 seconds.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.clientsElbv2Mod.HealthCheckTimeoutSeconds] = js.undefined
  
  /**
    * The number of consecutive health check successes required before considering a target healthy. The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type is lambda, the default is 5.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  
  /**
    * The type of IP address used for this target group. The possible values are ipv4 and ipv6. This is an optional parameter. If not specified, the IP address type defaults to ipv4.
    */
  var IpAddressType: js.UndefOr[TargetGroupIpAddressTypeEnum] = js.undefined
  
  /**
    * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target. For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a protocol of GENEVE, the range is 200-399.
    */
  var Matcher: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Matcher] = js.undefined
  
  /**
    * The name of the target group. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
    */
  var Name: TargetGroupName
  
  /**
    * The port on which the targets receive traffic. This port is used unless you specify a port override when registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the supported port is 6081.
    */
  var Port: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Port] = js.undefined
  
  /**
    * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTP/HTTPS protocol] The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1.
    */
  var ProtocolVersion: js.UndefOr[typings.awsSdk.clientsElbv2Mod.ProtocolVersion] = js.undefined
  
  /**
    * The tags to assign to the target group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of target that you must specify when registering targets with this target group. You can't specify targets for a target group using more than one target type.    instance - Register targets by instance ID. This is the default value.    ip - Register targets by IP address. You can specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.    lambda - Register a single Lambda function as a target.    alb - Register a single Application Load Balancer as a target.  
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.undefined
  
  /**
    * The number of consecutive health check failures required before considering a target unhealthy. The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type is lambda, the default is 5.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  
  /**
    * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter is required.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.VpcId] = js.undefined
}
object CreateTargetGroupInput {
  
  inline def apply(Name: TargetGroupName): CreateTargetGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTargetGroupInput] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckEnabled(value: HealthCheckEnabled): Self = StObject.set(x, "HealthCheckEnabled", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckEnabledUndefined: Self = StObject.set(x, "HealthCheckEnabled", js.undefined)
    
    inline def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    inline def setHealthCheckPath(value: Path): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    inline def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    inline def setHealthCheckProtocol(value: ProtocolEnum): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    inline def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = StObject.set(x, "HealthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTimeoutSecondsUndefined: Self = StObject.set(x, "HealthCheckTimeoutSeconds", js.undefined)
    
    inline def setHealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "HealthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdCountUndefined: Self = StObject.set(x, "HealthyThresholdCount", js.undefined)
    
    inline def setIpAddressType(value: TargetGroupIpAddressTypeEnum): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setMatcher(value: Matcher): Self = StObject.set(x, "Matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherUndefined: Self = StObject.set(x, "Matcher", js.undefined)
    
    inline def setName(value: TargetGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: ProtocolEnum): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setProtocolVersion(value: ProtocolVersion): Self = StObject.set(x, "ProtocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "ProtocolVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetType(value: TargetTypeEnum): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    inline def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdCountUndefined: Self = StObject.set(x, "UnhealthyThresholdCount", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
