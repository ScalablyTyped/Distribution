package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtlassianAccountId extends js.Object {
  var atlassianAccountId: String = js.native
}

object AtlassianAccountId {
  @scala.inline
  def apply(atlassianAccountId: String): AtlassianAccountId = {
    val __obj = js.Dynamic.literal(atlassianAccountId = atlassianAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlassianAccountId]
  }
  @scala.inline
  implicit class AtlassianAccountIdOps[Self <: AtlassianAccountId] (val x: Self) extends AnyVal {
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
    def setAtlassianAccountId(value: String): Self = this.set("atlassianAccountId", value.asInstanceOf[js.Any])
  }
  
}

