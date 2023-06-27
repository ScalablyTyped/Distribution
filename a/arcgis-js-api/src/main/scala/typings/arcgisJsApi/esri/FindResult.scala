package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The name of the layer's primary display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#displayFieldName)
  		 */
  var displayFieldName: String = js.native
  
  /**
  		 * The found feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#feature)
  		 */
  var feature: Graphic = js.native
  
  /**
  		 * The name of the field that contains the search text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#foundFieldName)
  		 */
  var foundFieldName: String = js.native
  
  /**
  		 * Unique ID of the layer that contains the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#layerId)
  		 */
  var layerId: Double = js.native
  
  /**
  		 * The layer name that contains the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#layerName)
  		 */
  var layerName: String = js.native
  
  /**
  		 * The value of the `foundFieldName` in the feature's attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html#value)
  		 */
  var value: String = js.native
}
