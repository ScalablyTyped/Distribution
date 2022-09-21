package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safetyCertificateOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SafetyCertificateOutlined", JSImport.Default)
  @js.native
  val default: SafetyCertificateOutlinedIconType = js.native
  
  @js.native
  trait SafetyCertificateOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SafetyCertificateOutlinedIconType: String = js.native
  }
  
  type _To = SafetyCertificateOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `safetyCertificateOutlinedMod.foo` */
  override def _to: SafetyCertificateOutlinedIconType = default
}
