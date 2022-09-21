package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UserOutlined", JSImport.Default)
  @js.native
  val default: UserOutlinedIconType = js.native
  
  @js.native
  trait UserOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UserOutlinedIconType: String = js.native
  }
  
  type _To = UserOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `userOutlinedMod.foo` */
  override def _to: UserOutlinedIconType = default
}
