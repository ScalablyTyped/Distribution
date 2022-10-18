package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSettingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SettingOutlined", JSImport.Default)
  @js.native
  val default: SettingOutlinedIconType = js.native
  
  @js.native
  trait SettingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SettingOutlinedIconType: String = js.native
  }
  
  type _To = SettingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSettingOutlinedMod.foo` */
  override def _to: SettingOutlinedIconType = default
}
