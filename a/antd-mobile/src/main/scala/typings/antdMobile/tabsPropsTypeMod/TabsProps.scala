package typings.antdMobile.tabsPropsTypeMod

import typings.react.mod.ReactNode
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends PropsType {
  /** render for replace the tab of tabbar. */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.native
}

object TabsProps {
  @scala.inline
  def apply(tabs: js.Array[TabData]): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setRenderTab(value: /* tab */ TabData => ReactNode): Self = this.set("renderTab", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
  }
  
}

