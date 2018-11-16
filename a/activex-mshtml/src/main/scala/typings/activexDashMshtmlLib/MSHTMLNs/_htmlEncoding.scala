package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlEncoding extends js.Object

@JSGlobal("MSHTML._htmlEncoding")
@js.native
object _htmlEncoding extends js.Object {
  @js.native
  sealed trait htmlEncodingMultipart
    extends activexDashMshtmlLib.MSHTMLNs._htmlEncoding
  
  @js.native
  sealed trait htmlEncodingText
    extends activexDashMshtmlLib.MSHTMLNs._htmlEncoding
  
  @js.native
  sealed trait htmlEncodingURL
    extends activexDashMshtmlLib.MSHTMLNs._htmlEncoding
  
  @js.native
  sealed trait htmlEncoding_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlEncoding
  
  /* 1 */ val htmlEncodingMultipart: htmlEncodingMultipart with scala.Double = js.native
  /* 2 */ val htmlEncodingText: htmlEncodingText with scala.Double = js.native
  /* 0 */ val htmlEncodingURL: htmlEncodingURL with scala.Double = js.native
  /* 2147483647 */ val htmlEncoding_Max: htmlEncoding_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlEncoding with scala.Double] = js.native
}

