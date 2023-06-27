package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterClassBreaksResult extends StObject {
  
  /**
  		 * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#RasterClassBreaksResult)
  		 */
  var classBreaksResult: ClassBreaksResult
  
  /**
  		 * The renderer object configured to best match the given basemap and the spread of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#RasterClassBreaksResult)
  		 */
  var renderer: ClassBreaksRenderer
}
object RasterClassBreaksResult {
  
  inline def apply(classBreaksResult: ClassBreaksResult, renderer: ClassBreaksRenderer): RasterClassBreaksResult = {
    val __obj = js.Dynamic.literal(classBreaksResult = classBreaksResult.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterClassBreaksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterClassBreaksResult] (val x: Self) extends AnyVal {
    
    inline def setClassBreaksResult(value: ClassBreaksResult): Self = StObject.set(x, "classBreaksResult", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
