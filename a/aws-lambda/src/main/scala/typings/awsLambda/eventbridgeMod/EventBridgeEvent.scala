package typings.awsLambda.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBridgeEvent[TDetailType /* <: String */, TDetail] extends js.Object {
  var account: String = js.native
  var detail: TDetail = js.native
  var `detail-type`: TDetailType = js.native
  var id: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var source: String = js.native
  var time: String = js.native
  var version: String = js.native
}

object EventBridgeEvent {
  @scala.inline
  def apply[/* <: java.lang.String */ TDetailType, TDetail](
    account: String,
    detail: TDetail,
    `detail-type`: TDetailType,
    id: String,
    region: String,
    resources: js.Array[String],
    source: String,
    time: String,
    version: String
  ): EventBridgeEvent[TDetailType, TDetail] = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeEvent[TDetailType, TDetail]]
  }
  @scala.inline
  implicit class EventBridgeEventOps[Self <: EventBridgeEvent[_, _], /* <: java.lang.String */ TDetailType, TDetail] (val x: Self with (EventBridgeEvent[TDetailType, TDetail])) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: TDetail): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDetail-type`(value: TDetailType): Self = this.set("detail-type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

