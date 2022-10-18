package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShopOutlined", JSImport.Default)
  @js.native
  val default: ShopOutlinedIconType = js.native
  
  @js.native
  trait ShopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ShopOutlinedIconType: String = js.native
  }
  
  type _To = ShopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShopOutlinedMod.foo` */
  override def _to: ShopOutlinedIconType = default
}
