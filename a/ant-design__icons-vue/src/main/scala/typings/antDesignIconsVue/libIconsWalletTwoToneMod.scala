package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWalletTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WalletTwoTone", JSImport.Default)
  @js.native
  val default: WalletTwoToneIconType = js.native
  
  @js.native
  trait WalletTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WalletTwoToneIconType: String = js.native
  }
  
  type _To = WalletTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWalletTwoToneMod.foo` */
  override def _to: WalletTwoToneIconType = default
}
