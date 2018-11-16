package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoOrgChartLayoutType extends js.Object

@JSGlobal("Office.MsoOrgChartLayoutType")
@js.native
object MsoOrgChartLayoutType extends js.Object {
  @js.native
  sealed trait msoOrgChartLayoutBothHanging
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  @js.native
  sealed trait msoOrgChartLayoutDefault
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  @js.native
  sealed trait msoOrgChartLayoutLeftHanging
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  @js.native
  sealed trait msoOrgChartLayoutMixed
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  @js.native
  sealed trait msoOrgChartLayoutRightHanging
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  @js.native
  sealed trait msoOrgChartLayoutStandard
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType
  
  /* 2 */ val msoOrgChartLayoutBothHanging: msoOrgChartLayoutBothHanging with scala.Double = js.native
  /* 5 */ val msoOrgChartLayoutDefault: msoOrgChartLayoutDefault with scala.Double = js.native
  /* 3 */ val msoOrgChartLayoutLeftHanging: msoOrgChartLayoutLeftHanging with scala.Double = js.native
  /* -2 */ val msoOrgChartLayoutMixed: msoOrgChartLayoutMixed with scala.Double = js.native
  /* 4 */ val msoOrgChartLayoutRightHanging: msoOrgChartLayoutRightHanging with scala.Double = js.native
  /* 1 */ val msoOrgChartLayoutStandard: msoOrgChartLayoutStandard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType with scala.Double] = js.native
}

