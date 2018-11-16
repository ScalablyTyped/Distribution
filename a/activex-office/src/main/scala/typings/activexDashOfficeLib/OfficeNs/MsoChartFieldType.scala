package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoChartFieldType extends js.Object

@JSGlobal("Office.MsoChartFieldType")
@js.native
object MsoChartFieldType extends js.Object {
  @js.native
  sealed trait msoChartFieldBubbleSize
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldCategoryName
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldFormula
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldPercentage
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldRange
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldSeriesName
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  @js.native
  sealed trait msoChartFieldValue
    extends activexDashOfficeLib.OfficeNs.MsoChartFieldType
  
  /* 1 */ val msoChartFieldBubbleSize: msoChartFieldBubbleSize with scala.Double = js.native
  /* 2 */ val msoChartFieldCategoryName: msoChartFieldCategoryName with scala.Double = js.native
  /* 6 */ val msoChartFieldFormula: msoChartFieldFormula with scala.Double = js.native
  /* 3 */ val msoChartFieldPercentage: msoChartFieldPercentage with scala.Double = js.native
  /* 7 */ val msoChartFieldRange: msoChartFieldRange with scala.Double = js.native
  /* 4 */ val msoChartFieldSeriesName: msoChartFieldSeriesName with scala.Double = js.native
  /* 5 */ val msoChartFieldValue: msoChartFieldValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoChartFieldType with scala.Double] = js.native
}

