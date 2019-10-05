package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbologySize extends js.Object {
  /**
    * Clones a size scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#cloneScheme)
    *
    * @param scheme The SizeScheme object to clone.
    *
    */
  def cloneScheme(scheme: SizeScheme): SizeScheme = js.native
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for size-based data-driven visualizions in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). The `basemap` parameter determines the color of the graphics used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features against the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.   **Possible Values:** point | multipoint | polyline | polygon
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def getSchemes(params: sizeGetSchemesParams): SizeSchemes = js.native
  /**
    * Returns metadata for the available themes. If a basemap is provided, returns themes that work best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: String): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
}

@JSGlobal("__esri.symbologySize")
@js.native
object symbologySize extends TopLevel[symbologySize]

