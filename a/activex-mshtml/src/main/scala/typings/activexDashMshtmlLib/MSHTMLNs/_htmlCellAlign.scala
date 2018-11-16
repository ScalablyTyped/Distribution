package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlCellAlign extends js.Object

@JSGlobal("MSHTML._htmlCellAlign")
@js.native
object _htmlCellAlign extends js.Object {
  @js.native
  sealed trait htmlCellAlignCenter
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  @js.native
  sealed trait htmlCellAlignLeft
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  @js.native
  sealed trait htmlCellAlignMiddle
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  @js.native
  sealed trait htmlCellAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  @js.native
  sealed trait htmlCellAlignRight
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  @js.native
  sealed trait htmlCellAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlCellAlign
  
  /* 2 */ val htmlCellAlignCenter: htmlCellAlignCenter with scala.Double = js.native
  /* 1 */ val htmlCellAlignLeft: htmlCellAlignLeft with scala.Double = js.native
  /* 2 */ val htmlCellAlignMiddle: htmlCellAlignMiddle with scala.Double = js.native
  /* 0 */ val htmlCellAlignNotSet: htmlCellAlignNotSet with scala.Double = js.native
  /* 3 */ val htmlCellAlignRight: htmlCellAlignRight with scala.Double = js.native
  /* 2147483647 */ val htmlCellAlign_Max: htmlCellAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlCellAlign with scala.Double] = js.native
}

