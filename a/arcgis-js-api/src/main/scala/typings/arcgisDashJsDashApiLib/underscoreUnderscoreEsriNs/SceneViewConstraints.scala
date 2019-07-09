package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraints extends AnonymousAccessor {
  /**
    * Specifies a constraint on the minimum and maximum allowed camera altitude.
    * > **Known Limitations**  The `altitude` constraints works just in global WebScene. (Not in local WebScene)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var altitude: js.UndefOr[SceneViewConstraintsAltitude] = js.undefined
  /**
    * Specifies the near and far webgl clip distances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var clipDistance: js.UndefOr[SceneViewConstraintsClipDistance] = js.undefined
  /**
    * When enabled, prevents the user from navigating below the surface in a local SceneView. This property is deprecated, please use [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint) instead.  **Deprecated since version 4.8**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var collision: js.UndefOr[SceneViewConstraintsCollision] = js.undefined
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTilt] = js.undefined
}

object SceneViewConstraints {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    altitude: SceneViewConstraintsAltitude = null,
    clipDistance: SceneViewConstraintsClipDistance = null,
    collision: SceneViewConstraintsCollision = null,
    get: /* propertyName */ java.lang.String => _ = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SceneViewConstraints]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewConstraints]) = null,
    tilt: SceneViewConstraintsTilt = null,
    watch: (/* path */ java.lang.String | js.Array[java.lang.String], /* callback */ WatchCallback, /* sync */ js.UndefOr[scala.Boolean]) => WatchHandle = null
  ): SceneViewConstraints = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (altitude != null) __obj.updateDynamic("altitude")(altitude)
    if (clipDistance != null) __obj.updateDynamic("clipDistance")(clipDistance)
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (tilt != null) __obj.updateDynamic("tilt")(tilt)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[SceneViewConstraints]
  }
}

