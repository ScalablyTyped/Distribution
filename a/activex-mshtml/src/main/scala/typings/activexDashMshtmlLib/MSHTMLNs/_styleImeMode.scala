package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleImeMode extends js.Object

@JSGlobal("MSHTML._styleImeMode")
@js.native
object _styleImeMode extends js.Object {
  @js.native
  sealed trait styleImeModeActive
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  @js.native
  sealed trait styleImeModeAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  @js.native
  sealed trait styleImeModeDisabled
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  @js.native
  sealed trait styleImeModeInactive
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  @js.native
  sealed trait styleImeModeNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  @js.native
  sealed trait styleImeMode_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleImeMode
  
  /* 1 */ val styleImeModeActive: styleImeModeActive with scala.Double = js.native
  /* 0 */ val styleImeModeAuto: styleImeModeAuto with scala.Double = js.native
  /* 3 */ val styleImeModeDisabled: styleImeModeDisabled with scala.Double = js.native
  /* 2 */ val styleImeModeInactive: styleImeModeInactive with scala.Double = js.native
  /* 4 */ val styleImeModeNotSet: styleImeModeNotSet with scala.Double = js.native
  /* 2147483647 */ val styleImeMode_Max: styleImeMode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleImeMode with scala.Double] = js.native
}

