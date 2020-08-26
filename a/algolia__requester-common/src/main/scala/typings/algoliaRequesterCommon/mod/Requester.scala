package typings.algoliaRequesterCommon.mod

import typings.algoliaRequesterCommon.anon.ReadonlyPromiseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requester extends js.Object {
  /**
    * Sends the given `request` to the server.
    */
  def send(request: Request): ReadonlyPromiseResponse = js.native
}

object Requester {
  @scala.inline
  def apply(send: Request => ReadonlyPromiseResponse): Requester = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Requester]
  }
  @scala.inline
  implicit class RequesterOps[Self <: Requester] (val x: Self) extends AnyVal {
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
    def setSend(value: Request => ReadonlyPromiseResponse): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}

