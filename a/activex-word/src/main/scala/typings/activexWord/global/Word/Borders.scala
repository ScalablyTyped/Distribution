package typings.activexWord.global.Word

import typings.activexWord.Word.WdBorderDistanceFrom
import typings.activexWord.Word.WdBorderType
import typings.activexWord.Word.WdColor
import typings.activexWord.Word.WdColorIndex
import typings.activexWord.Word.WdLineStyle
import typings.activexWord.Word.WdLineWidth
import typings.activexWord.activexWordNumbers.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Borders")
@js.native
class Borders protected ()
  extends StObject
     with typings.activexWord.Word.Borders {
  
  /* CompleteClass */
  var AlwaysInFront: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def ApplyPageBordersToAllSections(): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var DistanceFrom: WdBorderDistanceFrom = js.native
  
  /* CompleteClass */
  var DistanceFromBottom: Double = js.native
  
  /* CompleteClass */
  var DistanceFromLeft: Double = js.native
  
  /* CompleteClass */
  var DistanceFromRight: Double = js.native
  
  /* CompleteClass */
  var DistanceFromTop: Double = js.native
  
  /* CompleteClass */
  var Enable: Boolean | `9999999` | WdLineStyle = js.native
  
  /* CompleteClass */
  var EnableFirstPageInSection: Boolean = js.native
  
  /* CompleteClass */
  var EnableOtherPagesInSection: Boolean = js.native
  
  /* CompleteClass */
  override val HasHorizontal: Boolean = js.native
  
  /* CompleteClass */
  override val HasVertical: Boolean = js.native
  
  /* CompleteClass */
  var InsideColor: WdColor = js.native
  
  /* CompleteClass */
  var InsideColorIndex: WdColorIndex = js.native
  
  /* CompleteClass */
  var InsideLineStyle: WdLineStyle = js.native
  
  /* CompleteClass */
  var InsideLineWidth: WdLineWidth = js.native
  
  /* CompleteClass */
  override def Item(Index: WdBorderType): typings.activexWord.Word.Border = js.native
  
  /* CompleteClass */
  var JoinBorders: Boolean = js.native
  
  /* CompleteClass */
  var OutsideColor: WdColor = js.native
  
  /* CompleteClass */
  var OutsideColorIndex: WdColorIndex = js.native
  
  /* CompleteClass */
  var OutsideLineStyle: WdLineStyle = js.native
  
  /* CompleteClass */
  var OutsideLineWidth: WdLineWidth = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Shadow: Boolean = js.native
  
  /* CompleteClass */
  var SurroundFooter: Boolean = js.native
  
  /* CompleteClass */
  var SurroundHeader: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: typings.activexWord.Word.Borders = js.native
}
