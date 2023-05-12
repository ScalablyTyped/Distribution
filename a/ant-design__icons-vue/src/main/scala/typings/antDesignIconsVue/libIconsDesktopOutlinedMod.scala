package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDesktopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DesktopOutlined", JSImport.Default)
  @js.native
  val default: DesktopOutlinedIconType = js.native
  
  @js.native
  trait DesktopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DesktopOutlinedIconType: String = js.native
  }
  
  type _To = DesktopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDesktopOutlinedMod.foo` */
  override def _to: DesktopOutlinedIconType = default
}
