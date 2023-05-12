package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamResourceDiscoveryRequest extends StObject {
  
  /**
    * A client token for the IPAM resource discovery.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the IPAM resource discovery.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions.
    */
  var OperatingRegions: js.UndefOr[AddIpamOperatingRegionSet] = js.undefined
  
  /**
    * Tag specifications for the IPAM resource discovery.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateIpamResourceDiscoveryRequest {
  
  inline def apply(): CreateIpamResourceDiscoveryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpamResourceDiscoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIpamResourceDiscoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOperatingRegions(value: AddIpamOperatingRegionSet): Self = StObject.set(x, "OperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setOperatingRegionsUndefined: Self = StObject.set(x, "OperatingRegions", js.undefined)
    
    inline def setOperatingRegionsVarargs(value: AddIpamOperatingRegion*): Self = StObject.set(x, "OperatingRegions", js.Array(value*))
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
