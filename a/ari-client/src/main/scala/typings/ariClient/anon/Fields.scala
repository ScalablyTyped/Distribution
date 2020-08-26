package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  var configClass: String = js.native
  var fields: js.UndefOr[Containers] = js.native
  var id: String = js.native
  var objectType: String = js.native
}

object Fields {
  @scala.inline
  def apply(configClass: String, id: String, objectType: String): Fields = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def setConfigClass(value: String): Self = this.set("configClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: Containers): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

