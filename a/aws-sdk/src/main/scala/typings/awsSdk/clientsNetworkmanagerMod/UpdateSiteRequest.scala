package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteRequest extends StObject {
  
  /**
    * A description of your site. Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The site location:    Address: The physical address of the site.    Latitude: The latitude of the site.     Longitude: The longitude of the site.  
    */
  var Location: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Location] = js.undefined
  
  /**
    * The ID of your site.
    */
  var SiteId: typings.awsSdk.clientsNetworkmanagerMod.SiteId
}
object UpdateSiteRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, SiteId: SiteId): UpdateSiteRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteRequest]
  }
  
  extension [Self <: UpdateSiteRequest](x: Self) {
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
