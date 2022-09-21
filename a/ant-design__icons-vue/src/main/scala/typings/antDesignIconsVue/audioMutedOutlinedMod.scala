package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioMutedOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AudioMutedOutlined", JSImport.Default)
  @js.native
  val default: AudioMutedOutlinedIconType = js.native
  
  @js.native
  trait AudioMutedOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AudioMutedOutlinedIconType: String = js.native
  }
  
  type _To = AudioMutedOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `audioMutedOutlinedMod.foo` */
  override def _to: AudioMutedOutlinedIconType = default
}
