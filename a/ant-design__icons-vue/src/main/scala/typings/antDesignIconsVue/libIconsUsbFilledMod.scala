package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUsbFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UsbFilled", JSImport.Default)
  @js.native
  val default: UsbFilledIconType = js.native
  
  @js.native
  trait UsbFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UsbFilledIconType: String = js.native
  }
  
  type _To = UsbFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUsbFilledMod.foo` */
  override def _to: UsbFilledIconType = default
}
