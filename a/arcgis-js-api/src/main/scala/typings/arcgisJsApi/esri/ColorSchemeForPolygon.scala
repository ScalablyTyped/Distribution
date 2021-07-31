package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSchemeForPolygon
  extends StObject
     with Object
     with ColorScheme {
  
  /**
    * The continuous color ramp that will be applied to the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var colors: js.Array[Color_]
  
  /**
    * Predefined classed color schemes to use for the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks]
  
  /**
    * The unique id of the color scheme to usee in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var id: String
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var name: String
  
  /**
    * The color of the symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var noDataColor: Color_
  
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var opacity: Double
  
  /**
    * Properties for defining the outline of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var outline: ColorSchemeForPolygonOutline
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var tags: js.Array[String]
  
  /**
    * Indicates which values will be emphasized in the continuous ramp and the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var theme: String
}
object ColorSchemeForPolygon {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: ColorSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    theme: String
  ): ColorSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemeForPolygon]
  }
  
  @scala.inline
  implicit class ColorSchemeForPolygonMutableBuilder[Self <: ColorSchemeForPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsForClassBreaks(value: js.Array[ColorSchemeForPolygonColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsForClassBreaksVarargs(value: ColorSchemeForPolygonColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value :_*))
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: ColorSchemeForPolygonOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
