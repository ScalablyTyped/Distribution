package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbologyLocation extends js.Object {
  /**
    * Clones a location scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#cloneScheme)
    *
    * @param scheme The location scheme object to clone.
    *
    */
  def cloneScheme(scheme: LocationScheme): LocationScheme
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for location-only visualizions in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html). The `basemap` parameter determines the color of the graphics used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features on top of the given basemap.
    * @param params.geometryType The geometry type of the features to visualize. **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def getSchemes(params: locationGetSchemesParams): LocationSchemes
}

object symbologyLocation {
  @scala.inline
  def apply(
    cloneScheme: js.Function1[LocationScheme, LocationScheme],
    getSchemes: js.Function1[locationGetSchemesParams, LocationSchemes]
  ): symbologyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneScheme")(cloneScheme)
    __obj.updateDynamic("getSchemes")(getSchemes)
    __obj.asInstanceOf[symbologyLocation]
  }
}

