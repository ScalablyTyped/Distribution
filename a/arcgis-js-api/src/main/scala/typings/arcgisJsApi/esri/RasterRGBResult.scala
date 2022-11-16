package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterRGBResult extends StObject {
  
  /**
    * The RGB RasterStretchRenderer renderer to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#RasterRGBResult)
    */
  var renderer: RasterStretchRenderer
  
  /**
    * The RGB band indexes following the order of red, green, and blue channels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#RasterRGBResult)
    */
  var rgbBandIds: js.Array[Double]
}
object RasterRGBResult {
  
  inline def apply(renderer: RasterStretchRenderer, rgbBandIds: js.Array[Double]): RasterRGBResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], rgbBandIds = rgbBandIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterRGBResult]
  }
  
  extension [Self <: RasterRGBResult](x: Self) {
    
    inline def setRenderer(value: RasterStretchRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRgbBandIds(value: js.Array[Double]): Self = StObject.set(x, "rgbBandIds", value.asInstanceOf[js.Any])
    
    inline def setRgbBandIdsVarargs(value: Double*): Self = StObject.set(x, "rgbBandIds", js.Array(value*))
  }
}
