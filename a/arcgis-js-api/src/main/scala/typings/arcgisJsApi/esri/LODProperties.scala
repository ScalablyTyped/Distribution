package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LODProperties extends StObject {
  
  /**
  		 * ID for each level.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#level)
  		 */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
  		 * String to be used when constructing a URL to access a tile from this LOD.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#levelValue)
  		 */
  var levelValue: js.UndefOr[String] = js.undefined
  
  /**
  		 * Resolution in map units of each pixel in a tile for each level.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#resolution)
  		 */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Scale for each level.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#scale)
  		 */
  var scale: js.UndefOr[Double] = js.undefined
}
object LODProperties {
  
  inline def apply(): LODProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LODProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LODProperties] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelValue(value: String): Self = StObject.set(x, "levelValue", value.asInstanceOf[js.Any])
    
    inline def setLevelValueUndefined: Self = StObject.set(x, "levelValue", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
