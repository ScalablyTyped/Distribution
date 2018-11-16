package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEndStyleCap extends js.Object

@JSGlobal("Office.XlEndStyleCap")
@js.native
object XlEndStyleCap extends js.Object {
  @js.native
  sealed trait xlCap
    extends activexDashOfficeLib.OfficeNs.XlEndStyleCap
  
  @js.native
  sealed trait xlNoCap
    extends activexDashOfficeLib.OfficeNs.XlEndStyleCap
  
  /* 1 */ val xlCap: xlCap with scala.Double = js.native
  /* 2 */ val xlNoCap: xlNoCap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlEndStyleCap with scala.Double] = js.native
}

