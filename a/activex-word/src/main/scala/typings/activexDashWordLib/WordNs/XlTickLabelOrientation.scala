package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickLabelOrientation extends js.Object

@JSGlobal("Word.XlTickLabelOrientation")
@js.native
object XlTickLabelOrientation extends js.Object {
  @js.native
  sealed trait xlTickLabelOrientationAutomatic
    extends activexDashWordLib.WordNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationDownward
    extends activexDashWordLib.WordNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationHorizontal
    extends activexDashWordLib.WordNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationUpward
    extends activexDashWordLib.WordNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationVertical
    extends activexDashWordLib.WordNs.XlTickLabelOrientation
  
  /* -4105 */ val xlTickLabelOrientationAutomatic: xlTickLabelOrientationAutomatic with scala.Double = js.native
  /* -4170 */ val xlTickLabelOrientationDownward: xlTickLabelOrientationDownward with scala.Double = js.native
  /* -4128 */ val xlTickLabelOrientationHorizontal: xlTickLabelOrientationHorizontal with scala.Double = js.native
  /* -4171 */ val xlTickLabelOrientationUpward: xlTickLabelOrientationUpward with scala.Double = js.native
  /* -4166 */ val xlTickLabelOrientationVertical: xlTickLabelOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlTickLabelOrientation with scala.Double] = js.native
}

