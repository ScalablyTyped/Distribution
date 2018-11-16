package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridRowAlign extends js.Object

@JSGlobal("MSHTML._styleGridRowAlign")
@js.native
object _styleGridRowAlign extends js.Object {
  @js.native
  sealed trait styleGridRowAlignCenter
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  @js.native
  sealed trait styleGridRowAlignEnd
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  @js.native
  sealed trait styleGridRowAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  @js.native
  sealed trait styleGridRowAlignStart
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  @js.native
  sealed trait styleGridRowAlignStretch
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  @js.native
  sealed trait styleGridRowAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign
  
  /* 0 */ val styleGridRowAlignCenter: styleGridRowAlignCenter with scala.Double = js.native
  /* 1 */ val styleGridRowAlignEnd: styleGridRowAlignEnd with scala.Double = js.native
  /* 4 */ val styleGridRowAlignNotSet: styleGridRowAlignNotSet with scala.Double = js.native
  /* 2 */ val styleGridRowAlignStart: styleGridRowAlignStart with scala.Double = js.native
  /* 3 */ val styleGridRowAlignStretch: styleGridRowAlignStretch with scala.Double = js.native
  /* 2147483647 */ val styleGridRowAlign_Max: styleGridRowAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridRowAlign with scala.Double] = js.native
}

