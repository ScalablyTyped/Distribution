package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWebkitBoxDirection extends js.Object

@JSGlobal("MSHTML._styleWebkitBoxDirection")
@js.native
object _styleWebkitBoxDirection extends js.Object {
  @js.native
  sealed trait styleWebkitBoxDirectionNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleWebkitBoxDirection
  
  @js.native
  sealed trait styleWebkitBoxDirectionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWebkitBoxDirection
  
  @js.native
  sealed trait styleWebkitBoxDirectionReverse
    extends activexDashMshtmlLib.MSHTMLNs._styleWebkitBoxDirection
  
  @js.native
  sealed trait styleWebkitBoxDirection_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWebkitBoxDirection
  
  /* 0 */ val styleWebkitBoxDirectionNormal: styleWebkitBoxDirectionNormal with scala.Double = js.native
  /* 2 */ val styleWebkitBoxDirectionNotSet: styleWebkitBoxDirectionNotSet with scala.Double = js.native
  /* 1 */ val styleWebkitBoxDirectionReverse: styleWebkitBoxDirectionReverse with scala.Double = js.native
  /* 2147483647 */ val styleWebkitBoxDirection_Max: styleWebkitBoxDirection_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWebkitBoxDirection with scala.Double] = js.native
}

