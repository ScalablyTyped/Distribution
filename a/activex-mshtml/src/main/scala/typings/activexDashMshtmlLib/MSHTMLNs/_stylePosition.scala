package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _stylePosition extends js.Object

@JSGlobal("MSHTML._stylePosition")
@js.native
object _stylePosition extends js.Object {
  @js.native
  sealed trait stylePositionMsDeviceFixed
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionMsPage
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePosition_Max
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionabsolute
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionfixed
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionrelative
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  @js.native
  sealed trait stylePositionstatic
    extends activexDashMshtmlLib.MSHTMLNs._stylePosition
  
  /* 6 */ val stylePositionMsDeviceFixed: stylePositionMsDeviceFixed with scala.Double = js.native
  /* 5 */ val stylePositionMsPage: stylePositionMsPage with scala.Double = js.native
  /* 0 */ val stylePositionNotSet: stylePositionNotSet with scala.Double = js.native
  /* 2147483647 */ val stylePosition_Max: stylePosition_Max with scala.Double = js.native
  /* 3 */ val stylePositionabsolute: stylePositionabsolute with scala.Double = js.native
  /* 4 */ val stylePositionfixed: stylePositionfixed with scala.Double = js.native
  /* 2 */ val stylePositionrelative: stylePositionrelative with scala.Double = js.native
  /* 1 */ val stylePositionstatic: stylePositionstatic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._stylePosition with scala.Double] = js.native
}

