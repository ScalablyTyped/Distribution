package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbologyType extends js.Object {
  /**
    * Clones a type scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#cloneScheme)
    *
    * @param scheme The type scheme object to clone.
    *
    */
  def cloneScheme(scheme: TypeScheme): TypeScheme = js.native
  /**
    * Returns a type scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemeByName)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.name The name of the scheme to retrieve.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines whether to return a standardized  unique value scheme for point cloud class renderers (i.e. when the `CLASS_CODE` field is driving the visualization in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)), or to return the other default primary schemes used in other unique value renderers generated for non-point cloud layer types.  **Possible Values:** point-cloud-class | default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemeByName(params: typeGetSchemeByNameParams): TypeScheme = js.native
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for type-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The `basemap` parameter determines the color of the graphics used to visualize each feature. The `geometryType` determines which type of symbol to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemes)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines whether to return a standardized  unique value scheme for point cloud class renderers (i.e. when the `CLASS_CODE` field is driving the visualization in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)), or to return the other default primary schemes used in other unique value renderers generated for non-point cloud layer types.  **Possible Values:** point-cloud-class | default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemes(params: typeGetSchemesParams): TypeSchemes = js.native
  /**
    * Returns an array of type schemes with the provided tags. These schemes define symbol properties for data-driven visualizations in any layer that can be rendered with a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getSchemesByTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.excludedTags When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    * @param params.basemap The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    * @param params.geometryType The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    * @param params.theme Determines whether to return a standardized  unique value scheme for point cloud class renderers (i.e. when the `CLASS_CODE` field is driving the visualization in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)), or to return the other default primary schemes used in other unique value renderers generated for non-point cloud layer types.  **Possible Values:** point-cloud-class | default
    * @param params.worldScale Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    * @param params.view The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    */
  def getSchemesByTag(params: typeGetSchemesByTagParams): js.Array[TypeScheme] = js.native
  /**
    * Returns metadata for the available themes. If a basemap is provided, returns themes that work best with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#getThemes)
    *
    * @param basemap The [Esri basemap string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or object that will be used with the returned theme(s).
    *
    */
  def getThemes(): js.Array[Theme] = js.native
  def getThemes(basemap: Basemap): js.Array[Theme] = js.native
  def getThemes(basemap: java.lang.String): js.Array[Theme] = js.native
}

