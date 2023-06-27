package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResource extends StObject {
  
  /**
  		 * When the resource was created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
  		 */
  var created: js.Date
  
  /**
  		 * The fetched resources.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
  		 */
  var resource: PortalItemResource
  
  /**
  		 * The size of the resource in bytes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResource)
  		 */
  var size: Double
}
object FetchResource {
  
  inline def apply(created: js.Date, resource: PortalItemResource, size: Double): FetchResource = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchResource] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setResource(value: PortalItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
