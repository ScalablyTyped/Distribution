package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlertTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlertTwoTone", JSImport.Default)
  @js.native
  val default: AlertTwoToneIconType = js.native
  
  @js.native
  trait AlertTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlertTwoToneIconType: String = js.native
  }
  
  type _To = AlertTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlertTwoToneMod.foo` */
  override def _to: AlertTwoToneIconType = default
}
