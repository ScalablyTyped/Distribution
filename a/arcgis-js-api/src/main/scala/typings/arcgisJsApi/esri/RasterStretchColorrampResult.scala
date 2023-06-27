package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterStretchColorrampResult extends StObject {
  
  /**
  		 * The zero-based index of the band represented by the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#RasterStretchColorrampResult)
  		 */
  var bandId: Double
  
  /**
  		 * The RasterStretchRenderer renderer to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#RasterStretchColorrampResult)
  		 */
  var renderer: RasterStretchRenderer
}
object RasterStretchColorrampResult {
  
  inline def apply(bandId: Double, renderer: RasterStretchRenderer): RasterStretchColorrampResult = {
    val __obj = js.Dynamic.literal(bandId = bandId.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterStretchColorrampResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterStretchColorrampResult] (val x: Self) extends AnyVal {
    
    inline def setBandId(value: Double): Self = StObject.set(x, "bandId", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: RasterStretchRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
