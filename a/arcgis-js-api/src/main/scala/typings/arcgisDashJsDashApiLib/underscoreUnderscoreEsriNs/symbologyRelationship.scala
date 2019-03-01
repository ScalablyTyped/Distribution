package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbologyRelationship extends js.Object {
  /**
    * Clones a relationship (bivariate color) scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#cloneScheme)
    *
    * @param scheme The relationship scheme object to clone.
    *
    */
  def cloneScheme(scheme: RelationshipScheme): RelationshipScheme
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for relationship-based (bivariate choropleth) data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color of the symbols used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemes(params: relationshipGetSchemesParams): RelationshipSchemes
}

object symbologyRelationship {
  @scala.inline
  def apply(
    cloneScheme: js.Function1[RelationshipScheme, RelationshipScheme],
    getSchemes: js.Function1[relationshipGetSchemesParams, RelationshipSchemes]
  ): symbologyRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneScheme")(cloneScheme)
    __obj.updateDynamic("getSchemes")(getSchemes)
    __obj.asInstanceOf[symbologyRelationship]
  }
}

