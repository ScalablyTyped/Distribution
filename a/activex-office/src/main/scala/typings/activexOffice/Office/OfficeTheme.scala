package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfficeTheme extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.OfficeTheme_typekey")
  var OfficeDotOfficeTheme_typekey: OfficeTheme = js.native
  
  val Parent: js.Any = js.native
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  val ThemeEffectScheme: typings.activexOffice.Office.ThemeEffectScheme = js.native
  
  val ThemeFontScheme: typings.activexOffice.Office.ThemeFontScheme = js.native
}
