package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveIpRoutesRequest extends StObject {
  
  /**
    * IP address blocks that you want to remove.
    */
  var CidrIps: typings.awsSdk.clientsDirectoryserviceMod.CidrIps
  
  /**
    * Identifier (ID) of the directory from which you want to remove the IP addresses.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object RemoveIpRoutesRequest {
  
  inline def apply(CidrIps: CidrIps, DirectoryId: DirectoryId): RemoveIpRoutesRequest = {
    val __obj = js.Dynamic.literal(CidrIps = CidrIps.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveIpRoutesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveIpRoutesRequest] (val x: Self) extends AnyVal {
    
    inline def setCidrIps(value: CidrIps): Self = StObject.set(x, "CidrIps", value.asInstanceOf[js.Any])
    
    inline def setCidrIpsVarargs(value: CidrIp*): Self = StObject.set(x, "CidrIps", js.Array(value*))
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
