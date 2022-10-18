package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSettingFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SettingFilled", JSImport.Default)
  @js.native
  val default: SettingFilledIconType = js.native
  
  @js.native
  trait SettingFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SettingFilledIconType: String = js.native
  }
  
  type _To = SettingFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSettingFilledMod.foo` */
  override def _to: SettingFilledIconType = default
}
