package typings
package apostropheLib.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", "modalSupport")
@js.native
object modalSupport extends js.Object {
  var all: js.Array[_] = js.native
  var depth: scala.Double = js.native
  var initialized: scala.Boolean = js.native
  var stack: js.Array[_] = js.native
  def cancelTopModal(): scala.Unit = js.native
  def closeTopModal(): scala.Unit = js.native
  def getLatestModal(): scala.Null | java.lang.String = js.native
  def getTopModalOrBody(): java.lang.String = js.native
}

