package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceOptions extends InsertOptions {
  var overwrite: js.UndefOr[Boolean] = js.native
  var returnOld: js.UndefOr[Boolean] = js.native
}

object ReplaceOptions {
  @scala.inline
  def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  @scala.inline
  implicit class ReplaceOptionsOps[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
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
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setReturnOld(value: Boolean): Self = this.set("returnOld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnOld: Self = this.set("returnOld", js.undefined)
  }
  
}

