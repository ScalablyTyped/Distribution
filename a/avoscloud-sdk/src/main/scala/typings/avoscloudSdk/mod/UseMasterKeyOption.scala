package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMasterKeyOption extends js.Object {
  /**
    * In Cloud Code and Node only, causes the Master Key to be used for this request.
    */
  var useMasterKey: js.UndefOr[Boolean] = js.native
}

object UseMasterKeyOption {
  @scala.inline
  def apply(): UseMasterKeyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMasterKeyOption]
  }
  @scala.inline
  implicit class UseMasterKeyOptionOps[Self <: UseMasterKeyOption] (val x: Self) extends AnyVal {
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
    def setUseMasterKey(value: Boolean): Self = this.set("useMasterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMasterKey: Self = this.set("useMasterKey", js.undefined)
  }
  
}

