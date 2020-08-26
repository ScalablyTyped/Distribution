package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevocationConfiguration extends js.Object {
  /**
    * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
    */
  var CrlConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.CrlConfiguration] = js.native
}

object RevocationConfiguration {
  @scala.inline
  def apply(): RevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationConfiguration]
  }
  @scala.inline
  implicit class RevocationConfigurationOps[Self <: RevocationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCrlConfiguration(value: CrlConfiguration): Self = this.set("CrlConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrlConfiguration: Self = this.set("CrlConfiguration", js.undefined)
  }
  
}

