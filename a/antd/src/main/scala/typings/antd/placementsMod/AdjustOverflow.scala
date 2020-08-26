package typings.antd.placementsMod

import typings.antd.antdNumbers.`0`
import typings.antd.antdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustOverflow extends js.Object {
  var adjustX: js.UndefOr[`0` | `1`] = js.native
  var adjustY: js.UndefOr[`0` | `1`] = js.native
}

object AdjustOverflow {
  @scala.inline
  def apply(): AdjustOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustOverflow]
  }
  @scala.inline
  implicit class AdjustOverflowOps[Self <: AdjustOverflow] (val x: Self) extends AnyVal {
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
    def setAdjustX(value: `0` | `1`): Self = this.set("adjustX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustX: Self = this.set("adjustX", js.undefined)
    @scala.inline
    def setAdjustY(value: `0` | `1`): Self = this.set("adjustY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustY: Self = this.set("adjustY", js.undefined)
  }
  
}

