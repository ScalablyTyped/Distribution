package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accelerator extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to an accelerator's static IPv4 addresses. The naming convention for the DNS name for an accelerator is the following: A lowercase letter a, followed by a 16-bit random hex string, followed by .awsglobalaccelerator.com. For example: a1234567890abcdef.awsglobalaccelerator.com. If you have a dual-stack accelerator, you also have a second DNS name, DualStackDnsName, that points to both the A record and the AAAA record for all four static addresses for the accelerator: two IPv4 addresses and two IPv6 addresses. For more information about the default DNS name, see  Support for DNS addressing in Global Accelerator in the Global Accelerator Developer Guide.
    */
  var DnsName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to a dual-stack accelerator's four static IP addresses: two IPv4 addresses and two IPv6 addresses. The naming convention for the dual-stack DNS name is the following: A lowercase letter a, followed by a 16-bit random hex string, followed by .dualstack.awsglobalaccelerator.com. For example: a1234567890abcdef.dualstack.awsglobalaccelerator.com. Note: Global Accelerator also assigns a default DNS name, DnsName, to your accelerator that points just to the static IPv4 addresses.  For more information, see  Support for DNS addressing in Global Accelerator in the Global Accelerator Developer Guide.
    */
  var DualStackDnsName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * A history of changes that you make to an accelerator in Global Accelerator.
    */
  var Events: js.UndefOr[AcceleratorEvents] = js.undefined
  
  /**
    * The IP address type that an accelerator supports. For a standard accelerator, the value can be IPV4 or DUAL_STACK.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.IpAddressType] = js.undefined
  
  /**
    * The static IP addresses that Global Accelerator associates with the accelerator.
    */
  var IpSets: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.IpSets] = js.undefined
  
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the accelerator. The name must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.undefined
}
object Accelerator {
  
  inline def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accelerator] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorArnUndefined: Self = StObject.set(x, "AcceleratorArn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDnsName(value: GenericString): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setDualStackDnsName(value: GenericString): Self = StObject.set(x, "DualStackDnsName", value.asInstanceOf[js.Any])
    
    inline def setDualStackDnsNameUndefined: Self = StObject.set(x, "DualStackDnsName", js.undefined)
    
    inline def setEnabled(value: GenericBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEvents(value: AcceleratorEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: AcceleratorEvent*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setIpSets(value: IpSets): Self = StObject.set(x, "IpSets", value.asInstanceOf[js.Any])
    
    inline def setIpSetsUndefined: Self = StObject.set(x, "IpSets", js.undefined)
    
    inline def setIpSetsVarargs(value: IpSet*): Self = StObject.set(x, "IpSets", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: GenericString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: AcceleratorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
