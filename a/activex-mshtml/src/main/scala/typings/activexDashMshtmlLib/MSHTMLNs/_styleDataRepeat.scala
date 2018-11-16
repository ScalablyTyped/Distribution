package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleDataRepeat extends js.Object

@JSGlobal("MSHTML._styleDataRepeat")
@js.native
object _styleDataRepeat extends js.Object {
  @js.native
  sealed trait styleDataRepeatInner
    extends activexDashMshtmlLib.MSHTMLNs._styleDataRepeat
  
  @js.native
  sealed trait styleDataRepeatNone
    extends activexDashMshtmlLib.MSHTMLNs._styleDataRepeat
  
  @js.native
  sealed trait styleDataRepeat_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleDataRepeat
  
  /* 1 */ val styleDataRepeatInner: styleDataRepeatInner with scala.Double = js.native
  /* 0 */ val styleDataRepeatNone: styleDataRepeatNone with scala.Double = js.native
  /* 2147483647 */ val styleDataRepeat_Max: styleDataRepeat_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleDataRepeat with scala.Double] = js.native
}

