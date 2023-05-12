package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWarningTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WarningTwoTone", JSImport.Default)
  @js.native
  val default: WarningTwoToneIconType = js.native
  
  @js.native
  trait WarningTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WarningTwoToneIconType: String = js.native
  }
  
  type _To = WarningTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWarningTwoToneMod.foo` */
  override def _to: WarningTwoToneIconType = default
}
