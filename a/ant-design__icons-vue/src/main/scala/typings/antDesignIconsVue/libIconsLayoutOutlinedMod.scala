package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLayoutOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LayoutOutlined", JSImport.Default)
  @js.native
  val default: LayoutOutlinedIconType = js.native
  
  @js.native
  trait LayoutOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LayoutOutlinedIconType: String = js.native
  }
  
  type _To = LayoutOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLayoutOutlinedMod.foo` */
  override def _to: LayoutOutlinedIconType = default
}
