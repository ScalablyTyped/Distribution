package typings.antd.baseMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyConfig extends js.Object {
  var icon: js.UndefOr[ReactNode] = js.native
  var onCopy: js.UndefOr[js.Function0[Unit]] = js.native
  var text: js.UndefOr[String] = js.native
  var tooltips: js.UndefOr[js.Tuple2[ReactNode, ReactNode]] = js.native
}

object CopyConfig {
  @scala.inline
  def apply(): CopyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyConfig]
  }
  @scala.inline
  implicit class CopyConfigOps[Self <: CopyConfig] (val x: Self) extends AnyVal {
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
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnCopy(value: () => Unit): Self = this.set("onCopy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTooltips(value: js.Tuple2[ReactNode, ReactNode]): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

