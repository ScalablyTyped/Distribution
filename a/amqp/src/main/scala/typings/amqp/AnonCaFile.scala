package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaFile extends js.Object {
  var caFile: js.UndefOr[String] = js.undefined
  var certFile: js.UndefOr[String] = js.undefined
  var enabled: Boolean
  var keyFile: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object AnonCaFile {
  @scala.inline
  def apply(
    enabled: Boolean,
    caFile: String = null,
    certFile: String = null,
    keyFile: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): AnonCaFile = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (caFile != null) __obj.updateDynamic("caFile")(caFile.asInstanceOf[js.Any])
    if (certFile != null) __obj.updateDynamic("certFile")(certFile.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaFile]
  }
}

