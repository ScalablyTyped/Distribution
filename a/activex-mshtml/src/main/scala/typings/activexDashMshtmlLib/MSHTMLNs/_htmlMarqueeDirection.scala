package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlMarqueeDirection extends js.Object

@JSGlobal("MSHTML._htmlMarqueeDirection")
@js.native
object _htmlMarqueeDirection extends js.Object {
  @js.native
  sealed trait htmlMarqueeDirection_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection
  
  @js.native
  sealed trait htmlMarqueeDirectiondown
    extends activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection
  
  @js.native
  sealed trait htmlMarqueeDirectionleft
    extends activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection
  
  @js.native
  sealed trait htmlMarqueeDirectionright
    extends activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection
  
  @js.native
  sealed trait htmlMarqueeDirectionup
    extends activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection
  
  /* 2147483647 */ val htmlMarqueeDirection_Max: htmlMarqueeDirection_Max with scala.Double = js.native
  /* 7 */ val htmlMarqueeDirectiondown: htmlMarqueeDirectiondown with scala.Double = js.native
  /* 1 */ val htmlMarqueeDirectionleft: htmlMarqueeDirectionleft with scala.Double = js.native
  /* 3 */ val htmlMarqueeDirectionright: htmlMarqueeDirectionright with scala.Double = js.native
  /* 5 */ val htmlMarqueeDirectionup: htmlMarqueeDirectionup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlMarqueeDirection with scala.Double] = js.native
}

