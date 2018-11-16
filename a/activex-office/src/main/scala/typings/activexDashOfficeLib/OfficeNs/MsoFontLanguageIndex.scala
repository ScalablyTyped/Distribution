package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFontLanguageIndex extends js.Object

@JSGlobal("Office.MsoFontLanguageIndex")
@js.native
object MsoFontLanguageIndex extends js.Object {
  @js.native
  sealed trait msoThemeComplexScript
    extends activexDashOfficeLib.OfficeNs.MsoFontLanguageIndex
  
  @js.native
  sealed trait msoThemeEastAsian
    extends activexDashOfficeLib.OfficeNs.MsoFontLanguageIndex
  
  @js.native
  sealed trait msoThemeLatin
    extends activexDashOfficeLib.OfficeNs.MsoFontLanguageIndex
  
  /* 2 */ val msoThemeComplexScript: msoThemeComplexScript with scala.Double = js.native
  /* 3 */ val msoThemeEastAsian: msoThemeEastAsian with scala.Double = js.native
  /* 1 */ val msoThemeLatin: msoThemeLatin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFontLanguageIndex with scala.Double] = js.native
}

