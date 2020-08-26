package typings.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record[TFields] extends js.Object {
  var fields: TFields = js.native
  var id: String = js.native
}

object Record {
  @scala.inline
  def apply[TFields](fields: TFields, id: String): Record[TFields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record[TFields]]
  }
  @scala.inline
  implicit class RecordOps[Self <: Record[_], TFields] (val x: Self with Record[TFields]) extends AnyVal {
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
    def setFields(value: TFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

