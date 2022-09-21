package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creditCardTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CreditCardTwoTone", JSImport.Default)
  @js.native
  val default: CreditCardTwoToneIconType = js.native
  
  @js.native
  trait CreditCardTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CreditCardTwoToneIconType: String = js.native
  }
  
  type _To = CreditCardTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `creditCardTwoToneMod.foo` */
  override def _to: CreditCardTwoToneIconType = default
}
