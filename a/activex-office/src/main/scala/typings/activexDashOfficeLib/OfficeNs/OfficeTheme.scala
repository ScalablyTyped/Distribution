package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.OfficeTheme")
@js.native
class OfficeTheme protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var `Office.OfficeTheme_typekey`: OfficeTheme = js.native
  val Parent: js.Any = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val ThemeEffectScheme: activexDashOfficeLib.OfficeNs.ThemeEffectScheme = js.native
  val ThemeFontScheme: activexDashOfficeLib.OfficeNs.ThemeFontScheme = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

