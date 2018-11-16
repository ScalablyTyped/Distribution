package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpTabStopType extends js.Object

@JSGlobal("PowerPoint.PpTabStopType")
@js.native
object PpTabStopType extends js.Object {
  @js.native
  sealed trait ppTabStopCenter
    extends activexDashPowerpointLib.PowerPointNs.PpTabStopType
  
  @js.native
  sealed trait ppTabStopDecimal
    extends activexDashPowerpointLib.PowerPointNs.PpTabStopType
  
  @js.native
  sealed trait ppTabStopLeft
    extends activexDashPowerpointLib.PowerPointNs.PpTabStopType
  
  @js.native
  sealed trait ppTabStopMixed
    extends activexDashPowerpointLib.PowerPointNs.PpTabStopType
  
  @js.native
  sealed trait ppTabStopRight
    extends activexDashPowerpointLib.PowerPointNs.PpTabStopType
  
  /* 2 */ val ppTabStopCenter: ppTabStopCenter with scala.Double = js.native
  /* 4 */ val ppTabStopDecimal: ppTabStopDecimal with scala.Double = js.native
  /* 1 */ val ppTabStopLeft: ppTabStopLeft with scala.Double = js.native
  /* -2 */ val ppTabStopMixed: ppTabStopMixed with scala.Double = js.native
  /* 3 */ val ppTabStopRight: ppTabStopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpTabStopType with scala.Double] = js.native
}

