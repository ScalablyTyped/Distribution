package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWrapThrough extends js.Object

@JSGlobal("MSHTML._styleWrapThrough")
@js.native
object _styleWrapThrough extends js.Object {
  @js.native
  sealed trait styleWrapThroughNone
    extends activexDashMshtmlLib.MSHTMLNs._styleWrapThrough
  
  @js.native
  sealed trait styleWrapThroughNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWrapThrough
  
  @js.native
  sealed trait styleWrapThroughWrap
    extends activexDashMshtmlLib.MSHTMLNs._styleWrapThrough
  
  @js.native
  sealed trait styleWrapThrough_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWrapThrough
  
  /* 2 */ val styleWrapThroughNone: styleWrapThroughNone with scala.Double = js.native
  /* 0 */ val styleWrapThroughNotSet: styleWrapThroughNotSet with scala.Double = js.native
  /* 1 */ val styleWrapThroughWrap: styleWrapThroughWrap with scala.Double = js.native
  /* 2147483647 */ val styleWrapThrough_Max: styleWrapThrough_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWrapThrough with scala.Double] = js.native
}

