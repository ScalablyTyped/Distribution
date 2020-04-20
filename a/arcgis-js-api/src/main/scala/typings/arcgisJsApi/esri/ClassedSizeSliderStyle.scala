package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderStyle extends AnonymousAccessor {
  /**
    * The background color of the slider's track. Generally, this color should be subdued and not interfere with the `trackFillColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    *
    * @default new Color([224, 224, 224])
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.undefined
  /**
    * The color of the slider's track. For single-color visualizations where only a Size variable is present, you should set this color to match the color of the symbol in the [SimpleRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    *
    * @default new Color([149, 149, 149])
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}

object ClassedSizeSliderStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    get: /* propertyName */ String => _ = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, ClassedSizeSliderStyle]) with (js.Function1[/* props */ HashMap[_], ClassedSizeSliderStyle]) = null,
    trackBackgroundColor: Color_ = null,
    trackFillColor: Color_ = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): ClassedSizeSliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (trackBackgroundColor != null) __obj.updateDynamic("trackBackgroundColor")(trackBackgroundColor.asInstanceOf[js.Any])
    if (trackFillColor != null) __obj.updateDynamic("trackFillColor")(trackFillColor.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[ClassedSizeSliderStyle]
  }
}

