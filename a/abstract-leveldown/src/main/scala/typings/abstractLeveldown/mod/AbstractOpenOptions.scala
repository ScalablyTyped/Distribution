package typings.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractOpenOptions extends AbstractOptions {
  var createIfMissing: js.UndefOr[Boolean] = js.native
  var errorIfExists: js.UndefOr[Boolean] = js.native
}

object AbstractOpenOptions {
  @scala.inline
  def apply(): AbstractOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractOpenOptions]
  }
  @scala.inline
  implicit class AbstractOpenOptionsOps[Self <: AbstractOpenOptions] (val x: Self) extends AnyVal {
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
    def setCreateIfMissing(value: Boolean): Self = this.set("createIfMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateIfMissing: Self = this.set("createIfMissing", js.undefined)
    @scala.inline
    def setErrorIfExists(value: Boolean): Self = this.set("errorIfExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorIfExists: Self = this.set("errorIfExists", js.undefined)
  }
  
}

