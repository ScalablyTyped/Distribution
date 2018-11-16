package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFlexWrap extends js.Object

@JSGlobal("MSHTML._styleFlexWrap")
@js.native
object _styleFlexWrap extends js.Object {
  @js.native
  sealed trait styleFlexWrapNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexWrap
  
  @js.native
  sealed trait styleFlexWrapNowrap
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexWrap
  
  @js.native
  sealed trait styleFlexWrapWrap
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexWrap
  
  @js.native
  sealed trait styleFlexWrapWrapReverse
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexWrap
  
  @js.native
  sealed trait styleFlexWrap_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexWrap
  
  /* 3 */ val styleFlexWrapNotSet: styleFlexWrapNotSet with scala.Double = js.native
  /* 0 */ val styleFlexWrapNowrap: styleFlexWrapNowrap with scala.Double = js.native
  /* 1 */ val styleFlexWrapWrap: styleFlexWrapWrap with scala.Double = js.native
  /* 2 */ val styleFlexWrapWrapReverse: styleFlexWrapWrapReverse with scala.Double = js.native
  /* 2147483647 */ val styleFlexWrap_Max: styleFlexWrap_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFlexWrap with scala.Double] = js.native
}

