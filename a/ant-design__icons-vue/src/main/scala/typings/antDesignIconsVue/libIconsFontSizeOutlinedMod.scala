package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFontSizeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FontSizeOutlined", JSImport.Default)
  @js.native
  val default: FontSizeOutlinedIconType = js.native
  
  @js.native
  trait FontSizeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FontSizeOutlinedIconType: String = js.native
  }
  
  type _To = FontSizeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFontSizeOutlinedMod.foo` */
  override def _to: FontSizeOutlinedIconType = default
}
