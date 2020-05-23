package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeId extends js.Object {
  var bridgeId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BridgeId {
  @scala.inline
  def apply(bridgeId: String = null, name: String = null, `type`: String = null): BridgeId = {
    val __obj = js.Dynamic.literal()
    if (bridgeId != null) __obj.updateDynamic("bridgeId")(bridgeId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeId]
  }
}

