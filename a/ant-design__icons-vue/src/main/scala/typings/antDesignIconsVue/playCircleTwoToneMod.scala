package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlayCircleTwoTone", JSImport.Default)
  @js.native
  val default: PlayCircleTwoToneIconType = js.native
  
  @js.native
  trait PlayCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlayCircleTwoToneIconType: String = js.native
  }
  
  type _To = PlayCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `playCircleTwoToneMod.foo` */
  override def _to: PlayCircleTwoToneIconType = default
}
