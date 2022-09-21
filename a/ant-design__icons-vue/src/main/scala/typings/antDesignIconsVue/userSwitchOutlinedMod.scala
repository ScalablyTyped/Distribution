package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userSwitchOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UserSwitchOutlined", JSImport.Default)
  @js.native
  val default: UserSwitchOutlinedIconType = js.native
  
  @js.native
  trait UserSwitchOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UserSwitchOutlinedIconType: String = js.native
  }
  
  type _To = UserSwitchOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `userSwitchOutlinedMod.foo` */
  override def _to: UserSwitchOutlinedIconType = default
}
