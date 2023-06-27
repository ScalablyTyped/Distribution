package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalRating
import typings.arcgisJsApi.esri.PortalRatingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalRatingMod {
  
  @JSImport("esri/portal/PortalRating", JSImport.Namespace)
  @js.native
  /**
  		 * PortalRating provides details about the rating associated with a [Portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html)
  		 */
  open class ^ ()
    extends StObject
       with PortalRating {
    def this(properties: PortalRatingProperties) = this()
  }
}
