package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphFormat extends StObject {
  
  var Alignment: PpParagraphAlignment
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var BaseLineAlignment: PpBaselineAlignment
  
  val Bullet: BulletFormat
  
  var FarEastLineBreakControl: MsoTriState
  
  var HangingPunctuation: MsoTriState
  
  var LineRuleAfter: MsoTriState
  
  var LineRuleBefore: MsoTriState
  
  var LineRuleWithin: MsoTriState
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: ParagraphFormat
  
  var SpaceAfter: Double
  
  var SpaceBefore: Double
  
  var SpaceWithin: Double
  
  var TextDirection: PpDirection
  
  var WordWrap: MsoTriState
}
object ParagraphFormat {
  
  inline def apply(
    Alignment: PpParagraphAlignment,
    Application: Application,
    BaseLineAlignment: PpBaselineAlignment,
    Bullet: BulletFormat,
    FarEastLineBreakControl: MsoTriState,
    HangingPunctuation: MsoTriState,
    LineRuleAfter: MsoTriState,
    LineRuleBefore: MsoTriState,
    LineRuleWithin: MsoTriState,
    Parent: js.Any,
    PowerPointDotParagraphFormat_typekey: ParagraphFormat,
    SpaceAfter: Double,
    SpaceBefore: Double,
    SpaceWithin: Double,
    TextDirection: PpDirection,
    WordWrap: MsoTriState
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Bullet = Bullet.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], LineRuleAfter = LineRuleAfter.asInstanceOf[js.Any], LineRuleBefore = LineRuleBefore.asInstanceOf[js.Any], LineRuleWithin = LineRuleWithin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceWithin = SpaceWithin.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ParagraphFormat_typekey")(PowerPointDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  
  extension [Self <: ParagraphFormat](x: Self) {
    
    inline def setAlignment(value: PpParagraphAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBaseLineAlignment(value: PpBaselineAlignment): Self = StObject.set(x, "BaseLineAlignment", value.asInstanceOf[js.Any])
    
    inline def setBullet(value: BulletFormat): Self = StObject.set(x, "Bullet", value.asInstanceOf[js.Any])
    
    inline def setFarEastLineBreakControl(value: MsoTriState): Self = StObject.set(x, "FarEastLineBreakControl", value.asInstanceOf[js.Any])
    
    inline def setHangingPunctuation(value: MsoTriState): Self = StObject.set(x, "HangingPunctuation", value.asInstanceOf[js.Any])
    
    inline def setLineRuleAfter(value: MsoTriState): Self = StObject.set(x, "LineRuleAfter", value.asInstanceOf[js.Any])
    
    inline def setLineRuleBefore(value: MsoTriState): Self = StObject.set(x, "LineRuleBefore", value.asInstanceOf[js.Any])
    
    inline def setLineRuleWithin(value: MsoTriState): Self = StObject.set(x, "LineRuleWithin", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotParagraphFormat_typekey(value: ParagraphFormat): Self = StObject.set(x, "PowerPoint.ParagraphFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "SpaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "SpaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceWithin(value: Double): Self = StObject.set(x, "SpaceWithin", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: PpDirection): Self = StObject.set(x, "TextDirection", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
