package typings.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsrDomains extends js.Object {
  var altNames: js.Array[String] = js.native
  var commonName: String = js.native
}

object CsrDomains {
  @scala.inline
  def apply(altNames: js.Array[String], commonName: String): CsrDomains = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrDomains]
  }
  @scala.inline
  implicit class CsrDomainsOps[Self <: CsrDomains] (val x: Self) extends AnyVal {
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
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
  }
  
}

