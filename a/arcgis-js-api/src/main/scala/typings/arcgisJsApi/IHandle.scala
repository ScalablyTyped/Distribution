package typings.arcgisJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandle extends js.Object {
  def remove(): Unit
}

object IHandle {
  @scala.inline
  def apply(remove: () => Unit): IHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[IHandle]
  }
}

