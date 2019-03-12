package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsClipDistance extends AnonymousAccessor {
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

object SceneViewConstraintsClipDistance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    far: scala.Int | scala.Double = null,
    get: /* propertyName */ java.lang.String => _ = null,
    mode: java.lang.String = null,
    near: scala.Int | scala.Double = null,
    set: (js.Function2[
      /* propertyName */ java.lang.String, 
      /* value */ js.Any, 
      SceneViewConstraintsClipDistance
    ]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewConstraintsClipDistance]) = null,
    watch: (/* path */ java.lang.String | js.Array[java.lang.String], /* callback */ WatchCallback, /* sync */ js.UndefOr[scala.Boolean]) => WatchHandle = null
  ): SceneViewConstraintsClipDistance = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (far != null) __obj.updateDynamic("far")(far.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (near != null) __obj.updateDynamic("near")(near.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[SceneViewConstraintsClipDistance]
  }
}

