package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteLayerInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The id for an operational layer in a map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#layerId)
  		 */
  var layerId: String = js.native
  
  /**
  		 * The field name from the layer that defines the site name of a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#nameField)
  		 */
  var nameField: String = js.native
  
  /**
  		 * The field name from the layer that defines a site unique ID for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#siteIdField)
  		 */
  var siteIdField: String = js.native
  
  /**
  		 * This value references the numeric ID of the sublayer if the Site layer is a map service sublayer instead of a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#sublayerId)
  		 */
  var sublayerId: Double = js.native
}
