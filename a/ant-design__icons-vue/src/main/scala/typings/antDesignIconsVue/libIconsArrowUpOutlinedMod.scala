package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsArrowUpOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowUpOutlined", JSImport.Default)
  @js.native
  val default: ArrowUpOutlinedIconType = js.native
  
  @js.native
  trait ArrowUpOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ArrowUpOutlinedIconType: String = js.native
  }
  
  type _To = ArrowUpOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsArrowUpOutlinedMod.foo` */
  override def _to: ArrowUpOutlinedIconType = default
}
