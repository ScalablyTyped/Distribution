package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ThemeFontScheme")
@js.native
class ThemeFontScheme protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  @JSName("MajorFont")
  val MajorFont_Original: ThemeFonts = js.native
  @JSName("MinorFont")
  val MinorFont_Original: ThemeFonts = js.native
  var `Office.ThemeFontScheme_typekey`: ThemeFontScheme = js.native
  val Parent: js.Any = js.native
  def Load(FileName: java.lang.String): scala.Unit = js.native
  def MajorFont(Index: MsoFontLanguageIndex): ThemeFont = js.native
  def MinorFont(Index: MsoFontLanguageIndex): ThemeFont = js.native
  def Save(FileName: java.lang.String): scala.Unit = js.native
}

