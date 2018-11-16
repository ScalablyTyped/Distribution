package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _PARSE_FLAGS extends js.Object

@JSGlobal("MSHTML._PARSE_FLAGS")
@js.native
object _PARSE_FLAGS extends js.Object {
  @js.native
  sealed trait PARSE_ABSOLUTIFYIE40URLS
    extends activexDashMshtmlLib.MSHTMLNs._PARSE_FLAGS
  
  @js.native
  sealed trait PARSE_DISABLEVML
    extends activexDashMshtmlLib.MSHTMLNs._PARSE_FLAGS
  
  @js.native
  sealed trait PARSE_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._PARSE_FLAGS
  
  /* 1 */ val PARSE_ABSOLUTIFYIE40URLS: PARSE_ABSOLUTIFYIE40URLS with scala.Double = js.native
  /* 2 */ val PARSE_DISABLEVML: PARSE_DISABLEVML with scala.Double = js.native
  /* 2147483647 */ val PARSE_FLAGS_Max: PARSE_FLAGS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._PARSE_FLAGS with scala.Double] = js.native
}

