package typings.antDashDesignDashPro.libLoginLoginTabMod

import typings.antDashDesignDashPro.Anon_AddTab
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginTabProps extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var tab: js.UndefOr[ReactNode] = js.undefined
  var tabUtil: Anon_AddTab
}

object LoginTabProps {
  @scala.inline
  def apply(tabUtil: Anon_AddTab, key: String = null, tab: ReactNode = null): LoginTabProps = {
    val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginTabProps]
  }
}

