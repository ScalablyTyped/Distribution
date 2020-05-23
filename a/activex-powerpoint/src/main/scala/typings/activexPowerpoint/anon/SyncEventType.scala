package typings.activexPowerpoint.anon

import typings.activexOffice.Office.MsoSyncEventType
import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncEventType extends js.Object {
  val Pres: Presentation
  val SyncEventType: MsoSyncEventType
}

object SyncEventType {
  @scala.inline
  def apply(Pres: Presentation, SyncEventType: MsoSyncEventType): SyncEventType = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
}

