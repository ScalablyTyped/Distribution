package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWindowsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WindowsOutlined", JSImport.Default)
  @js.native
  val default: WindowsOutlinedIconType = js.native
  
  @js.native
  trait WindowsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WindowsOutlinedIconType: String = js.native
  }
  
  type _To = WindowsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWindowsOutlinedMod.foo` */
  override def _to: WindowsOutlinedIconType = default
}
