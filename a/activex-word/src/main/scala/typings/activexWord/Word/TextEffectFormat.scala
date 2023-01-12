package typings.activexWord.Word

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEffectFormat extends StObject {
  
  var Alignment: MsoTextEffectAlignment
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var FontBold: MsoTriState
  
  var FontItalic: MsoTriState
  
  var FontName: String
  
  var FontSize: Double
  
  var KernedPairs: MsoTriState
  
  var NormalizedHeight: MsoTriState
  
  val Parent: Any
  
  var PresetShape: MsoPresetTextEffectShape
  
  var PresetTextEffect: MsoPresetTextEffect
  
  var RotatedChars: MsoTriState
  
  var Text: String
  
  def ToggleVerticalText(): Unit
  
  var Tracking: Double
  
  /* private */ @JSName("Word.TextEffectFormat_typekey")
  var WordDotTextEffectFormat_typekey: TextEffectFormat
}
object TextEffectFormat {
  
  inline def apply(
    Alignment: MsoTextEffectAlignment,
    Application: Application,
    Creator: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    FontName: String,
    FontSize: Double,
    KernedPairs: MsoTriState,
    NormalizedHeight: MsoTriState,
    Parent: Any,
    PresetShape: MsoPresetTextEffectShape,
    PresetTextEffect: MsoPresetTextEffect,
    RotatedChars: MsoTriState,
    Text: String,
    ToggleVerticalText: () => Unit,
    Tracking: Double,
    WordDotTextEffectFormat_typekey: TextEffectFormat
  ): TextEffectFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], KernedPairs = KernedPairs.asInstanceOf[js.Any], NormalizedHeight = NormalizedHeight.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetShape = PresetShape.asInstanceOf[js.Any], PresetTextEffect = PresetTextEffect.asInstanceOf[js.Any], RotatedChars = RotatedChars.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], ToggleVerticalText = js.Any.fromFunction0(ToggleVerticalText), Tracking = Tracking.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextEffectFormat_typekey")(WordDotTextEffectFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEffectFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEffectFormat] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: MsoTextEffectAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFontBold(value: MsoTriState): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    inline def setFontItalic(value: MsoTriState): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setKernedPairs(value: MsoTriState): Self = StObject.set(x, "KernedPairs", value.asInstanceOf[js.Any])
    
    inline def setNormalizedHeight(value: MsoTriState): Self = StObject.set(x, "NormalizedHeight", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPresetShape(value: MsoPresetTextEffectShape): Self = StObject.set(x, "PresetShape", value.asInstanceOf[js.Any])
    
    inline def setPresetTextEffect(value: MsoPresetTextEffect): Self = StObject.set(x, "PresetTextEffect", value.asInstanceOf[js.Any])
    
    inline def setRotatedChars(value: MsoTriState): Self = StObject.set(x, "RotatedChars", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setToggleVerticalText(value: () => Unit): Self = StObject.set(x, "ToggleVerticalText", js.Any.fromFunction0(value))
    
    inline def setTracking(value: Double): Self = StObject.set(x, "Tracking", value.asInstanceOf[js.Any])
    
    inline def setWordDotTextEffectFormat_typekey(value: TextEffectFormat): Self = StObject.set(x, "Word.TextEffectFormat_typekey", value.asInstanceOf[js.Any])
  }
}
