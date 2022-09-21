package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creditCardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CreditCardFilled", JSImport.Default)
  @js.native
  val default: CreditCardFilledIconType = js.native
  
  @js.native
  trait CreditCardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CreditCardFilledIconType: String = js.native
  }
  
  type _To = CreditCardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `creditCardFilledMod.foo` */
  override def _to: CreditCardFilledIconType = default
}
