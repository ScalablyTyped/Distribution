package typings.androiduix.android.os

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Bundle")
@js.native
class Bundle () extends js.Object {
  def this(copy: Bundle) = this()
  def containsKey(key: String): Boolean = js.native
  def get(key: String, defaultValue: js.Any): js.Any = js.native
  def put(key: String, value: js.Any): Unit = js.native
}

