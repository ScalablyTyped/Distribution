package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSplitFormDatasheet extends js.Object

@JSGlobal("Access.AcSplitFormDatasheet")
@js.native
object AcSplitFormDatasheet extends js.Object {
  @js.native
  sealed trait acDatasheetAllowEdits
    extends activexDashAccessLib.AccessNs.AcSplitFormDatasheet
  
  @js.native
  sealed trait acDatasheetReadOnly
    extends activexDashAccessLib.AccessNs.AcSplitFormDatasheet
  
  /* 0 */ val acDatasheetAllowEdits: acDatasheetAllowEdits with scala.Double = js.native
  /* 1 */ val acDatasheetReadOnly: acDatasheetReadOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSplitFormDatasheet with scala.Double] = js.native
}

