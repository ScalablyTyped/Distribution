package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactInfo extends js.Object {
  /**
    * The Address of Record this contact belongs to.
    */
  var aor: String
  /**
    * The current status of the contact.
    */
  var contact_status: String
  /**
    * Current round trip time, in microseconds, for the contact.
    */
  var roundtrip_usec: js.UndefOr[String] = js.undefined
  /**
    * The location of the contact.
    */
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

