package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcView extends js.Object

@JSGlobal("Access.AcView")
@js.native
object AcView extends js.Object {
  @js.native
  sealed trait acViewDesign
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewLayout
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewNormal
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewPivotChart
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewPivotTable
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewPreview
    extends activexDashAccessLib.AccessNs.AcView
  
  @js.native
  sealed trait acViewReport
    extends activexDashAccessLib.AccessNs.AcView
  
  /* 1 */ val acViewDesign: acViewDesign with scala.Double = js.native
  /* 6 */ val acViewLayout: acViewLayout with scala.Double = js.native
  /* 0 */ val acViewNormal: acViewNormal with scala.Double = js.native
  /* 4 */ val acViewPivotChart: acViewPivotChart with scala.Double = js.native
  /* 3 */ val acViewPivotTable: acViewPivotTable with scala.Double = js.native
  /* 2 */ val acViewPreview: acViewPreview with scala.Double = js.native
  /* 5 */ val acViewReport: acViewReport with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcView with scala.Double] = js.native
}

