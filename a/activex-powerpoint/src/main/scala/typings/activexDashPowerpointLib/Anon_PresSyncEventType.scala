package typings
package activexDashPowerpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PresSyncEventType extends js.Object {
  val Pres: activexDashPowerpointLib.PowerPointNs.Presentation
  val SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType
}

object Anon_PresSyncEventType {
  @scala.inline
  def apply(
    Pres: activexDashPowerpointLib.PowerPointNs.Presentation,
    SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType
  ): Anon_PresSyncEventType = {
    val __obj = js.Dynamic.literal(Pres = Pres, SyncEventType = SyncEventType)
  
    __obj.asInstanceOf[Anon_PresSyncEventType]
  }
}

