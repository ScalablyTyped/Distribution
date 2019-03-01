package typings
package amqpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaFile extends js.Object {
  var caFile: js.UndefOr[java.lang.String] = js.undefined
  var certFile: js.UndefOr[java.lang.String] = js.undefined
  var enabled: scala.Boolean
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CaFile {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    caFile: java.lang.String = null,
    certFile: java.lang.String = null,
    keyFile: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CaFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    if (caFile != null) __obj.updateDynamic("caFile")(caFile)
    if (certFile != null) __obj.updateDynamic("certFile")(certFile)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[Anon_CaFile]
  }
}

