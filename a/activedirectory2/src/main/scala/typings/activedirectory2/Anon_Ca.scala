package typings.activedirectory2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ca extends js.Object {
  var ca: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: Boolean
}

object Anon_Ca {
  @scala.inline
  def apply(
    rejectUnauthorized: Boolean,
    ca: String = null,
    cert: String = null,
    host: String = null,
    key: String = null
  ): Anon_Ca = {
    val __obj = js.Dynamic.literal(rejectUnauthorized = rejectUnauthorized)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Ca]
  }
}

