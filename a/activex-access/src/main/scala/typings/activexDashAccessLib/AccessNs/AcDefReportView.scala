package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDefReportView extends js.Object

@JSGlobal("Access.AcDefReportView")
@js.native
object AcDefReportView extends js.Object {
  @js.native
  sealed trait acDefViewPreview
    extends activexDashAccessLib.AccessNs.AcDefReportView
  
  @js.native
  sealed trait acDefViewReportBrowse
    extends activexDashAccessLib.AccessNs.AcDefReportView
  
  /* 0 */ val acDefViewPreview: acDefViewPreview with scala.Double = js.native
  /* 1 */ val acDefViewReportBrowse: acDefViewReportBrowse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDefReportView with scala.Double] = js.native
}

