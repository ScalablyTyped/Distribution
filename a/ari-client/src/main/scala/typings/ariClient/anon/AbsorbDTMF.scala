package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsorbDTMF extends js.Object {
  var absorbDTMF: js.UndefOr[Boolean] = js.undefined
  var bridgeId: String
  var channel: String | js.Array[String]
  var mute: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object AbsorbDTMF {
  @scala.inline
  def apply(
    bridgeId: String,
    channel: String | js.Array[String],
    absorbDTMF: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): AbsorbDTMF = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(absorbDTMF)) __obj.updateDynamic("absorbDTMF")(absorbDTMF.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsorbDTMF]
  }
}

