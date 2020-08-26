package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndRecord extends js.Object {
  var Cancel: Boolean = js.native
  val Doc: Document = js.native
  val EndRecord: Double = js.native
  val StartRecord: Double = js.native
}

object EndRecord {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): EndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndRecord]
  }
  @scala.inline
  implicit class EndRecordOps[Self <: EndRecord] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndRecord(value: Double): Self = this.set("EndRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRecord(value: Double): Self = this.set("StartRecord", value.asInstanceOf[js.Any])
  }
  
}

