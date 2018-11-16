package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextJustifyTrim extends js.Object

@JSGlobal("MSHTML._styleTextJustifyTrim")
@js.native
object _styleTextJustifyTrim extends js.Object {
  @js.native
  sealed trait styleTextJustifyTrimNone
    extends activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim
  
  @js.native
  sealed trait styleTextJustifyTrimNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim
  
  @js.native
  sealed trait styleTextJustifyTrimPunctAndKana
    extends activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim
  
  @js.native
  sealed trait styleTextJustifyTrimPunctuation
    extends activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim
  
  @js.native
  sealed trait styleTextJustifyTrim_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim
  
  /* 1 */ val styleTextJustifyTrimNone: styleTextJustifyTrimNone with scala.Double = js.native
  /* 0 */ val styleTextJustifyTrimNotSet: styleTextJustifyTrimNotSet with scala.Double = js.native
  /* 3 */ val styleTextJustifyTrimPunctAndKana: styleTextJustifyTrimPunctAndKana with scala.Double = js.native
  /* 2 */ val styleTextJustifyTrimPunctuation: styleTextJustifyTrimPunctuation with scala.Double = js.native
  /* 2147483647 */ val styleTextJustifyTrim_Max: styleTextJustifyTrim_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextJustifyTrim with scala.Double] = js.native
}

