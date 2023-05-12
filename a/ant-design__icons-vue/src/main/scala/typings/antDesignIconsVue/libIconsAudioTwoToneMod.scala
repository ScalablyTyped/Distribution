package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAudioTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AudioTwoTone", JSImport.Default)
  @js.native
  val default: AudioTwoToneIconType = js.native
  
  @js.native
  trait AudioTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AudioTwoToneIconType: String = js.native
  }
  
  type _To = AudioTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAudioTwoToneMod.foo` */
  override def _to: AudioTwoToneIconType = default
}
