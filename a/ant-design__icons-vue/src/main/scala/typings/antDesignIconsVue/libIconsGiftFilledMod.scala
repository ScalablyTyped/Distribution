package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGiftFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GiftFilled", JSImport.Default)
  @js.native
  val default: GiftFilledIconType = js.native
  
  @js.native
  trait GiftFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GiftFilledIconType: String = js.native
  }
  
  type _To = GiftFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGiftFilledMod.foo` */
  override def _to: GiftFilledIconType = default
}
