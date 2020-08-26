package typings.apimocker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var allowAvoidPreFlight: js.UndefOr[Boolean] = js.native
  var allowedDomains: js.UndefOr[js.Array[String]] = js.native
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
  var logRequestHeaders: js.UndefOr[Boolean] = js.native
  var mockDirectory: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var useUploadFieldname: js.UndefOr[Boolean] = js.native
  var webServices: js.UndefOr[js.Any] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setAllowAvoidPreFlight(value: Boolean): Self = this.set("allowAvoidPreFlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAvoidPreFlight: Self = this.set("allowAvoidPreFlight", js.undefined)
    @scala.inline
    def setAllowedDomainsVarargs(value: String*): Self = this.set("allowedDomains", js.Array(value :_*))
    @scala.inline
    def setAllowedDomains(value: js.Array[String]): Self = this.set("allowedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedDomains: Self = this.set("allowedDomains", js.undefined)
    @scala.inline
    def setAllowedHeadersVarargs(value: String*): Self = this.set("allowedHeaders", js.Array(value :_*))
    @scala.inline
    def setAllowedHeaders(value: js.Array[String]): Self = this.set("allowedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("allowedHeaders", js.undefined)
    @scala.inline
    def setLogRequestHeaders(value: Boolean): Self = this.set("logRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogRequestHeaders: Self = this.set("logRequestHeaders", js.undefined)
    @scala.inline
    def setMockDirectory(value: String): Self = this.set("mockDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockDirectory: Self = this.set("mockDirectory", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setUseUploadFieldname(value: Boolean): Self = this.set("useUploadFieldname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUploadFieldname: Self = this.set("useUploadFieldname", js.undefined)
    @scala.inline
    def setWebServices(value: js.Any): Self = this.set("webServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebServices: Self = this.set("webServices", js.undefined)
  }
  
}

