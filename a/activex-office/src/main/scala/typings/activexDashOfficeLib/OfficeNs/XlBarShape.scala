package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBarShape extends js.Object

@JSGlobal("Office.XlBarShape")
@js.native
object XlBarShape extends js.Object {
  @js.native
  sealed trait xlBox
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  @js.native
  sealed trait xlConeToMax
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  @js.native
  sealed trait xlConeToPoint
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  @js.native
  sealed trait xlCylinder
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  @js.native
  sealed trait xlPyramidToMax
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  @js.native
  sealed trait xlPyramidToPoint
    extends activexDashOfficeLib.OfficeNs.XlBarShape
  
  /* 0 */ val xlBox: xlBox with scala.Double = js.native
  /* 5 */ val xlConeToMax: xlConeToMax with scala.Double = js.native
  /* 4 */ val xlConeToPoint: xlConeToPoint with scala.Double = js.native
  /* 3 */ val xlCylinder: xlCylinder with scala.Double = js.native
  /* 2 */ val xlPyramidToMax: xlPyramidToMax with scala.Double = js.native
  /* 1 */ val xlPyramidToPoint: xlPyramidToPoint with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlBarShape with scala.Double] = js.native
}

