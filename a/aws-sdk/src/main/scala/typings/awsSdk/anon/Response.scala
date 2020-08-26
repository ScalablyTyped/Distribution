package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[D, E] extends js.Object {
  @JSName("$response")
  var $response: typings.awsSdk.responseMod.Response[D, E] = js.native
}

object Response {
  @scala.inline
  def apply[D, E]($response: typings.awsSdk.responseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response[_, _], D, E] (val x: Self with (Response[D, E])) extends AnyVal {
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
    def set$response(value: typings.awsSdk.responseMod.Response[D, E]): Self = this.set("$response", value.asInstanceOf[js.Any])
  }
  
}

