package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterShadedReliefResult extends StObject {
  
  /**
  		 * The RasterShadedReliefRenderer renderer to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#RasterShadedReliefResult)
  		 */
  var renderer: RasterShadedReliefRenderer
}
object RasterShadedReliefResult {
  
  inline def apply(renderer: RasterShadedReliefRenderer): RasterShadedReliefResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterShadedReliefResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterShadedReliefResult] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: RasterShadedReliefRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
