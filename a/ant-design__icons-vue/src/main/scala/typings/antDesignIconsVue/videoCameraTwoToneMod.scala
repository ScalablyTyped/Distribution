package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoCameraTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VideoCameraTwoTone", JSImport.Default)
  @js.native
  val default: VideoCameraTwoToneIconType = js.native
  
  @js.native
  trait VideoCameraTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VideoCameraTwoToneIconType: String = js.native
  }
  
  type _To = VideoCameraTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `videoCameraTwoToneMod.foo` */
  override def _to: VideoCameraTwoToneIconType = default
}
