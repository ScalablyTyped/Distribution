package typings.apostrophe.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", "docs")
@js.native
object docs extends js.Object {
  def getManager(`type`: String): Unit = js.native
  def lock(id: String): Unit = js.native
  def lock(id: String, callback: js.Function0[_]): Unit = js.native
  def lockAndWatch(id: String): Unit = js.native
  def lockAndWatch(id: String, callback: js.Function0[_]): Unit = js.native
  def setManager(`type`: String, manager: js.Any): Unit = js.native
  def unlock(_id: String, sync: js.Any): js.Any = js.native
  def unlock(_id: String, sync: js.Any, callback: js.Function0[_]): js.Any = js.native
}

