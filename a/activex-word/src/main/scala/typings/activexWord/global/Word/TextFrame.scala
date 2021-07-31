package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoPathFormat
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexOffice.Office.MsoWarpFormat
import typings.activexOffice.Office.TextColumn2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected ()
  extends StObject
     with typings.activexWord.Word.TextFrame {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var AutoSize: Double = js.native
  
  /* CompleteClass */
  override def BreakForwardLink(): Unit = js.native
  
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  
  /* CompleteClass */
  override val ContainingRange: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  
  /* CompleteClass */
  override val HasText: Double = js.native
  
  /* CompleteClass */
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  
  /* CompleteClass */
  var MarginBottom: Double = js.native
  
  /* CompleteClass */
  var MarginLeft: Double = js.native
  
  /* CompleteClass */
  var MarginRight: Double = js.native
  
  /* CompleteClass */
  var MarginTop: Double = js.native
  
  /* CompleteClass */
  var Next: typings.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  var NoTextRotation: MsoTriState = js.native
  
  /* CompleteClass */
  var Orientation: MsoTextOrientation = js.native
  
  /* CompleteClass */
  override val Overflowing: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  var PathFormat: MsoPathFormat = js.native
  
  /* CompleteClass */
  var Previous: typings.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  override val TextRange: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val ThreeD: typings.activexWord.Word.ThreeDFormat = js.native
  
  /* CompleteClass */
  override def ValidLinkTarget(TargetTextFrame: typings.activexWord.Word.TextFrame): Boolean = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WarpFormat: MsoWarpFormat = js.native
  
  /* CompleteClass */
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: typings.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  var WordWrap: Double = js.native
}
