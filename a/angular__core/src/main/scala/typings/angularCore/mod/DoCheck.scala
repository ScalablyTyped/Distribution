package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoCheck extends js.Object {
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit = js.native
}

object DoCheck {
  @scala.inline
  def apply(ngDoCheck: () => Unit): DoCheck = {
    val __obj = js.Dynamic.literal(ngDoCheck = js.Any.fromFunction0(ngDoCheck))
    __obj.asInstanceOf[DoCheck]
  }
  @scala.inline
  implicit class DoCheckOps[Self <: DoCheck] (val x: Self) extends AnyVal {
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
    def setNgDoCheck(value: () => Unit): Self = this.set("ngDoCheck", js.Any.fromFunction0(value))
  }
  
}

