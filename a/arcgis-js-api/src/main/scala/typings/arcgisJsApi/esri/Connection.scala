package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * A convenient method that invokes a method on each worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#broadcast)
    *
    * @param methodName The name of the remote method to invoke on all workers.
    * @param data The unique parameter passed as argument of the remote method.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the executions of the remote method. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def broadcast(methodName: String): js.Array[js.Promise[_]] = js.native
  def broadcast(methodName: String, data: js.Any): js.Array[js.Promise[_]] = js.native
  def broadcast(methodName: String, data: js.Any, options: ConnectionBroadcastOptions): js.Array[js.Promise[_]] = js.native
  /**
    * Closes the existing connection instance to workers. Notifies all workers to destroy the connection instance and dispose the remote module.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#close)
    *
    *
    */
  def close(): Unit = js.native
  /**
    * Invokes a [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#basic-invocation) on the remote module loaded with the worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    *
    * @param methodName The name of the method to be invoked in the script.
    * @param data The unique parameter passed as argument of the remote method. See [Passing multiple parameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#multiple-parameters) section to pass more than one parameter to the remote method.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.transferList An array of [Transferable](https://developer.mozilla.org/en-US/docs/Web/API/Transferable) objects. Each transferable object in the array should have a corresponding entry in the data object. See [Using transferables](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#using-transferables) section for more information.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the execution of the remote method. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def invoke(methodName: String): js.Promise[_] = js.native
  def invoke(methodName: String, data: js.Any): js.Promise[_] = js.native
  def invoke(methodName: String, data: js.Any, options: ConnectionInvokeOptions): js.Promise[_] = js.native
}

