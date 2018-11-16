package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimAdditive extends js.Object

@JSGlobal("PowerPoint.MsoAnimAdditive")
@js.native
object MsoAnimAdditive extends js.Object {
  @js.native
  sealed trait msoAnimAdditiveAddBase
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAdditive
  
  @js.native
  sealed trait msoAnimAdditiveAddSum
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAdditive
  
  /* 1 */ val msoAnimAdditiveAddBase: msoAnimAdditiveAddBase with scala.Double = js.native
  /* 2 */ val msoAnimAdditiveAddSum: msoAnimAdditiveAddSum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimAdditive with scala.Double] = js.native
}

