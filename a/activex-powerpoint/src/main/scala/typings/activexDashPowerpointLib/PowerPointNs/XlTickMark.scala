package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickMark extends js.Object

@JSGlobal("PowerPoint.XlTickMark")
@js.native
object XlTickMark extends js.Object {
  @js.native
  sealed trait xlTickMarkCross
    extends activexDashPowerpointLib.PowerPointNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkInside
    extends activexDashPowerpointLib.PowerPointNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkNone
    extends activexDashPowerpointLib.PowerPointNs.XlTickMark
  
  @js.native
  sealed trait xlTickMarkOutside
    extends activexDashPowerpointLib.PowerPointNs.XlTickMark
  
  /* 4 */ val xlTickMarkCross: xlTickMarkCross with scala.Double = js.native
  /* 2 */ val xlTickMarkInside: xlTickMarkInside with scala.Double = js.native
  /* -4142 */ val xlTickMarkNone: xlTickMarkNone with scala.Double = js.native
  /* 3 */ val xlTickMarkOutside: xlTickMarkOutside with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlTickMark with scala.Double] = js.native
}

