package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.ContentAction.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants
  
  @js.native
  sealed trait EXCHANGED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants
  
  @js.native
  sealed trait INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants
  
  @js.native
  sealed trait REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants
  
  @js.native
  sealed trait SEARCH_MATCHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants
  
  /* 2 */ val DELETED: DELETED with scala.Double = js.native
  /* 4 */ val EXCHANGED: EXCHANGED with scala.Double = js.native
  /* 0 */ val INSERTED: INSERTED with scala.Double = js.native
  /* 1 */ val REMOVED: REMOVED with scala.Double = js.native
  /* 128 */ val SEARCH_MATCHED: SEARCH_MATCHED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentActionNs.Constants with scala.Double
  ] = js.native
}

