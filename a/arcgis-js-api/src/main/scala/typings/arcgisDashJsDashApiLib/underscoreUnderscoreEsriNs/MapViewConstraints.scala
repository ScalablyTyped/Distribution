package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewConstraints
  extends stdLib.Object {
  /**
    * A read-only property that specifies the levels of detail (LODs) read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveLODs: js.UndefOr[js.Array[LOD]] = js.undefined
  /**
    * A read-only property that specifies the maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * A read-only property that specifies the maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * A read-only property that specifies the minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * A read-only property that specifies the minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html). If not specified, this value is read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). This property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var lods: js.UndefOr[js.Array[LOD]] = js.undefined
  /**
    * The maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view. Setting this value to `0` allows the user to overzoom layer tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view. Setting this value to `0` allows the user to overzoom layer tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether the user can rotate the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    *
    * @default true
    */
  var rotationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, the view snaps to the next LOD when zooming in or out. When `false`, the zoom is continuous.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    *
    * @default true
    */
  var snapToZoom: js.UndefOr[scala.Boolean] = js.undefined
}

object MapViewConstraints {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    effectiveLODs: js.Array[LOD] = null,
    effectiveMaxScale: scala.Int | scala.Double = null,
    effectiveMaxZoom: scala.Int | scala.Double = null,
    effectiveMinScale: scala.Int | scala.Double = null,
    effectiveMinZoom: scala.Int | scala.Double = null,
    lods: js.Array[LOD] = null,
    maxScale: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    rotationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    snapToZoom: js.UndefOr[scala.Boolean] = js.undefined
  ): MapViewConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (effectiveLODs != null) __obj.updateDynamic("effectiveLODs")(effectiveLODs)
    if (effectiveMaxScale != null) __obj.updateDynamic("effectiveMaxScale")(effectiveMaxScale.asInstanceOf[js.Any])
    if (effectiveMaxZoom != null) __obj.updateDynamic("effectiveMaxZoom")(effectiveMaxZoom.asInstanceOf[js.Any])
    if (effectiveMinScale != null) __obj.updateDynamic("effectiveMinScale")(effectiveMinScale.asInstanceOf[js.Any])
    if (effectiveMinZoom != null) __obj.updateDynamic("effectiveMinZoom")(effectiveMinZoom.asInstanceOf[js.Any])
    if (lods != null) __obj.updateDynamic("lods")(lods)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationEnabled)) __obj.updateDynamic("rotationEnabled")(rotationEnabled)
    if (!js.isUndefined(snapToZoom)) __obj.updateDynamic("snapToZoom")(snapToZoom)
    __obj.asInstanceOf[MapViewConstraints]
  }
}

