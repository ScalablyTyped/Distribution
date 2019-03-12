package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerElevationInfo
  extends stdLib.Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[CSVLayerElevationInfoFeatureExpressionInfo] = js.undefined
  /**
    * Defines how the graphic is placed with respect to the terrain surface. See the table below for a list of possible values.
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Graphics are draped on the terrain surface. This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [ObjectSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * relative-to-ground | Graphics are placed at an elevation relative to the terrain surface. The graphic's elevation is determined by summing up the terrain elevation and the result of `featureExpressionInfo` (if defined). This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * absolute-height | Graphics are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the result of `featureExpressionInfo` (if defined). This mode doesn't take the elevation of the terrain into account.
    * relative-to-scene | Graphics are aligned to buildings and other objects part of 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), depending on which has higher elevation. If the graphic is not directly above a building or any other feature, it is aligned to the terrain surface elevation. If defined, the result of `featureExpressionInfo` is added to the 3D Object/terrain surface elevation.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var mode: java.lang.String
  /**
    * An elevation offset, which is added to the vertical position of the graphic. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unit for `featureExpressionInfo` and `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object CSVLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    mode: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    featureExpressionInfo: CSVLayerElevationInfoFeatureExpressionInfo = null,
    offset: scala.Int | scala.Double = null,
    unit: java.lang.String = null
  ): CSVLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (featureExpressionInfo != null) __obj.updateDynamic("featureExpressionInfo")(featureExpressionInfo)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[CSVLayerElevationInfo]
  }
}

