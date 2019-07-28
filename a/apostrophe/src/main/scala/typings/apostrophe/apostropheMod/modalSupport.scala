package typings.apostrophe.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", "modalSupport")
@js.native
object modalSupport extends js.Object {
  var all: js.Array[_] = js.native
  var depth: Double = js.native
  var initialized: Boolean = js.native
  var stack: js.Array[_] = js.native
  def cancelTopModal(): Unit = js.native
  def closeTopModal(): Unit = js.native
  def getLatestModal(): Null | String = js.native
  def getTopModalOrBody(): String = js.native
}

