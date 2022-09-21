package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphFormat2 extends StObject {
  
  var Alignment: MsoParagraphAlignment
  
  val Application: Any
  
  var BaselineAlignment: MsoBaselineAlignment
  
  val Bullet: BulletFormat2
  
  val Creator: Double
  
  var FarEastLineBreakLevel: MsoTriState
  
  var FirstLineIndent: Double
  
  var HangingPunctuation: MsoTriState
  
  var IndentLevel: Double
  
  var LeftIndent: Double
  
  var LineRuleAfter: MsoTriState
  
  var LineRuleBefore: MsoTriState
  
  var LineRuleWithin: MsoTriState
  
  /* private */ @JSName("Office.ParagraphFormat2_typekey")
  var OfficeDotParagraphFormat2_typekey: ParagraphFormat2
  
  val Parent: Any
  
  var RightIndent: Double
  
  var SpaceAfter: Double
  
  var SpaceBefore: Double
  
  var SpaceWithin: Double
  
  def TabStops(Index: Double): TabStop2
  @JSName("TabStops")
  val TabStops_Original: TabStops2
  
  var TextDirection: MsoTextDirection
  
  var WordWrap: MsoTriState
}
object ParagraphFormat2 {
  
  inline def apply(
    Alignment: MsoParagraphAlignment,
    Application: Any,
    BaselineAlignment: MsoBaselineAlignment,
    Bullet: BulletFormat2,
    Creator: Double,
    FarEastLineBreakLevel: MsoTriState,
    FirstLineIndent: Double,
    HangingPunctuation: MsoTriState,
    IndentLevel: Double,
    LeftIndent: Double,
    LineRuleAfter: MsoTriState,
    LineRuleBefore: MsoTriState,
    LineRuleWithin: MsoTriState,
    OfficeDotParagraphFormat2_typekey: ParagraphFormat2,
    Parent: Any,
    RightIndent: Double,
    SpaceAfter: Double,
    SpaceBefore: Double,
    SpaceWithin: Double,
    TabStops: TabStops2,
    TextDirection: MsoTextDirection,
    WordWrap: MsoTriState
  ): ParagraphFormat2 = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BaselineAlignment = BaselineAlignment.asInstanceOf[js.Any], Bullet = Bullet.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FarEastLineBreakLevel = FarEastLineBreakLevel.asInstanceOf[js.Any], FirstLineIndent = FirstLineIndent.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], IndentLevel = IndentLevel.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LineRuleAfter = LineRuleAfter.asInstanceOf[js.Any], LineRuleBefore = LineRuleBefore.asInstanceOf[js.Any], LineRuleWithin = LineRuleWithin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightIndent = RightIndent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceWithin = SpaceWithin.asInstanceOf[js.Any], TabStops = TabStops.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ParagraphFormat2_typekey")(OfficeDotParagraphFormat2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat2]
  }
  
  extension [Self <: ParagraphFormat2](x: Self) {
    
    inline def setAlignment(value: MsoParagraphAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBaselineAlignment(value: MsoBaselineAlignment): Self = StObject.set(x, "BaselineAlignment", value.asInstanceOf[js.Any])
    
    inline def setBullet(value: BulletFormat2): Self = StObject.set(x, "Bullet", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFarEastLineBreakLevel(value: MsoTriState): Self = StObject.set(x, "FarEastLineBreakLevel", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "FirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setHangingPunctuation(value: MsoTriState): Self = StObject.set(x, "HangingPunctuation", value.asInstanceOf[js.Any])
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "IndentLevel", value.asInstanceOf[js.Any])
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "LeftIndent", value.asInstanceOf[js.Any])
    
    inline def setLineRuleAfter(value: MsoTriState): Self = StObject.set(x, "LineRuleAfter", value.asInstanceOf[js.Any])
    
    inline def setLineRuleBefore(value: MsoTriState): Self = StObject.set(x, "LineRuleBefore", value.asInstanceOf[js.Any])
    
    inline def setLineRuleWithin(value: MsoTriState): Self = StObject.set(x, "LineRuleWithin", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotParagraphFormat2_typekey(value: ParagraphFormat2): Self = StObject.set(x, "Office.ParagraphFormat2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "RightIndent", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "SpaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "SpaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceWithin(value: Double): Self = StObject.set(x, "SpaceWithin", value.asInstanceOf[js.Any])
    
    inline def setTabStops(value: TabStops2): Self = StObject.set(x, "TabStops", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: MsoTextDirection): Self = StObject.set(x, "TextDirection", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
