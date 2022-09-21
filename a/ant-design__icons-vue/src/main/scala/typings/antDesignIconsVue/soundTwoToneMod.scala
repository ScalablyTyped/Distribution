package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SoundTwoTone", JSImport.Default)
  @js.native
  val default: SoundTwoToneIconType = js.native
  
  @js.native
  trait SoundTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SoundTwoToneIconType: String = js.native
  }
  
  type _To = SoundTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `soundTwoToneMod.foo` */
  override def _to: SoundTwoToneIconType = default
}
