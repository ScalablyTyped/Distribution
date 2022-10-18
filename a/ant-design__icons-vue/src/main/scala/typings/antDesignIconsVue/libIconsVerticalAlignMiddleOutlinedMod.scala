package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVerticalAlignMiddleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerticalAlignMiddleOutlined", JSImport.Default)
  @js.native
  val default: VerticalAlignMiddleOutlinedIconType = js.native
  
  @js.native
  trait VerticalAlignMiddleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerticalAlignMiddleOutlinedIconType: String = js.native
  }
  
  type _To = VerticalAlignMiddleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVerticalAlignMiddleOutlinedMod.foo` */
  override def _to: VerticalAlignMiddleOutlinedIconType = default
}
