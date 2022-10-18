package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSlidersTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlidersTwoTone", JSImport.Default)
  @js.native
  val default: SlidersTwoToneIconType = js.native
  
  @js.native
  trait SlidersTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlidersTwoToneIconType: String = js.native
  }
  
  type _To = SlidersTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSlidersTwoToneMod.foo` */
  override def _to: SlidersTwoToneIconType = default
}
