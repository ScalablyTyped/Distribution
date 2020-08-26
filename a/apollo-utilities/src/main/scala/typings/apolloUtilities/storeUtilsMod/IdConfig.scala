package typings.apolloUtilities.storeUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdConfig extends js.Object {
  var id: String = js.native
  var typename: js.UndefOr[String] = js.native
}

object IdConfig {
  @scala.inline
  def apply(id: String): IdConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdConfig]
  }
  @scala.inline
  implicit class IdConfigOps[Self <: IdConfig] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypename(value: String): Self = this.set("typename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypename: Self = this.set("typename", js.undefined)
  }
  
}

