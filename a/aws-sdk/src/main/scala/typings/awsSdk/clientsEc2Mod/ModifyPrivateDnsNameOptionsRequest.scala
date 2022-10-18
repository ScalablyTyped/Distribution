package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyPrivateDnsNameOptionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
    */
  var EnableResourceNameDnsAAAARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
    */
  var EnableResourceNameDnsARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceId] = js.undefined
  
  /**
    * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
    */
  var PrivateDnsHostnameType: js.UndefOr[HostnameType] = js.undefined
}
object ModifyPrivateDnsNameOptionsRequest {
  
  inline def apply(): ModifyPrivateDnsNameOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyPrivateDnsNameOptionsRequest]
  }
  
  extension [Self <: ModifyPrivateDnsNameOptionsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEnableResourceNameDnsAAAARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsAAAARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", js.undefined)
    
    inline def setEnableResourceNameDnsARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsARecord", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setPrivateDnsHostnameType(value: HostnameType): Self = StObject.set(x, "PrivateDnsHostnameType", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsHostnameTypeUndefined: Self = StObject.set(x, "PrivateDnsHostnameType", js.undefined)
  }
}
