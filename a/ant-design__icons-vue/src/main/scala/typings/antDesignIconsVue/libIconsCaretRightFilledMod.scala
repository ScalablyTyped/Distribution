package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCaretRightFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretRightFilled", JSImport.Default)
  @js.native
  val default: CaretRightFilledIconType = js.native
  
  @js.native
  trait CaretRightFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CaretRightFilledIconType: String = js.native
  }
  
  type _To = CaretRightFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCaretRightFilledMod.foo` */
  override def _to: CaretRightFilledIconType = default
}
