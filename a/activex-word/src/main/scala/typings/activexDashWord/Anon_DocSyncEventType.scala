package typings.activexDashWord

import typings.activexDashOffice.OfficeNs.MsoSyncEventType
import typings.activexDashWord.WordNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocSyncEventType extends js.Object {
  val Doc: Document
  val SyncEventType: MsoSyncEventType
}

object Anon_DocSyncEventType {
  @scala.inline
  def apply(Doc: Document, SyncEventType: MsoSyncEventType): Anon_DocSyncEventType = {
    val __obj = js.Dynamic.literal(Doc = Doc, SyncEventType = SyncEventType)
  
    __obj.asInstanceOf[Anon_DocSyncEventType]
  }
}

