package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clockCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ClockCircleFilled", JSImport.Default)
  @js.native
  val default: ClockCircleFilledIconType = js.native
  
  @js.native
  trait ClockCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ClockCircleFilledIconType: String = js.native
  }
  
  type _To = ClockCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `clockCircleFilledMod.foo` */
  override def _to: ClockCircleFilledIconType = default
}
