package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPushpinTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PushpinTwoTone", JSImport.Default)
  @js.native
  val default: PushpinTwoToneIconType = js.native
  
  @js.native
  trait PushpinTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PushpinTwoToneIconType: String = js.native
  }
  
  type _To = PushpinTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPushpinTwoToneMod.foo` */
  override def _to: PushpinTwoToneIconType = default
}
