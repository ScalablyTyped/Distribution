package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for generating optimal symbols for data-driven size visualizations.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html)
  */
@js.native
trait symbologySize extends StObject {
  
  /**
    * Clones a size scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#cloneScheme)
    */
  def cloneScheme(scheme: SizeScheme): SizeScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for size-based data-driven visualizations in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#getSchemes)
    */
  def getSchemes(params: sizeGetSchemesParams): SizeSchemes = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
