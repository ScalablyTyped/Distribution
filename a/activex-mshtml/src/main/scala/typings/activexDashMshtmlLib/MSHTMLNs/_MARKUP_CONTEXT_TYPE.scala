package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _MARKUP_CONTEXT_TYPE extends js.Object

@JSGlobal("MSHTML._MARKUP_CONTEXT_TYPE")
@js.native
object _MARKUP_CONTEXT_TYPE extends js.Object {
  @js.native
  sealed trait CONTEXT_TYPE_EnterScope
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  @js.native
  sealed trait CONTEXT_TYPE_ExitScope
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  @js.native
  sealed trait CONTEXT_TYPE_NoScope
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  @js.native
  sealed trait CONTEXT_TYPE_None
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  @js.native
  sealed trait CONTEXT_TYPE_Text
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  @js.native
  sealed trait MARKUP_CONTEXT_TYPE_Max
    extends activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE
  
  /* 2 */ val CONTEXT_TYPE_EnterScope: CONTEXT_TYPE_EnterScope with scala.Double = js.native
  /* 3 */ val CONTEXT_TYPE_ExitScope: CONTEXT_TYPE_ExitScope with scala.Double = js.native
  /* 4 */ val CONTEXT_TYPE_NoScope: CONTEXT_TYPE_NoScope with scala.Double = js.native
  /* 0 */ val CONTEXT_TYPE_None: CONTEXT_TYPE_None with scala.Double = js.native
  /* 1 */ val CONTEXT_TYPE_Text: CONTEXT_TYPE_Text with scala.Double = js.native
  /* 2147483647 */ val MARKUP_CONTEXT_TYPE_Max: MARKUP_CONTEXT_TYPE_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._MARKUP_CONTEXT_TYPE with scala.Double] = js.native
}

