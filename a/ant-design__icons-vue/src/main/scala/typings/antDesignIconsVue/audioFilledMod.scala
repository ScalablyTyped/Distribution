package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AudioFilled", JSImport.Default)
  @js.native
  val default: AudioFilledIconType = js.native
  
  @js.native
  trait AudioFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AudioFilledIconType: String = js.native
  }
  
  type _To = AudioFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `audioFilledMod.foo` */
  override def _to: AudioFilledIconType = default
}
