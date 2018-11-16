package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcCurrentView extends js.Object

@JSGlobal("Access.AcCurrentView")
@js.native
object AcCurrentView extends js.Object {
  @js.native
  sealed trait acCurViewDatasheet
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewDesign
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewFormBrowse
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewLayout
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewPivotChart
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewPivotTable
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewPreview
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  @js.native
  sealed trait acCurViewReportBrowse
    extends activexDashAccessLib.AccessNs.AcCurrentView
  
  /* 2 */ val acCurViewDatasheet: acCurViewDatasheet with scala.Double = js.native
  /* 0 */ val acCurViewDesign: acCurViewDesign with scala.Double = js.native
  /* 1 */ val acCurViewFormBrowse: acCurViewFormBrowse with scala.Double = js.native
  /* 7 */ val acCurViewLayout: acCurViewLayout with scala.Double = js.native
  /* 4 */ val acCurViewPivotChart: acCurViewPivotChart with scala.Double = js.native
  /* 3 */ val acCurViewPivotTable: acCurViewPivotTable with scala.Double = js.native
  /* 5 */ val acCurViewPreview: acCurViewPreview with scala.Double = js.native
  /* 6 */ val acCurViewReportBrowse: acCurViewReportBrowse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcCurrentView with scala.Double] = js.native
}

