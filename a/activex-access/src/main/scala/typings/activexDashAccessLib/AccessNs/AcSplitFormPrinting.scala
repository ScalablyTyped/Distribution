package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSplitFormPrinting extends js.Object

@JSGlobal("Access.AcSplitFormPrinting")
@js.native
object AcSplitFormPrinting extends js.Object {
  @js.native
  sealed trait acFormOnly
    extends activexDashAccessLib.AccessNs.AcSplitFormPrinting
  
  @js.native
  sealed trait acGridOnly
    extends activexDashAccessLib.AccessNs.AcSplitFormPrinting
  
  /* 0 */ val acFormOnly: acFormOnly with scala.Double = js.native
  /* 1 */ val acGridOnly: acGridOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSplitFormPrinting with scala.Double] = js.native
}

