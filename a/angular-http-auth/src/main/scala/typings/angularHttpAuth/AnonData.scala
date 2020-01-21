package typings.angularHttpAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  def reject(data: js.Any): Unit
  def resolve(data: js.Any): Unit
}

object AnonData {
  @scala.inline
  def apply(reject: js.Any => Unit, resolve: js.Any => Unit): AnonData = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[AnonData]
  }
}

