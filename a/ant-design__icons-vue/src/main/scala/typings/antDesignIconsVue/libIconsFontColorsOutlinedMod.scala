package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFontColorsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FontColorsOutlined", JSImport.Default)
  @js.native
  val default: FontColorsOutlinedIconType = js.native
  
  @js.native
  trait FontColorsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FontColorsOutlinedIconType: String = js.native
  }
  
  type _To = FontColorsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFontColorsOutlinedMod.foo` */
  override def _to: FontColorsOutlinedIconType = default
}
