package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleVisibility extends js.Object

@JSGlobal("MSHTML._styleVisibility")
@js.native
object _styleVisibility extends js.Object {
  @js.native
  sealed trait styleVisibilityCollapse
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  @js.native
  sealed trait styleVisibilityHidden
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  @js.native
  sealed trait styleVisibilityInherit
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  @js.native
  sealed trait styleVisibilityNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  @js.native
  sealed trait styleVisibilityVisible
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  @js.native
  sealed trait styleVisibility_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleVisibility
  
  /* 4 */ val styleVisibilityCollapse: styleVisibilityCollapse with scala.Double = js.native
  /* 3 */ val styleVisibilityHidden: styleVisibilityHidden with scala.Double = js.native
  /* 1 */ val styleVisibilityInherit: styleVisibilityInherit with scala.Double = js.native
  /* 0 */ val styleVisibilityNotSet: styleVisibilityNotSet with scala.Double = js.native
  /* 2 */ val styleVisibilityVisible: styleVisibilityVisible with scala.Double = js.native
  /* 2147483647 */ val styleVisibility_Max: styleVisibility_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleVisibility with scala.Double] = js.native
}

