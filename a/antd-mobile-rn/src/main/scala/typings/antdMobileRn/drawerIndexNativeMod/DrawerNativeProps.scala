package typings.antdMobileRn.drawerIndexNativeMod

import typings.antdMobileRn.drawerPropsTypeMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerNativeProps extends DrawerProps {
  
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  
  var drawerRef: js.UndefOr[js.Function1[/* el */ typings.reactNativeDrawerLayout.mod.default | Null, Unit]] = js.native
  
  var drawerWidth: js.UndefOr[Double] = js.native
}
object DrawerNativeProps {
  
  @scala.inline
  def apply(): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerNativeProps]
  }
  
  @scala.inline
  implicit class DrawerNativePropsOps[Self <: DrawerNativeProps] (val x: Self) extends AnyVal {
    
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
    def setDrawerBackgroundColor(value: String): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    
    @scala.inline
    def setDrawerRef(value: /* el */ typings.reactNativeDrawerLayout.mod.default | Null => Unit): Self = this.set("drawerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrawerRef: Self = this.set("drawerRef", js.undefined)
    
    @scala.inline
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerWidth: Self = this.set("drawerWidth", js.undefined)
  }
}
