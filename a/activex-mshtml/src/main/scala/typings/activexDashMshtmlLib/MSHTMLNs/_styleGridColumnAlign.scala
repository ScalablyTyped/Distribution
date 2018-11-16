package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridColumnAlign extends js.Object

@JSGlobal("MSHTML._styleGridColumnAlign")
@js.native
object _styleGridColumnAlign extends js.Object {
  @js.native
  sealed trait styleGridColumnAlignCenter
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  @js.native
  sealed trait styleGridColumnAlignEnd
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  @js.native
  sealed trait styleGridColumnAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  @js.native
  sealed trait styleGridColumnAlignStart
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  @js.native
  sealed trait styleGridColumnAlignStretch
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  @js.native
  sealed trait styleGridColumnAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign
  
  /* 0 */ val styleGridColumnAlignCenter: styleGridColumnAlignCenter with scala.Double = js.native
  /* 1 */ val styleGridColumnAlignEnd: styleGridColumnAlignEnd with scala.Double = js.native
  /* 4 */ val styleGridColumnAlignNotSet: styleGridColumnAlignNotSet with scala.Double = js.native
  /* 2 */ val styleGridColumnAlignStart: styleGridColumnAlignStart with scala.Double = js.native
  /* 3 */ val styleGridColumnAlignStretch: styleGridColumnAlignStretch with scala.Double = js.native
  /* 2147483647 */ val styleGridColumnAlign_Max: styleGridColumnAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridColumnAlign with scala.Double] = js.native
}

