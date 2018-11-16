package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickLabelOrientation extends js.Object

@JSGlobal("PowerPoint.XlTickLabelOrientation")
@js.native
object XlTickLabelOrientation extends js.Object {
  @js.native
  sealed trait xlTickLabelOrientationAutomatic
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationDownward
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationHorizontal
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationUpward
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationVertical
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation
  
  /* -4105 */ val xlTickLabelOrientationAutomatic: xlTickLabelOrientationAutomatic with scala.Double = js.native
  /* -4170 */ val xlTickLabelOrientationDownward: xlTickLabelOrientationDownward with scala.Double = js.native
  /* -4128 */ val xlTickLabelOrientationHorizontal: xlTickLabelOrientationHorizontal with scala.Double = js.native
  /* -4171 */ val xlTickLabelOrientationUpward: xlTickLabelOrientationUpward with scala.Double = js.native
  /* -4166 */ val xlTickLabelOrientationVertical: xlTickLabelOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlTickLabelOrientation with scala.Double] = js.native
}

