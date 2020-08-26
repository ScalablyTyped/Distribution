package typings.algoliaRequesterCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /**
    * The raw response from the server.
    */
  var content: String = js.native
  /**
    * If the request timeouted.
    */
  var isTimedOut: Boolean = js.native
  /**
    * The http status code.
    */
  var status: Double = js.native
}

object Response {
  @scala.inline
  def apply(content: String, isTimedOut: Boolean, status: Double): Response = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isTimedOut = isTimedOut.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTimedOut(value: Boolean): Self = this.set("isTimedOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

