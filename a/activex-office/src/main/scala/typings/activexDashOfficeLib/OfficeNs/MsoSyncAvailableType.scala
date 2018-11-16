package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncAvailableType extends js.Object

@JSGlobal("Office.MsoSyncAvailableType")
@js.native
object MsoSyncAvailableType extends js.Object {
  @js.native
  sealed trait msoSyncAvailableAnywhere
    extends activexDashOfficeLib.OfficeNs.MsoSyncAvailableType
  
  @js.native
  sealed trait msoSyncAvailableNone
    extends activexDashOfficeLib.OfficeNs.MsoSyncAvailableType
  
  @js.native
  sealed trait msoSyncAvailableOffline
    extends activexDashOfficeLib.OfficeNs.MsoSyncAvailableType
  
  /* 2 */ val msoSyncAvailableAnywhere: msoSyncAvailableAnywhere with scala.Double = js.native
  /* 0 */ val msoSyncAvailableNone: msoSyncAvailableNone with scala.Double = js.native
  /* 1 */ val msoSyncAvailableOffline: msoSyncAvailableOffline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncAvailableType with scala.Double] = js.native
}

