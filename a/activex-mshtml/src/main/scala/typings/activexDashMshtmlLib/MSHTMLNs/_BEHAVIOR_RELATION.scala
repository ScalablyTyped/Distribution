package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _BEHAVIOR_RELATION extends js.Object

@JSGlobal("MSHTML._BEHAVIOR_RELATION")
@js.native
object _BEHAVIOR_RELATION extends js.Object {
  @js.native
  sealed trait BEHAVIOR_CHILD
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_FIRSTRELATION
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_LASTRELATION
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_PARENT
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_RELATION_Max
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_SAMEELEMENT
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  @js.native
  sealed trait BEHAVIOR_SIBLING
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION
  
  /* 2 */ val BEHAVIOR_CHILD: BEHAVIOR_CHILD with scala.Double = js.native
  /* 0 */ val BEHAVIOR_FIRSTRELATION: BEHAVIOR_FIRSTRELATION with scala.Double = js.native
  /* 3 */ val BEHAVIOR_LASTRELATION: BEHAVIOR_LASTRELATION with scala.Double = js.native
  /* 1 */ val BEHAVIOR_PARENT: BEHAVIOR_PARENT with scala.Double = js.native
  /* 2147483647 */ val BEHAVIOR_RELATION_Max: BEHAVIOR_RELATION_Max with scala.Double = js.native
  /* 0 */ val BEHAVIOR_SAMEELEMENT: BEHAVIOR_SAMEELEMENT with scala.Double = js.native
  /* 3 */ val BEHAVIOR_SIBLING: BEHAVIOR_SIBLING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_RELATION with scala.Double] = js.native
}

