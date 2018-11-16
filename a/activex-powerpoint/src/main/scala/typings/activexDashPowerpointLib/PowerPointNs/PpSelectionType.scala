package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSelectionType extends js.Object

@JSGlobal("PowerPoint.PpSelectionType")
@js.native
object PpSelectionType extends js.Object {
  @js.native
  sealed trait ppSelectionNone
    extends activexDashPowerpointLib.PowerPointNs.PpSelectionType
  
  @js.native
  sealed trait ppSelectionShapes
    extends activexDashPowerpointLib.PowerPointNs.PpSelectionType
  
  @js.native
  sealed trait ppSelectionSlides
    extends activexDashPowerpointLib.PowerPointNs.PpSelectionType
  
  @js.native
  sealed trait ppSelectionText
    extends activexDashPowerpointLib.PowerPointNs.PpSelectionType
  
  /* 0 */ val ppSelectionNone: ppSelectionNone with scala.Double = js.native
  /* 2 */ val ppSelectionShapes: ppSelectionShapes with scala.Double = js.native
  /* 1 */ val ppSelectionSlides: ppSelectionSlides with scala.Double = js.native
  /* 3 */ val ppSelectionText: ppSelectionText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSelectionType with scala.Double] = js.native
}

