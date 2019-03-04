package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionBroadcastOptions
  extends stdLib.Object {
  /**
    * A signal to abort the executions of the remote method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#broadcast)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object ConnectionBroadcastOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    signal: stdLib.AbortSignal = null
  ): ConnectionBroadcastOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ConnectionBroadcastOptions]
  }
}

