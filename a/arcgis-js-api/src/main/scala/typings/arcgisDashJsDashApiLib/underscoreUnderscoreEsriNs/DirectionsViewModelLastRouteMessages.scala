package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelLastRouteMessages
  extends stdLib.Object {
  /**
    * A descriptive message of the returned mesage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var description: java.lang.String
  /**
    * Number indicating the message type returned from the service. This number correlates to one of the possible values listed below.
    *
    * Number | Value
    * ------|------------
    * 0 | informative
    * 1 | process-definition
    * 2 | process-start
    * 3 | process-stop
    * 50 | warning
    * 100 | error
    * 101 | empty
    * 200 | abort
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  var `type`: scala.Double
}

object DirectionsViewModelLastRouteMessages {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: scala.Double
  ): DirectionsViewModelLastRouteMessages = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DirectionsViewModelLastRouteMessages]
  }
}

