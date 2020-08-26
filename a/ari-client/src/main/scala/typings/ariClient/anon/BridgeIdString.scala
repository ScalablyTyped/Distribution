package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeIdString extends js.Object {
  var bridgeId: String = js.native
}

object BridgeIdString {
  @scala.inline
  def apply(bridgeId: String): BridgeIdString = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeIdString]
  }
  @scala.inline
  implicit class BridgeIdStringOps[Self <: BridgeIdString] (val x: Self) extends AnyVal {
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
    def setBridgeId(value: String): Self = this.set("bridgeId", value.asInstanceOf[js.Any])
  }
  
}

