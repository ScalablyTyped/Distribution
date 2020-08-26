package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupId extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var groupId: String | Double = js.native
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
  var timestamp: js.UndefOr[Date] = js.native
  var traits: js.UndefOr[js.Any] = js.native
}

object GroupId {
  @scala.inline
  def apply(groupId: String | Double): GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
  @scala.inline
  implicit class GroupIdOps[Self <: GroupId] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String | Double): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = this.set("integrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setTraits(value: js.Any): Self = this.set("traits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
  }
  
}

