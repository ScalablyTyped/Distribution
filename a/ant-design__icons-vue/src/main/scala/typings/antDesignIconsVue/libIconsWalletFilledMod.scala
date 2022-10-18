package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWalletFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WalletFilled", JSImport.Default)
  @js.native
  val default: WalletFilledIconType = js.native
  
  @js.native
  trait WalletFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WalletFilledIconType: String = js.native
  }
  
  type _To = WalletFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWalletFilledMod.foo` */
  override def _to: WalletFilledIconType = default
}
