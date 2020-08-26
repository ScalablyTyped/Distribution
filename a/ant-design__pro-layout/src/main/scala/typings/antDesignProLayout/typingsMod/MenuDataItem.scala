package typings.antDesignProLayout.typingsMod

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuDataItem
  extends /* key */ StringDictionary[js.Any] {
  var authority: js.UndefOr[js.Array[String] | String] = js.native
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.native
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.native
  var hideInMenu: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var key: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String | `false`] = js.native
  var name: js.UndefOr[String] = js.native
  var parentKeys: js.UndefOr[js.Array[String]] = js.native
  var path: js.UndefOr[String] = js.native
}

object MenuDataItem {
  @scala.inline
  def apply(): MenuDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuDataItem]
  }
  @scala.inline
  implicit class MenuDataItemOps[Self <: MenuDataItem] (val x: Self) extends AnyVal {
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
    def setAuthorityVarargs(value: String*): Self = this.set("authority", js.Array(value :_*))
    @scala.inline
    def setAuthority(value: js.Array[String] | String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: MenuDataItem*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[MenuDataItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setHideChildrenInMenu(value: Boolean): Self = this.set("hideChildrenInMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideChildrenInMenu: Self = this.set("hideChildrenInMenu", js.undefined)
    @scala.inline
    def setHideInMenu(value: Boolean): Self = this.set("hideInMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideInMenu: Self = this.set("hideInMenu", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocale(value: String | `false`): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentKeysVarargs(value: String*): Self = this.set("parentKeys", js.Array(value :_*))
    @scala.inline
    def setParentKeys(value: js.Array[String]): Self = this.set("parentKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentKeys: Self = this.set("parentKeys", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

