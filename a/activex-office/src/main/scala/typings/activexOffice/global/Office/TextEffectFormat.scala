package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.TextEffectFormat")
@js.native
class TextEffectFormat protected ()
  extends StObject
     with typings.activexOffice.Office.TextEffectFormat {
  
  /* CompleteClass */
  var Alignment: MsoTextEffectAlignment = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var FontBold: MsoTriState = js.native
  
  /* CompleteClass */
  var FontItalic: MsoTriState = js.native
  
  /* CompleteClass */
  var FontName: String = js.native
  
  /* CompleteClass */
  var FontSize: Double = js.native
  
  /* CompleteClass */
  var KernedPairs: MsoTriState = js.native
  
  /* CompleteClass */
  var NormalizedHeight: MsoTriState = js.native
  
  /* CompleteClass */
  @JSName("Office.TextEffectFormat_typekey")
  var OfficeDotTextEffectFormat_typekey: typings.activexOffice.Office.TextEffectFormat = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PresetShape: MsoPresetTextEffectShape = js.native
  
  /* CompleteClass */
  var PresetTextEffect: MsoPresetTextEffect = js.native
  
  /* CompleteClass */
  var RotatedChars: MsoTriState = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* CompleteClass */
  override def ToggleVerticalText(): Unit = js.native
  
  /* CompleteClass */
  var Tracking: Double = js.native
}
