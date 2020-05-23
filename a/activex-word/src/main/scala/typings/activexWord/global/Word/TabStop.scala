package typings.activexWord.global.Word

import typings.activexWord.Word.WdTabAlignment
import typings.activexWord.Word.WdTabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TabStop")
@js.native
class TabStop protected ()
  extends typings.activexWord.Word.TabStop {
  /* CompleteClass */
  override var Alignment: WdTabAlignment = js.native
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val CustomTab: Boolean = js.native
  /* CompleteClass */
  override var Leader: WdTabLeader = js.native
  /* CompleteClass */
  override val Next: typings.activexWord.Word.TabStop = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val Previous: typings.activexWord.Word.TabStop = js.native
  /* CompleteClass */
  @JSName("Word.TabStop_typekey")
  override var WordDotTabStop_typekey: typings.activexWord.Word.TabStop = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
}

