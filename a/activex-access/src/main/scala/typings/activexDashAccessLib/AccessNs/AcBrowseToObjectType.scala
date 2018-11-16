package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcBrowseToObjectType extends js.Object

@JSGlobal("Access.AcBrowseToObjectType")
@js.native
object AcBrowseToObjectType extends js.Object {
  @js.native
  sealed trait acBrowseToForm
    extends activexDashAccessLib.AccessNs.AcBrowseToObjectType
  
  @js.native
  sealed trait acBrowseToReport
    extends activexDashAccessLib.AccessNs.AcBrowseToObjectType
  
  /* 2 */ val acBrowseToForm: acBrowseToForm with scala.Double = js.native
  /* 3 */ val acBrowseToReport: acBrowseToReport with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcBrowseToObjectType with scala.Double] = js.native
}

