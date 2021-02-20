package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphFormat2 extends StObject {
  
  var Alignment: MsoParagraphAlignment = js.native
  
  val Application: js.Any = js.native
  
  var BaselineAlignment: MsoBaselineAlignment = js.native
  
  val Bullet: BulletFormat2 = js.native
  
  val Creator: Double = js.native
  
  var FarEastLineBreakLevel: MsoTriState = js.native
  
  var FirstLineIndent: Double = js.native
  
  var HangingPunctuation: MsoTriState = js.native
  
  var IndentLevel: Double = js.native
  
  var LeftIndent: Double = js.native
  
  var LineRuleAfter: MsoTriState = js.native
  
  var LineRuleBefore: MsoTriState = js.native
  
  var LineRuleWithin: MsoTriState = js.native
  
  @JSName("Office.ParagraphFormat2_typekey")
  var OfficeDotParagraphFormat2_typekey: ParagraphFormat2 = js.native
  
  val Parent: js.Any = js.native
  
  var RightIndent: Double = js.native
  
  var SpaceAfter: Double = js.native
  
  var SpaceBefore: Double = js.native
  
  var SpaceWithin: Double = js.native
  
  def TabStops(Index: Double): TabStop2 = js.native
  @JSName("TabStops")
  val TabStops_Original: TabStops2 = js.native
  
  var TextDirection: MsoTextDirection = js.native
  
  var WordWrap: MsoTriState = js.native
}
