package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlVAlign extends js.Object

@JSGlobal("PowerPoint.XlVAlign")
@js.native
object XlVAlign extends js.Object {
  @js.native
  sealed trait xlVAlignBottom
    extends activexDashPowerpointLib.PowerPointNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignCenter
    extends activexDashPowerpointLib.PowerPointNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignDistributed
    extends activexDashPowerpointLib.PowerPointNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignJustify
    extends activexDashPowerpointLib.PowerPointNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignTop
    extends activexDashPowerpointLib.PowerPointNs.XlVAlign
  
  /* -4107 */ val xlVAlignBottom: xlVAlignBottom with scala.Double = js.native
  /* -4108 */ val xlVAlignCenter: xlVAlignCenter with scala.Double = js.native
  /* -4117 */ val xlVAlignDistributed: xlVAlignDistributed with scala.Double = js.native
  /* -4130 */ val xlVAlignJustify: xlVAlignJustify with scala.Double = js.native
  /* -4160 */ val xlVAlignTop: xlVAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlVAlign with scala.Double] = js.native
}

