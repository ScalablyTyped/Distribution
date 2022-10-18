package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGiftTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GiftTwoTone", JSImport.Default)
  @js.native
  val default: GiftTwoToneIconType = js.native
  
  @js.native
  trait GiftTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GiftTwoToneIconType: String = js.native
  }
  
  type _To = GiftTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGiftTwoToneMod.foo` */
  override def _to: GiftTwoToneIconType = default
}
