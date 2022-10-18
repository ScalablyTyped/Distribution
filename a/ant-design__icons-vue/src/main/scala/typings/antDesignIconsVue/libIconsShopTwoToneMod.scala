package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShopTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShopTwoTone", JSImport.Default)
  @js.native
  val default: ShopTwoToneIconType = js.native
  
  @js.native
  trait ShopTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ShopTwoToneIconType: String = js.native
  }
  
  type _To = ShopTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShopTwoToneMod.foo` */
  override def _to: ShopTwoToneIconType = default
}
