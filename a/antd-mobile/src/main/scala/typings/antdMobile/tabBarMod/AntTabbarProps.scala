package typings.antdMobile.tabBarMod

import typings.antdMobile.tabBarPropsTypeMod.TabBarProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabbarProps extends TabBarProps {
  var className: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var noRenderContent: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[ReactNode] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
}

object AntTabbarProps {
  @scala.inline
  def apply(): AntTabbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntTabbarProps]
  }
  @scala.inline
  implicit class AntTabbarPropsOps[Self <: AntTabbarProps] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setNoRenderContent(value: Boolean): Self = this.set("noRenderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRenderContent: Self = this.set("noRenderContent", js.undefined)
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPrerenderingSiblingsNumber(value: Double): Self = this.set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerenderingSiblingsNumber: Self = this.set("prerenderingSiblingsNumber", js.undefined)
  }
  
}

