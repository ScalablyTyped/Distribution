package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBool extends js.Object

@JSGlobal("MSHTML._styleBool")
@js.native
object _styleBool extends js.Object {
  @js.native
  sealed trait styleBoolFalse
    extends activexDashMshtmlLib.MSHTMLNs._styleBool
  
  @js.native
  sealed trait styleBoolTrue
    extends activexDashMshtmlLib.MSHTMLNs._styleBool
  
  @js.native
  sealed trait styleBool_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBool
  
  /* 0 */ val styleBoolFalse: styleBoolFalse with scala.Double = js.native
  /* 1 */ val styleBoolTrue: styleBoolTrue with scala.Double = js.native
  /* 2147483647 */ val styleBool_Max: styleBool_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBool with scala.Double] = js.native
}

