package typings.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AirtableOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var apiVersion: js.UndefOr[String] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var noRetryIfRateLimited: js.UndefOr[Boolean] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
}

object AirtableOptions {
  @scala.inline
  def apply(): AirtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AirtableOptions]
  }
  @scala.inline
  implicit class AirtableOptionsOps[Self <: AirtableOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointUrl: Self = this.set("endpointUrl", js.undefined)
    @scala.inline
    def setNoRetryIfRateLimited(value: Boolean): Self = this.set("noRetryIfRateLimited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRetryIfRateLimited: Self = this.set("noRetryIfRateLimited", js.undefined)
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
  }
  
}

