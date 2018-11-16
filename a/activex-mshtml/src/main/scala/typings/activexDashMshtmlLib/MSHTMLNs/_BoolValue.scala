package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _BoolValue extends js.Object

@JSGlobal("MSHTML._BoolValue")
@js.native
object _BoolValue extends js.Object {
  @js.native
  sealed trait BoolValue_Max
    extends activexDashMshtmlLib.MSHTMLNs._BoolValue
  
  @js.native
  sealed trait False
    extends activexDashMshtmlLib.MSHTMLNs._BoolValue
  
  @js.native
  sealed trait True
    extends activexDashMshtmlLib.MSHTMLNs._BoolValue
  
  /* 2147483647 */ val BoolValue_Max: BoolValue_Max with scala.Double = js.native
  /* 0 */ val False: False with scala.Double = js.native
  /* 1 */ val True: True with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._BoolValue with scala.Double] = js.native
}

