package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for getting optimal symbol schemes used to create [relationship (bivariate choropleth) visualizations](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html)
  */
@js.native
trait symbologyRelationship extends js.Object {
  
  /**
    * Clones a relationship (bivariate color) scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#cloneScheme)
    */
  def cloneScheme(scheme: RelationshipScheme): RelationshipScheme = js.native
  
  /**
    * Returns a relationship scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemeByName)
    */
  def getSchemeByName(params: relationshipGetSchemeByNameParams): RelationshipScheme = js.native
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for relationship-based (bivariate choropleth) data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemes)
    */
  def getSchemes(params: relationshipGetSchemesParams): RelationshipSchemes = js.native
  
  /**
    * Returns an array of relationship schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  def getSchemesByTag(params: relationshipGetSchemesByTagParams): js.Array[RelationshipScheme] = js.native
  
  /**
    * Returns metadata for the available themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getThemes)
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}
