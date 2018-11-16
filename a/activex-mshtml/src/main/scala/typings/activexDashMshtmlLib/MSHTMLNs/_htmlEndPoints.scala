package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlEndPoints extends js.Object

@JSGlobal("MSHTML._htmlEndPoints")
@js.native
object _htmlEndPoints extends js.Object {
  @js.native
  sealed trait htmlEndPointsEndToEnd
    extends activexDashMshtmlLib.MSHTMLNs._htmlEndPoints
  
  @js.native
  sealed trait htmlEndPointsEndToStart
    extends activexDashMshtmlLib.MSHTMLNs._htmlEndPoints
  
  @js.native
  sealed trait htmlEndPointsStartToEnd
    extends activexDashMshtmlLib.MSHTMLNs._htmlEndPoints
  
  @js.native
  sealed trait htmlEndPointsStartToStart
    extends activexDashMshtmlLib.MSHTMLNs._htmlEndPoints
  
  @js.native
  sealed trait htmlEndPoints_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlEndPoints
  
  /* 4 */ val htmlEndPointsEndToEnd: htmlEndPointsEndToEnd with scala.Double = js.native
  /* 3 */ val htmlEndPointsEndToStart: htmlEndPointsEndToStart with scala.Double = js.native
  /* 2 */ val htmlEndPointsStartToEnd: htmlEndPointsStartToEnd with scala.Double = js.native
  /* 1 */ val htmlEndPointsStartToStart: htmlEndPointsStartToStart with scala.Double = js.native
  /* 2147483647 */ val htmlEndPoints_Max: htmlEndPoints_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlEndPoints with scala.Double] = js.native
}

