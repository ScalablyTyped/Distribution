package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWifiOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WifiOutlined", JSImport.Default)
  @js.native
  val default: WifiOutlinedIconType = js.native
  
  @js.native
  trait WifiOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WifiOutlinedIconType: String = js.native
  }
  
  type _To = WifiOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWifiOutlinedMod.foo` */
  override def _to: WifiOutlinedIconType = default
}
