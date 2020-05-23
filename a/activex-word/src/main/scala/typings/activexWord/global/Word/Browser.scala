package typings.activexWord.global.Word

import typings.activexWord.Word.WdBrowseTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Browser")
@js.native
class Browser protected ()
  extends typings.activexWord.Word.Browser {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Target: WdBrowseTarget = js.native
  /* CompleteClass */
  @JSName("Word.Browser_typekey")
  override var WordDotBrowser_typekey: typings.activexWord.Word.Browser = js.native
  /* CompleteClass */
  override def Next(): Unit = js.native
  /* CompleteClass */
  override def Previous(): Unit = js.native
}

