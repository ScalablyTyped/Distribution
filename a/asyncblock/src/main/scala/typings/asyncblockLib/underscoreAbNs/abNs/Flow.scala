package typings
package asyncblockLib.underscoreAbNs.abNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flow extends js.Object {
  var errorCallback: js.Function = js.native
  var maxParallel: scala.Double = js.native
  var taskTimeout: scala.Double = js.native
  var timeoutIsError: scala.Boolean = js.native
  def add(): js.Any = js.native
  def add(key: js.Any): js.Any = js.native
  def add(options: TaskOptions): js.Any = js.native
  def callback(): js.Any = js.native
  def callback(key: js.Any): js.Any = js.native
  def callback(options: TaskOptions): js.Any = js.native
  def del(key: js.Any): js.Any = js.native
  def doneAdding(): scala.Unit = js.native
  def forceWait(): js.Any = js.native
  def get(key: js.Any): js.Any = js.native
  //task timeout (event = taskTimeout)
  def on(event: java.lang.String, handler: js.Function1[/* info */ asyncblockLib.Anon_Key, scala.Unit]): scala.Unit = js.native
  def queue(exec: js.Function): scala.Unit = js.native
  def queue(key: js.Any, exec: js.Function): scala.Unit = js.native
  def queue(options: TaskOptions, exec: js.Function): scala.Unit = js.native
  def set(): js.Function = js.native
  def set(key: js.Any): js.Function = js.native
  def set(key: js.Any, responseFormat: js.Array[java.lang.String]): js.Function = js.native
  def set(options: TaskOptions): js.Function = js.native
  def sync(func: js.Any): js.Any = js.native
  def wait(key: js.Any): js.Any = js.native
}

