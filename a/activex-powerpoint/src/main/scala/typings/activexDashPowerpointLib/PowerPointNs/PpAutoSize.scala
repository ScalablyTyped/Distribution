package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpAutoSize extends js.Object

@JSGlobal("PowerPoint.PpAutoSize")
@js.native
object PpAutoSize extends js.Object {
  @js.native
  sealed trait ppAutoSizeMixed
    extends activexDashPowerpointLib.PowerPointNs.PpAutoSize
  
  @js.native
  sealed trait ppAutoSizeNone
    extends activexDashPowerpointLib.PowerPointNs.PpAutoSize
  
  @js.native
  sealed trait ppAutoSizeShapeToFitText
    extends activexDashPowerpointLib.PowerPointNs.PpAutoSize
  
  /* -2 */ val ppAutoSizeMixed: ppAutoSizeMixed with scala.Double = js.native
  /* 0 */ val ppAutoSizeNone: ppAutoSizeNone with scala.Double = js.native
  /* 1 */ val ppAutoSizeShapeToFitText: ppAutoSizeShapeToFitText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpAutoSize with scala.Double] = js.native
}

