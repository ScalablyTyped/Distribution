package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsControlOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ControlOutlined", JSImport.Default)
  @js.native
  val default: ControlOutlinedIconType = js.native
  
  @js.native
  trait ControlOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ControlOutlinedIconType: String = js.native
  }
  
  type _To = ControlOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsControlOutlinedMod.foo` */
  override def _to: ControlOutlinedIconType = default
}
