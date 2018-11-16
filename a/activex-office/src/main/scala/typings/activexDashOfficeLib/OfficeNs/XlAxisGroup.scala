package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisGroup extends js.Object

@JSGlobal("Office.XlAxisGroup")
@js.native
object XlAxisGroup extends js.Object {
  @js.native
  sealed trait xlPrimary
    extends activexDashOfficeLib.OfficeNs.XlAxisGroup
  
  @js.native
  sealed trait xlSecondary
    extends activexDashOfficeLib.OfficeNs.XlAxisGroup
  
  /* 1 */ val xlPrimary: xlPrimary with scala.Double = js.native
  /* 2 */ val xlSecondary: xlSecondary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlAxisGroup with scala.Double] = js.native
}

