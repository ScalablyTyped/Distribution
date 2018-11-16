package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlBlockAlign extends js.Object

@JSGlobal("MSHTML._htmlBlockAlign")
@js.native
object _htmlBlockAlign extends js.Object {
  @js.native
  sealed trait htmlBlockAlignCenter
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  @js.native
  sealed trait htmlBlockAlignJustify
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  @js.native
  sealed trait htmlBlockAlignLeft
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  @js.native
  sealed trait htmlBlockAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  @js.native
  sealed trait htmlBlockAlignRight
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  @js.native
  sealed trait htmlBlockAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign
  
  /* 2 */ val htmlBlockAlignCenter: htmlBlockAlignCenter with scala.Double = js.native
  /* 4 */ val htmlBlockAlignJustify: htmlBlockAlignJustify with scala.Double = js.native
  /* 1 */ val htmlBlockAlignLeft: htmlBlockAlignLeft with scala.Double = js.native
  /* 0 */ val htmlBlockAlignNotSet: htmlBlockAlignNotSet with scala.Double = js.native
  /* 3 */ val htmlBlockAlignRight: htmlBlockAlignRight with scala.Double = js.native
  /* 2147483647 */ val htmlBlockAlign_Max: htmlBlockAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlBlockAlign with scala.Double] = js.native
}

