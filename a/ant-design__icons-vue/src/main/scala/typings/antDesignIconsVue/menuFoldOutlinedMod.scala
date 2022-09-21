package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuFoldOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MenuFoldOutlined", JSImport.Default)
  @js.native
  val default: MenuFoldOutlinedIconType = js.native
  
  @js.native
  trait MenuFoldOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MenuFoldOutlinedIconType: String = js.native
  }
  
  type _To = MenuFoldOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `menuFoldOutlinedMod.foo` */
  override def _to: MenuFoldOutlinedIconType = default
}
