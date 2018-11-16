package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisGroup extends js.Object

@JSGlobal("PowerPoint.XlAxisGroup")
@js.native
object XlAxisGroup extends js.Object {
  @js.native
  sealed trait xlPrimary
    extends activexDashPowerpointLib.PowerPointNs.XlAxisGroup
  
  @js.native
  sealed trait xlSecondary
    extends activexDashPowerpointLib.PowerPointNs.XlAxisGroup
  
  /* 1 */ val xlPrimary: xlPrimary with scala.Double = js.native
  /* 2 */ val xlSecondary: xlSecondary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlAxisGroup with scala.Double] = js.native
}

