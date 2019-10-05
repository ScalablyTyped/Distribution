package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewGoToTarget extends Object {
  /**
    * The [SceneView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var center: js.UndefOr[js.Array[Double] | Point] = js.undefined
  /**
    * The [Camera.heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var heading: js.UndefOr[Double] = js.undefined
  /**
    * The [Camera.position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var position: js.UndefOr[Point] = js.undefined
  /**
    * The [SceneView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var target: js.UndefOr[
    (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint | Camera
  ] = js.undefined
  /**
    * The [Camera.tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var tilt: js.UndefOr[Double] = js.undefined
  /**
    * The final [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) value to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object SceneViewGoToTarget {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    center: js.Array[Double] | Point = null,
    heading: Int | Double = null,
    position: Point = null,
    scale: Int | Double = null,
    target: (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint | Camera = null,
    tilt: Int | Double = null,
    zoom: Int | Double = null
  ): SceneViewGoToTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewGoToTarget]
  }
}

