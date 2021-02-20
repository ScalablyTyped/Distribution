package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeFontScheme extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  def Load(FileName: String): Unit = js.native
  
  def MajorFont(Index: MsoFontLanguageIndex): ThemeFont = js.native
  @JSName("MajorFont")
  val MajorFont_Original: ThemeFonts = js.native
  
  def MinorFont(Index: MsoFontLanguageIndex): ThemeFont = js.native
  @JSName("MinorFont")
  val MinorFont_Original: ThemeFonts = js.native
  
  @JSName("Office.ThemeFontScheme_typekey")
  var OfficeDotThemeFontScheme_typekey: ThemeFontScheme = js.native
  
  val Parent: js.Any = js.native
  
  def Save(FileName: String): Unit = js.native
}
