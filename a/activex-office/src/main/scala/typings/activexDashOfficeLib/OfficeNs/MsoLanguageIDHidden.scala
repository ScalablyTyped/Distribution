package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLanguageIDHidden extends js.Object

@JSGlobal("Office.MsoLanguageIDHidden")
@js.native
object MsoLanguageIDHidden extends js.Object {
  @js.native
  sealed trait msoLanguageIDChineseHongKong
    extends activexDashOfficeLib.OfficeNs.MsoLanguageIDHidden
  
  @js.native
  sealed trait msoLanguageIDChineseMacao
    extends activexDashOfficeLib.OfficeNs.MsoLanguageIDHidden
  
  @js.native
  sealed trait msoLanguageIDEnglishTrinidad
    extends activexDashOfficeLib.OfficeNs.MsoLanguageIDHidden
  
  /* 3076 */ val msoLanguageIDChineseHongKong: msoLanguageIDChineseHongKong with scala.Double = js.native
  /* 5124 */ val msoLanguageIDChineseMacao: msoLanguageIDChineseMacao with scala.Double = js.native
  /* 11273 */ val msoLanguageIDEnglishTrinidad: msoLanguageIDEnglishTrinidad with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLanguageIDHidden with scala.Double] = js.native
}

