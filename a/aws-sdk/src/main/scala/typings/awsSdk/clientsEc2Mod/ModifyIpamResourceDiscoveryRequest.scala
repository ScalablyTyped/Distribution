package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResourceDiscoveryRequest extends StObject {
  
  /**
    * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions.
    */
  var AddOperatingRegions: js.UndefOr[AddIpamOperatingRegionSet] = js.undefined
  
  /**
    * A resource discovery description.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A resource discovery ID.
    */
  var IpamResourceDiscoveryId: typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId
  
  /**
    * Remove operating Regions.
    */
  var RemoveOperatingRegions: js.UndefOr[RemoveIpamOperatingRegionSet] = js.undefined
}
object ModifyIpamResourceDiscoveryRequest {
  
  inline def apply(IpamResourceDiscoveryId: IpamResourceDiscoveryId): ModifyIpamResourceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(IpamResourceDiscoveryId = IpamResourceDiscoveryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIpamResourceDiscoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamResourceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setAddOperatingRegions(value: AddIpamOperatingRegionSet): Self = StObject.set(x, "AddOperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setAddOperatingRegionsUndefined: Self = StObject.set(x, "AddOperatingRegions", js.undefined)
    
    inline def setAddOperatingRegionsVarargs(value: AddIpamOperatingRegion*): Self = StObject.set(x, "AddOperatingRegions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setRemoveOperatingRegions(value: RemoveIpamOperatingRegionSet): Self = StObject.set(x, "RemoveOperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setRemoveOperatingRegionsUndefined: Self = StObject.set(x, "RemoveOperatingRegions", js.undefined)
    
    inline def setRemoveOperatingRegionsVarargs(value: RemoveIpamOperatingRegion*): Self = StObject.set(x, "RemoveOperatingRegions", js.Array(value*))
  }
}
