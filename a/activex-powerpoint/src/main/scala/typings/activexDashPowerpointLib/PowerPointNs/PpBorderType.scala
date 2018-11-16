package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpBorderType extends js.Object

@JSGlobal("PowerPoint.PpBorderType")
@js.native
object PpBorderType extends js.Object {
  @js.native
  sealed trait ppBorderBottom
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  @js.native
  sealed trait ppBorderDiagonalDown
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  @js.native
  sealed trait ppBorderDiagonalUp
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  @js.native
  sealed trait ppBorderLeft
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  @js.native
  sealed trait ppBorderRight
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  @js.native
  sealed trait ppBorderTop
    extends activexDashPowerpointLib.PowerPointNs.PpBorderType
  
  /* 3 */ val ppBorderBottom: ppBorderBottom with scala.Double = js.native
  /* 5 */ val ppBorderDiagonalDown: ppBorderDiagonalDown with scala.Double = js.native
  /* 6 */ val ppBorderDiagonalUp: ppBorderDiagonalUp with scala.Double = js.native
  /* 2 */ val ppBorderLeft: ppBorderLeft with scala.Double = js.native
  /* 4 */ val ppBorderRight: ppBorderRight with scala.Double = js.native
  /* 1 */ val ppBorderTop: ppBorderTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpBorderType with scala.Double] = js.native
}

