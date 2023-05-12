package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFormatPainterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FormatPainterOutlined", JSImport.Default)
  @js.native
  val default: FormatPainterOutlinedIconType = js.native
  
  @js.native
  trait FormatPainterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FormatPainterOutlinedIconType: String = js.native
  }
  
  type _To = FormatPainterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFormatPainterOutlinedMod.foo` */
  override def _to: FormatPainterOutlinedIconType = default
}
