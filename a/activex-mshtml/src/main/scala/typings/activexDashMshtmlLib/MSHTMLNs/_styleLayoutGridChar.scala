package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLayoutGridChar extends js.Object

@JSGlobal("MSHTML._styleLayoutGridChar")
@js.native
object _styleLayoutGridChar extends js.Object {
  @js.native
  sealed trait styleLayoutGridCharAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridChar
  
  @js.native
  sealed trait styleLayoutGridCharNone
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridChar
  
  @js.native
  sealed trait styleLayoutGridCharNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridChar
  
  @js.native
  sealed trait styleLayoutGridChar_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridChar
  
  /* 1 */ val styleLayoutGridCharAuto: styleLayoutGridCharAuto with scala.Double = js.native
  /* 2 */ val styleLayoutGridCharNone: styleLayoutGridCharNone with scala.Double = js.native
  /* 0 */ val styleLayoutGridCharNotSet: styleLayoutGridCharNotSet with scala.Double = js.native
  /* 2147483647 */ val styleLayoutGridChar_Max: styleLayoutGridChar_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLayoutGridChar with scala.Double] = js.native
}

