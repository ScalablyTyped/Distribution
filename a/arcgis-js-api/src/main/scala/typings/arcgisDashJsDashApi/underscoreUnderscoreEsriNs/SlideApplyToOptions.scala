package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideApplyToOptions extends Object {
  /**
    * Indicates whether to animate the slide transition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the exact duration (in milliseconds) of the animation. Note that by default, animation duration is calculated based on the time required to reach the target at a constant speed. Setting duration overrides the speedFactor option. Note that the resulting duration is still limited to the maxDuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing function to use for the animation. This may either be a preset (named) function, or a user specified function. Supported named presets are: `linear`, `in-cubic`, `out-cubic`, `in-out-cubic`, `in-expo`, `out-expo`, `in-out-expo` By default, animations that are less than 1000 ms use an out easing function; longer animations use an in-out function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var easing: js.UndefOr[String | EasingFunction] = js.undefined
  /**
    * The maximum allowed duration (in milliseconds) of the animation. The default maxDuration value takes the specified speedFactor into account.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default 8000
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /**
    * Signal object that can be used to abort the asynchronous task. Aborting will cause the slide animation to stop. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Increases or decreases the animation speed by the specified factor. A speedFactor of 2 will make the animation twice as fast, while a speedFactor of 0.5 will make the animation half as fast. Setting the speed factor will automatically adapt the default maxDuration accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default 1
    */
  var speedFactor: js.UndefOr[Double] = js.undefined
}

object SlideApplyToOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: String | EasingFunction = null,
    maxDuration: Int | Double = null,
    signal: AbortSignal = null,
    speedFactor: Int | Double = null
  ): SlideApplyToOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (speedFactor != null) __obj.updateDynamic("speedFactor")(speedFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideApplyToOptions]
  }
}

