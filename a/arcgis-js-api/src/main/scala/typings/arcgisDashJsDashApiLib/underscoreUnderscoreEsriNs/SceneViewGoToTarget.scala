package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewGoToTarget
  extends stdLib.Object {
  /**
    * The [SceneView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var center: js.UndefOr[js.Array[scala.Double] | Point] = js.undefined
  /**
    * The [Camera.heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
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
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var target: js.UndefOr[
    js.Array[scala.Double] | Geometry | js.Array[Geometry] | Graphic | js.Array[Graphic] | Viewpoint | Camera
  ] = js.undefined
  /**
    * The [Camera.tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /**
    * The final [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) value to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewGoToTarget {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    center: js.Array[scala.Double] | Point = null,
    heading: scala.Int | scala.Double = null,
    position: Point = null,
    scale: scala.Int | scala.Double = null,
    target: js.Array[scala.Double] | Geometry | js.Array[Geometry] | Graphic | js.Array[Graphic] | Viewpoint | Camera = null,
    tilt: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): SceneViewGoToTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
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

