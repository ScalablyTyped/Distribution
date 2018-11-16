package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlSpellCheck extends js.Object

@JSGlobal("MSHTML._htmlSpellCheck")
@js.native
object _htmlSpellCheck extends js.Object {
  @js.native
  sealed trait htmlSpellCheckDefault
    extends activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck
  
  @js.native
  sealed trait htmlSpellCheckFalse
    extends activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck
  
  @js.native
  sealed trait htmlSpellCheckNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck
  
  @js.native
  sealed trait htmlSpellCheckTrue
    extends activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck
  
  @js.native
  sealed trait htmlSpellCheck_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck
  
  /* 3 */ val htmlSpellCheckDefault: htmlSpellCheckDefault with scala.Double = js.native
  /* 2 */ val htmlSpellCheckFalse: htmlSpellCheckFalse with scala.Double = js.native
  /* 0 */ val htmlSpellCheckNotSet: htmlSpellCheckNotSet with scala.Double = js.native
  /* 1 */ val htmlSpellCheckTrue: htmlSpellCheckTrue with scala.Double = js.native
  /* 2147483647 */ val htmlSpellCheck_Max: htmlSpellCheck_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlSpellCheck with scala.Double] = js.native
}

