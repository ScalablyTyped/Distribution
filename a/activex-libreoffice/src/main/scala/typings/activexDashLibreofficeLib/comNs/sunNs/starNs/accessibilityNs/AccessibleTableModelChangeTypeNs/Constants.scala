package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleTableModelChangeTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.accessibility.AccessibleTableModelChangeType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DELETE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleTableModelChangeTypeNs.Constants
  
  @js.native
  sealed trait INSERT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleTableModelChangeTypeNs.Constants
  
  @js.native
  sealed trait UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleTableModelChangeTypeNs.Constants
  
  /* 2 */ val DELETE: DELETE with scala.Double = js.native
  /* 1 */ val INSERT: INSERT with scala.Double = js.native
  /* 3 */ val UPDATE: UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleTableModelChangeTypeNs.Constants with scala.Double
  ] = js.native
}

