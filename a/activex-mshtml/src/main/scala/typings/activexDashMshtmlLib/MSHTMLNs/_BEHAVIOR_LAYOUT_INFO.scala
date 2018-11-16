package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _BEHAVIOR_LAYOUT_INFO extends js.Object

@JSGlobal("MSHTML._BEHAVIOR_LAYOUT_INFO")
@js.native
object _BEHAVIOR_LAYOUT_INFO extends js.Object {
  @js.native
  sealed trait BEHAVIORLAYOUTINFO_FULLDELEGATION
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_LAYOUT_INFO
  
  @js.native
  sealed trait BEHAVIORLAYOUTINFO_MAPSIZE
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_LAYOUT_INFO
  
  @js.native
  sealed trait BEHAVIORLAYOUTINFO_MODIFYNATURAL
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_LAYOUT_INFO
  
  @js.native
  sealed trait BEHAVIOR_LAYOUT_INFO_Max
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_LAYOUT_INFO
  
  /* 1 */ val BEHAVIORLAYOUTINFO_FULLDELEGATION: BEHAVIORLAYOUTINFO_FULLDELEGATION with scala.Double = js.native
  /* 4 */ val BEHAVIORLAYOUTINFO_MAPSIZE: BEHAVIORLAYOUTINFO_MAPSIZE with scala.Double = js.native
  /* 2 */ val BEHAVIORLAYOUTINFO_MODIFYNATURAL: BEHAVIORLAYOUTINFO_MODIFYNATURAL with scala.Double = js.native
  /* 2147483647 */ val BEHAVIOR_LAYOUT_INFO_Max: BEHAVIOR_LAYOUT_INFO_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_LAYOUT_INFO with scala.Double] = js.native
}

