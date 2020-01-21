package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDestroy extends js.Object {
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): Unit
}

object OnDestroy {
  @scala.inline
  def apply(ngOnDestroy: () => Unit): OnDestroy = {
    val __obj = js.Dynamic.literal(ngOnDestroy = js.Any.fromFunction0(ngOnDestroy))
  
    __obj.asInstanceOf[OnDestroy]
  }
}

