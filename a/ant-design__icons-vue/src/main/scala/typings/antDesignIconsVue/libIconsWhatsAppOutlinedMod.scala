package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWhatsAppOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WhatsAppOutlined", JSImport.Default)
  @js.native
  val default: WhatsAppOutlinedIconType = js.native
  
  @js.native
  trait WhatsAppOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WhatsAppOutlinedIconType: String = js.native
  }
  
  type _To = WhatsAppOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWhatsAppOutlinedMod.foo` */
  override def _to: WhatsAppOutlinedIconType = default
}
