package typings.activexWord

import typings.activexOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType
}

object AnonSyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType): AnonSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSyncEventType]
  }
}

