package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWalletOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WalletOutlined", JSImport.Default)
  @js.native
  val default: WalletOutlinedIconType = js.native
  
  @js.native
  trait WalletOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WalletOutlinedIconType: String = js.native
  }
  
  type _To = WalletOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWalletOutlinedMod.foo` */
  override def _to: WalletOutlinedIconType = default
}
