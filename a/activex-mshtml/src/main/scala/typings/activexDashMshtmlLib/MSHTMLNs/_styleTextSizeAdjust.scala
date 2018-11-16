package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextSizeAdjust extends js.Object

@JSGlobal("MSHTML._styleTextSizeAdjust")
@js.native
object _styleTextSizeAdjust extends js.Object {
  @js.native
  sealed trait styleTextSizeAdjustAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleTextSizeAdjust
  
  @js.native
  sealed trait styleTextSizeAdjustNone
    extends activexDashMshtmlLib.MSHTMLNs._styleTextSizeAdjust
  
  @js.native
  sealed trait styleTextSizeAdjust_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextSizeAdjust
  
  /* 1 */ val styleTextSizeAdjustAuto: styleTextSizeAdjustAuto with scala.Double = js.native
  /* 0 */ val styleTextSizeAdjustNone: styleTextSizeAdjustNone with scala.Double = js.native
  /* 2147483647 */ val styleTextSizeAdjust_Max: styleTextSizeAdjust_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextSizeAdjust with scala.Double] = js.native
}

