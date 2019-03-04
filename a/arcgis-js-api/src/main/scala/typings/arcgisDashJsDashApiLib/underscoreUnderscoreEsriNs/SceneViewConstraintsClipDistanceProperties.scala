package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsClipDistanceProperties
  extends stdLib.Object {
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`. In `auto` mode, the near and far clip distance values are automatically determined. In `manual` mode, the near and far clip distance values are user defined, constant values. Note that the mode automatically changes to `manual` whenever the `near` or `far` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewConstraintsClipDistanceProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    far: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    near: scala.Int | scala.Double = null
  ): SceneViewConstraintsClipDistanceProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (far != null) __obj.updateDynamic("far")(far.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (near != null) __obj.updateDynamic("near")(near.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsClipDistanceProperties]
  }
}

