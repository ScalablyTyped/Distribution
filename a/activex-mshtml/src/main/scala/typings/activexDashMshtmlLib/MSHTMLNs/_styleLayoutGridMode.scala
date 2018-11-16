package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLayoutGridMode extends js.Object

@JSGlobal("MSHTML._styleLayoutGridMode")
@js.native
object _styleLayoutGridMode extends js.Object {
  @js.native
  sealed trait styleLayoutGridModeBoth
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  @js.native
  sealed trait styleLayoutGridModeChar
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  @js.native
  sealed trait styleLayoutGridModeLine
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  @js.native
  sealed trait styleLayoutGridModeNone
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  @js.native
  sealed trait styleLayoutGridModeNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  @js.native
  sealed trait styleLayoutGridMode_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode
  
  /* 3 */ val styleLayoutGridModeBoth: styleLayoutGridModeBoth with scala.Double = js.native
  /* 1 */ val styleLayoutGridModeChar: styleLayoutGridModeChar with scala.Double = js.native
  /* 2 */ val styleLayoutGridModeLine: styleLayoutGridModeLine with scala.Double = js.native
  /* 4 */ val styleLayoutGridModeNone: styleLayoutGridModeNone with scala.Double = js.native
  /* 0 */ val styleLayoutGridModeNotSet: styleLayoutGridModeNotSet with scala.Double = js.native
  /* 2147483647 */ val styleLayoutGridMode_Max: styleLayoutGridMode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLayoutGridMode with scala.Double] = js.native
}

