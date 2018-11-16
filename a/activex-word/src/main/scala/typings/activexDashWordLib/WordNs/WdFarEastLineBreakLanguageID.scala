package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFarEastLineBreakLanguageID extends js.Object

@JSGlobal("Word.WdFarEastLineBreakLanguageID")
@js.native
object WdFarEastLineBreakLanguageID extends js.Object {
  @js.native
  sealed trait wdLineBreakJapanese
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLanguageID
  
  @js.native
  sealed trait wdLineBreakKorean
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLanguageID
  
  @js.native
  sealed trait wdLineBreakSimplifiedChinese
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLanguageID
  
  @js.native
  sealed trait wdLineBreakTraditionalChinese
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLanguageID
  
  /* 1041 */ val wdLineBreakJapanese: wdLineBreakJapanese with scala.Double = js.native
  /* 1042 */ val wdLineBreakKorean: wdLineBreakKorean with scala.Double = js.native
  /* 2052 */ val wdLineBreakSimplifiedChinese: wdLineBreakSimplifiedChinese with scala.Double = js.native
  /* 1028 */ val wdLineBreakTraditionalChinese: wdLineBreakTraditionalChinese with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFarEastLineBreakLanguageID with scala.Double] = js.native
}

