package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for generating optimal symbols for location-only visualizations.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html)
  */
@js.native
trait symbologyLocation extends StObject {
  
  /**
    * Clones a location scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#cloneScheme)
    */
  def cloneScheme(scheme: LocationScheme): LocationScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for location-only visualizions in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#getSchemes)
    */
  def getSchemes(params: locationGetSchemesParams): LocationSchemes = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
