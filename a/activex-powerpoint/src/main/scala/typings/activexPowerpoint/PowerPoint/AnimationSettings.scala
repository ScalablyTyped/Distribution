package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationSettings extends StObject {
  
  var AdvanceMode: PpAdvanceMode
  
  var AdvanceTime: Double
  
  var AfterEffect: PpAfterEffect
  
  var Animate: MsoTriState
  
  var AnimateBackground: MsoTriState
  
  var AnimateTextInReverse: MsoTriState
  
  var AnimationOrder: Double
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var ChartUnitEffect: PpChartUnitEffect
  
  val DimColor: ColorFormat
  
  var EntryEffect: PpEntryEffect
  
  val Parent: Any
  
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings
  
  /* private */ @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: AnimationSettings
  
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  
  var TextLevelEffect: PpTextLevelEffect
  
  var TextUnitEffect: PpTextUnitEffect
}
object AnimationSettings {
  
  inline def apply(
    AdvanceMode: PpAdvanceMode,
    AdvanceTime: Double,
    AfterEffect: PpAfterEffect,
    Animate: MsoTriState,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    AnimationOrder: Double,
    Application: Application,
    ChartUnitEffect: PpChartUnitEffect,
    DimColor: ColorFormat,
    EntryEffect: PpEntryEffect,
    Parent: Any,
    PlaySettings: PlaySettings,
    PowerPointDotAnimationSettings_typekey: AnimationSettings,
    SoundEffect: SoundEffect,
    TextLevelEffect: PpTextLevelEffect,
    TextUnitEffect: PpTextUnitEffect
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], AfterEffect = AfterEffect.asInstanceOf[js.Any], Animate = Animate.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], AnimationOrder = AnimationOrder.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ChartUnitEffect = ChartUnitEffect.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextLevelEffect = TextLevelEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationSettings_typekey")(PowerPointDotAnimationSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSettings]
  }
  
  extension [Self <: AnimationSettings](x: Self) {
    
    inline def setAdvanceMode(value: PpAdvanceMode): Self = StObject.set(x, "AdvanceMode", value.asInstanceOf[js.Any])
    
    inline def setAdvanceTime(value: Double): Self = StObject.set(x, "AdvanceTime", value.asInstanceOf[js.Any])
    
    inline def setAfterEffect(value: PpAfterEffect): Self = StObject.set(x, "AfterEffect", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: MsoTriState): Self = StObject.set(x, "Animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateBackground(value: MsoTriState): Self = StObject.set(x, "AnimateBackground", value.asInstanceOf[js.Any])
    
    inline def setAnimateTextInReverse(value: MsoTriState): Self = StObject.set(x, "AnimateTextInReverse", value.asInstanceOf[js.Any])
    
    inline def setAnimationOrder(value: Double): Self = StObject.set(x, "AnimationOrder", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChartUnitEffect(value: PpChartUnitEffect): Self = StObject.set(x, "ChartUnitEffect", value.asInstanceOf[js.Any])
    
    inline def setDimColor(value: ColorFormat): Self = StObject.set(x, "DimColor", value.asInstanceOf[js.Any])
    
    inline def setEntryEffect(value: PpEntryEffect): Self = StObject.set(x, "EntryEffect", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlaySettings(value: PlaySettings): Self = StObject.set(x, "PlaySettings", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotAnimationSettings_typekey(value: AnimationSettings): Self = StObject.set(x, "PowerPoint.AnimationSettings_typekey", value.asInstanceOf[js.Any])
    
    inline def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
    
    inline def setTextLevelEffect(value: PpTextLevelEffect): Self = StObject.set(x, "TextLevelEffect", value.asInstanceOf[js.Any])
    
    inline def setTextUnitEffect(value: PpTextUnitEffect): Self = StObject.set(x, "TextUnitEffect", value.asInstanceOf[js.Any])
  }
}
