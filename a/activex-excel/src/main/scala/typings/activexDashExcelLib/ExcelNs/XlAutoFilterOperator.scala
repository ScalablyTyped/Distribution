package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAutoFilterOperator extends js.Object

@JSGlobal("Excel.XlAutoFilterOperator")
@js.native
object XlAutoFilterOperator extends js.Object {
  @js.native
  sealed trait xlAnd
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlBottom10Items
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlBottom10Percent
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterAutomaticFontColor
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterCellColor
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterDynamic
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterFontColor
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterIcon
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterNoFill
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterNoIcon
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlFilterValues
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlOr
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlTop10Items
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  @js.native
  sealed trait xlTop10Percent
    extends activexDashExcelLib.ExcelNs.XlAutoFilterOperator
  
  /* 1 */ val xlAnd: xlAnd with scala.Double = js.native
  /* 4 */ val xlBottom10Items: xlBottom10Items with scala.Double = js.native
  /* 6 */ val xlBottom10Percent: xlBottom10Percent with scala.Double = js.native
  /* 13 */ val xlFilterAutomaticFontColor: xlFilterAutomaticFontColor with scala.Double = js.native
  /* 8 */ val xlFilterCellColor: xlFilterCellColor with scala.Double = js.native
  /* 11 */ val xlFilterDynamic: xlFilterDynamic with scala.Double = js.native
  /* 9 */ val xlFilterFontColor: xlFilterFontColor with scala.Double = js.native
  /* 10 */ val xlFilterIcon: xlFilterIcon with scala.Double = js.native
  /* 12 */ val xlFilterNoFill: xlFilterNoFill with scala.Double = js.native
  /* 14 */ val xlFilterNoIcon: xlFilterNoIcon with scala.Double = js.native
  /* 7 */ val xlFilterValues: xlFilterValues with scala.Double = js.native
  /* 2 */ val xlOr: xlOr with scala.Double = js.native
  /* 3 */ val xlTop10Items: xlTop10Items with scala.Double = js.native
  /* 5 */ val xlTop10Percent: xlTop10Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAutoFilterOperator with scala.Double] = js.native
}

