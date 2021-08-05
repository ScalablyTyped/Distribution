package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectInformation extends StObject {
  
  val AfterEffect: MsoAnimAfterEffect
  
  val AnimateBackground: MsoTriState
  
  val AnimateTextInReverse: MsoTriState
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val BuildByLevelEffect: MsoAnimateByLevel
  
  val Dim: ColorFormat
  
  val Parent: js.Any
  
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings
  
  /* private */ @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: EffectInformation
  
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  
  val TextUnitEffect: MsoAnimTextUnitEffect
}
object EffectInformation {
  
  inline def apply(
    AfterEffect: MsoAnimAfterEffect,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    Application: Application,
    BuildByLevelEffect: MsoAnimateByLevel,
    Dim: ColorFormat,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotEffectInformation_typekey: EffectInformation,
    SoundEffect: SoundEffect,
    TextUnitEffect: MsoAnimTextUnitEffect
  ): EffectInformation = {
    val __obj = js.Dynamic.literal(AfterEffect = AfterEffect.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BuildByLevelEffect = BuildByLevelEffect.asInstanceOf[js.Any], Dim = Dim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectInformation_typekey")(PowerPointDotEffectInformation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectInformation]
  }
  
  extension [Self <: EffectInformation](x: Self) {
    
    inline def setAfterEffect(value: MsoAnimAfterEffect): Self = StObject.set(x, "AfterEffect", value.asInstanceOf[js.Any])
    
    inline def setAnimateBackground(value: MsoTriState): Self = StObject.set(x, "AnimateBackground", value.asInstanceOf[js.Any])
    
    inline def setAnimateTextInReverse(value: MsoTriState): Self = StObject.set(x, "AnimateTextInReverse", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuildByLevelEffect(value: MsoAnimateByLevel): Self = StObject.set(x, "BuildByLevelEffect", value.asInstanceOf[js.Any])
    
    inline def setDim(value: ColorFormat): Self = StObject.set(x, "Dim", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlaySettings(value: PlaySettings): Self = StObject.set(x, "PlaySettings", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotEffectInformation_typekey(value: EffectInformation): Self = StObject.set(x, "PowerPoint.EffectInformation_typekey", value.asInstanceOf[js.Any])
    
    inline def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
    
    inline def setTextUnitEffect(value: MsoAnimTextUnitEffect): Self = StObject.set(x, "TextUnitEffect", value.asInstanceOf[js.Any])
  }
}
