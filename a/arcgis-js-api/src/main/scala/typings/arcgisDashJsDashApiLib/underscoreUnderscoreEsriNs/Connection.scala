package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    * @param options.signal A signal to abort the executions of the remote method.
    *
    */
  def broadcast(methodName: java.lang.String): js.Array[arcgisDashJsDashApiLib.IPromise[_]] = js.native
  def broadcast(methodName: java.lang.String, data: js.Any): js.Array[arcgisDashJsDashApiLib.IPromise[_]] = js.native
  def broadcast(methodName: java.lang.String, data: js.Any, options: ConnectionBroadcastOptions): js.Array[arcgisDashJsDashApiLib.IPromise[_]] = js.native
  /**
    * Closes the existing connection instance to workers. Notifies all workers to destroy the connection instance and dispose the remote module.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#close)
    *
    *
    */
  def close(): scala.Unit = js.native
  /**
    * Invokes a [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#basic-invocation) on the remote module loaded with the worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    *
    * @param methodName The name of the method to be invoked in the script.
    * @param data The unique parameter passed as argument of the remote method. See [Passing multiple parameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#multiple-parameters) section to pass more than one parameter to the remote method.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.transferList An array of [Transferable](https://developer.mozilla.org/en-US/docs/Web/API/Transferable) objects. Each transferable object in the array should have a corresponding entry in the data object. See [Using transferables](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#using-transferables) section for more information.
    * @param options.signal A signal to abort the execution of the remote method.
    *
    */
  def invoke(methodName: java.lang.String): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def invoke(methodName: java.lang.String, data: js.Any): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def invoke(methodName: java.lang.String, data: js.Any, options: ConnectionInvokeOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

@JSGlobal("__esri.Connection")
@js.native
/**
  * This class is used to execute remote methods located on the module loaded into a separate thread via the [workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html)
  */
class ConnectionCls () extends Connection

