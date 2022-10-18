package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsForwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ForwardOutlined", JSImport.Default)
  @js.native
  val default: ForwardOutlinedIconType = js.native
  
  @js.native
  trait ForwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ForwardOutlinedIconType: String = js.native
  }
  
  type _To = ForwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsForwardOutlinedMod.foo` */
  override def _to: ForwardOutlinedIconType = default
}
