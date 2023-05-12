package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFullscreenOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FullscreenOutlined", JSImport.Default)
  @js.native
  val default: FullscreenOutlinedIconType = js.native
  
  @js.native
  trait FullscreenOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FullscreenOutlinedIconType: String = js.native
  }
  
  type _To = FullscreenOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFullscreenOutlinedMod.foo` */
  override def _to: FullscreenOutlinedIconType = default
}
