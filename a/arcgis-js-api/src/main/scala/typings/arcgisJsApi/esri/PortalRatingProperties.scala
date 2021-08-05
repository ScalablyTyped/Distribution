package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalRatingProperties extends StObject {
  
  /**
    * Date the rating was added to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * A rating between 1.0 and 5.0 for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#rating)
    */
  var rating: js.UndefOr[Double] = js.undefined
}
object PortalRatingProperties {
  
  inline def apply(): PortalRatingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalRatingProperties]
  }
  
  extension [Self <: PortalRatingProperties](x: Self) {
    
    inline def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
  }
}
