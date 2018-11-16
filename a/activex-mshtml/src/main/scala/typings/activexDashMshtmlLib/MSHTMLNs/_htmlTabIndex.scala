package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlTabIndex extends js.Object

@JSGlobal("MSHTML._htmlTabIndex")
@js.native
object _htmlTabIndex extends js.Object {
  @js.native
  sealed trait htmlTabIndexNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlTabIndex
  
  @js.native
  sealed trait htmlTabIndex_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlTabIndex
  
  /* -32768 */ val htmlTabIndexNotSet: htmlTabIndexNotSet with scala.Double = js.native
  /* 2147483647 */ val htmlTabIndex_Max: htmlTabIndex_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlTabIndex with scala.Double] = js.native
}

