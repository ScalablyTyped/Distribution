package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRowCol extends js.Object

@JSGlobal("PowerPoint.XlRowCol")
@js.native
object XlRowCol extends js.Object {
  @js.native
  sealed trait xlColumns
    extends activexDashPowerpointLib.PowerPointNs.XlRowCol
  
  @js.native
  sealed trait xlRows
    extends activexDashPowerpointLib.PowerPointNs.XlRowCol
  
  /* 2 */ val xlColumns: xlColumns with scala.Double = js.native
  /* 1 */ val xlRows: xlRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlRowCol with scala.Double] = js.native
}

