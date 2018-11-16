package typings
package androiduixLib.androidNs.osNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Bundle")
@js.native
class Bundle () extends js.Object {
  def this(copy: Bundle) = this()
  def containsKey(key: java.lang.String): scala.Boolean = js.native
  def get(key: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def put(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

