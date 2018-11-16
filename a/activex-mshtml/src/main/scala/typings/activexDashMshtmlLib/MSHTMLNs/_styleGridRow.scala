package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridRow extends js.Object

@JSGlobal("MSHTML._styleGridRow")
@js.native
object _styleGridRow extends js.Object {
  @js.native
  sealed trait styleGridRowNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRow
  
  @js.native
  sealed trait styleGridRow_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRow
  
  /* 0 */ val styleGridRowNotSet: styleGridRowNotSet with scala.Double = js.native
  /* 2147483647 */ val styleGridRow_Max: styleGridRow_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridRow with scala.Double] = js.native
}

