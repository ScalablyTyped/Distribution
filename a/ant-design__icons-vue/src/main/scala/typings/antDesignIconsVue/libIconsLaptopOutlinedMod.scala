package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLaptopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LaptopOutlined", JSImport.Default)
  @js.native
  val default: LaptopOutlinedIconType = js.native
  
  @js.native
  trait LaptopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LaptopOutlinedIconType: String = js.native
  }
  
  type _To = LaptopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLaptopOutlinedMod.foo` */
  override def _to: LaptopOutlinedIconType = default
}
