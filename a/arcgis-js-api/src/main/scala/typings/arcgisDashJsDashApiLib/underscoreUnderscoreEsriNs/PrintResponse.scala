package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintResponse
  extends stdLib.Object {
  /**
    * URL pointing to the location of the generated printout of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html#PrintResponse)
    */
  var url: java.lang.String
}

object PrintResponse {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    url: java.lang.String
  ): PrintResponse = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, url = url)
  
    __obj.asInstanceOf[PrintResponse]
  }
}

