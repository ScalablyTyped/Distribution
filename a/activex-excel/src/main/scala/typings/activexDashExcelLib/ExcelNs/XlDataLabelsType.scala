package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataLabelsType extends js.Object

@JSGlobal("Excel.XlDataLabelsType")
@js.native
object XlDataLabelsType extends js.Object {
  @js.native
  sealed trait xlDataLabelsShowBubbleSizes
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabel
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabelAndPercent
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowNone
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowPercent
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowValue
    extends activexDashExcelLib.ExcelNs.XlDataLabelsType
  
  /* 6 */ val xlDataLabelsShowBubbleSizes: xlDataLabelsShowBubbleSizes with scala.Double = js.native
  /* 4 */ val xlDataLabelsShowLabel: xlDataLabelsShowLabel with scala.Double = js.native
  /* 5 */ val xlDataLabelsShowLabelAndPercent: xlDataLabelsShowLabelAndPercent with scala.Double = js.native
  /* -4142 */ val xlDataLabelsShowNone: xlDataLabelsShowNone with scala.Double = js.native
  /* 3 */ val xlDataLabelsShowPercent: xlDataLabelsShowPercent with scala.Double = js.native
  /* 2 */ val xlDataLabelsShowValue: xlDataLabelsShowValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataLabelsType with scala.Double] = js.native
}

