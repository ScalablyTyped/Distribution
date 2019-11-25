package typings.arcgisDashJsDashApi.__esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInvokeOptions extends Object {
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the execution of the remote method. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
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
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    signal: AbortSignal = null,
    transferList: js.Array[_] = null
  ): ConnectionInvokeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (transferList != null) __obj.updateDynamic("transferList")(transferList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInvokeOptions]
  }
}

