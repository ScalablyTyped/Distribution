package typings.avoscloudSdk.mod.Object

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions
  extends ErrorOption
     with SilentOption {
  var promise: js.UndefOr[js.Any] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Any): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
  }
  
}

