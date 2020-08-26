package typings.angularStrap.mgcrea.ngStrap.affix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAffixOptions extends js.Object {
  var offsetBottom: js.UndefOr[Double] = js.native
  var offsetParent: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var offsetUnpin: js.UndefOr[Double] = js.native
}

object IAffixOptions {
  @scala.inline
  def apply(): IAffixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAffixOptions]
  }
  @scala.inline
  implicit class IAffixOptionsOps[Self <: IAffixOptions] (val x: Self) extends AnyVal {
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
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    @scala.inline
    def setOffsetParent(value: Double): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetParent: Self = this.set("offsetParent", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOffsetUnpin(value: Double): Self = this.set("offsetUnpin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetUnpin: Self = this.set("offsetUnpin", js.undefined)
  }
  
}

