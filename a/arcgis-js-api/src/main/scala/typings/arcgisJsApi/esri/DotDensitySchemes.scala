package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotDensitySchemes extends StObject {
  
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average basemap color is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var basemapTheme: String
  
  /**
    * The dot density scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var primaryScheme: DotDensityScheme
  
  /**
    * Additional dot density schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensitySchemes)
    */
  var secondarySchemes: js.Array[DotDensityScheme]
}
object DotDensitySchemes {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    primaryScheme: DotDensityScheme,
    secondarySchemes: js.Array[DotDensityScheme]
  ): DotDensitySchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], primaryScheme = primaryScheme.asInstanceOf[js.Any], secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotDensitySchemes]
  }
  
  extension [Self <: DotDensitySchemes](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setPrimaryScheme(value: DotDensityScheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[DotDensityScheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: DotDensityScheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value*))
  }
}
