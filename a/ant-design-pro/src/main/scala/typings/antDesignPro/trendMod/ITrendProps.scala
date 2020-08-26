package typings.antDesignPro.trendMod

import typings.antDesignPro.antDesignProStrings.down
import typings.antDesignPro.antDesignProStrings.up
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrendProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var colorful: js.UndefOr[Boolean] = js.native
  var flag: up | down = js.native
  var reverseColor: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ITrendProps {
  @scala.inline
  def apply(flag: up | down): ITrendProps = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrendProps]
  }
  @scala.inline
  implicit class ITrendPropsOps[Self <: ITrendProps] (val x: Self) extends AnyVal {
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
    def setFlag(value: up | down): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorful(value: Boolean): Self = this.set("colorful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorful: Self = this.set("colorful", js.undefined)
    @scala.inline
    def setReverseColor(value: Boolean): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

