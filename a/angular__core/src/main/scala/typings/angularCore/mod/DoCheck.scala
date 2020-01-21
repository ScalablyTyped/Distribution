package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoCheck extends js.Object {
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit
}

object DoCheck {
  @scala.inline
  def apply(ngDoCheck: () => Unit): DoCheck = {
    val __obj = js.Dynamic.literal(ngDoCheck = js.Any.fromFunction0(ngDoCheck))
  
    __obj.asInstanceOf[DoCheck]
  }
}

