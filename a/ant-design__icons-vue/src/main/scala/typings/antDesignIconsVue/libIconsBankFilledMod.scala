package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBankFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BankFilled", JSImport.Default)
  @js.native
  val default: BankFilledIconType = js.native
  
  @js.native
  trait BankFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BankFilledIconType: String = js.native
  }
  
  type _To = BankFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBankFilledMod.foo` */
  override def _to: BankFilledIconType = default
}
