package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caretDownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretDownOutlined", JSImport.Default)
  @js.native
  val default: CaretDownOutlinedIconType = js.native
  
  @js.native
  trait CaretDownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CaretDownOutlinedIconType: String = js.native
  }
  
  type _To = CaretDownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `caretDownOutlinedMod.foo` */
  override def _to: CaretDownOutlinedIconType = default
}
