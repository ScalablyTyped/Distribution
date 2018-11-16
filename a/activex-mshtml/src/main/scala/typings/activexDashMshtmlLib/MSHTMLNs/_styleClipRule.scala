package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleClipRule extends js.Object

@JSGlobal("MSHTML._styleClipRule")
@js.native
object _styleClipRule extends js.Object {
  @js.native
  sealed trait styleClipRuleEvenOdd
    extends activexDashMshtmlLib.MSHTMLNs._styleClipRule
  
  @js.native
  sealed trait styleClipRuleNonZero
    extends activexDashMshtmlLib.MSHTMLNs._styleClipRule
  
  @js.native
  sealed trait styleClipRuleNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleClipRule
  
  @js.native
  sealed trait styleClipRule_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleClipRule
  
  /* 2 */ val styleClipRuleEvenOdd: styleClipRuleEvenOdd with scala.Double = js.native
  /* 1 */ val styleClipRuleNonZero: styleClipRuleNonZero with scala.Double = js.native
  /* 0 */ val styleClipRuleNotSet: styleClipRuleNotSet with scala.Double = js.native
  /* 2147483647 */ val styleClipRule_Max: styleClipRule_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleClipRule with scala.Double] = js.native
}

