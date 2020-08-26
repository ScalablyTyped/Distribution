package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3ActionActionMetadata extends js.Object {
  /**
    * Time when this action will expire.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3ActionActionMetadata {
  @scala.inline
  def apply(): GoogleActionsOrdersV3ActionActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3ActionActionMetadata]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3ActionActionMetadataOps[Self <: GoogleActionsOrdersV3ActionActionMetadata] (val x: Self) extends AnyVal {
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
  
}

