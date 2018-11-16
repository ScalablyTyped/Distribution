package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleZIndex extends js.Object

@JSGlobal("MSHTML._styleZIndex")
@js.native
object _styleZIndex extends js.Object {
  @js.native
  sealed trait styleZIndexAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleZIndex
  
  @js.native
  sealed trait styleZIndex_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleZIndex
  
  /* -2147483647 */ val styleZIndexAuto: styleZIndexAuto with scala.Double = js.native
  /* 2147483647 */ val styleZIndex_Max: styleZIndex_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleZIndex with scala.Double] = js.native
}

