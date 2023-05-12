package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBankTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BankTwoTone", JSImport.Default)
  @js.native
  val default: BankTwoToneIconType = js.native
  
  @js.native
  trait BankTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BankTwoToneIconType: String = js.native
  }
  
  type _To = BankTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBankTwoToneMod.foo` */
  override def _to: BankTwoToneIconType = default
}
