package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpIndentControl extends js.Object

@JSGlobal("PowerPoint.PpIndentControl")
@js.native
object PpIndentControl extends js.Object {
  @js.native
  sealed trait ppIndentControlMixed
    extends activexDashPowerpointLib.PowerPointNs.PpIndentControl
  
  @js.native
  sealed trait ppIndentKeepAttr
    extends activexDashPowerpointLib.PowerPointNs.PpIndentControl
  
  @js.native
  sealed trait ppIndentReplaceAttr
    extends activexDashPowerpointLib.PowerPointNs.PpIndentControl
  
  /* -2 */ val ppIndentControlMixed: ppIndentControlMixed with scala.Double = js.native
  /* 2 */ val ppIndentKeepAttr: ppIndentKeepAttr with scala.Double = js.native
  /* 1 */ val ppIndentReplaceAttr: ppIndentReplaceAttr with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpIndentControl with scala.Double] = js.native
}

