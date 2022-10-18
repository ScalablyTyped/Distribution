package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRecord extends StObject {
  
  /**
    * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.  Alias records don't include a TTL because Route 53 uses the TTL for the Amazon Web Services resource that an alias record routes traffic to. If you include the AWS_ALIAS_DNS_NAME attribute when you submit a RegisterInstance request, the TTL value is ignored. Always specify a TTL for the service; you can use a service to register instances that create either alias or non-alias records. 
    */
  var TTL: RecordTTL
  
  /**
    * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries. You can specify values for Type in the following combinations:     A       AAAA       A  and  AAAA       SRV       CNAME     If you want Cloud Map to create a Route 53 alias record when you register an instance, specify A or AAAA for Type. You specify other settings, such as the IP address for A and AAAA records, when you register an instance. For more information, see RegisterInstance. The following values are supported:  A  Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.  AAAA  Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.  CNAME  Route 53 returns the domain name of the resource, such as www.example.com. Note the following:   You specify the domain name that you want to route traffic to when you register an instance. For more information, see Attributes in the topic RegisterInstance.   You must specify WEIGHTED for the value of RoutingPolicy.   You can't specify both CNAME for Type and settings for HealthCheckConfig. If you do, the request will fail with an InvalidInput error.    SRV  Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:  priority weight port service-hostname  Note the following about the values:   The values of priority and weight are both set to 1 and can't be changed.    The value of port comes from the value that you specify for the AWS_INSTANCE_PORT attribute when you submit a RegisterInstance request.   The value of service-hostname is a concatenation of the following values:   The value that you specify for InstanceId when you register an instance.   The name of the service.   The name of the namespace.    For example, if the value of InstanceId is test, the name of the service is backend, and the name of the namespace is example.com, the value of service-hostname is the following:  test.backend.example.com    If you specify settings for an SRV record, note the following:   If you specify values for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both in the RegisterInstance request, Cloud Map automatically creates A and/or AAAA records that have the same name as the value of service-hostname in the SRV record. You can ignore these records.   If you're using a system that requires a specific SRV format, such as HAProxy, see the Name element in the documentation about CreateService for information about how to specify the correct name format.    
    */
  var Type: RecordType
}
object DnsRecord {
  
  inline def apply(TTL: RecordTTL, Type: RecordType): DnsRecord = {
    val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsRecord]
  }
  
  extension [Self <: DnsRecord](x: Self) {
    
    inline def setTTL(value: RecordTTL): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
    
    inline def setType(value: RecordType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
