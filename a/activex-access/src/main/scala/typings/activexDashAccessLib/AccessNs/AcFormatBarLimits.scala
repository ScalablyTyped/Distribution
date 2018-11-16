package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormatBarLimits extends js.Object

@JSGlobal("Access.AcFormatBarLimits")
@js.native
object AcFormatBarLimits extends js.Object {
  @js.native
  sealed trait acAutomatic
    extends activexDashAccessLib.AccessNs.AcFormatBarLimits
  
  @js.native
  sealed trait acNumber
    extends activexDashAccessLib.AccessNs.AcFormatBarLimits
  
  @js.native
  sealed trait acPercent
    extends activexDashAccessLib.AccessNs.AcFormatBarLimits
  
  /* 0 */ val acAutomatic: acAutomatic with scala.Double = js.native
  /* 1 */ val acNumber: acNumber with scala.Double = js.native
  /* 2 */ val acPercent: acPercent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormatBarLimits with scala.Double] = js.native
}

