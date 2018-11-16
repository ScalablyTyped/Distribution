package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsImeAlign extends js.Object

@JSGlobal("MSHTML._styleMsImeAlign")
@js.native
object _styleMsImeAlign extends js.Object {
  @js.native
  sealed trait styleMsImeAlignAfter
    extends activexDashMshtmlLib.MSHTMLNs._styleMsImeAlign
  
  @js.native
  sealed trait styleMsImeAlignAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleMsImeAlign
  
  @js.native
  sealed trait styleMsImeAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsImeAlign
  
  @js.native
  sealed trait styleMsImeAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsImeAlign
  
  /* 1 */ val styleMsImeAlignAfter: styleMsImeAlignAfter with scala.Double = js.native
  /* 0 */ val styleMsImeAlignAuto: styleMsImeAlignAuto with scala.Double = js.native
  /* 2 */ val styleMsImeAlignNotSet: styleMsImeAlignNotSet with scala.Double = js.native
  /* 2147483647 */ val styleMsImeAlign_Max: styleMsImeAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsImeAlign with scala.Double] = js.native
}

