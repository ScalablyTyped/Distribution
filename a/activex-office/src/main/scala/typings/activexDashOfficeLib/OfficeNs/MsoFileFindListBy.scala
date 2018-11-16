package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileFindListBy extends js.Object

@JSGlobal("Office.MsoFileFindListBy")
@js.native
object MsoFileFindListBy extends js.Object {
  @js.native
  sealed trait msoListbyName
    extends activexDashOfficeLib.OfficeNs.MsoFileFindListBy
  
  @js.native
  sealed trait msoListbyTitle
    extends activexDashOfficeLib.OfficeNs.MsoFileFindListBy
  
  /* 1 */ val msoListbyName: msoListbyName with scala.Double = js.native
  /* 2 */ val msoListbyTitle: msoListbyTitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileFindListBy with scala.Double] = js.native
}

