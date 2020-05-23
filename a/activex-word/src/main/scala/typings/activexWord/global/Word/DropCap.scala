package typings.activexWord.global.Word

import typings.activexWord.Word.WdDropPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DropCap")
@js.native
class DropCap protected ()
  extends typings.activexWord.Word.DropCap {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var DistanceFromText: Double = js.native
  /* CompleteClass */
  override var FontName: String = js.native
  /* CompleteClass */
  override var LinesToDrop: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: WdDropPosition = js.native
  /* CompleteClass */
  @JSName("Word.DropCap_typekey")
  override var WordDotDropCap_typekey: typings.activexWord.Word.DropCap = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def Enable(): Unit = js.native
}

