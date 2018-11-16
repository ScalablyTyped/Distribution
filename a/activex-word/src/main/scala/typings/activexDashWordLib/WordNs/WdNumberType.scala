package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdNumberType extends js.Object

@JSGlobal("Word.WdNumberType")
@js.native
object WdNumberType extends js.Object {
  @js.native
  sealed trait wdNumberAllNumbers
    extends activexDashWordLib.WordNs.WdNumberType
  
  @js.native
  sealed trait wdNumberListNum
    extends activexDashWordLib.WordNs.WdNumberType
  
  @js.native
  sealed trait wdNumberParagraph
    extends activexDashWordLib.WordNs.WdNumberType
  
  /* 3 */ val wdNumberAllNumbers: wdNumberAllNumbers with scala.Double = js.native
  /* 2 */ val wdNumberListNum: wdNumberListNum with scala.Double = js.native
  /* 1 */ val wdNumberParagraph: wdNumberParagraph with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdNumberType with scala.Double] = js.native
}

