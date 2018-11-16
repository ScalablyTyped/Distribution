package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleColumnFill extends js.Object

@JSGlobal("MSHTML._styleColumnFill")
@js.native
object _styleColumnFill extends js.Object {
  @js.native
  sealed trait styleColumnFillAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnFill
  
  @js.native
  sealed trait styleColumnFillBalance
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnFill
  
  @js.native
  sealed trait styleColumnFillNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnFill
  
  @js.native
  sealed trait styleColumnFill_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnFill
  
  /* 0 */ val styleColumnFillAuto: styleColumnFillAuto with scala.Double = js.native
  /* 1 */ val styleColumnFillBalance: styleColumnFillBalance with scala.Double = js.native
  /* 2 */ val styleColumnFillNotSet: styleColumnFillNotSet with scala.Double = js.native
  /* 2147483647 */ val styleColumnFill_Max: styleColumnFill_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleColumnFill with scala.Double] = js.native
}

