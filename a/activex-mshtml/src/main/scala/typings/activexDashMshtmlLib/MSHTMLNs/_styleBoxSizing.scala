package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBoxSizing extends js.Object

@JSGlobal("MSHTML._styleBoxSizing")
@js.native
object _styleBoxSizing extends js.Object {
  @js.native
  sealed trait styleBoxSizingBorderBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBoxSizing
  
  @js.native
  sealed trait styleBoxSizingContentBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBoxSizing
  
  @js.native
  sealed trait styleBoxSizingNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBoxSizing
  
  @js.native
  sealed trait styleBoxSizing_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBoxSizing
  
  /* 2 */ val styleBoxSizingBorderBox: styleBoxSizingBorderBox with scala.Double = js.native
  /* 1 */ val styleBoxSizingContentBox: styleBoxSizingContentBox with scala.Double = js.native
  /* 0 */ val styleBoxSizingNotSet: styleBoxSizingNotSet with scala.Double = js.native
  /* 2147483647 */ val styleBoxSizing_Max: styleBoxSizing_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBoxSizing with scala.Double] = js.native
}

