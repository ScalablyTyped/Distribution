package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBackgroundAttachment extends js.Object

@JSGlobal("MSHTML._styleBackgroundAttachment")
@js.native
object _styleBackgroundAttachment extends js.Object {
  @js.native
  sealed trait styleBackgroundAttachmentFixed
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundAttachment
  
  @js.native
  sealed trait styleBackgroundAttachmentNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundAttachment
  
  @js.native
  sealed trait styleBackgroundAttachmentScroll
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundAttachment
  
  @js.native
  sealed trait styleBackgroundAttachment_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundAttachment
  
  /* 0 */ val styleBackgroundAttachmentFixed: styleBackgroundAttachmentFixed with scala.Double = js.native
  /* 2 */ val styleBackgroundAttachmentNotSet: styleBackgroundAttachmentNotSet with scala.Double = js.native
  /* 1 */ val styleBackgroundAttachmentScroll: styleBackgroundAttachmentScroll with scala.Double = js.native
  /* 2147483647 */ val styleBackgroundAttachment_Max: styleBackgroundAttachment_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBackgroundAttachment with scala.Double] = js.native
}

