package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToParameters extends Object {
  /**
    * Animation options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#GoToParameters)
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * The target location/viewpoint to animate to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#GoToParameters)
    */
  var target: js.Any
}

object GoToParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    target: js.Any,
    options: js.Any = null
  ): GoToParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), target = target)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[GoToParameters]
  }
}

