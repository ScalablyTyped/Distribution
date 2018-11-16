package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoDocInspectorStatus extends js.Object

@JSGlobal("Office.MsoDocInspectorStatus")
@js.native
object MsoDocInspectorStatus extends js.Object {
  @js.native
  sealed trait msoDocInspectorStatusDocOk
    extends activexDashOfficeLib.OfficeNs.MsoDocInspectorStatus
  
  @js.native
  sealed trait msoDocInspectorStatusError
    extends activexDashOfficeLib.OfficeNs.MsoDocInspectorStatus
  
  @js.native
  sealed trait msoDocInspectorStatusIssueFound
    extends activexDashOfficeLib.OfficeNs.MsoDocInspectorStatus
  
  /* 0 */ val msoDocInspectorStatusDocOk: msoDocInspectorStatusDocOk with scala.Double = js.native
  /* 2 */ val msoDocInspectorStatusError: msoDocInspectorStatusError with scala.Double = js.native
  /* 1 */ val msoDocInspectorStatusIssueFound: msoDocInspectorStatusIssueFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoDocInspectorStatus with scala.Double] = js.native
}

