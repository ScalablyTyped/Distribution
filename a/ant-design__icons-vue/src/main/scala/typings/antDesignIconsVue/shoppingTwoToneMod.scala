package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shoppingTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShoppingTwoTone", JSImport.Default)
  @js.native
  val default: ShoppingTwoToneIconType = js.native
  
  @js.native
  trait ShoppingTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ShoppingTwoToneIconType: String = js.native
  }
  
  type _To = ShoppingTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `shoppingTwoToneMod.foo` */
  override def _to: ShoppingTwoToneIconType = default
}
