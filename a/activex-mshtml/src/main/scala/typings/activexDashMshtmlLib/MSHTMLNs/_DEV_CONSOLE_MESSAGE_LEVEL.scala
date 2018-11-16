package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _DEV_CONSOLE_MESSAGE_LEVEL extends js.Object

@JSGlobal("MSHTML._DEV_CONSOLE_MESSAGE_LEVEL")
@js.native
object _DEV_CONSOLE_MESSAGE_LEVEL extends js.Object {
  @js.native
  sealed trait DCML_ERROR
    extends activexDashMshtmlLib.MSHTMLNs._DEV_CONSOLE_MESSAGE_LEVEL
  
  @js.native
  sealed trait DCML_INFORMATIONAL
    extends activexDashMshtmlLib.MSHTMLNs._DEV_CONSOLE_MESSAGE_LEVEL
  
  @js.native
  sealed trait DCML_WARNING
    extends activexDashMshtmlLib.MSHTMLNs._DEV_CONSOLE_MESSAGE_LEVEL
  
  @js.native
  sealed trait DEV_CONSOLE_MESSAGE_LEVEL_Max
    extends activexDashMshtmlLib.MSHTMLNs._DEV_CONSOLE_MESSAGE_LEVEL
  
  /* 2 */ val DCML_ERROR: DCML_ERROR with scala.Double = js.native
  /* 0 */ val DCML_INFORMATIONAL: DCML_INFORMATIONAL with scala.Double = js.native
  /* 1 */ val DCML_WARNING: DCML_WARNING with scala.Double = js.native
  /* 2147483647 */ val DEV_CONSOLE_MESSAGE_LEVEL_Max: DEV_CONSOLE_MESSAGE_LEVEL_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._DEV_CONSOLE_MESSAGE_LEVEL with scala.Double] = js.native
}

