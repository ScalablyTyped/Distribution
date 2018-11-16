package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWidowsOrphans extends js.Object

@JSGlobal("MSHTML._styleWidowsOrphans")
@js.native
object _styleWidowsOrphans extends js.Object {
  @js.native
  sealed trait styleWidowsOrphansNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWidowsOrphans
  
  @js.native
  sealed trait styleWidowsOrphans_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWidowsOrphans
  
  /* -2147483647 */ val styleWidowsOrphansNotSet: styleWidowsOrphansNotSet with scala.Double = js.native
  /* 2147483647 */ val styleWidowsOrphans_Max: styleWidowsOrphans_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWidowsOrphans with scala.Double] = js.native
}

