package typings.antd.gridColMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColSize extends js.Object {
  var offset: js.UndefOr[ColSpanType] = js.native
  var order: js.UndefOr[ColSpanType] = js.native
  var pull: js.UndefOr[ColSpanType] = js.native
  var push: js.UndefOr[ColSpanType] = js.native
  var span: js.UndefOr[ColSpanType] = js.native
}

object ColSize {
  @scala.inline
  def apply(): ColSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColSize]
  }
  @scala.inline
  implicit class ColSizeOps[Self <: ColSize] (val x: Self) extends AnyVal {
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
    def setOffset(value: ColSpanType): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrder(value: ColSpanType): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPull(value: ColSpanType): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    @scala.inline
    def setPush(value: ColSpanType): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setSpan(value: ColSpanType): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

