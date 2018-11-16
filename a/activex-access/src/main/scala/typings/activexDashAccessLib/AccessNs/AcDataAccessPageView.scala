package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDataAccessPageView extends js.Object

@JSGlobal("Access.AcDataAccessPageView")
@js.native
object AcDataAccessPageView extends js.Object {
  @js.native
  sealed trait acDataAccessPageBrowse
    extends activexDashAccessLib.AccessNs.AcDataAccessPageView
  
  @js.native
  sealed trait acDataAccessPageDesign
    extends activexDashAccessLib.AccessNs.AcDataAccessPageView
  
  /* 0 */ val acDataAccessPageBrowse: acDataAccessPageBrowse with scala.Double = js.native
  /* 1 */ val acDataAccessPageDesign: acDataAccessPageDesign with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDataAccessPageView with scala.Double] = js.native
}

