package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEndStyleCap extends js.Object

@JSGlobal("PowerPoint.XlEndStyleCap")
@js.native
object XlEndStyleCap extends js.Object {
  @js.native
  sealed trait xlCap
    extends activexDashPowerpointLib.PowerPointNs.XlEndStyleCap
  
  @js.native
  sealed trait xlNoCap
    extends activexDashPowerpointLib.PowerPointNs.XlEndStyleCap
  
  /* 1 */ val xlCap: xlCap with scala.Double = js.native
  /* 2 */ val xlNoCap: xlNoCap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlEndStyleCap with scala.Double] = js.native
}

