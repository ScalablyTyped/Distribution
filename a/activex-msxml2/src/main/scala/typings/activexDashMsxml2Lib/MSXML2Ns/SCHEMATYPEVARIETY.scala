package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SCHEMATYPEVARIETY extends js.Object

/** Schema Object Model Type variety values */
@JSGlobal("MSXML2.SCHEMATYPEVARIETY")
@js.native
object SCHEMATYPEVARIETY extends js.Object {
  @js.native
  sealed trait SCHEMATYPEVARIETY_ATOMIC
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMATYPEVARIETY
  
  @js.native
  sealed trait SCHEMATYPEVARIETY_LIST
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMATYPEVARIETY
  
  @js.native
  sealed trait SCHEMATYPEVARIETY_NONE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMATYPEVARIETY
  
  @js.native
  sealed trait SCHEMATYPEVARIETY_UNION
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMATYPEVARIETY
  
  /* 0 */ val SCHEMATYPEVARIETY_ATOMIC: SCHEMATYPEVARIETY_ATOMIC with scala.Double = js.native
  /* 1 */ val SCHEMATYPEVARIETY_LIST: SCHEMATYPEVARIETY_LIST with scala.Double = js.native
  /* -1 */ val SCHEMATYPEVARIETY_NONE: SCHEMATYPEVARIETY_NONE with scala.Double = js.native
  /* 2 */ val SCHEMATYPEVARIETY_UNION: SCHEMATYPEVARIETY_UNION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns.SCHEMATYPEVARIETY with scala.Double] = js.native
}

