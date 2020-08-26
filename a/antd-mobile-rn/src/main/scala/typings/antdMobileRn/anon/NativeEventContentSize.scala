package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeEventContentSize extends js.Object {
  var nativeEvent: ContentSize = js.native
}

object NativeEventContentSize {
  @scala.inline
  def apply(nativeEvent: ContentSize): NativeEventContentSize = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSize]
  }
  @scala.inline
  implicit class NativeEventContentSizeOps[Self <: NativeEventContentSize] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: ContentSize): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

