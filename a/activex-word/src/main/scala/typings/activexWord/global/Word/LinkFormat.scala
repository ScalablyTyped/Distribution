package typings.activexWord.global.Word

import typings.activexWord.Word.WdLinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.LinkFormat")
@js.native
class LinkFormat protected ()
  extends typings.activexWord.Word.LinkFormat {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var AutoUpdate: Boolean = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var SavePictureWithDocument: Boolean = js.native
  /* CompleteClass */
  override var SourceFullName: String = js.native
  /* CompleteClass */
  override val SourceName: String = js.native
  /* CompleteClass */
  override val SourcePath: String = js.native
  /* CompleteClass */
  override val Type: WdLinkType = js.native
  /* CompleteClass */
  @JSName("Word.LinkFormat_typekey")
  override var WordDotLinkFormat_typekey: typings.activexWord.Word.LinkFormat = js.native
  /* CompleteClass */
  override def BreakLink(): Unit = js.native
  /* CompleteClass */
  override def Update(): Unit = js.native
}

