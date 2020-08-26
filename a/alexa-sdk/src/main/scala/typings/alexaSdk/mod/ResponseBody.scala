package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBody extends js.Object {
  var response: Response = js.native
  var sessionAttributes: js.UndefOr[js.Any] = js.native
  var version: String = js.native
}

object ResponseBody {
  @scala.inline
  def apply(response: Response, version: String): ResponseBody = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBody]
  }
  @scala.inline
  implicit class ResponseBodyOps[Self <: ResponseBody] (val x: Self) extends AnyVal {
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
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionAttributes(value: js.Any): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionAttributes: Self = this.set("sessionAttributes", js.undefined)
  }
  
}

