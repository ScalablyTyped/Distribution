package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBankOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BankOutlined", JSImport.Default)
  @js.native
  val default: BankOutlinedIconType = js.native
  
  @js.native
  trait BankOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BankOutlinedIconType: String = js.native
  }
  
  type _To = BankOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBankOutlinedMod.foo` */
  override def _to: BankOutlinedIconType = default
}
