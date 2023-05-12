package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsZoomOutOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ZoomOutOutlined", JSImport.Default)
  @js.native
  val default: ZoomOutOutlinedIconType = js.native
  
  @js.native
  trait ZoomOutOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ZoomOutOutlinedIconType: String = js.native
  }
  
  type _To = ZoomOutOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsZoomOutOutlinedMod.foo` */
  override def _to: ZoomOutOutlinedIconType = default
}
