package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBorderWidth extends js.Object

@JSGlobal("MSHTML._styleBorderWidth")
@js.native
object _styleBorderWidth extends js.Object {
  @js.native
  sealed trait styleBorderWidthMedium
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderWidth
  
  @js.native
  sealed trait styleBorderWidthThick
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderWidth
  
  @js.native
  sealed trait styleBorderWidthThin
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderWidth
  
  @js.native
  sealed trait styleBorderWidth_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderWidth
  
  /* 1 */ val styleBorderWidthMedium: styleBorderWidthMedium with scala.Double = js.native
  /* 2 */ val styleBorderWidthThick: styleBorderWidthThick with scala.Double = js.native
  /* 0 */ val styleBorderWidthThin: styleBorderWidthThin with scala.Double = js.native
  /* 2147483647 */ val styleBorderWidth_Max: styleBorderWidth_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBorderWidth with scala.Double] = js.native
}

