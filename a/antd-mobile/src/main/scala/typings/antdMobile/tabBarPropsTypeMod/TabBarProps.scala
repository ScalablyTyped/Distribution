package typings.antdMobile.tabBarPropsTypeMod

import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarProps extends js.Object {
  
  /** default: false */
  var animated: js.UndefOr[Boolean] = js.native
  
  var barTintColor: js.UndefOr[String] = js.native
  
  /** default: false */
  var swipeable: js.UndefOr[Boolean] = js.native
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var unselectedTintColor: js.UndefOr[String] = js.native
}
object TabBarProps {
  
  @scala.inline
  def apply(): TabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarProps]
  }
  
  @scala.inline
  implicit class TabBarPropsOps[Self <: TabBarProps] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setBarTintColor(value: String): Self = this.set("barTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarTintColor: Self = this.set("barTintColor", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setUnselectedTintColor(value: String): Self = this.set("unselectedTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectedTintColor: Self = this.set("unselectedTintColor", js.undefined)
  }
}
