package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaFile extends js.Object {
  var caFile: js.UndefOr[String] = js.undefined
  var certFile: js.UndefOr[String] = js.undefined
  var enabled: Boolean
  var keyFile: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object Anon_CaFile {
  @scala.inline
  def apply(
    enabled: Boolean,
    caFile: String = null,
    certFile: String = null,
    keyFile: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): Anon_CaFile = {
    val __obj = js.Dynamic.literal(enabled = enabled)
    if (caFile != null) __obj.updateDynamic("caFile")(caFile)
    if (certFile != null) __obj.updateDynamic("certFile")(certFile)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[Anon_CaFile]
  }
}

