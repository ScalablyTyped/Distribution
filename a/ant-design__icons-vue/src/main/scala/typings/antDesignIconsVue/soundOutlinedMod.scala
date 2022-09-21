package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SoundOutlined", JSImport.Default)
  @js.native
  val default: SoundOutlinedIconType = js.native
  
  @js.native
  trait SoundOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SoundOutlinedIconType: String = js.native
  }
  
  type _To = SoundOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `soundOutlinedMod.foo` */
  override def _to: SoundOutlinedIconType = default
}
