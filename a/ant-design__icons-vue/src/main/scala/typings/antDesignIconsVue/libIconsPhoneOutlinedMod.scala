package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPhoneOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PhoneOutlined", JSImport.Default)
  @js.native
  val default: PhoneOutlinedIconType = js.native
  
  @js.native
  trait PhoneOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PhoneOutlinedIconType: String = js.native
  }
  
  type _To = PhoneOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPhoneOutlinedMod.foo` */
  override def _to: PhoneOutlinedIconType = default
}
