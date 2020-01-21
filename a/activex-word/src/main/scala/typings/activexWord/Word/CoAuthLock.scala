package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLock")
@js.native
class CoAuthLock protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val HeaderFooter: Boolean = js.native
  val Owner: CoAuthor = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Type: WdLockType = js.native
  @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: CoAuthLock = js.native
  def Unlock(): Unit = js.native
}

