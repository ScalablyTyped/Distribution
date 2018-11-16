package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleOverflow extends js.Object

@JSGlobal("MSHTML._styleOverflow")
@js.native
object _styleOverflow extends js.Object {
  @js.native
  sealed trait styleOverflowAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  @js.native
  sealed trait styleOverflowHidden
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  @js.native
  sealed trait styleOverflowNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  @js.native
  sealed trait styleOverflowScroll
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  @js.native
  sealed trait styleOverflowVisible
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  @js.native
  sealed trait styleOverflow_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleOverflow
  
  /* 1 */ val styleOverflowAuto: styleOverflowAuto with scala.Double = js.native
  /* 2 */ val styleOverflowHidden: styleOverflowHidden with scala.Double = js.native
  /* 0 */ val styleOverflowNotSet: styleOverflowNotSet with scala.Double = js.native
  /* 4 */ val styleOverflowScroll: styleOverflowScroll with scala.Double = js.native
  /* 3 */ val styleOverflowVisible: styleOverflowVisible with scala.Double = js.native
  /* 2147483647 */ val styleOverflow_Max: styleOverflow_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleOverflow with scala.Double] = js.native
}

