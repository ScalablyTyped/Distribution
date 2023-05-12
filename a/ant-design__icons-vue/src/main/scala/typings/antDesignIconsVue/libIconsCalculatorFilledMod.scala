package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCalculatorFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalculatorFilled", JSImport.Default)
  @js.native
  val default: CalculatorFilledIconType = js.native
  
  @js.native
  trait CalculatorFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CalculatorFilledIconType: String = js.native
  }
  
  type _To = CalculatorFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCalculatorFilledMod.foo` */
  override def _to: CalculatorFilledIconType = default
}
