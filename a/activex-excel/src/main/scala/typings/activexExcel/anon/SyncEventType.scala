package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType
  val Wb: Workbook
}

object SyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType, Wb: Workbook): SyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
}

