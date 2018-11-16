package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSizeRepresents extends js.Object

@JSGlobal("Office.XlSizeRepresents")
@js.native
object XlSizeRepresents extends js.Object {
  @js.native
  sealed trait xlSizeIsArea
    extends activexDashOfficeLib.OfficeNs.XlSizeRepresents
  
  @js.native
  sealed trait xlSizeIsWidth
    extends activexDashOfficeLib.OfficeNs.XlSizeRepresents
  
  /* 1 */ val xlSizeIsArea: xlSizeIsArea with scala.Double = js.native
  /* 2 */ val xlSizeIsWidth: xlSizeIsWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlSizeRepresents with scala.Double] = js.native
}

