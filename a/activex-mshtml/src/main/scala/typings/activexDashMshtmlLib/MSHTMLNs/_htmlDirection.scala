package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlDirection extends js.Object

@JSGlobal("MSHTML._htmlDirection")
@js.native
object _htmlDirection extends js.Object {
  @js.native
  sealed trait htmlDirectionBackward
    extends activexDashMshtmlLib.MSHTMLNs._htmlDirection
  
  @js.native
  sealed trait htmlDirectionForward
    extends activexDashMshtmlLib.MSHTMLNs._htmlDirection
  
  @js.native
  sealed trait htmlDirection_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlDirection
  
  /* -99999 */ val htmlDirectionBackward: htmlDirectionBackward with scala.Double = js.native
  /* 99999 */ val htmlDirectionForward: htmlDirectionForward with scala.Double = js.native
  /* 2147483647 */ val htmlDirection_Max: htmlDirection_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlDirection with scala.Double] = js.native
}

