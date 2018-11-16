package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _VIEW_OBJECT_COMPOSITION_MODE extends js.Object

@JSGlobal("MSHTML._VIEW_OBJECT_COMPOSITION_MODE")
@js.native
object _VIEW_OBJECT_COMPOSITION_MODE extends js.Object {
  @js.native
  sealed trait VIEW_OBJECT_COMPOSITION_MODE_LEGACY
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_COMPOSITION_MODE
  
  @js.native
  sealed trait VIEW_OBJECT_COMPOSITION_MODE_Max
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_COMPOSITION_MODE
  
  @js.native
  sealed trait VIEW_OBJECT_COMPOSITION_MODE_SURFACEPRESENTER
    extends activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_COMPOSITION_MODE
  
  /* 0 */ val VIEW_OBJECT_COMPOSITION_MODE_LEGACY: VIEW_OBJECT_COMPOSITION_MODE_LEGACY with scala.Double = js.native
  /* 2147483647 */ val VIEW_OBJECT_COMPOSITION_MODE_Max: VIEW_OBJECT_COMPOSITION_MODE_Max with scala.Double = js.native
  /* 1 */ val VIEW_OBJECT_COMPOSITION_MODE_SURFACEPRESENTER: VIEW_OBJECT_COMPOSITION_MODE_SURFACEPRESENTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._VIEW_OBJECT_COMPOSITION_MODE with scala.Double] = js.native
}

