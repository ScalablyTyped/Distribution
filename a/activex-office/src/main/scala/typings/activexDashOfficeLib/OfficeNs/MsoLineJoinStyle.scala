package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLineJoinStyle extends js.Object

@JSGlobal("Office.MsoLineJoinStyle")
@js.native
object MsoLineJoinStyle extends js.Object {
  @js.native
  sealed trait msoLineJoinBevel
    extends activexDashOfficeLib.OfficeNs.MsoLineJoinStyle
  
  @js.native
  sealed trait msoLineJoinMiter
    extends activexDashOfficeLib.OfficeNs.MsoLineJoinStyle
  
  @js.native
  sealed trait msoLineJoinMixed
    extends activexDashOfficeLib.OfficeNs.MsoLineJoinStyle
  
  @js.native
  sealed trait msoLineJoinRound
    extends activexDashOfficeLib.OfficeNs.MsoLineJoinStyle
  
  /* 2 */ val msoLineJoinBevel: msoLineJoinBevel with scala.Double = js.native
  /* 3 */ val msoLineJoinMiter: msoLineJoinMiter with scala.Double = js.native
  /* -2 */ val msoLineJoinMixed: msoLineJoinMixed with scala.Double = js.native
  /* 1 */ val msoLineJoinRound: msoLineJoinRound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLineJoinStyle with scala.Double] = js.native
}

