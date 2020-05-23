package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoPathFormat
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexOffice.Office.MsoWarpFormat
import typings.activexOffice.Office.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected ()
  extends typings.activexWord.Word.TextFrame {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var AutoSize: Double = js.native
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  /* CompleteClass */
  override val ContainingRange: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HasText: Double = js.native
  /* CompleteClass */
  override var HorizontalAnchor: MsoHorizontalAnchor = js.native
  /* CompleteClass */
  override var MarginBottom: Double = js.native
  /* CompleteClass */
  override var MarginLeft: Double = js.native
  /* CompleteClass */
  override var MarginRight: Double = js.native
  /* CompleteClass */
  override var MarginTop: Double = js.native
  /* CompleteClass */
  override var Next: typings.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override var NoTextRotation: MsoTriState = js.native
  /* CompleteClass */
  override var Orientation: MsoTextOrientation = js.native
  /* CompleteClass */
  override val Overflowing: Boolean = js.native
  /* CompleteClass */
  override val Parent: typings.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override var PathFormat: MsoPathFormat = js.native
  /* CompleteClass */
  override var Previous: typings.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override val TextRange: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val ThreeD: typings.activexWord.Word.ThreeDFormat = js.native
  /* CompleteClass */
  override var VerticalAnchor: MsoVerticalAnchor = js.native
  /* CompleteClass */
  override var WarpFormat: MsoWarpFormat = js.native
  /* CompleteClass */
  @JSName("Word.TextFrame_typekey")
  override var WordDotTextFrame_typekey: typings.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override var WordWrap: Double = js.native
  /* CompleteClass */
  override def BreakForwardLink(): Unit = js.native
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  /* CompleteClass */
  override def ValidLinkTarget(TargetTextFrame: typings.activexWord.Word.TextFrame): Boolean = js.native
}

