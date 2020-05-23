package typings.asyncblock.ab.ab

import typings.asyncblock.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flow extends js.Object {
  var errorCallback: js.Function = js.native
  var maxParallel: Double = js.native
  var taskTimeout: Double = js.native
  var timeoutIsError: Boolean = js.native
  def add(): js.Any = js.native
  def add(key: js.Any): js.Any = js.native
  def add(options: TaskOptions): js.Any = js.native
  def callback(): js.Any = js.native
  def callback(key: js.Any): js.Any = js.native
  def callback(options: TaskOptions): js.Any = js.native
  def del(key: js.Any): js.Any = js.native
  def doneAdding(): Unit = js.native
  def forceWait(): js.Any = js.native
  def get(key: js.Any): js.Any = js.native
  //task timeout (event = taskTimeout)
  def on(event: String, handler: js.Function1[/* info */ Key, Unit]): Unit = js.native
  def queue(exec: js.Function): Unit = js.native
  def queue(key: js.Any, exec: js.Function): Unit = js.native
  def queue(options: TaskOptions, exec: js.Function): Unit = js.native
  def set(): js.Function = js.native
  def set(key: js.Any): js.Function = js.native
  def set(key: js.Any, responseFormat: js.Array[String]): js.Function = js.native
  def set(options: TaskOptions): js.Function = js.native
  def sync(func: js.Any): js.Any = js.native
  def wait(key: js.Any): js.Any = js.native
}

