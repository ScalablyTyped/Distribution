package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsTilt extends AnonymousAccessor {
  /**
    * Specifies the maximum amount of tilt (in degrees) allowed in the view and may range from 0.5 to 179.5 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the mode of the constraint. There are two possible values: `auto` or `manual`. In `auto` mode, the maximum tilt value is automatically determined based on the altitude of the view camera. In `manual` mode, the maximum tilt value is a user defined, constant value. **Note:** The mode automatically changes to `manual` whenever the `max` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object SceneViewConstraintsTilt {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    max: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SceneViewConstraintsTilt]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewConstraintsTilt]) = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SceneViewConstraintsTilt = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (get != null) __obj.updateDynamic("get")(get)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SceneViewConstraintsTilt]
  }
}

