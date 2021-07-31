package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for generating optimal symbols for heatmap visualizations.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html)
  */
@js.native
trait symbologyHeatmap extends StObject {
  
  /**
    * Clones a heatmap scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#cloneScheme)
    */
  def cloneScheme(scheme: HeatmapScheme): HeatmapScheme = js.native
  
  /**
    * Returns a heatmap scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemeByName)
    */
  def getSchemeByName(params: heatmapGetSchemeByNameParams): HeatmapScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining properties for heatmap visualizations in a point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemes)
    */
  def getSchemes(params: heatmapGetSchemesParams): HeatmapSchemes = js.native
  
  /**
    * Returns an array of heatmap schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemesByTag)
    */
  def getSchemesByTag(params: heatmapGetSchemesByTagParams): js.Array[HeatmapScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
