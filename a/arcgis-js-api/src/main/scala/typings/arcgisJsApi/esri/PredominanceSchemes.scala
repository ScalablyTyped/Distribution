package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominanceSchemes extends StObject {
  
  /**
  		 * The ID of the basemap associated with the given schemes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
  		 */
  var basemapId: String
  
  /**
  		 * Indicates whether the average basemap color is `light` or `dark`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
  		 */
  var basemapTheme: String
  
  /**
  		 * The predominance scheme best suited for the given basemap and geometry type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
  		 */
  var primaryScheme: PredominanceScheme
  
  /**
  		 * Additional predominance schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
  		 */
  var secondarySchemes: js.Array[PredominanceScheme]
}
object PredominanceSchemes {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    primaryScheme: PredominanceScheme,
    secondarySchemes: js.Array[PredominanceScheme]
  ): PredominanceSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], primaryScheme = primaryScheme.asInstanceOf[js.Any], secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominanceSchemes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredominanceSchemes] (val x: Self) extends AnyVal {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setPrimaryScheme(value: PredominanceScheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[PredominanceScheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: PredominanceScheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value*))
  }
}
