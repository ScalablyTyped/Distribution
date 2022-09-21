package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usbOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UsbOutlined", JSImport.Default)
  @js.native
  val default: UsbOutlinedIconType = js.native
  
  @js.native
  trait UsbOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UsbOutlinedIconType: String = js.native
  }
  
  type _To = UsbOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `usbOutlinedMod.foo` */
  override def _to: UsbOutlinedIconType = default
}
