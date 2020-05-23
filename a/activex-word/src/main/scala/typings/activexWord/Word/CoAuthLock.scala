package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthLock extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val HeaderFooter: Boolean
  val Owner: CoAuthor
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Type: WdLockType
  @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: CoAuthLock
  def Unlock(): Unit
}

object CoAuthLock {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    HeaderFooter: Boolean,
    Owner: CoAuthor,
    Parent: js.Any,
    Range: Range,
    Type: WdLockType,
    Unlock: () => Unit,
    WordDotCoAuthLock_typekey: CoAuthLock
  ): CoAuthLock = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HeaderFooter = HeaderFooter.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlock = js.Any.fromFunction0(Unlock))
    __obj.updateDynamic("Word.CoAuthLock_typekey")(WordDotCoAuthLock_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthLock]
  }
}

