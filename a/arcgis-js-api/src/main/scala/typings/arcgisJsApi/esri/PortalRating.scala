package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalRating
  extends StObject
     with Accessor {
  
  /**
  		 * Date the rating was added to the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#created)
  		 */
  var created: js.Date = js.native
  
  /**
  		 * A rating between 1.0 and 5.0 for the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#rating)
  		 */
  var rating: Double = js.native
}
