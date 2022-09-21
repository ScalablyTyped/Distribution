package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  /**
    * A convenient method that invokes a method on each worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#broadcast)
    */
  def broadcast(methodName: String): js.Array[js.Promise[Any]] = js.native
  def broadcast(methodName: String, data: Any): js.Array[js.Promise[Any]] = js.native
  def broadcast(methodName: String, data: Any, options: ConnectionBroadcastOptions): js.Array[js.Promise[Any]] = js.native
  def broadcast(methodName: String, data: scala.Unit, options: ConnectionBroadcastOptions): js.Array[js.Promise[Any]] = js.native
  
  /**
    * Closes the existing connection instance to workers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#close)
    */
  def close(): scala.Unit = js.native
  
  /**
    * Invokes a [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#basic-invocation) on the remote module loaded with the worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  def invoke(methodName: String): js.Promise[Any] = js.native
  def invoke(methodName: String, data: Any): js.Promise[Any] = js.native
  def invoke(methodName: String, data: Any, options: ConnectionInvokeOptions): js.Promise[Any] = js.native
  def invoke(methodName: String, data: scala.Unit, options: ConnectionInvokeOptions): js.Promise[Any] = js.native
}
