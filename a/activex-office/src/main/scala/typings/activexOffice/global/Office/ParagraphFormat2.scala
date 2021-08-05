package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoBaselineAlignment
import typings.activexOffice.Office.MsoParagraphAlignment
import typings.activexOffice.Office.MsoTextDirection
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.TabStops2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ParagraphFormat2")
@js.native
/* private */ class ParagraphFormat2 ()
  extends StObject
     with typings.activexOffice.Office.ParagraphFormat2 {
  
  /* CompleteClass */
  var Alignment: MsoParagraphAlignment = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var BaselineAlignment: MsoBaselineAlignment = js.native
  
  /* CompleteClass */
  override val Bullet: typings.activexOffice.Office.BulletFormat2 = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var FarEastLineBreakLevel: MsoTriState = js.native
  
  /* CompleteClass */
  var FirstLineIndent: Double = js.native
  
  /* CompleteClass */
  var HangingPunctuation: MsoTriState = js.native
  
  /* CompleteClass */
  var IndentLevel: Double = js.native
  
  /* CompleteClass */
  var LeftIndent: Double = js.native
  
  /* CompleteClass */
  var LineRuleAfter: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleBefore: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleWithin: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ParagraphFormat2_typekey")
  var OfficeDotParagraphFormat2_typekey: typings.activexOffice.Office.ParagraphFormat2 = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RightIndent: Double = js.native
  
  /* CompleteClass */
  var SpaceAfter: Double = js.native
  
  /* CompleteClass */
  var SpaceBefore: Double = js.native
  
  /* CompleteClass */
  var SpaceWithin: Double = js.native
  
  /* CompleteClass */
  override def TabStops(Index: Double): typings.activexOffice.Office.TabStop2 = js.native
  /* CompleteClass */
  @JSName("TabStops")
  override val TabStops_Original: TabStops2 = js.native
  
  /* CompleteClass */
  var TextDirection: MsoTextDirection = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
