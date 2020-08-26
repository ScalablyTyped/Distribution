package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OGCFeatureLayerElevationInfo extends Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[OGCFeatureLayerElevationInfoFeatureExpressionInfo] = js.native
  /**
    * Defines how the graphic is placed with respect to the terrain surface. See the table below for a list of possible values.
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Graphics are draped on the terrain surface. This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [ObjectSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * relative-to-ground | Graphics are placed at an elevation relative to the terrain surface. The graphic's elevation is determined by summing up the terrain elevation and the result of `featureExpressionInfo` (if defined). This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * absolute-height | Graphics are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the result of `featureExpressionInfo` (if defined). This mode doesn't take the elevation of the terrain into account.
    * relative-to-scene | Features are aligned to [extruded polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html) and objects part of 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), depending on which has higher elevation. If the graphic is not directly above a building or any other feature, it is aligned to the terrain surface elevation. If defined, the result of `featureExpressionInfo` is added to the 3D Object/terrain surface elevation.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene` = js.native
  /**
    * An elevation offset, which is added to the vertical position of the graphic. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The unit for `featureExpressionInfo` and `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.native
}

object OGCFeatureLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => Boolean
  ): OGCFeatureLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[OGCFeatureLayerElevationInfo]
  }
  @scala.inline
  implicit class OGCFeatureLayerElevationInfoOps[Self <: OGCFeatureLayerElevationInfo] (val x: Self) extends AnyVal {
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
    def setMode(value: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatureExpressionInfo(value: OGCFeatureLayerElevationInfoFeatureExpressionInfo): Self = this.set("featureExpressionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureExpressionInfo: Self = this.set("featureExpressionInfo", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

