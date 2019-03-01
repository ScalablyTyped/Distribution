package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocSyncEventType extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  val SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType
}

object Anon_DocSyncEventType {
  @scala.inline
  def apply(
    Doc: activexDashWordLib.WordNs.Document,
    SyncEventType: activexDashOfficeLib.OfficeNs.MsoSyncEventType
  ): Anon_DocSyncEventType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("SyncEventType")(SyncEventType)
    __obj.asInstanceOf[Anon_DocSyncEventType]
  }
}

