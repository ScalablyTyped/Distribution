package typings.angularHttpAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReject extends js.Object {
  def reject(data: js.Any): Unit
  def resolve(data: js.Any): Unit
}

object AnonReject {
  @scala.inline
  def apply(reject: js.Any => Unit, resolve: js.Any => Unit): AnonReject = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[AnonReject]
  }
}

