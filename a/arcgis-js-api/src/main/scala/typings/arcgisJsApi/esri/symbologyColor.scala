package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for generating optimal symbols for data-driven color visualizations.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html)
  */
@js.native
trait symbologyColor extends StObject {
  
  /**
    * Clones a color scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#cloneScheme)
    */
  def cloneScheme(scheme: ColorScheme): ColorScheme = js.native
  
  /**
    * Flips the colors in reverse order of the input color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#flipColors)
    */
  def flipColors(scheme: ColorScheme): ColorScheme = js.native
  
  /**
    * Returns all schemes matching the given color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  def getMatchingSchemes(params: colorGetMatchingSchemesParams): js.Array[ColorScheme] = js.native
  
  /**
    * Returns a color scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemeByName)
    */
  def getSchemeByName(params: colorGetSchemeByNameParams): ColorScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for data-driven color visualizations in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  def getSchemes(params: colorGetSchemesParams): ColorSchemes = js.native
  
  /**
    * Returns an array of color schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemesByTag)
    */
  def getSchemesByTag(params: colorGetSchemesByTagParams): js.Array[ColorScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
