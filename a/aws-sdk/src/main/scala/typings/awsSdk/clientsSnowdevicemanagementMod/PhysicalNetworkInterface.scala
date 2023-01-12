package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalNetworkInterface extends StObject {
  
  /**
    * The default gateway of the device.
    */
  var defaultGateway: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of the device.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * A value that describes whether the IP address is dynamic or persistent.
    */
  var ipAddressAssignment: js.UndefOr[IpAddressAssignment] = js.undefined
  
  /**
    * The MAC address of the device.
    */
  var macAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The netmask used to divide the IP address into subnets.
    */
  var netmask: js.UndefOr[String] = js.undefined
  
  /**
    * The physical connector type.
    */
  var physicalConnectorType: js.UndefOr[PhysicalConnectorType] = js.undefined
  
  /**
    * The physical network interface ID.
    */
  var physicalNetworkInterfaceId: js.UndefOr[String] = js.undefined
}
object PhysicalNetworkInterface {
  
  inline def apply(): PhysicalNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalNetworkInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalNetworkInterface] (val x: Self) extends AnyVal {
    
    inline def setDefaultGateway(value: String): Self = StObject.set(x, "defaultGateway", value.asInstanceOf[js.Any])
    
    inline def setDefaultGatewayUndefined: Self = StObject.set(x, "defaultGateway", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressAssignment(value: IpAddressAssignment): Self = StObject.set(x, "ipAddressAssignment", value.asInstanceOf[js.Any])
    
    inline def setIpAddressAssignmentUndefined: Self = StObject.set(x, "ipAddressAssignment", js.undefined)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    inline def setNetmask(value: String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    
    inline def setNetmaskUndefined: Self = StObject.set(x, "netmask", js.undefined)
    
    inline def setPhysicalConnectorType(value: PhysicalConnectorType): Self = StObject.set(x, "physicalConnectorType", value.asInstanceOf[js.Any])
    
    inline def setPhysicalConnectorTypeUndefined: Self = StObject.set(x, "physicalConnectorType", js.undefined)
    
    inline def setPhysicalNetworkInterfaceId(value: String): Self = StObject.set(x, "physicalNetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalNetworkInterfaceIdUndefined: Self = StObject.set(x, "physicalNetworkInterfaceId", js.undefined)
  }
}
