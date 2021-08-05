package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import typings.activexWord.Word.WdThemeColorIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ColorFormat")
@js.native
/* private */ class ColorFormat ()
  extends StObject
     with typings.activexWord.Word.ColorFormat {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Black: Double = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Cyan: Double = js.native
  
  /* CompleteClass */
  override def Ink(Index: Double): Double = js.native
  
  /* CompleteClass */
  var Magenta: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var ObjectThemeColor: WdThemeColorIndex = js.native
  
  /* CompleteClass */
  var OverPrint: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RGB: Double = js.native
  
  /* CompleteClass */
  var SchemeColor: Double = js.native
  
  /* CompleteClass */
  override def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoColorType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: typings.activexWord.Word.ColorFormat = js.native
  
  /* CompleteClass */
  var Yellow: Double = js.native
}
