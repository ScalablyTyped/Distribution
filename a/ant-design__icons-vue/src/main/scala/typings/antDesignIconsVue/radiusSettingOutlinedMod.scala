package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radiusSettingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RadiusSettingOutlined", JSImport.Default)
  @js.native
  val default: RadiusSettingOutlinedIconType = js.native
  
  @js.native
  trait RadiusSettingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RadiusSettingOutlinedIconType: String = js.native
  }
  
  type _To = RadiusSettingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `radiusSettingOutlinedMod.foo` */
  override def _to: RadiusSettingOutlinedIconType = default
}
