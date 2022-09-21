package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HighlightFilled", JSImport.Default)
  @js.native
  val default: HighlightFilledIconType = js.native
  
  @js.native
  trait HighlightFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HighlightFilledIconType: String = js.native
  }
  
  type _To = HighlightFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `highlightFilledMod.foo` */
  override def _to: HighlightFilledIconType = default
}
