package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcRecord extends js.Object

@JSGlobal("Access.AcRecord")
@js.native
object AcRecord extends js.Object {
  @js.native
  sealed trait acFirst
    extends activexDashAccessLib.AccessNs.AcRecord
  
  @js.native
  sealed trait acGoTo
    extends activexDashAccessLib.AccessNs.AcRecord
  
  @js.native
  sealed trait acLast
    extends activexDashAccessLib.AccessNs.AcRecord
  
  @js.native
  sealed trait acNewRec
    extends activexDashAccessLib.AccessNs.AcRecord
  
  @js.native
  sealed trait acNext
    extends activexDashAccessLib.AccessNs.AcRecord
  
  @js.native
  sealed trait acPrevious
    extends activexDashAccessLib.AccessNs.AcRecord
  
  /* 2 */ val acFirst: acFirst with scala.Double = js.native
  /* 4 */ val acGoTo: acGoTo with scala.Double = js.native
  /* 3 */ val acLast: acLast with scala.Double = js.native
  /* 5 */ val acNewRec: acNewRec with scala.Double = js.native
  /* 1 */ val acNext: acNext with scala.Double = js.native
  /* 0 */ val acPrevious: acPrevious with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcRecord with scala.Double] = js.native
}

