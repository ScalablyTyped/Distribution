package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SELECTION_TYPE extends js.Object

@JSGlobal("MSHTML._SELECTION_TYPE")
@js.native
object _SELECTION_TYPE extends js.Object {
  @js.native
  sealed trait SELECTION_TYPE_Caret
    extends activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE
  
  @js.native
  sealed trait SELECTION_TYPE_Control
    extends activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE
  
  @js.native
  sealed trait SELECTION_TYPE_Max
    extends activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE
  
  @js.native
  sealed trait SELECTION_TYPE_None
    extends activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE
  
  @js.native
  sealed trait SELECTION_TYPE_Text
    extends activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE
  
  /* 1 */ val SELECTION_TYPE_Caret: SELECTION_TYPE_Caret with scala.Double = js.native
  /* 3 */ val SELECTION_TYPE_Control: SELECTION_TYPE_Control with scala.Double = js.native
  /* 2147483647 */ val SELECTION_TYPE_Max: SELECTION_TYPE_Max with scala.Double = js.native
  /* 0 */ val SELECTION_TYPE_None: SELECTION_TYPE_None with scala.Double = js.native
  /* 2 */ val SELECTION_TYPE_Text: SELECTION_TYPE_Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._SELECTION_TYPE with scala.Double] = js.native
}

