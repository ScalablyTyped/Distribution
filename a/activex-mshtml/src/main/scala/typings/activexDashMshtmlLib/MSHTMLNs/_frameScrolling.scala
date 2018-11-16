package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _frameScrolling extends js.Object

@JSGlobal("MSHTML._frameScrolling")
@js.native
object _frameScrolling extends js.Object {
  @js.native
  sealed trait frameScrolling_Max
    extends activexDashMshtmlLib.MSHTMLNs._frameScrolling
  
  @js.native
  sealed trait frameScrollingauto
    extends activexDashMshtmlLib.MSHTMLNs._frameScrolling
  
  @js.native
  sealed trait frameScrollingno
    extends activexDashMshtmlLib.MSHTMLNs._frameScrolling
  
  @js.native
  sealed trait frameScrollingyes
    extends activexDashMshtmlLib.MSHTMLNs._frameScrolling
  
  /* 2147483647 */ val frameScrolling_Max: frameScrolling_Max with scala.Double = js.native
  /* 4 */ val frameScrollingauto: frameScrollingauto with scala.Double = js.native
  /* 2 */ val frameScrollingno: frameScrollingno with scala.Double = js.native
  /* 1 */ val frameScrollingyes: frameScrollingyes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._frameScrolling with scala.Double] = js.native
}

