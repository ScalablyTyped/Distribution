package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-class`
import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.default
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait typeGetSchemesByTagParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The geometry type of the features to visualize. | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch = js.native
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Determines whether to return a standardized  unique value scheme for point cloud class renderers (i.e. when the `CLASS_CODE` field is driving the visualization in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)), or to return the other default primary schemes used in other unique value renderers generated for non-point cloud layer types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    *
    * @default default
    */
  var theme: js.UndefOr[`point-cloud-class` | default] = js.native
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}

object typeGetSchemesByTagParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typeGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[typeGetSchemesByTagParams]
  }
  @scala.inline
  implicit class typeGetSchemesByTagParamsOps[Self <: typeGetSchemesByTagParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemapTheme: Self = this.set("basemapTheme", js.undefined)
    @scala.inline
    def setExcludedTagsVarargs(value: String*): Self = this.set("excludedTags", js.Array(value :_*))
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = this.set("excludedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedTags: Self = this.set("excludedTags", js.undefined)
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = this.set("includedTags", js.Array(value :_*))
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = this.set("includedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedTags: Self = this.set("includedTags", js.undefined)
    @scala.inline
    def setTheme(value: `point-cloud-class` | default): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setView(value: SceneView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWorldScale(value: Boolean): Self = this.set("worldScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldScale: Self = this.set("worldScale", js.undefined)
  }
  
}

