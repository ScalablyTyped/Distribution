package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoExtraInfoMethod extends js.Object

@JSGlobal("Office.MsoExtraInfoMethod")
@js.native
object MsoExtraInfoMethod extends js.Object {
  @js.native
  sealed trait msoMethodGet
    extends activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod
  
  @js.native
  sealed trait msoMethodPost
    extends activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod
  
  /* 0 */ val msoMethodGet: msoMethodGet with scala.Double = js.native
  /* 1 */ val msoMethodPost: msoMethodPost with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod with scala.Double] = js.native
}

