package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLock")
@js.native
class CoAuthLock protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  val HeaderFooter: scala.Boolean = js.native
  val Owner: CoAuthor = js.native
  val Parent: js.Any = js.native
  val Range: activexDashWordLib.WordNs.Range = js.native
  val Type: WdLockType = js.native
  var `Word.CoAuthLock_typekey`: CoAuthLock = js.native
  def Unlock(): scala.Unit = js.native
}

