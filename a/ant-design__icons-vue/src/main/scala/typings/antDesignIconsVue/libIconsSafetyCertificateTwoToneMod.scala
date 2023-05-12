package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSafetyCertificateTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SafetyCertificateTwoTone", JSImport.Default)
  @js.native
  val default: SafetyCertificateTwoToneIconType = js.native
  
  @js.native
  trait SafetyCertificateTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SafetyCertificateTwoToneIconType: String = js.native
  }
  
  type _To = SafetyCertificateTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSafetyCertificateTwoToneMod.foo` */
  override def _to: SafetyCertificateTwoToneIconType = default
}
