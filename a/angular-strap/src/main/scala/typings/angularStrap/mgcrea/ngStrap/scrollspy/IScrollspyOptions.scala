package typings.angularStrap.mgcrea.ngStrap.scrollspy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollspyOptions extends js.Object {
  var offset: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
}

object IScrollspyOptions {
  @scala.inline
  def apply(): IScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollspyOptions]
  }
  @scala.inline
  implicit class IScrollspyOptionsOps[Self <: IScrollspyOptions] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

