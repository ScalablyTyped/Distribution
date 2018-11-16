package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleEmptyCells extends js.Object

@JSGlobal("MSHTML._styleEmptyCells")
@js.native
object _styleEmptyCells extends js.Object {
  @js.native
  sealed trait styleEmptyCellsHide
    extends activexDashMshtmlLib.MSHTMLNs._styleEmptyCells
  
  @js.native
  sealed trait styleEmptyCellsNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleEmptyCells
  
  @js.native
  sealed trait styleEmptyCellsShow
    extends activexDashMshtmlLib.MSHTMLNs._styleEmptyCells
  
  @js.native
  sealed trait styleEmptyCells_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleEmptyCells
  
  /* 2 */ val styleEmptyCellsHide: styleEmptyCellsHide with scala.Double = js.native
  /* 0 */ val styleEmptyCellsNotSet: styleEmptyCellsNotSet with scala.Double = js.native
  /* 1 */ val styleEmptyCellsShow: styleEmptyCellsShow with scala.Double = js.native
  /* 2147483647 */ val styleEmptyCells_Max: styleEmptyCells_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleEmptyCells with scala.Double] = js.native
}

