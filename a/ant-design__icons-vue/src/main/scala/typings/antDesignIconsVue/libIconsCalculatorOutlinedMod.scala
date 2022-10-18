package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCalculatorOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalculatorOutlined", JSImport.Default)
  @js.native
  val default: CalculatorOutlinedIconType = js.native
  
  @js.native
  trait CalculatorOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CalculatorOutlinedIconType: String = js.native
  }
  
  type _To = CalculatorOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCalculatorOutlinedMod.foo` */
  override def _to: CalculatorOutlinedIconType = default
}
