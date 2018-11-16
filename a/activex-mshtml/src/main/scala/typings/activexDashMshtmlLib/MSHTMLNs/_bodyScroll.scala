package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _bodyScroll extends js.Object

@JSGlobal("MSHTML._bodyScroll")
@js.native
object _bodyScroll extends js.Object {
  @js.native
  sealed trait bodyScroll_Max
    extends activexDashMshtmlLib.MSHTMLNs._bodyScroll
  
  @js.native
  sealed trait bodyScrollauto
    extends activexDashMshtmlLib.MSHTMLNs._bodyScroll
  
  @js.native
  sealed trait bodyScrolldefault
    extends activexDashMshtmlLib.MSHTMLNs._bodyScroll
  
  @js.native
  sealed trait bodyScrollno
    extends activexDashMshtmlLib.MSHTMLNs._bodyScroll
  
  @js.native
  sealed trait bodyScrollyes
    extends activexDashMshtmlLib.MSHTMLNs._bodyScroll
  
  /* 2147483647 */ val bodyScroll_Max: bodyScroll_Max with scala.Double = js.native
  /* 4 */ val bodyScrollauto: bodyScrollauto with scala.Double = js.native
  /* 3 */ val bodyScrolldefault: bodyScrolldefault with scala.Double = js.native
  /* 2 */ val bodyScrollno: bodyScrollno with scala.Double = js.native
  /* 1 */ val bodyScrollyes: bodyScrollyes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._bodyScroll with scala.Double] = js.native
}

