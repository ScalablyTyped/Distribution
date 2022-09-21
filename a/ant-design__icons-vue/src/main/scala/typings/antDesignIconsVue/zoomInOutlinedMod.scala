package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomInOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ZoomInOutlined", JSImport.Default)
  @js.native
  val default: ZoomInOutlinedIconType = js.native
  
  @js.native
  trait ZoomInOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ZoomInOutlinedIconType: String = js.native
  }
  
  type _To = ZoomInOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `zoomInOutlinedMod.foo` */
  override def _to: ZoomInOutlinedIconType = default
}
