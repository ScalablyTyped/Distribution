package typings.activexDashPowerpoint

import typings.activexDashOffice.Office.MsoSyncEventType
import typings.activexDashPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PresSyncEventType extends js.Object {
  val Pres: Presentation
  val SyncEventType: MsoSyncEventType
}

object Anon_PresSyncEventType {
  @scala.inline
  def apply(Pres: Presentation, SyncEventType: MsoSyncEventType): Anon_PresSyncEventType = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PresSyncEventType]
  }
}

