package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnchorScrollProvider extends IServiceProvider {
  def disableAutoScrolling(): Unit = js.native
}

object IAnchorScrollProvider {
  @scala.inline
  def apply($get: js.Any, disableAutoScrolling: () => Unit): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableAutoScrolling = js.Any.fromFunction0(disableAutoScrolling))
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
  @scala.inline
  implicit class IAnchorScrollProviderOps[Self <: IAnchorScrollProvider] (val x: Self) extends AnyVal {
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
    def setDisableAutoScrolling(value: () => Unit): Self = this.set("disableAutoScrolling", js.Any.fromFunction0(value))
  }
  
}

