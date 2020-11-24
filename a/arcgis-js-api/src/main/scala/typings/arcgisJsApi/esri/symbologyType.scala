package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for getting optimal symbol themes used to create data-driven visualizations of unique values or types.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html)
  */
@js.native
trait symbologyType extends js.Object {
  
  /**
    * Clones a type scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#cloneScheme)
    */
  def cloneScheme(scheme: TypeScheme): TypeScheme = js.native
  
  /**
    * Returns a type scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemeByName)
    */
  def getSchemeByName(params: typeGetSchemeByNameParams): TypeScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for type-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemes)
    */
  def getSchemes(params: typeGetSchemesParams): TypeSchemes = js.native
  
  /**
    * Returns an array of type schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  def getSchemesByTag(params: typeGetSchemesByTagParams): js.Array[TypeScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
