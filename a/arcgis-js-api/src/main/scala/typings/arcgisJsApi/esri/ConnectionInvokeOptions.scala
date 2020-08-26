package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInvokeOptions extends Object {
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the execution of the remote method. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * An array of [Transferable](https://developer.mozilla.org/en-US/docs/Web/API/Transferable) objects. Each transferable object in the array should have a corresponding entry in the data object. See [Using transferables](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#using-transferables) section for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var transferList: js.UndefOr[js.Array[_]] = js.native
}

object ConnectionInvokeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ConnectionInvokeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ConnectionInvokeOptions]
  }
  @scala.inline
  implicit class ConnectionInvokeOptionsOps[Self <: ConnectionInvokeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setTransferListVarargs(value: js.Any*): Self = this.set("transferList", js.Array(value :_*))
    @scala.inline
    def setTransferList(value: js.Array[_]): Self = this.set("transferList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferList: Self = this.set("transferList", js.undefined)
  }
  
}

