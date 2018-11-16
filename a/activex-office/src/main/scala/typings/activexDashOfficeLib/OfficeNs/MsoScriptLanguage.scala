package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoScriptLanguage extends js.Object

@JSGlobal("Office.MsoScriptLanguage")
@js.native
object MsoScriptLanguage extends js.Object {
  @js.native
  sealed trait msoScriptLanguageASP
    extends activexDashOfficeLib.OfficeNs.MsoScriptLanguage
  
  @js.native
  sealed trait msoScriptLanguageJava
    extends activexDashOfficeLib.OfficeNs.MsoScriptLanguage
  
  @js.native
  sealed trait msoScriptLanguageOther
    extends activexDashOfficeLib.OfficeNs.MsoScriptLanguage
  
  @js.native
  sealed trait msoScriptLanguageVisualBasic
    extends activexDashOfficeLib.OfficeNs.MsoScriptLanguage
  
  /* 3 */ val msoScriptLanguageASP: msoScriptLanguageASP with scala.Double = js.native
  /* 1 */ val msoScriptLanguageJava: msoScriptLanguageJava with scala.Double = js.native
  /* 4 */ val msoScriptLanguageOther: msoScriptLanguageOther with scala.Double = js.native
  /* 2 */ val msoScriptLanguageVisualBasic: msoScriptLanguageVisualBasic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoScriptLanguage with scala.Double] = js.native
}

