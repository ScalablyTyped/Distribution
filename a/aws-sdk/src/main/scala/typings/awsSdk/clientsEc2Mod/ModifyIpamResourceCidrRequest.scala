package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResourceCidrRequest extends StObject {
  
  /**
    * The ID of the current scope that the resource CIDR is in.
    */
  var CurrentIpamScopeId: IpamScopeId
  
  /**
    * The ID of the scope you want to transfer the resource CIDR to.
    */
  var DestinationIpamScopeId: js.UndefOr[IpamScopeId] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM and you can view details about the resource’s CIDR.
    */
  var Monitored: Boolean
  
  /**
    * The CIDR of the resource you want to modify.
    */
  var ResourceCidr: String
  
  /**
    * The ID of the resource you want to modify.
    */
  var ResourceId: String
  
  /**
    * The Amazon Web Services Region of the resource you want to modify.
    */
  var ResourceRegion: String
}
object ModifyIpamResourceCidrRequest {
  
  inline def apply(
    CurrentIpamScopeId: IpamScopeId,
    Monitored: Boolean,
    ResourceCidr: String,
    ResourceId: String,
    ResourceRegion: String
  ): ModifyIpamResourceCidrRequest = {
    val __obj = js.Dynamic.literal(CurrentIpamScopeId = CurrentIpamScopeId.asInstanceOf[js.Any], Monitored = Monitored.asInstanceOf[js.Any], ResourceCidr = ResourceCidr.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceRegion = ResourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIpamResourceCidrRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamResourceCidrRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrentIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "CurrentIpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "DestinationIpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpamScopeIdUndefined: Self = StObject.set(x, "DestinationIpamScopeId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMonitored(value: Boolean): Self = StObject.set(x, "Monitored", value.asInstanceOf[js.Any])
    
    inline def setResourceCidr(value: String): Self = StObject.set(x, "ResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
  }
}
