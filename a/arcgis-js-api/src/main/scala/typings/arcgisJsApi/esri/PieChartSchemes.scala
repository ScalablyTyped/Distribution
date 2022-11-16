package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartSchemes extends StObject {
  
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartSchemes)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average basemap color is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartSchemes)
    */
  var basemapTheme: String
  
  /**
    * The suggest default chart scheme based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartSchemes)
    */
  var primaryScheme: PieChartScheme
  
  /**
    * Additional chart schemes that may be used to visualize data overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartSchemes)
    */
  var secondarySchemes: js.Array[PieChartScheme]
}
object PieChartSchemes {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    primaryScheme: PieChartScheme,
    secondarySchemes: js.Array[PieChartScheme]
  ): PieChartSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], primaryScheme = primaryScheme.asInstanceOf[js.Any], secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartSchemes]
  }
  
  extension [Self <: PieChartSchemes](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setPrimaryScheme(value: PieChartScheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[PieChartScheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: PieChartScheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value*))
  }
}
