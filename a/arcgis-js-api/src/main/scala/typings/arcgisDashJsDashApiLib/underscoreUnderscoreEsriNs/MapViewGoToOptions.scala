package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewGoToOptions
  extends stdLib.Object {
  /**
    * Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The duration of the animation in milliseconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default 200
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.  **Possible Values:** linear | ease | ease-in | ease-out | ease-in-out
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default ease
    */
  var easing: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object MapViewGoToOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String | js.Function = null
  ): MapViewGoToOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewGoToOptions]
  }
}

