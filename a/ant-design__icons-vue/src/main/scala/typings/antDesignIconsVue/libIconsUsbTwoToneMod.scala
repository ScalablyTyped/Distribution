package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUsbTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UsbTwoTone", JSImport.Default)
  @js.native
  val default: UsbTwoToneIconType = js.native
  
  @js.native
  trait UsbTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UsbTwoToneIconType: String = js.native
  }
  
  type _To = UsbTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUsbTwoToneMod.foo` */
  override def _to: UsbTwoToneIconType = default
}
