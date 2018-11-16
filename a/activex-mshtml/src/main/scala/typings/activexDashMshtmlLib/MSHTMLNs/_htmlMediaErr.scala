package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlMediaErr extends js.Object

@JSGlobal("MSHTML._htmlMediaErr")
@js.native
object _htmlMediaErr extends js.Object {
  @js.native
  sealed trait htmlMediaErrAborted
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaErr
  
  @js.native
  sealed trait htmlMediaErrDecode
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaErr
  
  @js.native
  sealed trait htmlMediaErrNetwork
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaErr
  
  @js.native
  sealed trait htmlMediaErrSrcNotSupported
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaErr
  
  @js.native
  sealed trait htmlMediaErr_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaErr
  
  /* 0 */ val htmlMediaErrAborted: htmlMediaErrAborted with scala.Double = js.native
  /* 2 */ val htmlMediaErrDecode: htmlMediaErrDecode with scala.Double = js.native
  /* 1 */ val htmlMediaErrNetwork: htmlMediaErrNetwork with scala.Double = js.native
  /* 3 */ val htmlMediaErrSrcNotSupported: htmlMediaErrSrcNotSupported with scala.Double = js.native
  /* 2147483647 */ val htmlMediaErr_Max: htmlMediaErr_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlMediaErr with scala.Double] = js.native
}

