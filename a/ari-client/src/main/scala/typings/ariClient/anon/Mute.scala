package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mute extends js.Object {
  var absorbDTMF: js.UndefOr[Boolean] = js.undefined
  var channel: String | js.Array[String]
  var mute: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object Mute {
  @scala.inline
  def apply(
    channel: String | js.Array[String],
    absorbDTMF: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): Mute = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(absorbDTMF)) __obj.updateDynamic("absorbDTMF")(absorbDTMF.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mute]
  }
}

