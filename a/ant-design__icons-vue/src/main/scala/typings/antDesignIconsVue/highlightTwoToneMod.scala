package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HighlightTwoTone", JSImport.Default)
  @js.native
  val default: HighlightTwoToneIconType = js.native
  
  @js.native
  trait HighlightTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HighlightTwoToneIconType: String = js.native
  }
  
  type _To = HighlightTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `highlightTwoToneMod.foo` */
  override def _to: HighlightTwoToneIconType = default
}
