package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for getting optimal color schemes used to create [pie chart visualizations](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html)
  */
@js.native
trait symbologyPieChart extends StObject {
  
  /**
    * Clones a pie chart scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#cloneScheme)
    */
  def cloneScheme(scheme: PieChartScheme): PieChartScheme = js.native
  
  /**
    * Returns a pie chart scheme with the given name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemeByName)
    */
  def getSchemeByName(params: pieChartGetSchemeByNameParams): PieChartScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining properties for pie chart visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemes)
    */
  def getSchemes(params: pieChartGetSchemesParams): PieChartSchemes = js.native
  
  /**
    * Returns an array of pie chart schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemesByTag)
    */
  def getSchemesByTag(params: pieChartGetSchemesByTagParams): js.Array[PieChartScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
