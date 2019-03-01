package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsAltitudeProperties
  extends stdLib.Object {
  /**
    * The maximum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default EARTH_RADIUS * 4
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default -∞
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewConstraintsAltitudeProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): SceneViewConstraintsAltitudeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsAltitudeProperties]
  }
}

