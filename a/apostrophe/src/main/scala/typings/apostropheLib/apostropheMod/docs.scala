package typings
package apostropheLib.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", "docs")
@js.native
object docs extends js.Object {
  def getManager(`type`: java.lang.String): scala.Unit = js.native
  def lock(id: java.lang.String): scala.Unit = js.native
  def lock(id: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def lockAndWatch(id: java.lang.String): scala.Unit = js.native
  def lockAndWatch(id: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def setManager(`type`: java.lang.String, manager: js.Any): scala.Unit = js.native
  def unlock(_id: java.lang.String, sync: js.Any): js.Any = js.native
  def unlock(_id: java.lang.String, sync: js.Any, callback: js.Function0[_]): js.Any = js.native
}

