package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SyncEventType extends js.Object {
  val SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_SyncEventType {
  @scala.inline
  def apply(
    SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_SyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType, Wb = Wb)
  
    __obj.asInstanceOf[Anon_SyncEventType]
  }
}

