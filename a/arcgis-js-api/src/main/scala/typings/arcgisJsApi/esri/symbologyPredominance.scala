package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for getting optimal symbol schemes used to create [predominance visualizations](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html)
  */
@js.native
trait symbologyPredominance extends StObject {
  
  /**
    * Clones a predominance scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#cloneScheme)
    */
  def cloneScheme(scheme: PredominanceScheme): PredominanceScheme = js.native
  
  /**
    * Returns a predominance scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  def getSchemeByName(params: predominanceGetSchemeByNameParams): PredominanceScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for predominance-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemes)
    */
  def getSchemes(params: predominanceGetSchemesParams): PredominanceSchemes = js.native
  
  /**
    * Returns an array of predominance schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  def getSchemesByTag(params: predominanceGetSchemesByTagParams): js.Array[PredominanceScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
