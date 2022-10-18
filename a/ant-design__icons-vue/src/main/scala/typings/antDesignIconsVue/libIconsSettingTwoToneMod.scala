package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSettingTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SettingTwoTone", JSImport.Default)
  @js.native
  val default: SettingTwoToneIconType = js.native
  
  @js.native
  trait SettingTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SettingTwoToneIconType: String = js.native
  }
  
  type _To = SettingTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSettingTwoToneMod.foo` */
  override def _to: SettingTwoToneIconType = default
}
