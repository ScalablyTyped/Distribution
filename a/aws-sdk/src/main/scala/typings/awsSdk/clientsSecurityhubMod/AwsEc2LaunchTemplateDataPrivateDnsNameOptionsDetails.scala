package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails extends StObject {
  
  /**
    *  Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records. 
    */
  var EnableResourceNameDnsAAAARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates whether to respond to DNS queries for instance hostnames with DNS A records. 
    */
  var EnableResourceNameDnsARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The type of hostname for EC2 instances. 
    */
  var HostnameType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setEnableResourceNameDnsAAAARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsAAAARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", js.undefined)
    
    inline def setEnableResourceNameDnsARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsARecord", js.undefined)
    
    inline def setHostnameType(value: NonEmptyString): Self = StObject.set(x, "HostnameType", value.asInstanceOf[js.Any])
    
    inline def setHostnameTypeUndefined: Self = StObject.set(x, "HostnameType", js.undefined)
  }
}
