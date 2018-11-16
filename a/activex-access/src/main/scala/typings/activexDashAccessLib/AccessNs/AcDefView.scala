package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDefView extends js.Object

@JSGlobal("Access.AcDefView")
@js.native
object AcDefView extends js.Object {
  @js.native
  sealed trait acDefViewContinuous
    extends activexDashAccessLib.AccessNs.AcDefView
  
  @js.native
  sealed trait acDefViewDatasheet
    extends activexDashAccessLib.AccessNs.AcDefView
  
  @js.native
  sealed trait acDefViewPivotChart
    extends activexDashAccessLib.AccessNs.AcDefView
  
  @js.native
  sealed trait acDefViewPivotTable
    extends activexDashAccessLib.AccessNs.AcDefView
  
  @js.native
  sealed trait acDefViewSingle
    extends activexDashAccessLib.AccessNs.AcDefView
  
  @js.native
  sealed trait acDefViewSplitForm
    extends activexDashAccessLib.AccessNs.AcDefView
  
  /* 1 */ val acDefViewContinuous: acDefViewContinuous with scala.Double = js.native
  /* 2 */ val acDefViewDatasheet: acDefViewDatasheet with scala.Double = js.native
  /* 4 */ val acDefViewPivotChart: acDefViewPivotChart with scala.Double = js.native
  /* 3 */ val acDefViewPivotTable: acDefViewPivotTable with scala.Double = js.native
  /* 0 */ val acDefViewSingle: acDefViewSingle with scala.Double = js.native
  /* 5 */ val acDefViewSplitForm: acDefViewSplitForm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDefView with scala.Double] = js.native
}

