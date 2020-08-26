package typings.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsrOptions extends js.Object {
  var altNames: js.UndefOr[js.Array[String]] = js.native
  var commonName: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var emailAddress: js.UndefOr[String] = js.native
  var keySize: js.UndefOr[Double] = js.native
  var locality: js.UndefOr[String] = js.native
  var organization: js.UndefOr[String] = js.native
  var organizationUnit: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object CsrOptions {
  @scala.inline
  def apply(): CsrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsrOptions]
  }
  @scala.inline
  implicit class CsrOptionsOps[Self <: CsrOptions] (val x: Self) extends AnyVal {
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
    def setAltNamesVarargs(value: String*): Self = this.set("altNames", js.Array(value :_*))
    @scala.inline
    def setAltNames(value: js.Array[String]): Self = this.set("altNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltNames: Self = this.set("altNames", js.undefined)
    @scala.inline
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySize: Self = this.set("keySize", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setOrganizationUnit(value: String): Self = this.set("organizationUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationUnit: Self = this.set("organizationUnit", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

