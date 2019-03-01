package typings
package activedirectory2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ca extends js.Object {
  var ca: js.UndefOr[java.lang.String] = js.undefined
  var cert: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: scala.Boolean
}

object Anon_Ca {
  @scala.inline
  def apply(
    rejectUnauthorized: scala.Boolean,
    ca: java.lang.String = null,
    cert: java.lang.String = null,
    host: java.lang.String = null,
    key: java.lang.String = null
  ): Anon_Ca = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Ca]
  }
}

