package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncVersionType extends js.Object

@JSGlobal("Office.MsoSyncVersionType")
@js.native
object MsoSyncVersionType extends js.Object {
  @js.native
  sealed trait msoSyncVersionLastViewed
    extends activexDashOfficeLib.OfficeNs.MsoSyncVersionType
  
  @js.native
  sealed trait msoSyncVersionServer
    extends activexDashOfficeLib.OfficeNs.MsoSyncVersionType
  
  /* 0 */ val msoSyncVersionLastViewed: msoSyncVersionLastViewed with scala.Double = js.native
  /* 1 */ val msoSyncVersionServer: msoSyncVersionServer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncVersionType with scala.Double] = js.native
}

