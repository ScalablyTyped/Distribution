package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlAdjacency extends js.Object

@JSGlobal("MSHTML._htmlAdjacency")
@js.native
object _htmlAdjacency extends js.Object {
  @js.native
  sealed trait htmlAdjacencyAfterBegin
    extends activexDashMshtmlLib.MSHTMLNs._htmlAdjacency
  
  @js.native
  sealed trait htmlAdjacencyAfterEnd
    extends activexDashMshtmlLib.MSHTMLNs._htmlAdjacency
  
  @js.native
  sealed trait htmlAdjacencyBeforeBegin
    extends activexDashMshtmlLib.MSHTMLNs._htmlAdjacency
  
  @js.native
  sealed trait htmlAdjacencyBeforeEnd
    extends activexDashMshtmlLib.MSHTMLNs._htmlAdjacency
  
  @js.native
  sealed trait htmlAdjacency_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlAdjacency
  
  /* 2 */ val htmlAdjacencyAfterBegin: htmlAdjacencyAfterBegin with scala.Double = js.native
  /* 4 */ val htmlAdjacencyAfterEnd: htmlAdjacencyAfterEnd with scala.Double = js.native
  /* 1 */ val htmlAdjacencyBeforeBegin: htmlAdjacencyBeforeBegin with scala.Double = js.native
  /* 3 */ val htmlAdjacencyBeforeEnd: htmlAdjacencyBeforeEnd with scala.Double = js.native
  /* 2147483647 */ val htmlAdjacency_Max: htmlAdjacency_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlAdjacency with scala.Double] = js.native
}

