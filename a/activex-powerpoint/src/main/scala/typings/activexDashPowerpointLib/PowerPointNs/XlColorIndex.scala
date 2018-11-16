package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlColorIndex extends js.Object

@JSGlobal("PowerPoint.XlColorIndex")
@js.native
object XlColorIndex extends js.Object {
  @js.native
  sealed trait xlColorIndexAutomatic
    extends activexDashPowerpointLib.PowerPointNs.XlColorIndex
  
  @js.native
  sealed trait xlColorIndexNone
    extends activexDashPowerpointLib.PowerPointNs.XlColorIndex
  
  /* -4105 */ val xlColorIndexAutomatic: xlColorIndexAutomatic with scala.Double = js.native
  /* -4142 */ val xlColorIndexNone: xlColorIndexNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlColorIndex with scala.Double] = js.native
}

