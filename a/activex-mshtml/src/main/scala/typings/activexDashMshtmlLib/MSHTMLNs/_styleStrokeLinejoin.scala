package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleStrokeLinejoin extends js.Object

@JSGlobal("MSHTML._styleStrokeLinejoin")
@js.native
object _styleStrokeLinejoin extends js.Object {
  @js.native
  sealed trait styleStrokeLinejoinBevel
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin
  
  @js.native
  sealed trait styleStrokeLinejoinMiter
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin
  
  @js.native
  sealed trait styleStrokeLinejoinNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin
  
  @js.native
  sealed trait styleStrokeLinejoinRound
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin
  
  @js.native
  sealed trait styleStrokeLinejoin_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin
  
  /* 3 */ val styleStrokeLinejoinBevel: styleStrokeLinejoinBevel with scala.Double = js.native
  /* 1 */ val styleStrokeLinejoinMiter: styleStrokeLinejoinMiter with scala.Double = js.native
  /* 0 */ val styleStrokeLinejoinNotSet: styleStrokeLinejoinNotSet with scala.Double = js.native
  /* 2 */ val styleStrokeLinejoinRound: styleStrokeLinejoinRound with scala.Double = js.native
  /* 2147483647 */ val styleStrokeLinejoin_Max: styleStrokeLinejoin_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleStrokeLinejoin with scala.Double] = js.native
}

