package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCalculatorTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalculatorTwoTone", JSImport.Default)
  @js.native
  val default: CalculatorTwoToneIconType = js.native
  
  @js.native
  trait CalculatorTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CalculatorTwoToneIconType: String = js.native
  }
  
  type _To = CalculatorTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCalculatorTwoToneMod.foo` */
  override def _to: CalculatorTwoToneIconType = default
}
