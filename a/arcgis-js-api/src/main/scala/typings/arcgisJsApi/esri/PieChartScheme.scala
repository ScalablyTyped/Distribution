package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartScheme extends StObject {
  
  /**
    * The color of the "others" category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var colorForOthersCategory: Color_
  
  /**
    * The colors used to visualize pie slices in the chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var colors: js.Array[Color_]
  
  /**
    * The unique name of the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var name: String
  
  /**
    * Properties for defining the outline of the pie chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var outline: PieChartSchemeOutline
  
  /**
    * The default size of the pie charts in points or pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var size: Double | String
  
  /**
    * The scheme defining the size visual variable used to vary chart size per feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var sizeScheme: SizeScheme
  
  /**
    * Tags associated with the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#PieChartScheme)
    */
  var tags: js.Array[String]
}
object PieChartScheme {
  
  inline def apply(
    colorForOthersCategory: Color_,
    colors: js.Array[Color_],
    name: String,
    outline: PieChartSchemeOutline,
    size: Double | String,
    sizeScheme: SizeScheme,
    tags: js.Array[String]
  ): PieChartScheme = {
    val __obj = js.Dynamic.literal(colorForOthersCategory = colorForOthersCategory.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartScheme]
  }
  
  extension [Self <: PieChartScheme](x: Self) {
    
    inline def setColorForOthersCategory(value: Color_): Self = StObject.set(x, "colorForOthersCategory", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: PieChartSchemeOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
