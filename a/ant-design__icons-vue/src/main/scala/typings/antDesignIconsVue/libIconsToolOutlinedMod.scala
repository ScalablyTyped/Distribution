package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsToolOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ToolOutlined", JSImport.Default)
  @js.native
  val default: ToolOutlinedIconType = js.native
  
  @js.native
  trait ToolOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ToolOutlinedIconType: String = js.native
  }
  
  type _To = ToolOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsToolOutlinedMod.foo` */
  override def _to: ToolOutlinedIconType = default
}
