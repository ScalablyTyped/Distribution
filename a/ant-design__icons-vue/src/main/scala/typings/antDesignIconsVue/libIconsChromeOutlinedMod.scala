package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsChromeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ChromeOutlined", JSImport.Default)
  @js.native
  val default: ChromeOutlinedIconType = js.native
  
  @js.native
  trait ChromeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ChromeOutlinedIconType: String = js.native
  }
  
  type _To = ChromeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsChromeOutlinedMod.foo` */
  override def _to: ChromeOutlinedIconType = default
}
