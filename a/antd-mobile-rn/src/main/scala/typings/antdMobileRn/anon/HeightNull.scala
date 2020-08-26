package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightNull extends js.Object {
  var height: Null = js.native
}

object HeightNull {
  @scala.inline
  def apply(height: Null): HeightNull = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightNull]
  }
  @scala.inline
  implicit class HeightNullOps[Self <: HeightNull] (val x: Self) extends AnyVal {
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
    def setHeight(value: Null): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

