package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSizeRepresents extends js.Object

@JSGlobal("PowerPoint.XlSizeRepresents")
@js.native
object XlSizeRepresents extends js.Object {
  @js.native
  sealed trait xlSizeIsArea
    extends activexDashPowerpointLib.PowerPointNs.XlSizeRepresents
  
  @js.native
  sealed trait xlSizeIsWidth
    extends activexDashPowerpointLib.PowerPointNs.XlSizeRepresents
  
  /* 1 */ val xlSizeIsArea: xlSizeIsArea with scala.Double = js.native
  /* 2 */ val xlSizeIsWidth: xlSizeIsWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlSizeRepresents with scala.Double] = js.native
}

