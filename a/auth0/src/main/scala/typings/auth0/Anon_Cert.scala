package typings.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
  var cert: js.UndefOr[String] = js.undefined
  var pub: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object Anon_Cert {
  @scala.inline
  def apply(cert: String = null, pub: String = null, subject: String = null): Anon_Cert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (pub != null) __obj.updateDynamic("pub")(pub)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Anon_Cert]
  }
}

