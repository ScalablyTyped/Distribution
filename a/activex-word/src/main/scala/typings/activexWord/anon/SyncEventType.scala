package typings.activexWord.anon

import typings.activexOffice.Office.MsoSyncEventType
import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncEventType extends js.Object {
  val Doc: Document = js.native
  val SyncEventType: MsoSyncEventType = js.native
}

object SyncEventType {
  @scala.inline
  def apply(Doc: Document, SyncEventType: MsoSyncEventType): SyncEventType = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
  @scala.inline
  implicit class SyncEventTypeOps[Self <: SyncEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncEventType(value: MsoSyncEventType): Self = this.set("SyncEventType", value.asInstanceOf[js.Any])
  }
  
}

