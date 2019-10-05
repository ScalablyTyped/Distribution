package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewBaseGoToTarget extends Object {
  /**
    * The [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#center) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#scale) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var target: js.UndefOr[
    (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint
  ] = js.undefined
  /**
    * The [MapView.zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#zoom) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapViewBaseGoToTarget {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    center: js.Array[Double] = null,
    scale: Int | Double = null,
    target: (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint = null,
    zoom: Int | Double = null
  ): MapViewBaseGoToTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (center != null) __obj.updateDynamic("center")(center)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewBaseGoToTarget]
  }
}

