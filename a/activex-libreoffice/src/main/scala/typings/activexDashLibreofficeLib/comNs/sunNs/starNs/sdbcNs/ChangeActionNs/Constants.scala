package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ChangeAction.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DELETE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs.Constants
  
  @js.native
  sealed trait INSERT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs.Constants
  
  @js.native
  sealed trait UNDO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs.Constants
  
  @js.native
  sealed trait UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs.Constants
  
  /* 3 */ val DELETE: DELETE with scala.Double = js.native
  /* 1 */ val INSERT: INSERT with scala.Double = js.native
  /* 4 */ val UNDO: UNDO with scala.Double = js.native
  /* 2 */ val UPDATE: UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ChangeActionNs.Constants with scala.Double
  ] = js.native
}

