package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorGetMatchingSchemesParams extends StObject {
  
  /**
    * An array of colors used to match with schemes for the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var colors: js.Array[Color_]
  
  /**
    * The geometry type of the layer for which the color scheme will be applied.
    *
    * [Read more...](global.html#geometryType)
    */
  var geometryType: String
  
  /**
    * The name of the theme from which to get color schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var theme: `high-to-low` | `above-and-below` | `centered-on` | extremes
  
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  
  /**
    * Indicates whether 3D volumetric symbols will be used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}
object colorGetMatchingSchemesParams {
  
  inline def apply(
    colors: js.Array[Color_],
    geometryType: String,
    theme: `high-to-low` | `above-and-below` | `centered-on` | extremes
  ): colorGetMatchingSchemesParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetMatchingSchemesParams]
  }
  
  extension [Self <: colorGetMatchingSchemesParams](x: Self) {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setGeometryType(value: String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: `high-to-low` | `above-and-below` | `centered-on` | extremes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setView(value: SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWorldScale(value: Boolean): Self = StObject.set(x, "worldScale", value.asInstanceOf[js.Any])
    
    inline def setWorldScaleUndefined: Self = StObject.set(x, "worldScale", js.undefined)
  }
}
