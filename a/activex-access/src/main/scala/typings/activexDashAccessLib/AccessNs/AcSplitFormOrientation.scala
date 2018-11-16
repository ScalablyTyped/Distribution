package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSplitFormOrientation extends js.Object

@JSGlobal("Access.AcSplitFormOrientation")
@js.native
object AcSplitFormOrientation extends js.Object {
  @js.native
  sealed trait acDatasheetOnBottom
    extends activexDashAccessLib.AccessNs.AcSplitFormOrientation
  
  @js.native
  sealed trait acDatasheetOnLeft
    extends activexDashAccessLib.AccessNs.AcSplitFormOrientation
  
  @js.native
  sealed trait acDatasheetOnRight
    extends activexDashAccessLib.AccessNs.AcSplitFormOrientation
  
  @js.native
  sealed trait acDatasheetOnTop
    extends activexDashAccessLib.AccessNs.AcSplitFormOrientation
  
  /* 1 */ val acDatasheetOnBottom: acDatasheetOnBottom with scala.Double = js.native
  /* 2 */ val acDatasheetOnLeft: acDatasheetOnLeft with scala.Double = js.native
  /* 3 */ val acDatasheetOnRight: acDatasheetOnRight with scala.Double = js.native
  /* 0 */ val acDatasheetOnTop: acDatasheetOnTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSplitFormOrientation with scala.Double] = js.native
}

