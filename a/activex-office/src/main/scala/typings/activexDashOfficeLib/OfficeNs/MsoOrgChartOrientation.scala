package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoOrgChartOrientation extends js.Object

@JSGlobal("Office.MsoOrgChartOrientation")
@js.native
object MsoOrgChartOrientation extends js.Object {
  @js.native
  sealed trait msoOrgChartOrientationMixed
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartOrientation
  
  @js.native
  sealed trait msoOrgChartOrientationVertical
    extends activexDashOfficeLib.OfficeNs.MsoOrgChartOrientation
  
  /* -2 */ val msoOrgChartOrientationMixed: msoOrgChartOrientationMixed with scala.Double = js.native
  /* 1 */ val msoOrgChartOrientationVertical: msoOrgChartOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoOrgChartOrientation with scala.Double] = js.native
}

