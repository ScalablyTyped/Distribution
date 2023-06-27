package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColormapInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The color of a given pixel.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The label for a given pixel value and color mapping.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#label)
  		 */
  var label: String = js.native
  
  /**
  		 * The raster pixel value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#value)
  		 */
  var value: Double = js.native
}
