package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFarEastLineBreakLanguageID extends js.Object

@JSGlobal("Office.MsoFarEastLineBreakLanguageID")
@js.native
object MsoFarEastLineBreakLanguageID extends js.Object {
  @js.native
  sealed trait MsoFarEastLineBreakLanguageJapanese
    extends activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID
  
  @js.native
  sealed trait MsoFarEastLineBreakLanguageKorean
    extends activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID
  
  @js.native
  sealed trait MsoFarEastLineBreakLanguageSimplifiedChinese
    extends activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID
  
  @js.native
  sealed trait MsoFarEastLineBreakLanguageTraditionalChinese
    extends activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID
  
  /* 1041 */ val MsoFarEastLineBreakLanguageJapanese: MsoFarEastLineBreakLanguageJapanese with scala.Double = js.native
  /* 1042 */ val MsoFarEastLineBreakLanguageKorean: MsoFarEastLineBreakLanguageKorean with scala.Double = js.native
  /* 2052 */ val MsoFarEastLineBreakLanguageSimplifiedChinese: MsoFarEastLineBreakLanguageSimplifiedChinese with scala.Double = js.native
  /* 1028 */ val MsoFarEastLineBreakLanguageTraditionalChinese: MsoFarEastLineBreakLanguageTraditionalChinese with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFarEastLineBreakLanguageID with scala.Double] = js.native
}

