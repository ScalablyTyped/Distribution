package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbologyPredominance extends js.Object {
  /**
    * Clones a predominance scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#cloneScheme)
    *
    * @param scheme The predominance scheme object to clone.
    *
    */
  def cloneScheme(scheme: PredominanceScheme): PredominanceScheme
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for predominance-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color of the symbols used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.numColors The number of unique values to include in the predominance visualization.
    * @param params.theme Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemes(params: predominanceGetSchemesParams): PredominanceSchemes
}

object symbologyPredominance {
  @scala.inline
  def apply(
    cloneScheme: PredominanceScheme => PredominanceScheme,
    getSchemes: predominanceGetSchemesParams => PredominanceSchemes
  ): symbologyPredominance = {
    val __obj = js.Dynamic.literal(cloneScheme = js.Any.fromFunction1(cloneScheme), getSchemes = js.Any.fromFunction1(getSchemes))
  
    __obj.asInstanceOf[symbologyPredominance]
  }
}

