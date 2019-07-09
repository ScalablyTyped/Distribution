package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewBaseGoToOptions
  extends stdLib.Object {
  /**
    * Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    *
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The duration of the animation in milliseconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    *
    * @default 200
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    *
    * @default ease
    */
  var easing: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).  **Possible Values:** linear | ease | ease-in | ease-out | ease-in-out
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object MapViewBaseGoToOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String | js.Function = null,
    signal: stdLib.AbortSignal = null
  ): MapViewBaseGoToOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[MapViewBaseGoToOptions]
  }
}

