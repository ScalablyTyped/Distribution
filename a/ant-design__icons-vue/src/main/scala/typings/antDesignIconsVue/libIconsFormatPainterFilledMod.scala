package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFormatPainterFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FormatPainterFilled", JSImport.Default)
  @js.native
  val default: FormatPainterFilledIconType = js.native
  
  @js.native
  trait FormatPainterFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FormatPainterFilledIconType: String = js.native
  }
  
  type _To = FormatPainterFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFormatPainterFilledMod.foo` */
  override def _to: FormatPainterFilledIconType = default
}
