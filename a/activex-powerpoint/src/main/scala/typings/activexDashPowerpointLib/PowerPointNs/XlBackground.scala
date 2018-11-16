package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBackground extends js.Object

@JSGlobal("PowerPoint.XlBackground")
@js.native
object XlBackground extends js.Object {
  @js.native
  sealed trait xlBackgroundAutomatic
    extends activexDashPowerpointLib.PowerPointNs.XlBackground
  
  @js.native
  sealed trait xlBackgroundOpaque
    extends activexDashPowerpointLib.PowerPointNs.XlBackground
  
  @js.native
  sealed trait xlBackgroundTransparent
    extends activexDashPowerpointLib.PowerPointNs.XlBackground
  
  /* -4105 */ val xlBackgroundAutomatic: xlBackgroundAutomatic with scala.Double = js.native
  /* 3 */ val xlBackgroundOpaque: xlBackgroundOpaque with scala.Double = js.native
  /* 2 */ val xlBackgroundTransparent: xlBackgroundTransparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlBackground with scala.Double] = js.native
}

