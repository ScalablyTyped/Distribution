package typings.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousId extends js.Object {
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
  var previousId: String | Double = js.native
}

object PreviousId {
  @scala.inline
  def apply(previousId: String | Double): PreviousId = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousId]
  }
  @scala.inline
  implicit class PreviousIdOps[Self <: PreviousId] (val x: Self) extends AnyVal {
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
    def setPreviousId(value: String | Double): Self = this.set("previousId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = this.set("integrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
  }
  
}

