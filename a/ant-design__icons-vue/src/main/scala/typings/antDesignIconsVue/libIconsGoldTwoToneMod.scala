package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGoldTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GoldTwoTone", JSImport.Default)
  @js.native
  val default: GoldTwoToneIconType = js.native
  
  @js.native
  trait GoldTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GoldTwoToneIconType: String = js.native
  }
  
  type _To = GoldTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGoldTwoToneMod.foo` */
  override def _to: GoldTwoToneIconType = default
}
