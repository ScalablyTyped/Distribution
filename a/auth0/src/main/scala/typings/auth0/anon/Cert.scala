package typings.auth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cert extends js.Object {
  var cert: js.UndefOr[String] = js.native
  var pub: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
}

object Cert {
  @scala.inline
  def apply(): Cert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cert]
  }
  @scala.inline
  implicit class CertOps[Self <: Cert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setPub(value: String): Self = this.set("pub", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePub: Self = this.set("pub", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

