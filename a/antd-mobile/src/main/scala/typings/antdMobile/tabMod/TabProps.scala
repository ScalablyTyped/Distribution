package typings.antdMobile.tabMod

import org.scalablytyped.runtime.StringDictionary
import typings.antdMobile.tabBarPropsTypeMod.TabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.native
  var dataAttrs: js.UndefOr[StringDictionary[String]] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[TabIcon] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var prefixCls: String = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedIcon: js.UndefOr[TabIcon] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var unselectedTintColor: js.UndefOr[String] = js.native
}

object TabProps {
  @scala.inline
  def apply(prefixCls: String): TabProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
  @scala.inline
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadge(value: String | Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setDataAttrs(value: StringDictionary[String]): Self = this.set("dataAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAttrs: Self = this.set("dataAttrs", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setIcon(value: TabIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedIcon(value: TabIcon): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUnselectedTintColor(value: String): Self = this.set("unselectedTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedTintColor: Self = this.set("unselectedTintColor", js.undefined)
  }
  
}

