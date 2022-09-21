package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoThemeColorSchemeIndex
import typings.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.OfficeTheme")
@js.native
/* private */ open class OfficeTheme ()
  extends StObject
     with typings.activexOffice.Office.OfficeTheme {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.OfficeTheme_typekey")
  var OfficeDotOfficeTheme_typekey: typings.activexOffice.Office.OfficeTheme = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): typings.activexOffice.Office.ThemeColor = js.native
  /* CompleteClass */
  @JSName("ThemeColorScheme")
  override val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  /* CompleteClass */
  override val ThemeEffectScheme: typings.activexOffice.Office.ThemeEffectScheme = js.native
  
  /* CompleteClass */
  override val ThemeFontScheme: typings.activexOffice.Office.ThemeFontScheme = js.native
}
