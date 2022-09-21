package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoFontLanguageIndex
import typings.activexOffice.Office.ThemeFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ThemeFontScheme")
@js.native
/* private */ open class ThemeFontScheme ()
  extends StObject
     with typings.activexOffice.Office.ThemeFontScheme {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Load(FileName: String): Unit = js.native
  
  /* CompleteClass */
  override def MajorFont(Index: MsoFontLanguageIndex): typings.activexOffice.Office.ThemeFont = js.native
  /* CompleteClass */
  @JSName("MajorFont")
  override val MajorFont_Original: ThemeFonts = js.native
  
  /* CompleteClass */
  override def MinorFont(Index: MsoFontLanguageIndex): typings.activexOffice.Office.ThemeFont = js.native
  /* CompleteClass */
  @JSName("MinorFont")
  override val MinorFont_Original: ThemeFonts = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ThemeFontScheme_typekey")
  var OfficeDotThemeFontScheme_typekey: typings.activexOffice.Office.ThemeFontScheme = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Save(FileName: String): Unit = js.native
}
