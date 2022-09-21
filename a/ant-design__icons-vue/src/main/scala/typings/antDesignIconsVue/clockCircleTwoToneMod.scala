package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clockCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ClockCircleTwoTone", JSImport.Default)
  @js.native
  val default: ClockCircleTwoToneIconType = js.native
  
  @js.native
  trait ClockCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ClockCircleTwoToneIconType: String = js.native
  }
  
  type _To = ClockCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `clockCircleTwoToneMod.foo` */
  override def _to: ClockCircleTwoToneIconType = default
}
