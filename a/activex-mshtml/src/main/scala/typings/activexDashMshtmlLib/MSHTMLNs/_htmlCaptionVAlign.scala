package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlCaptionVAlign extends js.Object

@JSGlobal("MSHTML._htmlCaptionVAlign")
@js.native
object _htmlCaptionVAlign extends js.Object {
  @js.native
  sealed trait htmlCaptionVAlignBottom
    extends activexDashMshtmlLib.MSHTMLNs._htmlCaptionVAlign
  
  @js.native
  sealed trait htmlCaptionVAlignNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlCaptionVAlign
  
  @js.native
  sealed trait htmlCaptionVAlignTop
    extends activexDashMshtmlLib.MSHTMLNs._htmlCaptionVAlign
  
  @js.native
  sealed trait htmlCaptionVAlign_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlCaptionVAlign
  
  /* 2 */ val htmlCaptionVAlignBottom: htmlCaptionVAlignBottom with scala.Double = js.native
  /* 0 */ val htmlCaptionVAlignNotSet: htmlCaptionVAlignNotSet with scala.Double = js.native
  /* 1 */ val htmlCaptionVAlignTop: htmlCaptionVAlignTop with scala.Double = js.native
  /* 2147483647 */ val htmlCaptionVAlign_Max: htmlCaptionVAlign_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlCaptionVAlign with scala.Double] = js.native
}

