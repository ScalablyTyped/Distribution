package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileFindOptions extends js.Object

@JSGlobal("Office.MsoFileFindOptions")
@js.native
object MsoFileFindOptions extends js.Object {
  @js.native
  sealed trait msoOptionsAdd
    extends activexDashOfficeLib.OfficeNs.MsoFileFindOptions
  
  @js.native
  sealed trait msoOptionsNew
    extends activexDashOfficeLib.OfficeNs.MsoFileFindOptions
  
  @js.native
  sealed trait msoOptionsWithin
    extends activexDashOfficeLib.OfficeNs.MsoFileFindOptions
  
  /* 2 */ val msoOptionsAdd: msoOptionsAdd with scala.Double = js.native
  /* 1 */ val msoOptionsNew: msoOptionsNew with scala.Double = js.native
  /* 3 */ val msoOptionsWithin: msoOptionsWithin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileFindOptions with scala.Double] = js.native
}

