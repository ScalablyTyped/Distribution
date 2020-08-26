package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportApiKeysRequest extends js.Object {
  /**
    * The payload of the POST request to import API keys. For the payload format, see API Key File Format.
    */
  var body: _Blob = js.native
  /**
    * A query parameter to indicate whether to rollback ApiKey importation (true) or not (false) when error is encountered.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A query parameter to specify the input format to imported API keys. Currently, only the csv format is supported.
    */
  var format: ApiKeysFormat = js.native
}

object ImportApiKeysRequest {
  @scala.inline
  def apply(body: _Blob, format: ApiKeysFormat): ImportApiKeysRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApiKeysRequest]
  }
  @scala.inline
  implicit class ImportApiKeysRequestOps[Self <: ImportApiKeysRequest] (val x: Self) extends AnyVal {
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
    def setBody(value: _Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ApiKeysFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailOnWarnings(value: Boolean): Self = this.set("failOnWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnWarnings: Self = this.set("failOnWarnings", js.undefined)
  }
  
}

