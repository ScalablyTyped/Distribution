package typings.activexWord.global.Word

import typings.activexWord.Word.WdLockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLock")
@js.native
class CoAuthLock protected ()
  extends typings.activexWord.Word.CoAuthLock {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HeaderFooter: Boolean = js.native
  /* CompleteClass */
  override val Owner: typings.activexWord.Word.CoAuthor = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Type: WdLockType = js.native
  /* CompleteClass */
  @JSName("Word.CoAuthLock_typekey")
  override var WordDotCoAuthLock_typekey: typings.activexWord.Word.CoAuthLock = js.native
  /* CompleteClass */
  override def Unlock(): Unit = js.native
}

