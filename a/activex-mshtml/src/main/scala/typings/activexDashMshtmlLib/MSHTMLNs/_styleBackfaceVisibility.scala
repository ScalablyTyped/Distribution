package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBackfaceVisibility extends js.Object

@JSGlobal("MSHTML._styleBackfaceVisibility")
@js.native
object _styleBackfaceVisibility extends js.Object {
  @js.native
  sealed trait styleBackfaceVisibilityHidden
    extends activexDashMshtmlLib.MSHTMLNs._styleBackfaceVisibility
  
  @js.native
  sealed trait styleBackfaceVisibilityNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBackfaceVisibility
  
  @js.native
  sealed trait styleBackfaceVisibilityVisible
    extends activexDashMshtmlLib.MSHTMLNs._styleBackfaceVisibility
  
  @js.native
  sealed trait styleBackfaceVisibility_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBackfaceVisibility
  
  /* 1 */ val styleBackfaceVisibilityHidden: styleBackfaceVisibilityHidden with scala.Double = js.native
  /* 2 */ val styleBackfaceVisibilityNotSet: styleBackfaceVisibilityNotSet with scala.Double = js.native
  /* 0 */ val styleBackfaceVisibilityVisible: styleBackfaceVisibilityVisible with scala.Double = js.native
  /* 2147483647 */ val styleBackfaceVisibility_Max: styleBackfaceVisibility_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBackfaceVisibility with scala.Double] = js.native
}

