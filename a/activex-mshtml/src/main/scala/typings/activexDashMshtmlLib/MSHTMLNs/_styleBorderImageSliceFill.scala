package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBorderImageSliceFill extends js.Object

@JSGlobal("MSHTML._styleBorderImageSliceFill")
@js.native
object _styleBorderImageSliceFill extends js.Object {
  @js.native
  sealed trait styleBorderImageSliceFillFill
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderImageSliceFill
  
  @js.native
  sealed trait styleBorderImageSliceFillNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderImageSliceFill
  
  @js.native
  sealed trait styleBorderImageSliceFill_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBorderImageSliceFill
  
  /* 1 */ val styleBorderImageSliceFillFill: styleBorderImageSliceFillFill with scala.Double = js.native
  /* 0 */ val styleBorderImageSliceFillNotSet: styleBorderImageSliceFillNotSet with scala.Double = js.native
  /* 2147483647 */ val styleBorderImageSliceFill_Max: styleBorderImageSliceFill_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBorderImageSliceFill with scala.Double] = js.native
}

