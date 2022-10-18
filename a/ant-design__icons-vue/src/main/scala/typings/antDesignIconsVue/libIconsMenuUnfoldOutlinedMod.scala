package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMenuUnfoldOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MenuUnfoldOutlined", JSImport.Default)
  @js.native
  val default: MenuUnfoldOutlinedIconType = js.native
  
  @js.native
  trait MenuUnfoldOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MenuUnfoldOutlinedIconType: String = js.native
  }
  
  type _To = MenuUnfoldOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMenuUnfoldOutlinedMod.foo` */
  override def _to: MenuUnfoldOutlinedIconType = default
}
