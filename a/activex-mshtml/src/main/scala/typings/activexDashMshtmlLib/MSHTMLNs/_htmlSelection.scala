package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlSelection extends js.Object

@JSGlobal("MSHTML._htmlSelection")
@js.native
object _htmlSelection extends js.Object {
  @js.native
  sealed trait htmlSelectionControl
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelection
  
  @js.native
  sealed trait htmlSelectionNone
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelection
  
  @js.native
  sealed trait htmlSelectionTable
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelection
  
  @js.native
  sealed trait htmlSelectionText
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelection
  
  @js.native
  sealed trait htmlSelection_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlSelection
  
  /* 2 */ val htmlSelectionControl: htmlSelectionControl with scala.Double = js.native
  /* 0 */ val htmlSelectionNone: htmlSelectionNone with scala.Double = js.native
  /* 3 */ val htmlSelectionTable: htmlSelectionTable with scala.Double = js.native
  /* 1 */ val htmlSelectionText: htmlSelectionText with scala.Double = js.native
  /* 2147483647 */ val htmlSelection_Max: htmlSelection_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlSelection with scala.Double] = js.native
}

