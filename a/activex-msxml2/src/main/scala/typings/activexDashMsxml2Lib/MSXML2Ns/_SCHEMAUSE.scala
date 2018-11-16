package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SCHEMAUSE extends js.Object

/** Schema Object Model Attribute Uses */
@JSGlobal("MSXML2._SCHEMAUSE")
@js.native
object _SCHEMAUSE extends js.Object {
  @js.native
  sealed trait SCHEMAUSE_OPTIONAL
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMAUSE
  
  @js.native
  sealed trait SCHEMAUSE_PROHIBITED
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMAUSE
  
  @js.native
  sealed trait SCHEMAUSE_REQUIRED
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMAUSE
  
  /* 0 */ val SCHEMAUSE_OPTIONAL: SCHEMAUSE_OPTIONAL with scala.Double = js.native
  /* 1 */ val SCHEMAUSE_PROHIBITED: SCHEMAUSE_PROHIBITED with scala.Double = js.native
  /* 2 */ val SCHEMAUSE_REQUIRED: SCHEMAUSE_REQUIRED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns._SCHEMAUSE with scala.Double] = js.native
}

