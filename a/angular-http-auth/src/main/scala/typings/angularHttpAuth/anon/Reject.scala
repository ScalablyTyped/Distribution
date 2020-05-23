package typings.angularHttpAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reject extends js.Object {
  def reject(data: js.Any): Unit
  def resolve(data: js.Any): Unit
}

object Reject {
  @scala.inline
  def apply(reject: js.Any => Unit, resolve: js.Any => Unit): Reject = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Reject]
  }
}

