package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFixedFormatType extends js.Object

@JSGlobal("PowerPoint.PpFixedFormatType")
@js.native
object PpFixedFormatType extends js.Object {
  @js.native
  sealed trait ppFixedFormatTypePDF
    extends activexDashPowerpointLib.PowerPointNs.PpFixedFormatType
  
  @js.native
  sealed trait ppFixedFormatTypeXPS
    extends activexDashPowerpointLib.PowerPointNs.PpFixedFormatType
  
  /* 2 */ val ppFixedFormatTypePDF: ppFixedFormatTypePDF with scala.Double = js.native
  /* 1 */ val ppFixedFormatTypeXPS: ppFixedFormatTypeXPS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFixedFormatType with scala.Double] = js.native
}

