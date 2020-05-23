package typings.activedirectory2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ca extends js.Object {
  var ca: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: Boolean
}

object Ca {
  @scala.inline
  def apply(
    rejectUnauthorized: Boolean,
    ca: String = null,
    cert: String = null,
    host: String = null,
    key: String = null
  ): Ca = {
    val __obj = js.Dynamic.literal(rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ca]
  }
}

