package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _COORD_SYSTEM extends js.Object

@JSGlobal("MSHTML._COORD_SYSTEM")
@js.native
object _COORD_SYSTEM extends js.Object {
  @js.native
  sealed trait COORD_SYSTEM_CLIENT
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_CONTAINER
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_CONTENT
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_FRAME
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_GLOBAL
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_Max
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  @js.native
  sealed trait COORD_SYSTEM_PARENT
    extends activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM
  
  /* 5 */ val COORD_SYSTEM_CLIENT: COORD_SYSTEM_CLIENT with scala.Double = js.native
  /* 2 */ val COORD_SYSTEM_CONTAINER: COORD_SYSTEM_CONTAINER with scala.Double = js.native
  /* 3 */ val COORD_SYSTEM_CONTENT: COORD_SYSTEM_CONTENT with scala.Double = js.native
  /* 4 */ val COORD_SYSTEM_FRAME: COORD_SYSTEM_FRAME with scala.Double = js.native
  /* 0 */ val COORD_SYSTEM_GLOBAL: COORD_SYSTEM_GLOBAL with scala.Double = js.native
  /* 2147483647 */ val COORD_SYSTEM_Max: COORD_SYSTEM_Max with scala.Double = js.native
  /* 1 */ val COORD_SYSTEM_PARENT: COORD_SYSTEM_PARENT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._COORD_SYSTEM with scala.Double] = js.native
}

