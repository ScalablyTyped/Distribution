package typings.activexWord.global.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Version")
@js.native
class Version protected ()
  extends typings.activexWord.Word.Version {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Comment: String = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Date: VarDate = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SavedBy: String = js.native
  /* CompleteClass */
  @JSName("Word.Version_typekey")
  override var WordDotVersion_typekey: typings.activexWord.Word.Version = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): typings.activexWord.Word.Document = js.native
  /* CompleteClass */
  override def OpenOld(): Unit = js.native
}

