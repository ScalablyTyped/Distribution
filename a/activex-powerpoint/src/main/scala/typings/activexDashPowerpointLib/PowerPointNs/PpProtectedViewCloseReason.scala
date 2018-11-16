package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpProtectedViewCloseReason extends js.Object

@JSGlobal("PowerPoint.PpProtectedViewCloseReason")
@js.native
object PpProtectedViewCloseReason extends js.Object {
  @js.native
  sealed trait ppProtectedViewCloseEdit
    extends activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason
  
  @js.native
  sealed trait ppProtectedViewCloseForced
    extends activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason
  
  @js.native
  sealed trait ppProtectedViewCloseNormal
    extends activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason
  
  /* 1 */ val ppProtectedViewCloseEdit: ppProtectedViewCloseEdit with scala.Double = js.native
  /* 2 */ val ppProtectedViewCloseForced: ppProtectedViewCloseForced with scala.Double = js.native
  /* 0 */ val ppProtectedViewCloseNormal: ppProtectedViewCloseNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason with scala.Double
  ] = js.native
}

