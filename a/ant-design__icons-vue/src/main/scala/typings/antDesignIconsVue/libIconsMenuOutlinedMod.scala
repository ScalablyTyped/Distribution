package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMenuOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MenuOutlined", JSImport.Default)
  @js.native
  val default: MenuOutlinedIconType = js.native
  
  @js.native
  trait MenuOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MenuOutlinedIconType: String = js.native
  }
  
  type _To = MenuOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMenuOutlinedMod.foo` */
  override def _to: MenuOutlinedIconType = default
}
