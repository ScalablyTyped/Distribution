package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSafetyCertificateFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SafetyCertificateFilled", JSImport.Default)
  @js.native
  val default: SafetyCertificateFilledIconType = js.native
  
  @js.native
  trait SafetyCertificateFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SafetyCertificateFilledIconType: String = js.native
  }
  
  type _To = SafetyCertificateFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSafetyCertificateFilledMod.foo` */
  override def _to: SafetyCertificateFilledIconType = default
}
