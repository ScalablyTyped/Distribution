package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormView extends js.Object

@JSGlobal("Access.AcFormView")
@js.native
object AcFormView extends js.Object {
  @js.native
  sealed trait acDesign
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acFormDS
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acFormPivotChart
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acFormPivotTable
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acLayout
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acNormal
    extends activexDashAccessLib.AccessNs.AcFormView
  
  @js.native
  sealed trait acPreview
    extends activexDashAccessLib.AccessNs.AcFormView
  
  /* 1 */ val acDesign: acDesign with scala.Double = js.native
  /* 3 */ val acFormDS: acFormDS with scala.Double = js.native
  /* 5 */ val acFormPivotChart: acFormPivotChart with scala.Double = js.native
  /* 4 */ val acFormPivotTable: acFormPivotTable with scala.Double = js.native
  /* 6 */ val acLayout: acLayout with scala.Double = js.native
  /* 0 */ val acNormal: acNormal with scala.Double = js.native
  /* 2 */ val acPreview: acPreview with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormView with scala.Double] = js.native
}

