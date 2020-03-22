package typings.algoliaRequesterCommon.mod

import typings.algoliaRequesterCommon.ReadonlyPromiseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requester extends js.Object {
  /**
    * Sends the given `request` to the server.
    */
  def send(request: Request): ReadonlyPromiseResponse
}

object Requester {
  @scala.inline
  def apply(send: Request => ReadonlyPromiseResponse): Requester = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Requester]
  }
}

