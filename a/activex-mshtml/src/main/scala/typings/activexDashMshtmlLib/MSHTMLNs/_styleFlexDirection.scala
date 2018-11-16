package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFlexDirection extends js.Object

@JSGlobal("MSHTML._styleFlexDirection")
@js.native
object _styleFlexDirection extends js.Object {
  @js.native
  sealed trait styleFlexDirectionColumn
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  @js.native
  sealed trait styleFlexDirectionColumnReverse
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  @js.native
  sealed trait styleFlexDirectionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  @js.native
  sealed trait styleFlexDirectionRow
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  @js.native
  sealed trait styleFlexDirectionRowReverse
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  @js.native
  sealed trait styleFlexDirection_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexDirection
  
  /* 2 */ val styleFlexDirectionColumn: styleFlexDirectionColumn with scala.Double = js.native
  /* 3 */ val styleFlexDirectionColumnReverse: styleFlexDirectionColumnReverse with scala.Double = js.native
  /* 4 */ val styleFlexDirectionNotSet: styleFlexDirectionNotSet with scala.Double = js.native
  /* 0 */ val styleFlexDirectionRow: styleFlexDirectionRow with scala.Double = js.native
  /* 1 */ val styleFlexDirectionRowReverse: styleFlexDirectionRowReverse with scala.Double = js.native
  /* 2147483647 */ val styleFlexDirection_Max: styleFlexDirection_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFlexDirection with scala.Double] = js.native
}

