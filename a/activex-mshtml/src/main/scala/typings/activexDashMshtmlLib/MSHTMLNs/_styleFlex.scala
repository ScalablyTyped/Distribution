package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFlex extends js.Object

@JSGlobal("MSHTML._styleFlex")
@js.native
object _styleFlex extends js.Object {
  @js.native
  sealed trait styleFlexNone
    extends activexDashMshtmlLib.MSHTMLNs._styleFlex
  
  @js.native
  sealed trait styleFlexNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFlex
  
  @js.native
  sealed trait styleFlex_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFlex
  
  /* 0 */ val styleFlexNone: styleFlexNone with scala.Double = js.native
  /* 1 */ val styleFlexNotSet: styleFlexNotSet with scala.Double = js.native
  /* 2147483647 */ val styleFlex_Max: styleFlex_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFlex with scala.Double] = js.native
}

