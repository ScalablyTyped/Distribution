package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpAddressResponse extends StObject {
  
  /**
    * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * One IP address that the Resolver endpoint uses for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ip] = js.undefined
  
  /**
    * The ID of one IP address.
    */
  var IpId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A status code that gives the current status of the request.
    */
  var Status: js.UndefOr[IpAddressStatus] = js.undefined
  
  /**
    * A message that provides additional information about the status of the request.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
  
  /**
    * The ID of one subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.SubnetId] = js.undefined
}
object IpAddressResponse {
  
  inline def apply(): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressResponse]
  }
  
  extension [Self <: IpAddressResponse](x: Self) {
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpId(value: ResourceId): Self = StObject.set(x, "IpId", value.asInstanceOf[js.Any])
    
    inline def setIpIdUndefined: Self = StObject.set(x, "IpId", js.undefined)
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setStatus(value: IpAddressStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
