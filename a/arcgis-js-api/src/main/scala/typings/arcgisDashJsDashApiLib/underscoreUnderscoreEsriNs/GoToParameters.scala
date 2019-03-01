package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToParameters
  extends stdLib.Object {
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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    target: js.Any,
    options: js.Any = null
  ): GoToParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("target")(target)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[GoToParameters]
  }
}

