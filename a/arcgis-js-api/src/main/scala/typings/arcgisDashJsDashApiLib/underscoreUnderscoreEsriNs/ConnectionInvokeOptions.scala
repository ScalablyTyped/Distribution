package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInvokeOptions
  extends stdLib.Object {
  /**
    * A signal to abort the execution of the remote method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  /**
    * An array of [Transferable](https://developer.mozilla.org/en-US/docs/Web/API/Transferable) objects. Each transferable object in the array should have a corresponding entry in the data object. See [Using transferables](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#using-transferables) section for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var transferList: js.UndefOr[js.Array[_]] = js.undefined
}

object ConnectionInvokeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    signal: stdLib.AbortSignal = null,
    transferList: js.Array[_] = null
  ): ConnectionInvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (transferList != null) __obj.updateDynamic("transferList")(transferList)
    __obj.asInstanceOf[ConnectionInvokeOptions]
  }
}

