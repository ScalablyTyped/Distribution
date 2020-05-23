package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactInfo extends js.Object {
  var aor: String
  var contact_status: String
  var roundtrip_usec: js.UndefOr[String] = js.undefined
  /* Properties */
  var uri: String
}

object ContactInfo {
  @scala.inline
  def apply(aor: String, contact_status: String, uri: String, roundtrip_usec: String = null): ContactInfo = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], contact_status = contact_status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (roundtrip_usec != null) __obj.updateDynamic("roundtrip_usec")(roundtrip_usec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInfo]
  }
}

