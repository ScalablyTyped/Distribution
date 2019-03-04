package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideApplyToOptions
  extends stdLib.Object {
  /**
    * Indicates whether to animate the slide transition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the exact duration (in milliseconds) of the animation. Note that by default, animation duration is calculated based on the time required to reach the target at a constant speed. Setting duration overrides the speedFactor option. Note that the resulting duration is still limited to the maxDuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing function to use for the animation. This may either be a preset (named) function, or a user specified function. Supported named presets are: `linear`, `in-cubic`, `out-cubic`, `in-out-cubic`, `in-expo`, `out-expo`, `in-out-expo` By default, animations that are less than 1000 ms use an out easing function; longer animations use an in-out function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var easing: js.UndefOr[java.lang.String | EasingFunction] = js.undefined
  /**
    * The maximum allowed duration (in milliseconds) of the animation. The default maxDuration value takes the specified speedFactor into account.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default 8000
    */
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Increases or decreases the animation speed by the specified factor. A speedFactor of 2 will make the animation twice as fast, while a speedFactor of 0.5 will make the animation half as fast. Setting the speed factor will automatically adapt the default maxDuration accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @default 1
    */
  var speedFactor: js.UndefOr[scala.Double] = js.undefined
}

object SlideApplyToOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String | EasingFunction = null,
    maxDuration: scala.Int | scala.Double = null,
    speedFactor: scala.Int | scala.Double = null
  ): SlideApplyToOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (speedFactor != null) __obj.updateDynamic("speedFactor")(speedFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideApplyToOptions]
  }
}

