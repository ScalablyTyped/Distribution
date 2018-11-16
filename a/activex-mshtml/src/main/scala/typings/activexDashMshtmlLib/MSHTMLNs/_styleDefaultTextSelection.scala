package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleDefaultTextSelection extends js.Object

@JSGlobal("MSHTML._styleDefaultTextSelection")
@js.native
object _styleDefaultTextSelection extends js.Object {
  @js.native
  sealed trait styleDefaultTextSelectionFalse
    extends activexDashMshtmlLib.MSHTMLNs._styleDefaultTextSelection
  
  @js.native
  sealed trait styleDefaultTextSelectionTrue
    extends activexDashMshtmlLib.MSHTMLNs._styleDefaultTextSelection
  
  @js.native
  sealed trait styleDefaultTextSelection_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleDefaultTextSelection
  
  /* 0 */ val styleDefaultTextSelectionFalse: styleDefaultTextSelectionFalse with scala.Double = js.native
  /* 1 */ val styleDefaultTextSelectionTrue: styleDefaultTextSelectionTrue with scala.Double = js.native
  /* 2147483647 */ val styleDefaultTextSelection_Max: styleDefaultTextSelection_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleDefaultTextSelection with scala.Double] = js.native
}

