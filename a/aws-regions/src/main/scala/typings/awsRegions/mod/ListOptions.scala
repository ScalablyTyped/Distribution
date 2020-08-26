package typings.awsRegions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOptions extends js.Object {
  var public: js.UndefOr[Boolean] = js.native
}

object ListOptions {
  @scala.inline
  def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
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
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
  }
  
}

