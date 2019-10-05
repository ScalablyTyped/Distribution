package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLock")
@js.native
class CoAuthLock protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val HeaderFooter: Boolean = js.native
  val Owner: CoAuthor = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexDashWord.Word.Range = js.native
  val Type: WdLockType = js.native
  var `Word.CoAuthLock_typekey`: CoAuthLock = js.native
  def Unlock(): Unit = js.native
}

