package typings.amplitudeDashJs.amplitudeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "Identify")
@js.native
class Identify () extends js.Object {
  def add(key: String, value: String): Identify = js.native
  def add(key: String, value: Double): Identify = js.native
  def append(key: String, value: js.Any): Identify = js.native
  def prepend(key: String, value: js.Any): Identify = js.native
  def set(key: String, value: js.Any): Identify = js.native
  def setOnce(key: String, value: js.Any): Identify = js.native
  def unset(key: String): Identify = js.native
}

@JSImport("amplitude-js", "identify")
@js.native
object identify extends js.Object {
  def apply(identify: Identify): Unit = js.native
  def apply(identify: Identify, callback: Callback): Unit = js.native
}

