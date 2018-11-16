package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoContactCardStyle extends js.Object

@JSGlobal("Office.MsoContactCardStyle")
@js.native
object MsoContactCardStyle extends js.Object {
  @js.native
  sealed trait msoContactCardFull
    extends activexDashOfficeLib.OfficeNs.MsoContactCardStyle
  
  @js.native
  sealed trait msoContactCardHover
    extends activexDashOfficeLib.OfficeNs.MsoContactCardStyle
  
  /* 1 */ val msoContactCardFull: msoContactCardFull with scala.Double = js.native
  /* 0 */ val msoContactCardHover: msoContactCardHover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoContactCardStyle with scala.Double] = js.native
}

