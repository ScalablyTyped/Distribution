package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoScriptLocation extends js.Object

@JSGlobal("Office.MsoScriptLocation")
@js.native
object MsoScriptLocation extends js.Object {
  @js.native
  sealed trait msoScriptLocationInBody
    extends activexDashOfficeLib.OfficeNs.MsoScriptLocation
  
  @js.native
  sealed trait msoScriptLocationInHead
    extends activexDashOfficeLib.OfficeNs.MsoScriptLocation
  
  /* 2 */ val msoScriptLocationInBody: msoScriptLocationInBody with scala.Double = js.native
  /* 1 */ val msoScriptLocationInHead: msoScriptLocationInHead with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoScriptLocation with scala.Double] = js.native
}

