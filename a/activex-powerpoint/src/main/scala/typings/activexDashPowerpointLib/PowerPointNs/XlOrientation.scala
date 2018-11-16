package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOrientation extends js.Object

@JSGlobal("PowerPoint.XlOrientation")
@js.native
object XlOrientation extends js.Object {
  @js.native
  sealed trait xlDownward
    extends activexDashPowerpointLib.PowerPointNs.XlOrientation
  
  @js.native
  sealed trait xlHorizontal
    extends activexDashPowerpointLib.PowerPointNs.XlOrientation
  
  @js.native
  sealed trait xlUpward
    extends activexDashPowerpointLib.PowerPointNs.XlOrientation
  
  @js.native
  sealed trait xlVertical
    extends activexDashPowerpointLib.PowerPointNs.XlOrientation
  
  /* -4170 */ val xlDownward: xlDownward with scala.Double = js.native
  /* -4128 */ val xlHorizontal: xlHorizontal with scala.Double = js.native
  /* -4171 */ val xlUpward: xlUpward with scala.Double = js.native
  /* -4166 */ val xlVertical: xlVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlOrientation with scala.Double] = js.native
}

