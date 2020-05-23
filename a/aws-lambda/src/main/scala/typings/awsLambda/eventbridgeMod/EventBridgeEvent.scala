package typings.awsLambda.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBridgeEvent[TDetailType /* <: String */, TDetail] extends js.Object {
  var account: String
  var detail: TDetail
  var `detail-type`: TDetailType
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: String
  var time: String
  var version: String
}

object EventBridgeEvent {
  @scala.inline
  def apply[TDetailType, TDetail](
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
}

