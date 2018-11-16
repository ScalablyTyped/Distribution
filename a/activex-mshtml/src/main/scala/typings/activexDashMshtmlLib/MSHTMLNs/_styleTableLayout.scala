package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTableLayout extends js.Object

@JSGlobal("MSHTML._styleTableLayout")
@js.native
object _styleTableLayout extends js.Object {
  @js.native
  sealed trait styleTableLayoutAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleTableLayout
  
  @js.native
  sealed trait styleTableLayoutFixed
    extends activexDashMshtmlLib.MSHTMLNs._styleTableLayout
  
  @js.native
  sealed trait styleTableLayoutNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTableLayout
  
  @js.native
  sealed trait styleTableLayout_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTableLayout
  
  /* 1 */ val styleTableLayoutAuto: styleTableLayoutAuto with scala.Double = js.native
  /* 2 */ val styleTableLayoutFixed: styleTableLayoutFixed with scala.Double = js.native
  /* 0 */ val styleTableLayoutNotSet: styleTableLayoutNotSet with scala.Double = js.native
  /* 2147483647 */ val styleTableLayout_Max: styleTableLayout_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTableLayout with scala.Double] = js.native
}

