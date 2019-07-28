package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  /**
    * Performs tasks associated with freeing, releasing, or resetting resources.
    */
  def dispose(): Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[Disposable]
  }
}

