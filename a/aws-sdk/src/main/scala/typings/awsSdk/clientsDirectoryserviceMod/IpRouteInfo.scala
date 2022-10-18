package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpRouteInfo extends StObject {
  
  /**
    * The date and time the address block was added to the directory.
    */
  var AddedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * IP address block in the IpRoute.
    */
  var CidrIp: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.CidrIp] = js.undefined
  
  /**
    * Description of the IpRouteInfo.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Description] = js.undefined
  
  /**
    * Identifier (ID) of the directory associated with the IP addresses.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The status of the IP address block.
    */
  var IpRouteStatusMsg: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.IpRouteStatusMsg] = js.undefined
  
  /**
    * The reason for the IpRouteStatusMsg.
    */
  var IpRouteStatusReason: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.IpRouteStatusReason] = js.undefined
}
object IpRouteInfo {
  
  inline def apply(): IpRouteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRouteInfo]
  }
  
  extension [Self <: IpRouteInfo](x: Self) {
    
    inline def setAddedDateTime(value: js.Date): Self = StObject.set(x, "AddedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAddedDateTimeUndefined: Self = StObject.set(x, "AddedDateTime", js.undefined)
    
    inline def setCidrIp(value: CidrIp): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    inline def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setIpRouteStatusMsg(value: IpRouteStatusMsg): Self = StObject.set(x, "IpRouteStatusMsg", value.asInstanceOf[js.Any])
    
    inline def setIpRouteStatusMsgUndefined: Self = StObject.set(x, "IpRouteStatusMsg", js.undefined)
    
    inline def setIpRouteStatusReason(value: IpRouteStatusReason): Self = StObject.set(x, "IpRouteStatusReason", value.asInstanceOf[js.Any])
    
    inline def setIpRouteStatusReasonUndefined: Self = StObject.set(x, "IpRouteStatusReason", js.undefined)
  }
}
