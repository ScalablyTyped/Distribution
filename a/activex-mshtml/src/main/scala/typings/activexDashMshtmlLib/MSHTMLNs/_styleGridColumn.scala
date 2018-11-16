package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridColumn extends js.Object

@JSGlobal("MSHTML._styleGridColumn")
@js.native
object _styleGridColumn extends js.Object {
  @js.native
  sealed trait styleGridColumnNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumn
  
  @js.native
  sealed trait styleGridColumn_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumn
  
  /* 0 */ val styleGridColumnNotSet: styleGridColumnNotSet with scala.Double = js.native
  /* 2147483647 */ val styleGridColumn_Max: styleGridColumn_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridColumn with scala.Double] = js.native
}

