package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShoppingFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShoppingFilled", JSImport.Default)
  @js.native
  val default: ShoppingFilledIconType = js.native
  
  @js.native
  trait ShoppingFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ShoppingFilledIconType: String = js.native
  }
  
  type _To = ShoppingFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShoppingFilledMod.foo` */
  override def _to: ShoppingFilledIconType = default
}
