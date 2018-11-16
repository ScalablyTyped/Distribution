package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFillRule extends js.Object

@JSGlobal("MSHTML._styleFillRule")
@js.native
object _styleFillRule extends js.Object {
  @js.native
  sealed trait styleFillRuleEvenOdd
    extends activexDashMshtmlLib.MSHTMLNs._styleFillRule
  
  @js.native
  sealed trait styleFillRuleNonZero
    extends activexDashMshtmlLib.MSHTMLNs._styleFillRule
  
  @js.native
  sealed trait styleFillRuleNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFillRule
  
  @js.native
  sealed trait styleFillRule_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFillRule
  
  /* 2 */ val styleFillRuleEvenOdd: styleFillRuleEvenOdd with scala.Double = js.native
  /* 1 */ val styleFillRuleNonZero: styleFillRuleNonZero with scala.Double = js.native
  /* 0 */ val styleFillRuleNotSet: styleFillRuleNotSet with scala.Double = js.native
  /* 2147483647 */ val styleFillRule_Max: styleFillRule_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFillRule with scala.Double] = js.native
}

