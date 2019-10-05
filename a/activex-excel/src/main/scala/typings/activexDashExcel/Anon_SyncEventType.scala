package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import typings.activexDashOffice.Office.MsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SyncEventType extends js.Object {
  val SyncEventType: MsoSyncEventType
  val Wb: Workbook
}

object Anon_SyncEventType {
  @scala.inline
  def apply(SyncEventType: MsoSyncEventType, Wb: Workbook): Anon_SyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType, Wb = Wb)
  
    __obj.asInstanceOf[Anon_SyncEventType]
  }
}

