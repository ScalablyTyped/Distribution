package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clockCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ClockCircleOutlined", JSImport.Default)
  @js.native
  val default: ClockCircleOutlinedIconType = js.native
  
  @js.native
  trait ClockCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ClockCircleOutlinedIconType: String = js.native
  }
  
  type _To = ClockCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `clockCircleOutlinedMod.foo` */
  override def _to: ClockCircleOutlinedIconType = default
}
