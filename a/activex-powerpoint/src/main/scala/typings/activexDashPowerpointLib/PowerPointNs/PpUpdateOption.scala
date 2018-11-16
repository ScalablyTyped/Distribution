package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpUpdateOption extends js.Object

@JSGlobal("PowerPoint.PpUpdateOption")
@js.native
object PpUpdateOption extends js.Object {
  @js.native
  sealed trait ppUpdateOptionAutomatic
    extends activexDashPowerpointLib.PowerPointNs.PpUpdateOption
  
  @js.native
  sealed trait ppUpdateOptionManual
    extends activexDashPowerpointLib.PowerPointNs.PpUpdateOption
  
  @js.native
  sealed trait ppUpdateOptionMixed
    extends activexDashPowerpointLib.PowerPointNs.PpUpdateOption
  
  /* 2 */ val ppUpdateOptionAutomatic: ppUpdateOptionAutomatic with scala.Double = js.native
  /* 1 */ val ppUpdateOptionManual: ppUpdateOptionManual with scala.Double = js.native
  /* -2 */ val ppUpdateOptionMixed: ppUpdateOptionMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpUpdateOption with scala.Double] = js.native
}

