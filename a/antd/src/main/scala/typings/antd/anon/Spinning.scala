package typings.antd.anon

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spinning extends js.Object {
  var size: small | large | default = js.native
  var spinning: Boolean = js.native
  var wrapperClassName: String = js.native
}

object Spinning {
  @scala.inline
  def apply(size: small | large | default, spinning: Boolean, wrapperClassName: String): Spinning = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], spinning = spinning.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinning]
  }
  @scala.inline
  implicit class SpinningOps[Self <: Spinning] (val x: Self) extends AnyVal {
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
    def setSize(value: small | large | default): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinning(value: Boolean): Self = this.set("spinning", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
}

