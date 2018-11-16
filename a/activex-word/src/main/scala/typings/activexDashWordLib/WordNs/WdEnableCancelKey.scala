package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEnableCancelKey extends js.Object

@JSGlobal("Word.WdEnableCancelKey")
@js.native
object WdEnableCancelKey extends js.Object {
  @js.native
  sealed trait wdCancelDisabled
    extends activexDashWordLib.WordNs.WdEnableCancelKey
  
  @js.native
  sealed trait wdCancelInterrupt
    extends activexDashWordLib.WordNs.WdEnableCancelKey
  
  /* 0 */ val wdCancelDisabled: wdCancelDisabled with scala.Double = js.native
  /* 1 */ val wdCancelInterrupt: wdCancelInterrupt with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEnableCancelKey with scala.Double] = js.native
}

