package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalAlignBottomOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerticalAlignBottomOutlined", JSImport.Default)
  @js.native
  val default: VerticalAlignBottomOutlinedIconType = js.native
  
  @js.native
  trait VerticalAlignBottomOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerticalAlignBottomOutlinedIconType: String = js.native
  }
  
  type _To = VerticalAlignBottomOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `verticalAlignBottomOutlinedMod.foo` */
  override def _to: VerticalAlignBottomOutlinedIconType = default
}
