package typings.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCert extends js.Object {
  var cert: js.UndefOr[String] = js.undefined
  var pub: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object AnonCert {
  @scala.inline
  def apply(cert: String = null, pub: String = null, subject: String = null): AnonCert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (pub != null) __obj.updateDynamic("pub")(pub.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCert]
  }
}

