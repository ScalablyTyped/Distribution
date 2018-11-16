package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _ELEMENT_ADJACENCY extends js.Object

@JSGlobal("MSHTML._ELEMENT_ADJACENCY")
@js.native
object _ELEMENT_ADJACENCY extends js.Object {
  @js.native
  sealed trait ELEMENT_ADJACENCY_Max
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY
  
  @js.native
  sealed trait ELEM_ADJ_AfterBegin
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY
  
  @js.native
  sealed trait ELEM_ADJ_AfterEnd
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY
  
  @js.native
  sealed trait ELEM_ADJ_BeforeBegin
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY
  
  @js.native
  sealed trait ELEM_ADJ_BeforeEnd
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY
  
  /* 2147483647 */ val ELEMENT_ADJACENCY_Max: ELEMENT_ADJACENCY_Max with scala.Double = js.native
  /* 1 */ val ELEM_ADJ_AfterBegin: ELEM_ADJ_AfterBegin with scala.Double = js.native
  /* 3 */ val ELEM_ADJ_AfterEnd: ELEM_ADJ_AfterEnd with scala.Double = js.native
  /* 0 */ val ELEM_ADJ_BeforeBegin: ELEM_ADJ_BeforeBegin with scala.Double = js.native
  /* 2 */ val ELEM_ADJ_BeforeEnd: ELEM_ADJ_BeforeEnd with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._ELEMENT_ADJACENCY with scala.Double] = js.native
}

