package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteRequest extends StObject {
  
  /**
    * A description of your site. Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The site location. This information is used for visualization in the Network Manager console. If you specify the address, the latitude and longitude are automatically calculated.    Address: The physical address of the site.    Latitude: The latitude of the site.     Longitude: The longitude of the site.  
    */
  var Location: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Location] = js.undefined
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSiteRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): CreateSiteRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteRequest]
  }
  
  extension [Self <: CreateSiteRequest](x: Self) {
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
