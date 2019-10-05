package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.OfficeTheme")
@js.native
class OfficeTheme protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var `Office.OfficeTheme_typekey`: OfficeTheme = js.native
  val Parent: js.Any = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val ThemeEffectScheme: typings.activexDashOffice.Office.ThemeEffectScheme = js.native
  val ThemeFontScheme: typings.activexDashOffice.Office.ThemeFontScheme = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

