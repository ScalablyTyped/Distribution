package typings.avoscloudSdk.mod.Collection

import typings.avoscloudSdk.mod.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends SilentOption {
  /**
    * The index at which to add the models.
    */
  var at: js.UndefOr[Double] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
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
    def setAt(value: Double): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
  }
  
}

