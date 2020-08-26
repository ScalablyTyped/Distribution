package typings.antDesignProLayout.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentHeight: js.UndefOr[Double | String] = js.native
  var isChildrenLayout: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ClassName {
  @scala.inline
  def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentHeight(value: Double | String): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    @scala.inline
    def setIsChildrenLayout(value: Boolean): Self = this.set("isChildrenLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChildrenLayout: Self = this.set("isChildrenLayout", js.undefined)
    @scala.inline
    def setLocation(value: js.Any): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

