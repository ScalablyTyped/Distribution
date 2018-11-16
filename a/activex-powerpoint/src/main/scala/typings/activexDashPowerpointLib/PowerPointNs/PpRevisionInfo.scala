package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpRevisionInfo extends js.Object

@JSGlobal("PowerPoint.PpRevisionInfo")
@js.native
object PpRevisionInfo extends js.Object {
  @js.native
  sealed trait ppRevisionInfoBaseline
    extends activexDashPowerpointLib.PowerPointNs.PpRevisionInfo
  
  @js.native
  sealed trait ppRevisionInfoMerged
    extends activexDashPowerpointLib.PowerPointNs.PpRevisionInfo
  
  @js.native
  sealed trait ppRevisionInfoNone
    extends activexDashPowerpointLib.PowerPointNs.PpRevisionInfo
  
  /* 1 */ val ppRevisionInfoBaseline: ppRevisionInfoBaseline with scala.Double = js.native
  /* 2 */ val ppRevisionInfoMerged: ppRevisionInfoMerged with scala.Double = js.native
  /* 0 */ val ppRevisionInfoNone: ppRevisionInfoNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpRevisionInfo with scala.Double] = js.native
}

