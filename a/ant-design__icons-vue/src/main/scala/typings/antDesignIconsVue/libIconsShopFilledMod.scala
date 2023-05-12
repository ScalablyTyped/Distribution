package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShopFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShopFilled", JSImport.Default)
  @js.native
  val default: ShopFilledIconType = js.native
  
  @js.native
  trait ShopFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ShopFilledIconType: String = js.native
  }
  
  type _To = ShopFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShopFilledMod.foo` */
  override def _to: ShopFilledIconType = default
}
