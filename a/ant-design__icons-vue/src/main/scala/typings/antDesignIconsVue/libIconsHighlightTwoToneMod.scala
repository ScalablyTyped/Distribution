package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHighlightTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HighlightTwoTone", JSImport.Default)
  @js.native
  val default: HighlightTwoToneIconType = js.native
  
  @js.native
  trait HighlightTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HighlightTwoToneIconType: String = js.native
  }
  
  type _To = HighlightTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHighlightTwoToneMod.foo` */
  override def _to: HighlightTwoToneIconType = default
}
