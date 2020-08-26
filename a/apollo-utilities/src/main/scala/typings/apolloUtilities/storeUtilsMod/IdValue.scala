package typings.apolloUtilities.storeUtilsMod

import typings.apolloUtilities.apolloUtilitiesStrings.id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdValue extends _StoreValue {
  var generated: Boolean = js.native
  var id: String = js.native
  var `type`: id = js.native
  var typename: js.UndefOr[String] = js.native
}

object IdValue {
  @scala.inline
  def apply(generated: Boolean, id: String, `type`: id): IdValue = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdValue]
  }
  @scala.inline
  implicit class IdValueOps[Self <: IdValue] (val x: Self) extends AnyVal {
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
    def setGenerated(value: Boolean): Self = this.set("generated", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: id): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypename(value: String): Self = this.set("typename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypename: Self = this.set("typename", js.undefined)
  }
  
}

