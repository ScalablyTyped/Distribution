package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCaretDownFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretDownFilled", JSImport.Default)
  @js.native
  val default: CaretDownFilledIconType = js.native
  
  @js.native
  trait CaretDownFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CaretDownFilledIconType: String = js.native
  }
  
  type _To = CaretDownFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCaretDownFilledMod.foo` */
  override def _to: CaretDownFilledIconType = default
}
