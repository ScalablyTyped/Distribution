package typings
package atAntDashDesignProDashLayoutLib.esPageHeaderWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderTabConfig extends js.Object {
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ java.lang.String, scala.Unit]] = js.undefined
  var tabActiveKey: js.UndefOr[java.lang.String] = js.undefined
  var tabBarExtraContent: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var tabList: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.Anon_Key]] = js.undefined
}

object PageHeaderTabConfig {
  @scala.inline
  def apply(
    onTabChange: /* activeKey */ java.lang.String => scala.Unit = null,
    tabActiveKey: java.lang.String = null,
    tabBarExtraContent: reactLib.reactMod.ReactNode = null,
    tabList: js.Array[atAntDashDesignProDashLayoutLib.Anon_Key] = null
  ): PageHeaderTabConfig = {
    val __obj = js.Dynamic.literal()
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    __obj.asInstanceOf[PageHeaderTabConfig]
  }
}

