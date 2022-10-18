package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSlidersFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlidersFilled", JSImport.Default)
  @js.native
  val default: SlidersFilledIconType = js.native
  
  @js.native
  trait SlidersFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlidersFilledIconType: String = js.native
  }
  
  type _To = SlidersFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSlidersFilledMod.foo` */
  override def _to: SlidersFilledIconType = default
}
