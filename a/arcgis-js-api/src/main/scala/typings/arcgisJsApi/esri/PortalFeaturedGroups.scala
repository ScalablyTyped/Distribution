package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalFeaturedGroups extends StObject {
  
  /**
  		 * Name of the group owner.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
  		 */
  var owner: String
  
  /**
  		 * Group title.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
  		 */
  var title: String
}
object PortalFeaturedGroups {
  
  inline def apply(owner: String, title: String): PortalFeaturedGroups = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalFeaturedGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalFeaturedGroups] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
