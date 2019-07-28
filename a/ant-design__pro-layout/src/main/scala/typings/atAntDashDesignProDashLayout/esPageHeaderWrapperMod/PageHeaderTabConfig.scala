package typings.atAntDashDesignProDashLayout.esPageHeaderWrapperMod

import typings.atAntDashDesignProDashLayout.Anon_Key
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderTabConfig extends js.Object {
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
  var tabActiveKey: js.UndefOr[String] = js.undefined
  var tabBarExtraContent: js.UndefOr[ReactNode | Null] = js.undefined
  var tabList: js.UndefOr[js.Array[Anon_Key]] = js.undefined
}

object PageHeaderTabConfig {
  @scala.inline
  def apply(
    onTabChange: /* activeKey */ String => Unit = null,
    tabActiveKey: String = null,
    tabBarExtraContent: ReactNode = null,
    tabList: js.Array[Anon_Key] = null
  ): PageHeaderTabConfig = {
    val __obj = js.Dynamic.literal()
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    __obj.asInstanceOf[PageHeaderTabConfig]
  }
}

