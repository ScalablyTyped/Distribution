package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCreditCardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CreditCardOutlined", JSImport.Default)
  @js.native
  val default: CreditCardOutlinedIconType = js.native
  
  @js.native
  trait CreditCardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CreditCardOutlinedIconType: String = js.native
  }
  
  type _To = CreditCardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCreditCardOutlinedMod.foo` */
  override def _to: CreditCardOutlinedIconType = default
}
