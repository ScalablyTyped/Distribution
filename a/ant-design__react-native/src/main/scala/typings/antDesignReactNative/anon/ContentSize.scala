package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentSize extends js.Object {
  var contentSize: Height = js.native
}

object ContentSize {
  @scala.inline
  def apply(contentSize: Height): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
  @scala.inline
  implicit class ContentSizeOps[Self <: ContentSize] (val x: Self) extends AnyVal {
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
    def setContentSize(value: Height): Self = this.set("contentSize", value.asInstanceOf[js.Any])
  }
  
}

