package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoutOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LogoutOutlined", JSImport.Default)
  @js.native
  val default: LogoutOutlinedIconType = js.native
  
  @js.native
  trait LogoutOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LogoutOutlinedIconType: String = js.native
  }
  
  type _To = LogoutOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `logoutOutlinedMod.foo` */
  override def _to: LogoutOutlinedIconType = default
}
