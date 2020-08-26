package typings.antDesignProLayout.pageContainerMod

import typings.antDesignProLayout.anon.TabPanePropskeyReactTextu
import typings.antd.tabsMod.TabsProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageHeaderTabConfig extends js.Object {
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
  var tabActiveKey: js.UndefOr[String] = js.native
  var tabBarExtraContent: js.UndefOr[ReactNode] = js.native
  var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.native
  var tabProps: js.UndefOr[TabsProps] = js.native
}

object PageHeaderTabConfig {
  @scala.inline
  def apply(): PageHeaderTabConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderTabConfig]
  }
  @scala.inline
  implicit class PageHeaderTabConfigOps[Self <: PageHeaderTabConfig] (val x: Self) extends AnyVal {
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
    def setOnTabChange(value: /* activeKey */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    @scala.inline
    def setTabActiveKey(value: String): Self = this.set("tabActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabActiveKey: Self = this.set("tabActiveKey", js.undefined)
    @scala.inline
    def setTabBarExtraContent(value: ReactNode): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarExtraContent: Self = this.set("tabBarExtraContent", js.undefined)
    @scala.inline
    def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = this.set("tabList", js.Array(value :_*))
    @scala.inline
    def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = this.set("tabList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabList: Self = this.set("tabList", js.undefined)
    @scala.inline
    def setTabProps(value: TabsProps): Self = this.set("tabProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabProps: Self = this.set("tabProps", js.undefined)
  }
  
}

