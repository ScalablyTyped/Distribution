package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _VIEW_OBJECT_ALPHA_MODE extends js.Object

@JSGlobal("MSHTML._VIEW_OBJECT_ALPHA_MODE")
@js.native
object _VIEW_OBJECT_ALPHA_MODE extends js.Object {
  @js.native
  sealed trait VIEW_OBJECT_ALPHA_MODE_IGNORE
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_ALPHA_MODE
  
  @js.native
  sealed trait VIEW_OBJECT_ALPHA_MODE_Max
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_ALPHA_MODE
  
  @js.native
  sealed trait VIEW_OBJECT_ALPHA_MODE_PREMULTIPLIED
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_ALPHA_MODE
  
  /* 0 */ val VIEW_OBJECT_ALPHA_MODE_IGNORE: VIEW_OBJECT_ALPHA_MODE_IGNORE with scala.Double = js.native
  /* 2147483647 */ val VIEW_OBJECT_ALPHA_MODE_Max: VIEW_OBJECT_ALPHA_MODE_Max with scala.Double = js.native
  /* 1 */ val VIEW_OBJECT_ALPHA_MODE_PREMULTIPLIED: VIEW_OBJECT_ALPHA_MODE_PREMULTIPLIED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_ALPHA_MODE with scala.Double] = js.native
}

