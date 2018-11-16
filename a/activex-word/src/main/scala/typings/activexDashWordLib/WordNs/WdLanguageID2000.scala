package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLanguageID2000 extends js.Object

@JSGlobal("Word.WdLanguageID2000")
@js.native
object WdLanguageID2000 extends js.Object {
  @js.native
  sealed trait wdChineseHongKong
    extends activexDashWordLib.WordNs.WdLanguageID2000
  
  @js.native
  sealed trait wdChineseMacao
    extends activexDashWordLib.WordNs.WdLanguageID2000
  
  @js.native
  sealed trait wdEnglishTrinidad
    extends activexDashWordLib.WordNs.WdLanguageID2000
  
  /* 3076 */ val wdChineseHongKong: wdChineseHongKong with scala.Double = js.native
  /* 5124 */ val wdChineseMacao: wdChineseMacao with scala.Double = js.native
  /* 11273 */ val wdEnglishTrinidad: wdEnglishTrinidad with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLanguageID2000 with scala.Double] = js.native
}

