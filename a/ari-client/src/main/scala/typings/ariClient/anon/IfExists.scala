package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfExists extends js.Object {
  var beep: js.UndefOr[Boolean] = js.undefined
  var channelId: String
  var format: String
  var ifExists: js.UndefOr[String] = js.undefined
  var maxDurationSeconds: js.UndefOr[Double] = js.undefined
  var maxSilenceSeconds: js.UndefOr[Double] = js.undefined
  var name: String
  var terminateOn: js.UndefOr[String] = js.undefined
}

object IfExists {
  @scala.inline
  def apply(
    channelId: String,
    format: String,
    name: String,
    beep: js.UndefOr[Boolean] = js.undefined,
    ifExists: String = null,
    maxDurationSeconds: js.UndefOr[Double] = js.undefined,
    maxSilenceSeconds: js.UndefOr[Double] = js.undefined,
    terminateOn: String = null
  ): IfExists = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(beep)) __obj.updateDynamic("beep")(beep.get.asInstanceOf[js.Any])
    if (ifExists != null) __obj.updateDynamic("ifExists")(ifExists.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDurationSeconds)) __obj.updateDynamic("maxDurationSeconds")(maxDurationSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSilenceSeconds)) __obj.updateDynamic("maxSilenceSeconds")(maxSilenceSeconds.get.asInstanceOf[js.Any])
    if (terminateOn != null) __obj.updateDynamic("terminateOn")(terminateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfExists]
  }
}

