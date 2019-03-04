package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideDescription extends AnonymousAccessor {
  /**
    * The description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SlideDescription {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SlideDescription]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SlideDescription]) = null,
    text: java.lang.String = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SlideDescription = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (get != null) __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    if (text != null) __obj.updateDynamic("text")(text)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SlideDescription]
  }
}

