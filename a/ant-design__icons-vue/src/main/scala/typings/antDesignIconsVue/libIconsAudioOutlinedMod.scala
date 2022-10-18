package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAudioOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AudioOutlined", JSImport.Default)
  @js.native
  val default: AudioOutlinedIconType = js.native
  
  @js.native
  trait AudioOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AudioOutlinedIconType: String = js.native
  }
  
  type _To = AudioOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAudioOutlinedMod.foo` */
  override def _to: AudioOutlinedIconType = default
}
