package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShoppingCartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShoppingCartOutlined", JSImport.Default)
  @js.native
  val default: ShoppingCartOutlinedIconType = js.native
  
  @js.native
  trait ShoppingCartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ShoppingCartOutlinedIconType: String = js.native
  }
  
  type _To = ShoppingCartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShoppingCartOutlinedMod.foo` */
  override def _to: ShoppingCartOutlinedIconType = default
}
