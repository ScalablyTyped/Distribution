package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTextFormFieldType extends js.Object

@JSGlobal("Word.WdTextFormFieldType")
@js.native
object WdTextFormFieldType extends js.Object {
  @js.native
  sealed trait wdCalculationText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  @js.native
  sealed trait wdCurrentDateText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  @js.native
  sealed trait wdCurrentTimeText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  @js.native
  sealed trait wdDateText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  @js.native
  sealed trait wdNumberText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  @js.native
  sealed trait wdRegularText
    extends activexDashWordLib.WordNs.WdTextFormFieldType
  
  /* 5 */ val wdCalculationText: wdCalculationText with scala.Double = js.native
  /* 3 */ val wdCurrentDateText: wdCurrentDateText with scala.Double = js.native
  /* 4 */ val wdCurrentTimeText: wdCurrentTimeText with scala.Double = js.native
  /* 2 */ val wdDateText: wdDateText with scala.Double = js.native
  /* 1 */ val wdNumberText: wdNumberText with scala.Double = js.native
  /* 0 */ val wdRegularText: wdRegularText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTextFormFieldType with scala.Double] = js.native
}

