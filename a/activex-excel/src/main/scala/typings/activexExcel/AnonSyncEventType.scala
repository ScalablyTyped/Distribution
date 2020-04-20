package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import typings.activexOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType
  val Wb: Workbook
}

object AnonSyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType, Wb: Workbook): AnonSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSyncEventType]
  }
}

