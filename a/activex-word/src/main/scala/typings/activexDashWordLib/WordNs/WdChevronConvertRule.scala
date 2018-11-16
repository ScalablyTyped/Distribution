package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdChevronConvertRule extends js.Object

@JSGlobal("Word.WdChevronConvertRule")
@js.native
object WdChevronConvertRule extends js.Object {
  @js.native
  sealed trait wdAlwaysConvert
    extends activexDashWordLib.WordNs.WdChevronConvertRule
  
  @js.native
  sealed trait wdAskToConvert
    extends activexDashWordLib.WordNs.WdChevronConvertRule
  
  @js.native
  sealed trait wdAskToNotConvert
    extends activexDashWordLib.WordNs.WdChevronConvertRule
  
  @js.native
  sealed trait wdNeverConvert
    extends activexDashWordLib.WordNs.WdChevronConvertRule
  
  /* 1 */ val wdAlwaysConvert: wdAlwaysConvert with scala.Double = js.native
  /* 3 */ val wdAskToConvert: wdAskToConvert with scala.Double = js.native
  /* 2 */ val wdAskToNotConvert: wdAskToNotConvert with scala.Double = js.native
  /* 0 */ val wdNeverConvert: wdNeverConvert with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdChevronConvertRule with scala.Double] = js.native
}

